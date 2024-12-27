package net.mcreator.radiant.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.radiant.init.RadiantModMobEffects;
import net.mcreator.radiant.init.RadiantModBlocks;

public class IlluminationJungleLogBlockBlockIsPlacedByProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RadiantModMobEffects.ILLUMINATION_LIGHTWEAVER) || entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(RadiantModMobEffects.ILLUMINATION_TRUTHWATCHER))
				&& (entity instanceof Player _plr ? _plr.experienceLevel : 0) > 2) {
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(5));
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_JUNGLE_LOG_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
