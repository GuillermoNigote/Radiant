package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.radiant.entity.CognitiveInksprenEntity;
import net.mcreator.radiant.client.model.ModelCognitive_Inkspren;

import com.mojang.blaze3d.vertex.PoseStack;

public class CognitiveInksprenRenderer extends MobRenderer<CognitiveInksprenEntity, ModelCognitive_Inkspren<CognitiveInksprenEntity>> {
	public CognitiveInksprenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCognitive_Inkspren<CognitiveInksprenEntity>(context.bakeLayer(ModelCognitive_Inkspren.LAYER_LOCATION)), 0f);
	}

	@Override
	protected void scale(CognitiveInksprenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}

	@Override
	public ResourceLocation getTextureLocation(CognitiveInksprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/cognitive_inkspren.png");
	}
}