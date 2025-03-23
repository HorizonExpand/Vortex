package net.saudade.vortex.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.saudade.vortex.block.entity.TraderHeadTileEntity;

import net.minecraft.resources.ResourceLocation;

public class TraderHeadBlockModel extends GeoModel<TraderHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TraderHeadTileEntity animatable) {
		return new ResourceLocation("vortex", "animations/trader.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TraderHeadTileEntity animatable) {
		return new ResourceLocation("vortex", "geo/trader.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TraderHeadTileEntity animatable) {
		return new ResourceLocation("vortex", "textures/block/trader.png");
	}
}
