
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.radiant.entity.CognitiveLightsprenEntity;
import net.mcreator.radiant.client.model.ModelCognitive_Peakspren;

public class CognitiveLightsprenRenderer extends MobRenderer<CognitiveLightsprenEntity, ModelCognitive_Peakspren<CognitiveLightsprenEntity>> {
	public CognitiveLightsprenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCognitive_Peakspren<CognitiveLightsprenEntity>(context.bakeLayer(ModelCognitive_Peakspren.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(CognitiveLightsprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/cognitive_lightspren.png");
	}
}
