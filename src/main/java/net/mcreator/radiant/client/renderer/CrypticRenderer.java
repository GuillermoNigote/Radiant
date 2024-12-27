
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.radiant.entity.CrypticEntity;
import net.mcreator.radiant.client.model.ModelCryptic;

import com.mojang.blaze3d.vertex.PoseStack;

public class CrypticRenderer extends MobRenderer<CrypticEntity, ModelCryptic<CrypticEntity>> {
	public CrypticRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCryptic(context.bakeLayer(ModelCryptic.LAYER_LOCATION)), 0f);
	}

	@Override
	protected void scale(CrypticEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.2f, 0.2f, 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrypticEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/cryptic_texture.png");
	}
}
