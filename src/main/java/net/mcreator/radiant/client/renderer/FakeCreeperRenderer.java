
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.radiant.entity.FakeCreeperEntity;

public class FakeCreeperRenderer extends MobRenderer<FakeCreeperEntity, CreeperModel<FakeCreeperEntity>> {
	public FakeCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FakeCreeperEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/creeper.png");
	}
}
