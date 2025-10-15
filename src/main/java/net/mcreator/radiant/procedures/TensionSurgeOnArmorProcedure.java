package net.mcreator.radiant.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.radiant.init.RadiantModItems;

public class TensionSurgeOnArmorProcedure {
	public static void execute(LevelAccessor world, Entity entity, double armorslot) {
		if (entity == null)
			return;
		double damage = 0;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
			public static EquipmentSlot armorSlotByIndex(int _slotindex) {
				for (EquipmentSlot _slot : EquipmentSlot.values()) {
					if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
						return _slot;
					}
				}
				throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
			}
		}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getItem() == Items.CHAINMAIL_HELMET) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set((int) armorslot, new ItemStack(RadiantModItems.TENSION_CHAINMAIL_ARMOR_HELMET.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(new Object() {
						public static EquipmentSlot armorSlotByIndex(int _slotindex) {
							for (EquipmentSlot _slot : EquipmentSlot.values()) {
								if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
									return _slot;
								}
							}
							throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
						}
					}.armorSlotByIndex((int) armorslot), new ItemStack(RadiantModItems.TENSION_CHAINMAIL_ARMOR_HELMET.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).setDamageValue((int) damage);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), 5);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(10));
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
			public static EquipmentSlot armorSlotByIndex(int _slotindex) {
				for (EquipmentSlot _slot : EquipmentSlot.values()) {
					if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
						return _slot;
					}
				}
				throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
			}
		}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getItem() == Items.CHAINMAIL_CHESTPLATE) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set((int) armorslot, new ItemStack(RadiantModItems.TENSION_CHAINMAIL_ARMOR_CHESTPLATE.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(new Object() {
						public static EquipmentSlot armorSlotByIndex(int _slotindex) {
							for (EquipmentSlot _slot : EquipmentSlot.values()) {
								if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
									return _slot;
								}
							}
							throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
						}
					}.armorSlotByIndex((int) armorslot), new ItemStack(RadiantModItems.TENSION_CHAINMAIL_ARMOR_CHESTPLATE.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).setDamageValue((int) damage);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), 5);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(30));
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
			public static EquipmentSlot armorSlotByIndex(int _slotindex) {
				for (EquipmentSlot _slot : EquipmentSlot.values()) {
					if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
						return _slot;
					}
				}
				throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
			}
		}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getItem() == Items.CHAINMAIL_LEGGINGS) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set((int) armorslot, new ItemStack(RadiantModItems.TENSION_CHAINMAIL_ARMOR_LEGGINGS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(new Object() {
						public static EquipmentSlot armorSlotByIndex(int _slotindex) {
							for (EquipmentSlot _slot : EquipmentSlot.values()) {
								if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
									return _slot;
								}
							}
							throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
						}
					}.armorSlotByIndex((int) armorslot), new ItemStack(RadiantModItems.TENSION_CHAINMAIL_ARMOR_LEGGINGS.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).setDamageValue((int) damage);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), 5);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(20));
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
			public static EquipmentSlot armorSlotByIndex(int _slotindex) {
				for (EquipmentSlot _slot : EquipmentSlot.values()) {
					if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
						return _slot;
					}
				}
				throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
			}
		}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getItem() == Items.CHAINMAIL_BOOTS) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set((int) armorslot, new ItemStack(RadiantModItems.TENSION_CHAINMAIL_ARMOR_BOOTS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(new Object() {
						public static EquipmentSlot armorSlotByIndex(int _slotindex) {
							for (EquipmentSlot _slot : EquipmentSlot.values()) {
								if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
									return _slot;
								}
							}
							throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
						}
					}.armorSlotByIndex((int) armorslot), new ItemStack(RadiantModItems.TENSION_CHAINMAIL_ARMOR_BOOTS.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).setDamageValue((int) damage);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), 5);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(10));
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
			public static EquipmentSlot armorSlotByIndex(int _slotindex) {
				for (EquipmentSlot _slot : EquipmentSlot.values()) {
					if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
						return _slot;
					}
				}
				throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
			}
		}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getItem() == Items.IRON_HELMET) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set((int) damage, new ItemStack(RadiantModItems.TENSION_IRON_ARMOR_HELMET.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(new Object() {
						public static EquipmentSlot armorSlotByIndex(int _slotindex) {
							for (EquipmentSlot _slot : EquipmentSlot.values()) {
								if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
									return _slot;
								}
							}
							throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
						}
					}.armorSlotByIndex((int) damage), new ItemStack(RadiantModItems.TENSION_IRON_ARMOR_HELMET.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).setDamageValue((int) damage);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), 5);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(10));
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
			public static EquipmentSlot armorSlotByIndex(int _slotindex) {
				for (EquipmentSlot _slot : EquipmentSlot.values()) {
					if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
						return _slot;
					}
				}
				throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
			}
		}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getItem() == Items.IRON_CHESTPLATE) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set((int) armorslot, new ItemStack(RadiantModItems.TENSION_IRON_ARMOR_CHESTPLATE.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(new Object() {
						public static EquipmentSlot armorSlotByIndex(int _slotindex) {
							for (EquipmentSlot _slot : EquipmentSlot.values()) {
								if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
									return _slot;
								}
							}
							throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
						}
					}.armorSlotByIndex((int) armorslot), new ItemStack(RadiantModItems.TENSION_IRON_ARMOR_CHESTPLATE.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).setDamageValue((int) damage);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), 5);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(30));
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
			public static EquipmentSlot armorSlotByIndex(int _slotindex) {
				for (EquipmentSlot _slot : EquipmentSlot.values()) {
					if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
						return _slot;
					}
				}
				throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
			}
		}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getItem() == Items.IRON_LEGGINGS) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set((int) armorslot, new ItemStack(RadiantModItems.TENSION_IRON_ARMOR_LEGGINGS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(new Object() {
						public static EquipmentSlot armorSlotByIndex(int _slotindex) {
							for (EquipmentSlot _slot : EquipmentSlot.values()) {
								if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
									return _slot;
								}
							}
							throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
						}
					}.armorSlotByIndex((int) armorslot), new ItemStack(RadiantModItems.TENSION_IRON_ARMOR_LEGGINGS.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).setDamageValue((int) damage);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), 5);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(20));
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
			public static EquipmentSlot armorSlotByIndex(int _slotindex) {
				for (EquipmentSlot _slot : EquipmentSlot.values()) {
					if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
						return _slot;
					}
				}
				throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
			}
		}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getItem() == Items.IRON_BOOTS) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set((int) armorslot, new ItemStack(RadiantModItems.TENSION_IRON_ARMOR_BOOTS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(new Object() {
						public static EquipmentSlot armorSlotByIndex(int _slotindex) {
							for (EquipmentSlot _slot : EquipmentSlot.values()) {
								if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
									return _slot;
								}
							}
							throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
						}
					}.armorSlotByIndex((int) armorslot), new ItemStack(RadiantModItems.TENSION_IRON_ARMOR_BOOTS.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).setDamageValue((int) damage);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), 5);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(10));
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
			public static EquipmentSlot armorSlotByIndex(int _slotindex) {
				for (EquipmentSlot _slot : EquipmentSlot.values()) {
					if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
						return _slot;
					}
				}
				throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
			}
		}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getItem() == Items.GOLDEN_HELMET) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set((int) armorslot, new ItemStack(RadiantModItems.TENSION_GOLD_ARMOR_HELMET.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(new Object() {
						public static EquipmentSlot armorSlotByIndex(int _slotindex) {
							for (EquipmentSlot _slot : EquipmentSlot.values()) {
								if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
									return _slot;
								}
							}
							throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
						}
					}.armorSlotByIndex((int) armorslot), new ItemStack(RadiantModItems.TENSION_GOLD_ARMOR_HELMET.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).setDamageValue((int) damage);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), 5);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(10));
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
			public static EquipmentSlot armorSlotByIndex(int _slotindex) {
				for (EquipmentSlot _slot : EquipmentSlot.values()) {
					if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
						return _slot;
					}
				}
				throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
			}
		}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getItem() == Items.GOLDEN_CHESTPLATE) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set((int) armorslot, new ItemStack(RadiantModItems.TENSION_GOLD_ARMOR_CHESTPLATE.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(new Object() {
						public static EquipmentSlot armorSlotByIndex(int _slotindex) {
							for (EquipmentSlot _slot : EquipmentSlot.values()) {
								if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
									return _slot;
								}
							}
							throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
						}
					}.armorSlotByIndex((int) armorslot), new ItemStack(RadiantModItems.TENSION_GOLD_ARMOR_CHESTPLATE.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).setDamageValue((int) damage);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), 5);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(30));
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
			public static EquipmentSlot armorSlotByIndex(int _slotindex) {
				for (EquipmentSlot _slot : EquipmentSlot.values()) {
					if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
						return _slot;
					}
				}
				throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
			}
		}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getItem() == Items.GOLDEN_LEGGINGS) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set((int) armorslot, new ItemStack(RadiantModItems.TENSION_GOLD_ARMOR_LEGGINGS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(new Object() {
						public static EquipmentSlot armorSlotByIndex(int _slotindex) {
							for (EquipmentSlot _slot : EquipmentSlot.values()) {
								if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
									return _slot;
								}
							}
							throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
						}
					}.armorSlotByIndex((int) armorslot), new ItemStack(RadiantModItems.TENSION_GOLD_ARMOR_LEGGINGS.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).setDamageValue((int) damage);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), 5);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(20));
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
			public static EquipmentSlot armorSlotByIndex(int _slotindex) {
				for (EquipmentSlot _slot : EquipmentSlot.values()) {
					if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
						return _slot;
					}
				}
				throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
			}
		}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getItem() == Items.GOLDEN_BOOTS) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set((int) armorslot, new ItemStack(RadiantModItems.TENSION_GOLD_ARMOR_BOOTS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(new Object() {
						public static EquipmentSlot armorSlotByIndex(int _slotindex) {
							for (EquipmentSlot _slot : EquipmentSlot.values()) {
								if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
									return _slot;
								}
							}
							throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
						}
					}.armorSlotByIndex((int) armorslot), new ItemStack(RadiantModItems.TENSION_GOLD_ARMOR_BOOTS.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).setDamageValue((int) damage);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), 5);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(10));
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
			public static EquipmentSlot armorSlotByIndex(int _slotindex) {
				for (EquipmentSlot _slot : EquipmentSlot.values()) {
					if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
						return _slot;
					}
				}
				throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
			}
		}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getItem() == Items.DIAMOND_HELMET) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set((int) armorslot, new ItemStack(RadiantModItems.TENSION_DIAMOND_ARMOR_HELMET.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(new Object() {
						public static EquipmentSlot armorSlotByIndex(int _slotindex) {
							for (EquipmentSlot _slot : EquipmentSlot.values()) {
								if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
									return _slot;
								}
							}
							throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
						}
					}.armorSlotByIndex((int) armorslot), new ItemStack(RadiantModItems.TENSION_DIAMOND_ARMOR_HELMET.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).setDamageValue((int) damage);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), 5);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(10));
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
			public static EquipmentSlot armorSlotByIndex(int _slotindex) {
				for (EquipmentSlot _slot : EquipmentSlot.values()) {
					if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
						return _slot;
					}
				}
				throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
			}
		}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getItem() == Items.DIAMOND_CHESTPLATE) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set((int) armorslot, new ItemStack(RadiantModItems.TENSION_DIAMOND_ARMOR_CHESTPLATE.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(new Object() {
						public static EquipmentSlot armorSlotByIndex(int _slotindex) {
							for (EquipmentSlot _slot : EquipmentSlot.values()) {
								if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
									return _slot;
								}
							}
							throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
						}
					}.armorSlotByIndex((int) armorslot), new ItemStack(RadiantModItems.TENSION_DIAMOND_ARMOR_CHESTPLATE.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).setDamageValue((int) damage);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), 5);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(30));
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
			public static EquipmentSlot armorSlotByIndex(int _slotindex) {
				for (EquipmentSlot _slot : EquipmentSlot.values()) {
					if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
						return _slot;
					}
				}
				throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
			}
		}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getItem() == Items.DIAMOND_LEGGINGS) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set((int) armorslot, new ItemStack(RadiantModItems.TENSION_DIAMOND_ARMOR_LEGGINGS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(new Object() {
						public static EquipmentSlot armorSlotByIndex(int _slotindex) {
							for (EquipmentSlot _slot : EquipmentSlot.values()) {
								if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
									return _slot;
								}
							}
							throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
						}
					}.armorSlotByIndex((int) armorslot), new ItemStack(RadiantModItems.TENSION_DIAMOND_ARMOR_LEGGINGS.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).setDamageValue((int) damage);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), 5);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(20));
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
			public static EquipmentSlot armorSlotByIndex(int _slotindex) {
				for (EquipmentSlot _slot : EquipmentSlot.values()) {
					if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
						return _slot;
					}
				}
				throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
			}
		}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getItem() == Items.DIAMOND_BOOTS) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set((int) armorslot, new ItemStack(RadiantModItems.TENSION_DIAMOND_ARMOR_BOOTS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(new Object() {
						public static EquipmentSlot armorSlotByIndex(int _slotindex) {
							for (EquipmentSlot _slot : EquipmentSlot.values()) {
								if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
									return _slot;
								}
							}
							throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
						}
					}.armorSlotByIndex((int) armorslot), new ItemStack(RadiantModItems.TENSION_DIAMOND_ARMOR_BOOTS.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).setDamageValue((int) damage);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), 5);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(10));
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
			public static EquipmentSlot armorSlotByIndex(int _slotindex) {
				for (EquipmentSlot _slot : EquipmentSlot.values()) {
					if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
						return _slot;
					}
				}
				throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
			}
		}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getItem() == Items.TURTLE_HELMET) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set((int) armorslot, new ItemStack(RadiantModItems.TENSION_TURTLE_ARMOR_HELMET.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(new Object() {
						public static EquipmentSlot armorSlotByIndex(int _slotindex) {
							for (EquipmentSlot _slot : EquipmentSlot.values()) {
								if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
									return _slot;
								}
							}
							throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
						}
					}.armorSlotByIndex((int) armorslot), new ItemStack(RadiantModItems.TENSION_TURTLE_ARMOR_HELMET.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).setDamageValue((int) damage);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(new Object() {
				public static EquipmentSlot armorSlotByIndex(int _slotindex) {
					for (EquipmentSlot _slot : EquipmentSlot.values()) {
						if (_slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR && _slot.getIndex() == _slotindex) {
							return _slot;
						}
					}
					throw new IllegalArgumentException("Invalid slot index: " + _slotindex);
				}
			}.armorSlotByIndex((int) armorslot)) : ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), 5);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(10));
		}
	}
}