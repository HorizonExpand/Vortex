
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.saudade.vortex.init;

import net.saudade.vortex.world.inventory.PreservesJarGUIMenu;
import net.saudade.vortex.VortexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;

import javax.annotation.Nullable;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VortexModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, VortexMod.MODID);
	public static final RegistryObject<MenuType<PreservesJarGUIMenu>> PRESERVES_JAR_GUI = REGISTRY.register("preserves_jar_gui", () -> IForgeMenuType.create(PreservesJarGUIMenu::new));

	public static void setText(String boxname, String value, @Nullable ServerPlayer player) {
		if (player != null) {
			VortexMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> player), new GuiSyncMessage(boxname, value));
		} else {
			VortexMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new GuiSyncMessage(boxname, value));
		}
	}

	public static class GuiSyncMessage {
		private final String textboxid;
		private final String data;

		public GuiSyncMessage(FriendlyByteBuf buffer) {
			this.textboxid = buffer.readComponent().getString();
			this.data = buffer.readComponent().getString();
		}

		public GuiSyncMessage(String textboxid, String data) {
			this.textboxid = textboxid;
			this.data = data;
		}

		public static void buffer(GuiSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeComponent(Component.literal(message.textboxid));
			buffer.writeComponent(Component.literal(message.data));
		}

		public static void handleData(GuiSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					VortexModScreens.handleTextBoxMessage(message);
				}
			});
			context.setPacketHandled(true);
		}

		String editbox() {
			return this.textboxid;
		}

		String value() {
			return this.data;
		}
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		VortexMod.addNetworkMessage(GuiSyncMessage.class, GuiSyncMessage::buffer, GuiSyncMessage::new, GuiSyncMessage::handleData);
	}
}
