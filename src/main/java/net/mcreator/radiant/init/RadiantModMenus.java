
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.radiant.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.radiant.world.inventory.TransformationSurgeGUIMenu;
import net.mcreator.radiant.RadiantMod;

public class RadiantModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, RadiantMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<TransformationSurgeGUIMenu>> TRANSFORMATION_SURGE_GUI = REGISTRY.register("transformation_surge_gui", () -> IMenuTypeExtension.create(TransformationSurgeGUIMenu::new));
}
