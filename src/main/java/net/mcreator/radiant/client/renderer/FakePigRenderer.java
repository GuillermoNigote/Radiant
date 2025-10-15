package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.mcreator.radiant.entity.FakePigEntity;

public class FakePigRenderer extends MobRenderer<FakePigEntity, PigModel<FakePigEntity>> {
	public FakePigRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel<FakePigEntity>(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FakePigEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/fake_pig.png");
	}
}