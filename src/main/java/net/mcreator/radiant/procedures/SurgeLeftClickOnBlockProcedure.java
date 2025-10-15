package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.radiant.network.RadiantModVariables;
import net.mcreator.radiant.init.RadiantModMobEffects;
import net.mcreator.radiant.init.RadiantModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SurgeLeftClickOnBlockProcedure {
	@SubscribeEvent
	public static void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if ((entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(RadiantModMobEffects.ILLUMINATION_LIGHTWEAVER) || entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(RadiantModMobEffects.ILLUMINATION_TRUTHWATCHER))
					&& entity.isShiftKeyDown() && (entity instanceof Player _plr ? _plr.experienceLevel : 0) > 2) {
				IlluminationLeftClickOnBlockProcedure.execute(world, x, y, z, entity);
			} else if ((entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(RadiantModMobEffects.DIVISION_SKYBREAKER) || entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(RadiantModMobEffects.DIVISION_DUSTBRINGER))
					&& (entity instanceof Player _plr ? _plr.experienceLevel : 0) > 1) {
				DivisionLeftClickOnBlockProcedure.execute(world, x, y, z);
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 1
					&& (entity instanceof LivingEntity _livEnt11 && _livEnt11.hasEffect(RadiantModMobEffects.COHESION_STONEWARD) || entity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(RadiantModMobEffects.COHESION_WILLSHAPER))) {
				CohesionLeftClickOnBlockProcedure.execute(world, x, y, z, entity);
			} else if (entity.isShiftKeyDown() && (entity instanceof LivingEntity _livEnt14 && _livEnt14.hasEffect(RadiantModMobEffects.TRANSFORMATION_ELSECALLER)
					|| entity instanceof LivingEntity _livEnt15 && _livEnt15.hasEffect(RadiantModMobEffects.TRANSFORMATION_LIGHTWEAVER))) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RadiantModBlocks.ALUMINUM_BLOCK.get())) {
					{
						RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
						_vars.xant = x;
						_vars.syncPlayerVariables(entity);
					}
					{
						RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
						_vars.yant = y;
						_vars.syncPlayerVariables(entity);
					}
					{
						RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
						_vars.zant = z;
						_vars.syncPlayerVariables(entity);
					}
				}
			}
		}
	}
}