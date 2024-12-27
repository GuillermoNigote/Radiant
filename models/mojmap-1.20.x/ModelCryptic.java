// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCryptic<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cryptic"), "main");
	private final ModelPart bone2;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bb_main;

	public ModelCryptic(ModelPart root) {
		this.bone2 = root.getChild("bone2");
		this.bone = root.getChild("bone");
		this.bone3 = root.getChild("bone3");
		this.bone4 = root.getChild("bone4");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(20, 16)
				.addBox(-8.0F, -0.3F, -4.0F, 16.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -0.3F, -8.0F, 8.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone3
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(16, 0).addBox(-3.0F, -0.3F, -8.0F, 6.0F, 0.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r2 = bone4
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 16).addBox(-3.0F, -0.3F, -8.0F, 6.0F, 0.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(20, 16)
				.addBox(-8.0F, -0.3F, -4.0F, 16.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r3 = bb_main
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(16, 0).addBox(-3.0F, -0.3F, -8.0F, 6.0F, 0.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r4 = bb_main
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(0, 16).addBox(-3.0F, -0.3F, -8.0F, 6.0F, 0.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bb_main.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.bone3.yRot = ageInTicks / 20.f;
		this.bone2.yRot = ageInTicks / 20.f;
		this.bone4.yRot = ageInTicks / 20.f;
		this.bone.yRot = ageInTicks / 20.f;
	}
}