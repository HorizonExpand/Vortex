
package net.saudade.vortex.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.saudade.vortex.entity.model.MysticalCoinEntityModel;
import net.saudade.vortex.entity.MysticalCoinEntityEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MysticalCoinEntityRenderer extends GeoEntityRenderer<MysticalCoinEntityEntity> {
	public MysticalCoinEntityRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new MysticalCoinEntityModel());
		this.shadowRadius = 0f;
	}

	@Override
	public RenderType getRenderType(MysticalCoinEntityEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, MysticalCoinEntityEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(MysticalCoinEntityEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
