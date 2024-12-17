package net.saudade.vortex;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.saudade.vortex.world.features.StructureFeature;
import net.saudade.vortex.init.VortexModTabs;
import net.saudade.vortex.init.VortexModSounds;
import net.saudade.vortex.init.VortexModMenus;
import net.saudade.vortex.init.VortexModItems;
import net.saudade.vortex.init.VortexModFluids;
import net.saudade.vortex.init.VortexModFluidTypes;
import net.saudade.vortex.init.VortexModFeatures;
import net.saudade.vortex.init.VortexModEntities;
import net.saudade.vortex.init.VortexModBlocks;
import net.saudade.vortex.init.VortexModBlockEntities;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.util.thread.SidedThreadGroups;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("vortex")
public class VortexMod {
	public static final Logger LOGGER = LogManager.getLogger(VortexMod.class);
	public static final String MODID = "vortex";

	public VortexMod() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		VortexModSounds.REGISTRY.register(bus);
		VortexModBlocks.REGISTRY.register(bus);
		VortexModBlockEntities.REGISTRY.register(bus);
		VortexModItems.REGISTRY.register(bus);
		VortexModEntities.REGISTRY.register(bus);

		VortexModTabs.REGISTRY.register(bus);
		VortexModFeatures.REGISTRY.register(bus);
		StructureFeature.REGISTRY.register(bus);

		VortexModMenus.REGISTRY.register(bus);
		VortexModFluids.REGISTRY.register(bus);
		VortexModFluidTypes.REGISTRY.register(bus);

		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new AbstractMap.SimpleEntry<>(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
