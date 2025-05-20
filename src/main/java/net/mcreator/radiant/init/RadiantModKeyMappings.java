
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.radiant.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.radiant.network.UseSecondSurgeMessage;
import net.mcreator.radiant.network.UseFirstSurgeMessage;
import net.mcreator.radiant.network.SummonShardbladeKeyBindMessage;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RadiantModKeyMappings {
	public static final KeyMapping USE_FIRST_SURGE = new KeyMapping("key.radiant.use_first_surge", GLFW.GLFW_KEY_UNKNOWN, "key.categories.radiant") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new UseFirstSurgeMessage(0, 0));
				UseFirstSurgeMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_SECOND_SURGE = new KeyMapping("key.radiant.use_second_surge", GLFW.GLFW_KEY_UNKNOWN, "key.categories.radiant") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new UseSecondSurgeMessage(0, 0));
				UseSecondSurgeMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SUMMON_SHARDBLADE_KEY_BIND = new KeyMapping("key.radiant.summon_shardblade_key_bind", GLFW.GLFW_KEY_Q, "key.categories.radiant") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new SummonShardbladeKeyBindMessage(0, 0));
				SummonShardbladeKeyBindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(USE_FIRST_SURGE);
		event.register(USE_SECOND_SURGE);
		event.register(SUMMON_SHARDBLADE_KEY_BIND);
	}

	@EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				USE_FIRST_SURGE.consumeClick();
				USE_SECOND_SURGE.consumeClick();
				SUMMON_SHARDBLADE_KEY_BIND.consumeClick();
			}
		}
	}
}
