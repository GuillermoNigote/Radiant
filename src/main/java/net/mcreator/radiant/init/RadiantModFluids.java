
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.radiant.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.radiant.fluid.CohesionLiquidFluid;
import net.mcreator.radiant.fluid.CohesionBlockStoneFluid;
import net.mcreator.radiant.fluid.CohesionBlockSandstoneFluid;
import net.mcreator.radiant.fluid.CohesionBlockSandFluid;
import net.mcreator.radiant.fluid.CohesionBlockObsidianFluid;
import net.mcreator.radiant.fluid.CohesionBlockNetherrackFluid;
import net.mcreator.radiant.fluid.CohesionBlockGraniteFluid;
import net.mcreator.radiant.fluid.CohesionBlockEndstoneFluid;
import net.mcreator.radiant.fluid.CohesionBlockDirtFluid;
import net.mcreator.radiant.fluid.CohesionBlockDioriteFluid;
import net.mcreator.radiant.fluid.CohesionBlockDeepslateFluid;
import net.mcreator.radiant.fluid.CohesionBlockDeepslateCObblestoneFluid;
import net.mcreator.radiant.fluid.CohesionBlockDebrisFluid;
import net.mcreator.radiant.fluid.CohesionBlockCobblestoneFluid;
import net.mcreator.radiant.fluid.CohesionBlockBedrockFluid;
import net.mcreator.radiant.fluid.CohesionBlockAndesiteFluid;
import net.mcreator.radiant.fluid.BloodFluid;
import net.mcreator.radiant.RadiantMod;

public class RadiantModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, RadiantMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> COHESION_BLOCK_DIRT = REGISTRY.register("cohesion_block_dirt", () -> new CohesionBlockDirtFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COHESION_BLOCK_DIRT = REGISTRY.register("flowing_cohesion_block_dirt", () -> new CohesionBlockDirtFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> COHESION_BLOCK_STONE = REGISTRY.register("cohesion_block_stone", () -> new CohesionBlockStoneFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COHESION_BLOCK_STONE = REGISTRY.register("flowing_cohesion_block_stone", () -> new CohesionBlockStoneFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> COHESION_BLOCK_OBSIDIAN = REGISTRY.register("cohesion_block_obsidian", () -> new CohesionBlockObsidianFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COHESION_BLOCK_OBSIDIAN = REGISTRY.register("flowing_cohesion_block_obsidian", () -> new CohesionBlockObsidianFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> COHESION_BLOCK_NETHERRACK = REGISTRY.register("cohesion_block_netherrack", () -> new CohesionBlockNetherrackFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COHESION_BLOCK_NETHERRACK = REGISTRY.register("flowing_cohesion_block_netherrack", () -> new CohesionBlockNetherrackFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> COHESION_BLOCK_GRANITE = REGISTRY.register("cohesion_block_granite", () -> new CohesionBlockGraniteFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COHESION_BLOCK_GRANITE = REGISTRY.register("flowing_cohesion_block_granite", () -> new CohesionBlockGraniteFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> COHESION_BLOCK_SANDSTONE = REGISTRY.register("cohesion_block_sandstone", () -> new CohesionBlockSandstoneFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COHESION_BLOCK_SANDSTONE = REGISTRY.register("flowing_cohesion_block_sandstone", () -> new CohesionBlockSandstoneFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> COHESION_BLOCK_SAND = REGISTRY.register("cohesion_block_sand", () -> new CohesionBlockSandFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COHESION_BLOCK_SAND = REGISTRY.register("flowing_cohesion_block_sand", () -> new CohesionBlockSandFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> COHESION_BLOCK_DIORITE = REGISTRY.register("cohesion_block_diorite", () -> new CohesionBlockDioriteFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COHESION_BLOCK_DIORITE = REGISTRY.register("flowing_cohesion_block_diorite", () -> new CohesionBlockDioriteFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> COHESION_BLOCK_BEDROCK = REGISTRY.register("cohesion_block_bedrock", () -> new CohesionBlockBedrockFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COHESION_BLOCK_BEDROCK = REGISTRY.register("flowing_cohesion_block_bedrock", () -> new CohesionBlockBedrockFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> COHESION_BLOCK_ANDESITE = REGISTRY.register("cohesion_block_andesite", () -> new CohesionBlockAndesiteFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COHESION_BLOCK_ANDESITE = REGISTRY.register("flowing_cohesion_block_andesite", () -> new CohesionBlockAndesiteFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> COHESION_BLOCK_DEBRIS = REGISTRY.register("cohesion_block_debris", () -> new CohesionBlockDebrisFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COHESION_BLOCK_DEBRIS = REGISTRY.register("flowing_cohesion_block_debris", () -> new CohesionBlockDebrisFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> COHESION_BLOCK_ENDSTONE = REGISTRY.register("cohesion_block_endstone", () -> new CohesionBlockEndstoneFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COHESION_BLOCK_ENDSTONE = REGISTRY.register("flowing_cohesion_block_endstone", () -> new CohesionBlockEndstoneFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> COHESION_LIQUID = REGISTRY.register("cohesion_liquid", () -> new CohesionLiquidFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COHESION_LIQUID = REGISTRY.register("flowing_cohesion_liquid", () -> new CohesionLiquidFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> COHESION_BLOCK_COBBLESTONE = REGISTRY.register("cohesion_block_cobblestone", () -> new CohesionBlockCobblestoneFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COHESION_BLOCK_COBBLESTONE = REGISTRY.register("flowing_cohesion_block_cobblestone", () -> new CohesionBlockCobblestoneFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> COHESION_BLOCK_DEEPSLATE_C_OBBLESTONE = REGISTRY.register("cohesion_block_deepslate_c_obblestone", () -> new CohesionBlockDeepslateCObblestoneFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COHESION_BLOCK_DEEPSLATE_C_OBBLESTONE = REGISTRY.register("flowing_cohesion_block_deepslate_c_obblestone", () -> new CohesionBlockDeepslateCObblestoneFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> COHESION_BLOCK_DEEPSLATE = REGISTRY.register("cohesion_block_deepslate", () -> new CohesionBlockDeepslateFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COHESION_BLOCK_DEEPSLATE = REGISTRY.register("flowing_cohesion_block_deepslate", () -> new CohesionBlockDeepslateFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> BLOOD = REGISTRY.register("blood", () -> new BloodFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_BLOOD = REGISTRY.register("flowing_blood", () -> new BloodFluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(COHESION_BLOCK_DIRT.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COHESION_BLOCK_DIRT.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COHESION_BLOCK_STONE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COHESION_BLOCK_STONE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COHESION_BLOCK_OBSIDIAN.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COHESION_BLOCK_OBSIDIAN.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COHESION_BLOCK_NETHERRACK.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COHESION_BLOCK_NETHERRACK.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COHESION_BLOCK_GRANITE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COHESION_BLOCK_GRANITE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COHESION_BLOCK_SANDSTONE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COHESION_BLOCK_SANDSTONE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COHESION_BLOCK_SAND.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COHESION_BLOCK_SAND.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COHESION_BLOCK_DIORITE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COHESION_BLOCK_DIORITE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COHESION_BLOCK_BEDROCK.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COHESION_BLOCK_BEDROCK.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COHESION_BLOCK_ANDESITE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COHESION_BLOCK_ANDESITE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COHESION_BLOCK_DEBRIS.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COHESION_BLOCK_DEBRIS.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COHESION_BLOCK_ENDSTONE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COHESION_BLOCK_ENDSTONE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COHESION_LIQUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COHESION_LIQUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COHESION_BLOCK_COBBLESTONE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COHESION_BLOCK_COBBLESTONE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COHESION_BLOCK_DEEPSLATE_C_OBBLESTONE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COHESION_BLOCK_DEEPSLATE_C_OBBLESTONE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COHESION_BLOCK_DEEPSLATE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COHESION_BLOCK_DEEPSLATE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BLOOD.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BLOOD.get(), RenderType.translucent());
		}
	}
}
