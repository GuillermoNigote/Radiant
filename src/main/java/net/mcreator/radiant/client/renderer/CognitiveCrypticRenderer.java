
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.radiant.entity.CognitiveCrypticEntity;
import net.mcreator.radiant.client.model.ModelCognitive_Criptic;

public class CognitiveCrypticRenderer extends MobRenderer<CognitiveCrypticEntity, ModelCognitive_Criptic<CognitiveCrypticEntity>> {
	public CognitiveCrypticRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCognitive_Criptic<CognitiveCrypticEntity>(context.bakeLayer(ModelCognitive_Criptic.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(CognitiveCrypticEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/cognitive_cryptic.png");
	}
}
