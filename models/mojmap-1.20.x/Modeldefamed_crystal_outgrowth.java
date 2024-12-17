// Made with Blockbench 4.11.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldefamed_crystal_outgrowth<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "defamed_crystal_outgrowth"), "main");
	private final ModelPart bone;

	public Modeldefamed_crystal_outgrowth(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(34, 0).addBox(
				-4.5F, -14.5F, -4.5F, 9.0F, 15.0F, 9.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head_r1 = bone.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(0, 51).addBox(-7.7426F, -3.5F, -4.475F, 6.0F, 6.0F, 8.95F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(3.7074F, -18.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Head_r2 = bone.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(34, 24).addBox(-6.5F, -5.5F, -3.5F, 7.0F, 9.0F, 7.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.2098F, -6.1529F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r3 = bone.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(34, 40).addBox(-0.5F, -5.5F, -3.5F, 7.0F, 9.0F, 7.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-0.2098F, -6.1529F, 0.0F, 0.0F, 0.0F, 0.3491F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}