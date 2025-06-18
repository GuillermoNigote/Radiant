
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.radiant.entity.FakeCowEntity;

public class FakeCowRenderer extends MobRenderer<FakeCowEntity, CowModel<FakeCowEntity>> {
	public FakeCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel<FakeCowEntity>(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FakeCowEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/fake_cow.png");
	}
}
