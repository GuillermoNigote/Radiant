
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.radiant.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.radiant.RadiantMod;

public class RadiantModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RadiantMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RADIANT = REGISTRY.register("radiant",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.radiant.radiant")).icon(() -> new ItemStack(RadiantModItems.RADIANTS_GLYPH.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RadiantModItems.TRUTHWATCHERS_GLYPH.get());
				tabData.accept(RadiantModItems.WILLSHAPERS_GLYPH.get());
				tabData.accept(RadiantModItems.STONEWARDS_GLYPH.get());
				tabData.accept(RadiantModItems.EDGEDANCERS_GLYPH.get());
				tabData.accept(RadiantModItems.DUSTBRINGERS_GLYPH.get());
				tabData.accept(RadiantModItems.RADIANTS_GLYPH.get());
				tabData.accept(RadiantModItems.SKYBREAKERS_GLYPH.get());
				tabData.accept(RadiantModItems.WINDRUNNERS_GLYPH.get());
				tabData.accept(RadiantModItems.WINDRUNNER_ADHESION_GLYPH.get());
				tabData.accept(RadiantModItems.WINDRUNNER_GRAVITATION_GLYPH.get());
				tabData.accept(RadiantModItems.SKYBREAKER_DIVISION_GLYPH.get());
				tabData.accept(RadiantModItems.SKYBREAKER_GRAVITATION_GLYPH.get());
				tabData.accept(RadiantModItems.DUSTBRINGER_DIVISION_GLYPH.get());
				tabData.accept(RadiantModItems.DUSTBRINGER_ABRASION_GLYPH.get());
				tabData.accept(RadiantModItems.LIGHTWEAVERS_GLYPH.get());
				tabData.accept(RadiantModItems.ELSECALLERS_GLYPH.get());
				tabData.accept(RadiantModItems.ELSECALLER_LIVING_SHARDBLADE.get());
				tabData.accept(RadiantModItems.EDGEDANCER_ABRASION_GLYPH.get());
				tabData.accept(RadiantModItems.EDGEDANCER_PROGRESSION_GLYPH.get());
				tabData.accept(RadiantModItems.TRUTHWATCHER_PROGRESSION_GLYPH.get());
				tabData.accept(RadiantModItems.TRUTHWATCHER_ILLUMINATION_GLYPH.get());
				tabData.accept(RadiantModItems.LIGHTWEAVER_ILLUMINATION_GLYPH.get());
				tabData.accept(RadiantModItems.LIGHTWEAVER_TRANSFORMATION_GLYPH.get());
				tabData.accept(RadiantModItems.ELSECALLER_TRANSFORMATION_GLYPH.get());
				tabData.accept(RadiantModItems.DUSTBRINGER_DEAD_SHARDBLADE.get());
				tabData.accept(RadiantModItems.EDGEDANCER_DEAD_SHARDBLADE.get());
				tabData.accept(RadiantModItems.STONEWARD_DEAD_SHARDBLADE.get());
				tabData.accept(RadiantModItems.WILLSHAPER_DEAD_SHARDBLADE.get());
				tabData.accept(RadiantModItems.TRUTHWATCHER_DEAD_SHARDBLADE.get());
				tabData.accept(RadiantModItems.WINDRUNNER_DEAD_SHARDBLADE.get());
				tabData.accept(RadiantModItems.LIGHTWEAVER_DEAD_SHARDBLADE.get());
				tabData.accept(RadiantModItems.SKYBREAKER_DEAD_SHARDBLADE.get());
				tabData.accept(RadiantModItems.ELSECALLER_TRANSPORTATION_GLYPH.get());
				tabData.accept(RadiantModItems.WILLSHAPER_TRANSPORTATION_GLYPH.get());
				tabData.accept(RadiantModItems.WILLSHAPER_COHESION_GLYPH.get());
				tabData.accept(RadiantModItems.STONEWARD_COHESION_GLYPH.get());
				tabData.accept(RadiantModItems.STONEWARD_TENSION_GLYPH.get());
				tabData.accept(RadiantModItems.DUSTBRINGER_SHARDPLATE_HELMET.get());
				tabData.accept(RadiantModItems.DUSTBRINGER_SHARDPLATE_CHESTPLATE.get());
				tabData.accept(RadiantModItems.DUSTBRINGER_SHARDPLATE_LEGGINGS.get());
				tabData.accept(RadiantModItems.DUSTBRINGER_SHARDPLATE_BOOTS.get());
			})

					.build());
}
