
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.radiant.entity.FakeVillagerPlainsEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class FakeVillagerPlainsRenderer extends MobRenderer<FakeVillagerPlainsEntity, VillagerModel<FakeVillagerPlainsEntity>> {
	public FakeVillagerPlainsRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel<FakeVillagerPlainsEntity>(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	protected void scale(FakeVillagerPlainsEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(FakeVillagerPlainsEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/fake_villager_plains.png");
	}
}
