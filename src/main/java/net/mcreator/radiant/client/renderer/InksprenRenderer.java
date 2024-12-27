
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.radiant.entity.InksprenEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class InksprenRenderer extends HumanoidMobRenderer<InksprenEntity, HumanoidModel<InksprenEntity>> {
	public InksprenRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<InksprenEntity, HumanoidModel<InksprenEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("radiant:textures/entities/inkspren.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, InksprenEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	protected void scale(InksprenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.3f, 0.3f, 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(InksprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/inkspren.png");
	}
}
