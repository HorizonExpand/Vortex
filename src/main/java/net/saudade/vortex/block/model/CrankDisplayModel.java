package net.saudade.vortex.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.saudade.vortex.block.display.CrankDisplayItem;

import net.minecraft.resources.ResourceLocation;

public class CrankDisplayModel extends GeoModel<CrankDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CrankDisplayItem animatable) {
		return new ResourceLocation("vortex", "animations/crank.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrankDisplayItem animatable) {
		return new ResourceLocation("vortex", "geo/crank.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrankDisplayItem entity) {
		return new ResourceLocation("vortex", "textures/block/crank.png");
	}
}
