
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.radiant.entity.IlluminationFakePlayerEntity;
import net.mcreator.radiant.client.model.ModelCognitive_Peakspren;

public class IlluminationFakePlayerRenderer extends MobRenderer<IlluminationFakePlayerEntity, ModelCognitive_Peakspren<IlluminationFakePlayerEntity>> {
	public IlluminationFakePlayerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCognitive_Peakspren<IlluminationFakePlayerEntity>(context.bakeLayer(ModelCognitive_Peakspren.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(IlluminationFakePlayerEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/illumination_steve.png");
	}
}
