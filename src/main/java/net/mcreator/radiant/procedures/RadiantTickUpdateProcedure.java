package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import net.mcreator.radiant.network.RadiantModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class RadiantTickUpdateProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantCounter == 6) {
			{
				RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
				_vars.RadiantCounter = 1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			{
				RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
				_vars.RadiantCounter = entity.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantCounter + 1;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
