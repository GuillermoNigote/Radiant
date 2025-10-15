package net.mcreator.radiant.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class CalculatePlayerXpProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double level = 0;
		double nextXpTarget = 0;
		double progress = 0;
		double exp = 0;
		level = entity instanceof Player _plr ? _plr.experienceLevel : 0;
		nextXpTarget = entity instanceof Player _plr ? _plr.getXpNeededForNextLevel() : 0;
		progress = entity instanceof Player _plr ? _plr.experienceProgress : 0;
		nextXpTarget = nextXpTarget * progress;
		if (level == 0) {
			exp = progress;
		}
		else if (level < 16) {
			exp = 2 * level + 7 + nextXpTarget;
		} else if (level >= 16 && level <= 32) {
			exp = 5 * level - 38 + nextXpTarget;
		}
		else {
			exp = 9 * level - 158 + nextXpTarget;
		}
		return  Math.round(exp);
	}
}