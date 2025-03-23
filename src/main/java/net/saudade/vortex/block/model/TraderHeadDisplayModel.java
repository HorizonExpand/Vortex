package net.saudade.vortex.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.saudade.vortex.block.display.TraderHeadDisplayItem;

import net.minecraft.resources.ResourceLocation;

public class TraderHeadDisplayModel extends GeoModel<TraderHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TraderHeadDisplayItem animatable) {
		return new ResourceLocation("vortex", "animations/trader.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TraderHeadDisplayItem animatable) {
		return new ResourceLocation("vortex", "geo/trader.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TraderHeadDisplayItem entity) {
		return new ResourceLocation("vortex", "textures/block/trader.png");
	}
}
