package net.saudade.vortex.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.saudade.vortex.block.model.CrankDisplayModel;
import net.saudade.vortex.block.display.CrankDisplayItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class CrankDisplayItemRenderer extends GeoItemRenderer<CrankDisplayItem> {
	public CrankDisplayItemRenderer() {
		super(new CrankDisplayModel());
	}

	@Override
	public RenderType getRenderType(CrankDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
