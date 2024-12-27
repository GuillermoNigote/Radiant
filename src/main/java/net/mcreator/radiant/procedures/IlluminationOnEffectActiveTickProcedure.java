package net.mcreator.radiant.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.radiant.init.RadiantModMobEffects;

public class IlluminationOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) < 2) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_LIGHTWEAVER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_TRUTHWATCHER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION);
		}
	}
}
