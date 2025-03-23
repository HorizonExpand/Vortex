package net.saudade.vortex.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.saudade.vortex.block.model.TraderHeadDisplayModel;
import net.saudade.vortex.block.display.TraderHeadDisplayItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class TraderHeadDisplayItemRenderer extends GeoItemRenderer<TraderHeadDisplayItem> {
	public TraderHeadDisplayItemRenderer() {
		super(new TraderHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(TraderHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
