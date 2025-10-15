package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.radiant.entity.CognitiveMistsprenEntity;
import net.mcreator.radiant.client.model.ModelCognitive_Mistspren;

import com.mojang.blaze3d.vertex.PoseStack;

public class CognitiveMistsprenRenderer extends MobRenderer<CognitiveMistsprenEntity, ModelCognitive_Mistspren<CognitiveMistsprenEntity>> {
	public CognitiveMistsprenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCognitive_Mistspren<CognitiveMistsprenEntity>(context.bakeLayer(ModelCognitive_Mistspren.LAYER_LOCATION)), 0f);
	}

	@Override
	protected void scale(CognitiveMistsprenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}

	@Override
	public ResourceLocation getTextureLocation(CognitiveMistsprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/cognitive_mistspren.png");
	}
}