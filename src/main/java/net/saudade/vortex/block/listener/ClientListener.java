package net.saudade.vortex.block.listener;

import net.saudade.vortex.init.VortexModBlockEntities;
import net.saudade.vortex.block.renderer.TraderHeadTileRenderer;
import net.saudade.vortex.block.renderer.CrankTileRenderer;
import net.saudade.vortex.VortexMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(modid = VortexMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(VortexModBlockEntities.CRANK.get(), context -> new CrankTileRenderer());
		event.registerBlockEntityRenderer(VortexModBlockEntities.TRADER_HEAD.get(), context -> new TraderHeadTileRenderer());
	}
}
