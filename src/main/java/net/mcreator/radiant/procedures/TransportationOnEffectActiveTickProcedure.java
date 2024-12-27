package net.mcreator.radiant.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.radiant.network.RadiantModVariables;
import net.mcreator.radiant.init.RadiantModMobEffects;

import java.util.List;
import java.util.Comparator;

public class TransportationOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 0) {
			if (entity.isShiftKeyDown()) {
				if (entity.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantCounter == 4) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(1));
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(52 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entity == entityiterator)) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 15, 0, false, false));
							}
						}
					}
				}
			}
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.TRANSPORTATION_WILLSHAPER);
		}
	}
}
