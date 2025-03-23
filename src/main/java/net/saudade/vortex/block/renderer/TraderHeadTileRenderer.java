package net.saudade.vortex.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.saudade.vortex.block.model.TraderHeadBlockModel;
import net.saudade.vortex.block.entity.TraderHeadTileEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class TraderHeadTileRenderer extends GeoBlockRenderer<TraderHeadTileEntity> {
	public TraderHeadTileRenderer() {
		super(new TraderHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(TraderHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
