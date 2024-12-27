package net.mcreator.radiant.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.EntityTypeTags;

import net.mcreator.radiant.network.RadiantModVariables;
import net.mcreator.radiant.init.RadiantModMobEffects;

import java.util.List;
import java.util.Comparator;

public class IlluminationFakePlayerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean IlluminationIsNear = false;
		IlluminationIsNear = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(48 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RadiantModMobEffects.ILLUMINATION_TRUTHWATCHER)
						|| entityiterator instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(RadiantModMobEffects.ILLUMINATION_LIGHTWEAVER)) {
					IlluminationIsNear = true;
					if (entityiterator.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantCounter == 4) {
						if (entityiterator instanceof Player _player)
							_player.giveExperiencePoints(-(1));
					}
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!entity.getType().is(EntityTypeTags.ILLAGER)) {
					if (entityiterator instanceof Mob _entity && entity instanceof LivingEntity _ent)
						_entity.setTarget(_ent);
				}
			}
		}
		if (!IlluminationIsNear) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
