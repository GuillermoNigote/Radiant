package net.mcreator.radiant.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelCognitive_Mistspren<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("radiant", "model_cognitive_mistspren"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart bone;
	public final ModelPart LeftArm;
	public final ModelPart bone2;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelCognitive_Mistspren(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.bone = this.RightArm.getChild("bone");
		this.LeftArm = root.getChild("LeftArm");
		this.bone2 = this.LeftArm.getChild("bone2");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(6, 6).addBox(-5.0F, -9.0F, -4.0F, 10.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 7).addBox(-5.0F, -9.0F, -4.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.5F)).texOffs(74, 9)
						.addBox(3.0F, -8.0F, -4.0F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(74, 25).addBox(-2.0F, -8.0F, -4.0F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(66, 30)
						.addBox(-4.0F, -1.0F, -4.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(66, 19).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(66, 9)
						.addBox(-4.0F, -3.0F, -4.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(74, 25).addBox(-4.0F, -8.0F, 0.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(74, -8).addBox(0.0F, -8.0F, -4.0F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, -1.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(74, 9).addBox(0.0F, -8.0F, -4.0F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(74, 28).addBox(-4.0F, 0.0F, 1.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(81, -3)
						.addBox(2.0F, 4.0F, -2.0F, 0.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(79, 5).addBox(-2.0F, 0.0F, -2.0F, 0.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(78, 21)
						.addBox(-2.0F, 5.0F, -2.0F, 0.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 5).addBox(0.0F, 5.0F, -2.0F, 0.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(78, 19)
						.addBox(0.0F, -1.0F, -2.0F, 0.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(78, 29).addBox(2.0F, 0.0F, -2.0F, 0.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 34)
						.addBox(-4.0F, 3.0F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 3).addBox(-4.0F, 7.0F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 32)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition bone = RightArm.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(78, 21).addBox(-2.0F, -2.0F, -2.0F, 0.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(78, 21).addBox(0.0F, -2.0F, -2.0F, 0.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(78, 25)
						.addBox(-3.0F, -2.0F, 1.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(78, 33).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(76, 11)
						.addBox(-3.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(75, 18).addBox(-3.0F, 4.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition bone2 = LeftArm.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(79, 18).addBox(0.0F, -2.0F, -2.0F, 0.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(79, 18).addBox(2.0F, -2.0F, -2.0F, 0.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(79, 22)
						.addBox(-1.0F, -2.0F, 1.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(79, 30).addBox(-1.0F, -2.0F, -1.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(77, 8)
						.addBox(-1.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(76, 15).addBox(-1.0F, 4.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 90, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.bone2.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.bone.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
