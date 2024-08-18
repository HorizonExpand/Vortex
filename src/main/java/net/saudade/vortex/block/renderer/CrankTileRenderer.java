package net.saudade.vortex.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.saudade.vortex.block.model.CrankBlockModel;
import net.saudade.vortex.block.entity.CrankTileEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class CrankTileRenderer extends GeoBlockRenderer<CrankTileEntity> {
	public CrankTileRenderer() {
		super(new CrankBlockModel());
	}

	@Override
	public RenderType getRenderType(CrankTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
