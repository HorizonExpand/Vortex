
package net.saudade.vortex.client.renderer;

import net.saudade.vortex.entity.ReposedGaiaEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

public class ReposedGaiaRenderer extends HumanoidMobRenderer<ReposedGaiaEntity, HumanoidModel<ReposedGaiaEntity>> {
	public ReposedGaiaRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<ReposedGaiaEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(ReposedGaiaEntity entity) {
		return new ResourceLocation("vortex:textures/entities/transparent.png");
	}
}
