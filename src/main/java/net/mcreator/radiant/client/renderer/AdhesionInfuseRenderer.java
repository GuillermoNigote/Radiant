
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.radiant.entity.AdhesionInfuseEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class AdhesionInfuseRenderer extends MobRenderer<AdhesionInfuseEntity, SlimeModel<AdhesionInfuseEntity>> {
	public AdhesionInfuseRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0f);
	}

	@Override
	protected void scale(AdhesionInfuseEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.5f, 0.5f, 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AdhesionInfuseEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/empty.png");
	}
}
