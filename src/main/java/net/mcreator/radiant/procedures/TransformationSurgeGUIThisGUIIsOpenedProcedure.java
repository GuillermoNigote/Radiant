package net.mcreator.radiant.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.radiant.init.RadiantModMobEffects;

public class TransformationSurgeGUIThisGUIIsOpenedProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double currentExp = 0;
		currentExp = CalculatePlayerXpProcedure.execute(entity);
		if (currentExp == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.TRANSFORMATION_ELSECALLER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.TRANSFORMATION_LIGHTWEAVER);
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You are too tired to do this..."), true);
		} else {
			if (currentExp <= TransformationCalculateXPProcedure.execute(x, y, z, entity)) {
				if (entity instanceof Player _player)
					_player.closeContainer();
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You don't have enough Investidure to do this..."), true);
			}
		}
	}
}