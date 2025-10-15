package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.radiant.entity.CognitiveAshsprenEntity;
import net.mcreator.radiant.client.model.ModelCognitive_Peakspren;

import com.mojang.blaze3d.vertex.PoseStack;

public class CognitiveAshsprenRenderer extends MobRenderer<CognitiveAshsprenEntity, ModelCognitive_Peakspren<CognitiveAshsprenEntity>> {
	public CognitiveAshsprenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCognitive_Peakspren<CognitiveAshsprenEntity>(context.bakeLayer(ModelCognitive_Peakspren.LAYER_LOCATION)), 0f);
	}

	@Override
	protected void scale(CognitiveAshsprenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}

	@Override
	public ResourceLocation getTextureLocation(CognitiveAshsprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/cognitive_ashspren.png");
	}
}