
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.radiant.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.radiant.client.renderer.PeaksprenRenderer;
import net.mcreator.radiant.client.renderer.MistsprenRenderer;
import net.mcreator.radiant.client.renderer.LightsprenRenderer;
import net.mcreator.radiant.client.renderer.InksprenRenderer;
import net.mcreator.radiant.client.renderer.IlluminationFakePlayerRenderer;
import net.mcreator.radiant.client.renderer.HonorsprenRenderer;
import net.mcreator.radiant.client.renderer.HighsprenRenderer;
import net.mcreator.radiant.client.renderer.FakeSpiderRenderer;
import net.mcreator.radiant.client.renderer.FakeCreeperRenderer;
import net.mcreator.radiant.client.renderer.CultivationsprenRenderer;
import net.mcreator.radiant.client.renderer.CrypticRenderer;
import net.mcreator.radiant.client.renderer.AshsprenRenderer;
import net.mcreator.radiant.client.renderer.AdhesionInfuseRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RadiantModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RadiantModEntities.PEAKSPREN.get(), PeaksprenRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.LIGHTSPREN.get(), LightsprenRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.MISTSPREN.get(), MistsprenRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.CULTIVATIONSPREN.get(), CultivationsprenRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.ASHSPREN.get(), AshsprenRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.HIGHSPREN.get(), HighsprenRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.HONORSPREN.get(), HonorsprenRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.FAKE_CREEPER.get(), FakeCreeperRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.FAKE_SPIDER.get(), FakeSpiderRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.INKSPREN.get(), InksprenRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.CRYPTIC.get(), CrypticRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.ILLUMINATION_FAKE_PLAYER.get(), IlluminationFakePlayerRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.ADHESION_INFUSE.get(), AdhesionInfuseRenderer::new);
	}
}
