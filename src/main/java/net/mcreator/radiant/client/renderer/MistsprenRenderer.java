
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.radiant.entity.MistsprenEntity;
import net.mcreator.radiant.client.model.ModelMastered_Sand_Projectile;

public class MistsprenRenderer extends MobRenderer<MistsprenEntity, ModelMastered_Sand_Projectile<MistsprenEntity>> {
	public MistsprenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMastered_Sand_Projectile(context.bakeLayer(ModelMastered_Sand_Projectile.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(MistsprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/mistspren_texture.png");
	}
}
