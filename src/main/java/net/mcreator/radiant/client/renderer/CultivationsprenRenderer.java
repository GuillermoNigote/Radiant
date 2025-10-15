package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.radiant.entity.CultivationsprenEntity;
import net.mcreator.radiant.client.model.ModelAshspren;

import com.mojang.blaze3d.vertex.PoseStack;

public class CultivationsprenRenderer extends MobRenderer<CultivationsprenEntity, ModelAshspren<CultivationsprenEntity>> {
	public CultivationsprenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAshspren<CultivationsprenEntity>(context.bakeLayer(ModelAshspren.LAYER_LOCATION)), 0f);
	}

	@Override
	protected void scale(CultivationsprenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}

	@Override
	public ResourceLocation getTextureLocation(CultivationsprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/empty.png");
	}
}