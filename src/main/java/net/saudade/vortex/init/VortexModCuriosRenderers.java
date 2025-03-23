package net.saudade.vortex.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.saudade.vortex.client.renderer.OrcishQuiverRenderer;
import net.saudade.vortex.client.model.Modelorcish_quiver;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VortexModCuriosRenderers {
	@SubscribeEvent
	public static void registerLayers(final EntityRenderersEvent.RegisterLayerDefinitions evt) {
		evt.registerLayerDefinition(VortexModLayerDefinitions.ORCISH_QUIVER, Modelorcish_quiver::createBodyLayer);
	}

	@SubscribeEvent
	public static void clientSetup(final FMLClientSetupEvent evt) {
		CuriosRendererRegistry.register(VortexModItems.ORCISH_QUIVER.get(), OrcishQuiverRenderer::new);
	}
}
