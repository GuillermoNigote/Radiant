
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.radiant.entity.AshsprenEntity;
import net.mcreator.radiant.client.model.ModelAshspren;

public class AshsprenRenderer extends MobRenderer<AshsprenEntity, ModelAshspren<AshsprenEntity>> {
	public AshsprenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAshspren(context.bakeLayer(ModelAshspren.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(AshsprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/empty.png");
	}
}
