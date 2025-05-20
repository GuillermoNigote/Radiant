
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.radiant.entity.CognitiveHonorsprenEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class CognitiveHonorsprenRenderer extends MobRenderer<CognitiveHonorsprenEntity, VillagerModel<CognitiveHonorsprenEntity>> {
	public CognitiveHonorsprenRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel<CognitiveHonorsprenEntity>(context.bakeLayer(ModelLayers.VILLAGER)), 0f);
	}

	@Override
	protected void scale(CognitiveHonorsprenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(CognitiveHonorsprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/honorspren_texture.png");
	}
}
