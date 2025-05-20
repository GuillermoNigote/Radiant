
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.radiant.entity.CognitiveHighsprenEntity;
import net.mcreator.radiant.client.model.ModelCognitive_Peakspren;

public class CognitiveHighsprenRenderer extends MobRenderer<CognitiveHighsprenEntity, ModelCognitive_Peakspren<CognitiveHighsprenEntity>> {
	public CognitiveHighsprenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCognitive_Peakspren<CognitiveHighsprenEntity>(context.bakeLayer(ModelCognitive_Peakspren.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(CognitiveHighsprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/cognitive_highspren.png");
	}
}
