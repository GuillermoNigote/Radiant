
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
import net.mcreator.radiant.client.renderer.FakeZombieRenderer;
import net.mcreator.radiant.client.renderer.FakeWitchRenderer;
import net.mcreator.radiant.client.renderer.FakeVillagerPlainsRenderer;
import net.mcreator.radiant.client.renderer.FakeSpiderRenderer;
import net.mcreator.radiant.client.renderer.FakePigRenderer;
import net.mcreator.radiant.client.renderer.FakeCreeperRenderer;
import net.mcreator.radiant.client.renderer.FakeCowRenderer;
import net.mcreator.radiant.client.renderer.CultivationsprenRenderer;
import net.mcreator.radiant.client.renderer.CrypticRenderer;
import net.mcreator.radiant.client.renderer.CognitivePeaksprenRenderer;
import net.mcreator.radiant.client.renderer.CognitiveMistsprenRenderer;
import net.mcreator.radiant.client.renderer.CognitiveLightsprenRenderer;
import net.mcreator.radiant.client.renderer.CognitiveInksprenRenderer;
import net.mcreator.radiant.client.renderer.CognitiveHonorsprenRenderer;
import net.mcreator.radiant.client.renderer.CognitiveHighsprenRenderer;
import net.mcreator.radiant.client.renderer.CognitiveCultivationsprenRenderer;
import net.mcreator.radiant.client.renderer.CognitiveCrypticRenderer;
import net.mcreator.radiant.client.renderer.CognitiveAshsprenRenderer;
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
		event.registerEntityRenderer(RadiantModEntities.COGNITIVE_HONORSPREN.get(), CognitiveHonorsprenRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.COGNITIVE_CULTIVATIONSPREN.get(), CognitiveCultivationsprenRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.COGNITIVE_PEAKSPREN.get(), CognitivePeaksprenRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.COGNITIVE_LIGHTSPREN.get(), CognitiveLightsprenRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.COGNITIVE_ASHSPREN.get(), CognitiveAshsprenRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.COGNITIVE_HIGHSPREN.get(), CognitiveHighsprenRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.COGNITIVE_INKSPREN.get(), CognitiveInksprenRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.COGNITIVE_CRYPTIC.get(), CognitiveCrypticRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.COGNITIVE_MISTSPREN.get(), CognitiveMistsprenRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.FAKE_COW.get(), FakeCowRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.FAKE_PIG.get(), FakePigRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.FAKE_VILLAGER_PLAINS.get(), FakeVillagerPlainsRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.FAKE_WITCH.get(), FakeWitchRenderer::new);
		event.registerEntityRenderer(RadiantModEntities.FAKE_ZOMBIE.get(), FakeZombieRenderer::new);
	}
}
