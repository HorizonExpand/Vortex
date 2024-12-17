package net.saudade.vortex.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.saudade.vortex.entity.MysticalCoinEntityEntity;

import net.minecraft.resources.ResourceLocation;

public class MysticalCoinEntityModel extends GeoModel<MysticalCoinEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(MysticalCoinEntityEntity entity) {
		return new ResourceLocation("vortex", "animations/mystical_coin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MysticalCoinEntityEntity entity) {
		return new ResourceLocation("vortex", "geo/mystical_coin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MysticalCoinEntityEntity entity) {
		return new ResourceLocation("vortex", "textures/entities/" + entity.getTexture() + ".png");
	}

}
