package net.mcreator.radiant.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.radiant.network.RadiantModVariables;
import net.mcreator.radiant.init.RadiantModMobEffects;

public class ProgressionOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 0) {
			if (entity.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantCounter == 3 && (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) != 20) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(1));
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
			}
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.PROGRESSION_EDGEDANCER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.PROGRESSION_TRUTHWATCHER);
		}
	}
}
