package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.radiant.network.RadiantModVariables;
import net.mcreator.radiant.init.RadiantModMobEffects;

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
		if (entity.isShiftKeyDown()
				&& !(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(RadiantModMobEffects.SUMMONING_SHARDPLATE_FIRST) && entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(RadiantModMobEffects.SUMMONING_SHARDPLATE_SECOND))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(RadiantModMobEffects.SUMMONING_SHARDPLATE_FIRST, 3, 0));
		}
	}
}