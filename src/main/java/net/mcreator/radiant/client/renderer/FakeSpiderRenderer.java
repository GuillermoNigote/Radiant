
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.radiant.entity.FakeSpiderEntity;

public class FakeSpiderRenderer extends MobRenderer<FakeSpiderEntity, SpiderModel<FakeSpiderEntity>> {
	public FakeSpiderRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FakeSpiderEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/illumination_spider.png");
	}
}
