package net.saudade.vortex.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.saudade.vortex.block.entity.CrankTileEntity;

import net.minecraft.resources.ResourceLocation;

public class CrankBlockModel extends GeoModel<CrankTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CrankTileEntity animatable) {
		return new ResourceLocation("vortex", "animations/crank.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrankTileEntity animatable) {
		return new ResourceLocation("vortex", "geo/crank.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrankTileEntity animatable) {
		return new ResourceLocation("vortex", "textures/block/crank.png");
	}
}
