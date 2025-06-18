package net.mcreator.radiant.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.radiant.init.RadiantModMobEffects;

import java.util.Comparator;

public class DisguiseEntityIsHurtProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource) {
		if (damagesource == null)
			return false;
		if (damagesource.is(DamageTypes.ARROW) || damagesource.is(DamageTypes.PLAYER_ATTACK)) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					if (entityiterator instanceof LivingEntity _entity)
						_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_LIGHTWEAVER);
					if (entityiterator instanceof LivingEntity _entity)
						_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_TRUTHWATCHER);
				}
			}
			return true;
		}
		return false;
	}
}
