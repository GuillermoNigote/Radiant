
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.radiant.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.radiant.client.gui.TransformationSurgeGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RadiantModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(RadiantModMenus.TRANSFORMATION_SURGE_GUI.get(), TransformationSurgeGUIScreen::new);
	}
}
