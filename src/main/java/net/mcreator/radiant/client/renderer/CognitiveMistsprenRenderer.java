
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.radiant.entity.CognitiveMistsprenEntity;
import net.mcreator.radiant.client.model.ModelCognitive_Peakspren;

public class CognitiveMistsprenRenderer extends MobRenderer<CognitiveMistsprenEntity, ModelCognitive_Peakspren<CognitiveMistsprenEntity>> {
	public CognitiveMistsprenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCognitive_Peakspren<CognitiveMistsprenEntity>(context.bakeLayer(ModelCognitive_Peakspren.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(CognitiveMistsprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/cognitive_highspren.png");
	}
}
