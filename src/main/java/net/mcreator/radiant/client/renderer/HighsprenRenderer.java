
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.radiant.entity.HighsprenEntity;
import net.mcreator.radiant.client.model.ModelHighspren;

public class HighsprenRenderer extends MobRenderer<HighsprenEntity, ModelHighspren<HighsprenEntity>> {
	public HighsprenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHighspren(context.bakeLayer(ModelHighspren.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(HighsprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/highspren_texture.png");
	}
}
