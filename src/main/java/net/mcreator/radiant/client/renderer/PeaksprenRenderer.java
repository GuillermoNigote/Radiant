
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.radiant.entity.PeaksprenEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class PeaksprenRenderer extends HumanoidMobRenderer<PeaksprenEntity, HumanoidModel<PeaksprenEntity>> {
	public PeaksprenRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	protected void scale(PeaksprenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.3f, 0.3f, 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(PeaksprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/peakspren_texture.png");
	}
}
