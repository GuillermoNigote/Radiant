package net.mcreator.radiant.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.radiant.network.RadiantModVariables;
import net.mcreator.radiant.init.RadiantModMobEffects;

import java.util.List;
import java.util.Comparator;

public class AdhesionInfuseEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean AdhesionIsNear = false;
		AdhesionIsNear = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RadiantModMobEffects.ADHESION_WINDRUNNER)) {
					AdhesionIsNear = true;
					if (entityiterator.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantCounter == 4) {
						if (entityiterator instanceof Player _player)
							_player.giveExperiencePoints(-(1));
					}
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				entityiterator.setDeltaMovement(new Vec3(((-1.1) * (entityiterator.getX() - entity.getX())), ((-1.1) * (entityiterator.getY() - entity.getY())), ((-1.1) * (entityiterator.getZ() - entity.getZ()))));
			}
		}
		if (!AdhesionIsNear) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
