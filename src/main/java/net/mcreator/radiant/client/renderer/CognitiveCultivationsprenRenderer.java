
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.radiant.entity.CognitiveCultivationsprenEntity;
import net.mcreator.radiant.client.model.ModelCognitive_Peakspren;

public class CognitiveCultivationsprenRenderer extends MobRenderer<CognitiveCultivationsprenEntity, ModelCognitive_Peakspren<CognitiveCultivationsprenEntity>> {
	public CognitiveCultivationsprenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCognitive_Peakspren<CognitiveCultivationsprenEntity>(context.bakeLayer(ModelCognitive_Peakspren.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(CognitiveCultivationsprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/cognitive_cultivationspren.png");
	}
}
