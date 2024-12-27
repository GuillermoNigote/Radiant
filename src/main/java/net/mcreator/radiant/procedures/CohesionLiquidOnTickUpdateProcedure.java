package net.mcreator.radiant.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.radiant.init.RadiantModMobEffects;

import java.util.List;
import java.util.Comparator;

public class CohesionLiquidOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean keepCohesion = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RadiantModMobEffects.COHESION_WILLSHAPER) || entityiterator instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(RadiantModMobEffects.COHESION_STONEWARD)) {
					keepCohesion = true;
				}
			}
		}
		if (!keepCohesion) {
			sx = -1;
			for (int index0 = 0; index0 < 2; index0++) {
				sy = -1;
				for (int index1 = 0; index1 < 2; index1++) {
					sz = -1;
					for (int index2 = 0; index2 < 2; index2++) {
						if (!world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz))) {
							{
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockState _bs = (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)));
								BlockState _bso = world.getBlockState(_bp);
								for (Property<?> _propertyOld : _bso.getProperties()) {
									Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
									if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
										try {
											_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
		}
	}
}
