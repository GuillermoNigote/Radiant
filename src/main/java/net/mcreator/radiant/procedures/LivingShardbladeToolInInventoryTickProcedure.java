package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.radiant.network.RadiantModVariables;
import net.mcreator.radiant.init.RadiantModItems;

import java.util.Comparator;

public class LivingShardbladeToolInInventoryTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END || !entity.getData(RadiantModVariables.PLAYER_VARIABLES).SummonedBlade) {
			itemstack.shrink(1);
		} else {
			itemstack.setDamageValue(0);
			{
				final Vec3 _center = new Vec3(x, y, z);
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					if ((entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)
							&& entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("radiant:spren")))) {
						if (!entityiterator.level().isClientSide())
							entityiterator.discard();
					}
				}
			}
			if (entity.isNoGravity()) {
				if (itemstack.getItem() == RadiantModItems.WINDRUNNER_LIVING_SHARDBLADE.get()) {
					itemstack.shrink(1);
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(RadiantModItems.WINDRUNNER_LIVING_SHARDLANCE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (itemstack.getItem() == RadiantModItems.SKYBREAKER_LIVING_SHARDBLADE.get()) {
					itemstack.shrink(1);
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(RadiantModItems.SKYBREAKER_LIVING_SHARDLANCE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			} else {
				if (itemstack.getItem() == RadiantModItems.SKYBREAKER_LIVING_SHARDLANCE.get()) {
					itemstack.shrink(1);
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(RadiantModItems.SKYBREAKER_LIVING_SHARDBLADE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (itemstack.getItem() == RadiantModItems.WINDRUNNER_LIVING_SHARDLANCE.get()) {
					itemstack.shrink(1);
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(RadiantModItems.WINDRUNNER_LIVING_SHARDBLADE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		}
	}
}
