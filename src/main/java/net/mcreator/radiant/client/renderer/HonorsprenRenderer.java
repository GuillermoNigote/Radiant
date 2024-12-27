
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.radiant.entity.HonorsprenEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class HonorsprenRenderer extends MobRenderer<HonorsprenEntity, VillagerModel<HonorsprenEntity>> {
	public HonorsprenRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0f);
		this.addLayer(new RenderLayer<HonorsprenEntity, VillagerModel<HonorsprenEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("radiant:textures/entities/honorspren_texture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, HonorsprenEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	protected void scale(HonorsprenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.2f, 0.2f, 0.2f);
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(HonorsprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/empty.png");
	}
}
