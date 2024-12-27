
package net.mcreator.radiant.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.radiant.entity.LightsprenEntity;
import net.mcreator.radiant.client.model.ModelSeon;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LightsprenRenderer extends MobRenderer<LightsprenEntity, ModelSeon<LightsprenEntity>> {
	public LightsprenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSeon(context.bakeLayer(ModelSeon.LAYER_LOCATION)), 0f);
		this.addLayer(new RenderLayer<LightsprenEntity, ModelSeon<LightsprenEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("radiant:textures/entities/lightspren_texture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LightsprenEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LightsprenEntity entity) {
		return ResourceLocation.parse("radiant:textures/entities/empty.png");
	}
}
