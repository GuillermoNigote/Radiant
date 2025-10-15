package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.radiant.entity.CognitivePeaksprenEntity;
import net.mcreator.radiant.client.model.ModelCognitive_Peakspren;

import com.mojang.blaze3d.vertex.PoseStack;

public class CognitivePeaksprenRenderer extends MobRenderer<CognitivePeaksprenEntity, ModelCognitive_Peakspren<CognitivePeaksprenEntity>> {
	public CognitivePeaksprenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCognitive_Peakspren<CognitivePeaksprenEntity>(context.bakeLayer(ModelCognitive_Peakspren.LAYER_LOCATION)), 0f);
	}

	@Override
	protected void scale(CognitivePeaksprenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}

	@Override
	public ResourceLocation getTextureLocation(CognitivePeaksprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/cognitive_peakspren_.png");
	}
}