package net.mcreator.radiant.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.MagmaCube;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.animal.allay.Allay;
import net.minecraft.world.entity.animal.AbstractGolem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.EntityTypeTags;

public class LivingShardbladeEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof EnderDragon || entity instanceof AbstractGolem || entity instanceof Allay || entity instanceof Blaze || entity instanceof Creeper || entity instanceof MagmaCube || entity instanceof EnderMan
				|| entity.getType().is(EntityTypeTags.UNDEAD) || (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).isEnchanted())) {
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.PLAYER_ATTACK)), 1000);
		}
	}
}
