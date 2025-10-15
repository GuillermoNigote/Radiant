package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.CrossedArmsItemLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.WitchModel;

import net.mcreator.radiant.entity.FakeWitchEntity;

public class FakeWitchRenderer extends MobRenderer<FakeWitchEntity, WitchModel<FakeWitchEntity>> {
	public FakeWitchRenderer(EntityRendererProvider.Context context) {
		super(context, new WitchModel<FakeWitchEntity>(context.bakeLayer(ModelLayers.WITCH)), 0.5f);
		this.addLayer(new CrossedArmsItemLayer<>(this, context.getItemInHandRenderer()));
	}

	@Override
	public ResourceLocation getTextureLocation(FakeWitchEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/fake_witch.png");
	}
}