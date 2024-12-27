package net.mcreator.radiant.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.radiant.network.RadiantModVariables;
import net.mcreator.radiant.init.RadiantModMobEffects;

import java.util.Random;

public class GravitationOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double Random = 0;
		if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 0) {
			if (entity.isNoGravity() && entity.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantCounter == 4) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(1));
			}
			if (entity.onGround()) {
				entity.setNoGravity(false);
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.xant = 0;
					_vars.syncPlayerVariables(entity);
				}
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.yant = 0;
					_vars.syncPlayerVariables(entity);
				}
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.zant = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
			if (entity.isShiftKeyDown()) {
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.xant = entity.getLookAngle().x;
					_vars.syncPlayerVariables(entity);
				}
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.yant = entity.getLookAngle().y;
					_vars.syncPlayerVariables(entity);
				}
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.zant = entity.getLookAngle().z;
					_vars.syncPlayerVariables(entity);
				}
			}
			if (entity.isNoGravity()) {
				if (entity.isSprinting()) {
					entity.setDeltaMovement(
							new Vec3((0.5 * entity.getData(RadiantModVariables.PLAYER_VARIABLES).xant), (0.5 * entity.getData(RadiantModVariables.PLAYER_VARIABLES).yant), (0.5 * entity.getData(RadiantModVariables.PLAYER_VARIABLES).zant)));
				} else {
					entity.setDeltaMovement(
							new Vec3((1.5 * entity.getData(RadiantModVariables.PLAYER_VARIABLES).xant), (1.5 * entity.getData(RadiantModVariables.PLAYER_VARIABLES).yant), (1.5 * entity.getData(RadiantModVariables.PLAYER_VARIABLES).zant)));
				}
			}
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.GRAVITATION_SKYBREAKER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.GRAVITATION_WINDRUNNER);
		}
	}
}
