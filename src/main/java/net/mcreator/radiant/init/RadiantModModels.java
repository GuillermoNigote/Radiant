
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.radiant.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.radiant.client.model.ModelSeon;
import net.mcreator.radiant.client.model.ModelMastered_Sand_Projectile;
import net.mcreator.radiant.client.model.ModelHighspren;
import net.mcreator.radiant.client.model.ModelCryptic;
import net.mcreator.radiant.client.model.ModelAshspren;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RadiantModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelAshspren.LAYER_LOCATION, ModelAshspren::createBodyLayer);
		event.registerLayerDefinition(ModelCryptic.LAYER_LOCATION, ModelCryptic::createBodyLayer);
		event.registerLayerDefinition(ModelMastered_Sand_Projectile.LAYER_LOCATION, ModelMastered_Sand_Projectile::createBodyLayer);
		event.registerLayerDefinition(ModelHighspren.LAYER_LOCATION, ModelHighspren::createBodyLayer);
		event.registerLayerDefinition(ModelSeon.LAYER_LOCATION, ModelSeon::createBodyLayer);
	}
}
