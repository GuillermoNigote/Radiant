package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.radiant.entity.CognitiveHighsprenEntity;
import net.mcreator.radiant.client.model.ModelCognitive_Peakspren;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CognitiveHighsprenRenderer extends MobRenderer<CognitiveHighsprenEntity, ModelCognitive_Peakspren<CognitiveHighsprenEntity>> {
	public CognitiveHighsprenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCognitive_Peakspren<CognitiveHighsprenEntity>(context.bakeLayer(ModelCognitive_Peakspren.LAYER_LOCATION)), 0f);
		this.addLayer(new RenderLayer<CognitiveHighsprenEntity, ModelCognitive_Peakspren<CognitiveHighsprenEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("radiant:textures/entities/cognitive_highspren_glowing.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CognitiveHighsprenEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				EntityModel model = new ModelCognitive_Peakspren(Minecraft.getInstance().getEntityModels().bakeLayer(ModelCognitive_Peakspren.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	protected void scale(CognitiveHighsprenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}

	@Override
	public ResourceLocation getTextureLocation(CognitiveHighsprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/cognitive_highspren.png");
	}
}