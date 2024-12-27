
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.radiant.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.radiant.fluid.types.CohesionLiquidFluidType;
import net.mcreator.radiant.fluid.types.CohesionBlockStoneFluidType;
import net.mcreator.radiant.fluid.types.CohesionBlockSandstoneFluidType;
import net.mcreator.radiant.fluid.types.CohesionBlockSandFluidType;
import net.mcreator.radiant.fluid.types.CohesionBlockObsidianFluidType;
import net.mcreator.radiant.fluid.types.CohesionBlockNetherrackFluidType;
import net.mcreator.radiant.fluid.types.CohesionBlockGraniteFluidType;
import net.mcreator.radiant.fluid.types.CohesionBlockEndstoneFluidType;
import net.mcreator.radiant.fluid.types.CohesionBlockDirtFluidType;
import net.mcreator.radiant.fluid.types.CohesionBlockDioriteFluidType;
import net.mcreator.radiant.fluid.types.CohesionBlockDeepslateFluidType;
import net.mcreator.radiant.fluid.types.CohesionBlockDeepslateCObblestoneFluidType;
import net.mcreator.radiant.fluid.types.CohesionBlockDebrisFluidType;
import net.mcreator.radiant.fluid.types.CohesionBlockCobblestoneFluidType;
import net.mcreator.radiant.fluid.types.CohesionBlockBedrockFluidType;
import net.mcreator.radiant.fluid.types.CohesionBlockAndesiteFluidType;
import net.mcreator.radiant.fluid.types.BloodFluidType;
import net.mcreator.radiant.RadiantMod;

public class RadiantModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, RadiantMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> COHESION_BLOCK_DIRT_TYPE = REGISTRY.register("cohesion_block_dirt", () -> new CohesionBlockDirtFluidType());
	public static final DeferredHolder<FluidType, FluidType> COHESION_BLOCK_STONE_TYPE = REGISTRY.register("cohesion_block_stone", () -> new CohesionBlockStoneFluidType());
	public static final DeferredHolder<FluidType, FluidType> COHESION_BLOCK_OBSIDIAN_TYPE = REGISTRY.register("cohesion_block_obsidian", () -> new CohesionBlockObsidianFluidType());
	public static final DeferredHolder<FluidType, FluidType> COHESION_BLOCK_NETHERRACK_TYPE = REGISTRY.register("cohesion_block_netherrack", () -> new CohesionBlockNetherrackFluidType());
	public static final DeferredHolder<FluidType, FluidType> COHESION_BLOCK_GRANITE_TYPE = REGISTRY.register("cohesion_block_granite", () -> new CohesionBlockGraniteFluidType());
	public static final DeferredHolder<FluidType, FluidType> COHESION_BLOCK_SANDSTONE_TYPE = REGISTRY.register("cohesion_block_sandstone", () -> new CohesionBlockSandstoneFluidType());
	public static final DeferredHolder<FluidType, FluidType> COHESION_BLOCK_SAND_TYPE = REGISTRY.register("cohesion_block_sand", () -> new CohesionBlockSandFluidType());
	public static final DeferredHolder<FluidType, FluidType> COHESION_BLOCK_DIORITE_TYPE = REGISTRY.register("cohesion_block_diorite", () -> new CohesionBlockDioriteFluidType());
	public static final DeferredHolder<FluidType, FluidType> COHESION_BLOCK_BEDROCK_TYPE = REGISTRY.register("cohesion_block_bedrock", () -> new CohesionBlockBedrockFluidType());
	public static final DeferredHolder<FluidType, FluidType> COHESION_BLOCK_ANDESITE_TYPE = REGISTRY.register("cohesion_block_andesite", () -> new CohesionBlockAndesiteFluidType());
	public static final DeferredHolder<FluidType, FluidType> COHESION_BLOCK_DEBRIS_TYPE = REGISTRY.register("cohesion_block_debris", () -> new CohesionBlockDebrisFluidType());
	public static final DeferredHolder<FluidType, FluidType> COHESION_BLOCK_ENDSTONE_TYPE = REGISTRY.register("cohesion_block_endstone", () -> new CohesionBlockEndstoneFluidType());
	public static final DeferredHolder<FluidType, FluidType> COHESION_LIQUID_TYPE = REGISTRY.register("cohesion_liquid", () -> new CohesionLiquidFluidType());
	public static final DeferredHolder<FluidType, FluidType> COHESION_BLOCK_COBBLESTONE_TYPE = REGISTRY.register("cohesion_block_cobblestone", () -> new CohesionBlockCobblestoneFluidType());
	public static final DeferredHolder<FluidType, FluidType> COHESION_BLOCK_DEEPSLATE_C_OBBLESTONE_TYPE = REGISTRY.register("cohesion_block_deepslate_c_obblestone", () -> new CohesionBlockDeepslateCObblestoneFluidType());
	public static final DeferredHolder<FluidType, FluidType> COHESION_BLOCK_DEEPSLATE_TYPE = REGISTRY.register("cohesion_block_deepslate", () -> new CohesionBlockDeepslateFluidType());
	public static final DeferredHolder<FluidType, FluidType> BLOOD_TYPE = REGISTRY.register("blood", () -> new BloodFluidType());
}
