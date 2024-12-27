
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.radiant.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.radiant.block.entity.IlluminationSprucePlanksBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationSpruceLogBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationSnowBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationRedstoneOreBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationRedstoneBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationOakPlanksBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationOakLogBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationMudBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationMangrovePlanksBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationMangroveLogBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationLapislazuliOreBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationJunglePlanksBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationJungleLogBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationDeepslateRedstoneBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationDeepslateLapislazuliBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationDeepslateIronBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationDeepslateGoldBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationDeepslateDiamondBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationDeepslateCoalBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationDeepslateBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationDeepsalteEmeraldBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationDeepsalteCopperBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationDarkOakPlanksBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationDarkOakLogBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationCrimsonPlanksBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationCobblestoneBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationCobbledDeepslateBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationClayBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationCherryPlanksBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationCherryLogBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBookshelfBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBlockStoneBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBlockSandstoneBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBlockSandBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBlockObsidianBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBlockNetherrackBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBlockIronOreBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBlockGoldOreBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBlockGoldBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBlockEndstoneBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBlockEmeraldOreBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBlockEmeraldBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBlockDirtBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBlockDiamondOreBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBlockDiamondBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBlockBedrockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBlockAncientDebrisBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBirchPlanksBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationBirchLogBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationAcaciaPlanksBlockBlockEntity;
import net.mcreator.radiant.block.entity.IlluminationAcaciaLogBlockBlockEntity;
import net.mcreator.radiant.RadiantMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class RadiantModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, RadiantMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BLOCK = register("illumination_block", RadiantModBlocks.ILLUMINATION_BLOCK, IlluminationBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BLOCK_DIRT = register("illumination_block_dirt", RadiantModBlocks.ILLUMINATION_BLOCK_DIRT, IlluminationBlockDirtBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BLOCK_STONE = register("illumination_block_stone", RadiantModBlocks.ILLUMINATION_BLOCK_STONE, IlluminationBlockStoneBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BLOCK_OBSIDIAN = register("illumination_block_obsidian", RadiantModBlocks.ILLUMINATION_BLOCK_OBSIDIAN, IlluminationBlockObsidianBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BLOCK_SAND = register("illumination_block_sand", RadiantModBlocks.ILLUMINATION_BLOCK_SAND, IlluminationBlockSandBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BLOCK_NETHERRACK = register("illumination_block_netherrack", RadiantModBlocks.ILLUMINATION_BLOCK_NETHERRACK, IlluminationBlockNetherrackBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BLOCK_BEDROCK = register("illumination_block_bedrock", RadiantModBlocks.ILLUMINATION_BLOCK_BEDROCK, IlluminationBlockBedrockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BLOCK_DIAMOND = register("illumination_block_diamond", RadiantModBlocks.ILLUMINATION_BLOCK_DIAMOND, IlluminationBlockDiamondBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BLOCK_SANDSTONE = register("illumination_block_sandstone", RadiantModBlocks.ILLUMINATION_BLOCK_SANDSTONE, IlluminationBlockSandstoneBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BLOCK_ENDSTONE = register("illumination_block_endstone", RadiantModBlocks.ILLUMINATION_BLOCK_ENDSTONE, IlluminationBlockEndstoneBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BLOCK_DIAMOND_ORE = register("illumination_block_diamond_ore", RadiantModBlocks.ILLUMINATION_BLOCK_DIAMOND_ORE, IlluminationBlockDiamondOreBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BLOCK_IRON_ORE = register("illumination_block_iron_ore", RadiantModBlocks.ILLUMINATION_BLOCK_IRON_ORE, IlluminationBlockIronOreBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BLOCK_GOLD_ORE = register("illumination_block_gold_ore", RadiantModBlocks.ILLUMINATION_BLOCK_GOLD_ORE, IlluminationBlockGoldOreBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BLOCK_EMERALD_ORE = register("illumination_block_emerald_ore", RadiantModBlocks.ILLUMINATION_BLOCK_EMERALD_ORE, IlluminationBlockEmeraldOreBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BLOCK_GOLD = register("illumination_block_gold", RadiantModBlocks.ILLUMINATION_BLOCK_GOLD, IlluminationBlockGoldBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BLOCK_EMERALD = register("illumination_block_emerald", RadiantModBlocks.ILLUMINATION_BLOCK_EMERALD, IlluminationBlockEmeraldBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BLOCK_ANCIENT_DEBRIS = register("illumination_block_ancient_debris", RadiantModBlocks.ILLUMINATION_BLOCK_ANCIENT_DEBRIS,
			IlluminationBlockAncientDebrisBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_COBBLESTONE_BLOCK = register("illumination_cobblestone_block", RadiantModBlocks.ILLUMINATION_COBBLESTONE_BLOCK, IlluminationCobblestoneBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_ACACIA_LOG_BLOCK = register("illumination_acacia_log_block", RadiantModBlocks.ILLUMINATION_ACACIA_LOG_BLOCK, IlluminationAcaciaLogBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_ACACIA_PLANKS_BLOCK = register("illumination_acacia_planks_block", RadiantModBlocks.ILLUMINATION_ACACIA_PLANKS_BLOCK,
			IlluminationAcaciaPlanksBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BIRCH_LOG_BLOCK = register("illumination_birch_log_block", RadiantModBlocks.ILLUMINATION_BIRCH_LOG_BLOCK, IlluminationBirchLogBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BIRCH_PLANKS_BLOCK = register("illumination_birch_planks_block", RadiantModBlocks.ILLUMINATION_BIRCH_PLANKS_BLOCK,
			IlluminationBirchPlanksBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_BOOKSHELF_BLOCK = register("illumination_bookshelf_block", RadiantModBlocks.ILLUMINATION_BOOKSHELF_BLOCK, IlluminationBookshelfBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_CHERRY_LOG_BLOCK = register("illumination_cherry_log_block", RadiantModBlocks.ILLUMINATION_CHERRY_LOG_BLOCK, IlluminationCherryLogBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_CHERRY_PLANKS_BLOCK = register("illumination_cherry_planks_block", RadiantModBlocks.ILLUMINATION_CHERRY_PLANKS_BLOCK,
			IlluminationCherryPlanksBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_CLAY_BLOCK = register("illumination_clay_block", RadiantModBlocks.ILLUMINATION_CLAY_BLOCK, IlluminationClayBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_COBBLED_DEEPSLATE_BLOCK = register("illumination_cobbled_deepslate_block", RadiantModBlocks.ILLUMINATION_COBBLED_DEEPSLATE_BLOCK,
			IlluminationCobbledDeepslateBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_CRIMSON_PLANKS_BLOCK = register("illumination_crimson_planks_block", RadiantModBlocks.ILLUMINATION_CRIMSON_PLANKS_BLOCK,
			IlluminationCrimsonPlanksBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_DARK_OAK_LOG_BLOCK = register("illumination_dark_oak_log_block", RadiantModBlocks.ILLUMINATION_DARK_OAK_LOG_BLOCK,
			IlluminationDarkOakLogBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_DARK_OAK_PLANKS_BLOCK = register("illumination_dark_oak_planks_block", RadiantModBlocks.ILLUMINATION_DARK_OAK_PLANKS_BLOCK,
			IlluminationDarkOakPlanksBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_DEEPSLATE_BLOCK = register("illumination_deepslate_block", RadiantModBlocks.ILLUMINATION_DEEPSLATE_BLOCK, IlluminationDeepslateBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_DEEPSLATE_COAL_BLOCK = register("illumination_deepslate_coal_block", RadiantModBlocks.ILLUMINATION_DEEPSLATE_COAL_BLOCK,
			IlluminationDeepslateCoalBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_DEEPSLATE_IRON_BLOCK = register("illumination_deepslate_iron_block", RadiantModBlocks.ILLUMINATION_DEEPSLATE_IRON_BLOCK,
			IlluminationDeepslateIronBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_DEEPSALTE_COPPER_BLOCK = register("illumination_deepsalte_copper_block", RadiantModBlocks.ILLUMINATION_DEEPSALTE_COPPER_BLOCK,
			IlluminationDeepsalteCopperBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_DEEPSLATE_DIAMOND_BLOCK = register("illumination_deepslate_diamond_block", RadiantModBlocks.ILLUMINATION_DEEPSLATE_DIAMOND_BLOCK,
			IlluminationDeepslateDiamondBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_DEEPSALTE_EMERALD_BLOCK = register("illumination_deepsalte_emerald_block", RadiantModBlocks.ILLUMINATION_DEEPSALTE_EMERALD_BLOCK,
			IlluminationDeepsalteEmeraldBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_DEEPSLATE_GOLD_BLOCK = register("illumination_deepslate_gold_block", RadiantModBlocks.ILLUMINATION_DEEPSLATE_GOLD_BLOCK,
			IlluminationDeepslateGoldBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_DEEPSLATE_LAPISLAZULI_BLOCK = register("illumination_deepslate_lapislazuli_block", RadiantModBlocks.ILLUMINATION_DEEPSLATE_LAPISLAZULI_BLOCK,
			IlluminationDeepslateLapislazuliBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_DEEPSLATE_REDSTONE_BLOCK = register("illumination_deepslate_redstone_block", RadiantModBlocks.ILLUMINATION_DEEPSLATE_REDSTONE_BLOCK,
			IlluminationDeepslateRedstoneBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_JUNGLE_LOG_BLOCK = register("illumination_jungle_log_block", RadiantModBlocks.ILLUMINATION_JUNGLE_LOG_BLOCK, IlluminationJungleLogBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_JUNGLE_PLANKS_BLOCK = register("illumination_jungle_planks_block", RadiantModBlocks.ILLUMINATION_JUNGLE_PLANKS_BLOCK,
			IlluminationJunglePlanksBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_LAPISLAZULI_ORE_BLOCK = register("illumination_lapislazuli_ore_block", RadiantModBlocks.ILLUMINATION_LAPISLAZULI_ORE_BLOCK,
			IlluminationLapislazuliOreBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_MANGROVE_LOG_BLOCK = register("illumination_mangrove_log_block", RadiantModBlocks.ILLUMINATION_MANGROVE_LOG_BLOCK,
			IlluminationMangroveLogBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_MANGROVE_PLANKS_BLOCK = register("illumination_mangrove_planks_block", RadiantModBlocks.ILLUMINATION_MANGROVE_PLANKS_BLOCK,
			IlluminationMangrovePlanksBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_MUD_BLOCK = register("illumination_mud_block", RadiantModBlocks.ILLUMINATION_MUD_BLOCK, IlluminationMudBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_OAK_LOG_BLOCK = register("illumination_oak_log_block", RadiantModBlocks.ILLUMINATION_OAK_LOG_BLOCK, IlluminationOakLogBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_OAK_PLANKS_BLOCK = register("illumination_oak_planks_block", RadiantModBlocks.ILLUMINATION_OAK_PLANKS_BLOCK, IlluminationOakPlanksBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_REDSTONE_BLOCK = register("illumination_redstone_block", RadiantModBlocks.ILLUMINATION_REDSTONE_BLOCK, IlluminationRedstoneBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_REDSTONE_ORE_BLOCK = register("illumination_redstone_ore_block", RadiantModBlocks.ILLUMINATION_REDSTONE_ORE_BLOCK,
			IlluminationRedstoneOreBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_SNOW_BLOCK = register("illumination_snow_block", RadiantModBlocks.ILLUMINATION_SNOW_BLOCK, IlluminationSnowBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_SPRUCE_LOG_BLOCK = register("illumination_spruce_log_block", RadiantModBlocks.ILLUMINATION_SPRUCE_LOG_BLOCK, IlluminationSpruceLogBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ILLUMINATION_SPRUCE_PLANKS_BLOCK = register("illumination_spruce_planks_block", RadiantModBlocks.ILLUMINATION_SPRUCE_PLANKS_BLOCK,
			IlluminationSprucePlanksBlockBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BLOCK.get(), (blockEntity, side) -> ((IlluminationBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BLOCK_DIRT.get(), (blockEntity, side) -> ((IlluminationBlockDirtBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BLOCK_STONE.get(), (blockEntity, side) -> ((IlluminationBlockStoneBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BLOCK_OBSIDIAN.get(), (blockEntity, side) -> ((IlluminationBlockObsidianBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BLOCK_SAND.get(), (blockEntity, side) -> ((IlluminationBlockSandBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BLOCK_NETHERRACK.get(), (blockEntity, side) -> ((IlluminationBlockNetherrackBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BLOCK_BEDROCK.get(), (blockEntity, side) -> ((IlluminationBlockBedrockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BLOCK_DIAMOND.get(), (blockEntity, side) -> ((IlluminationBlockDiamondBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BLOCK_SANDSTONE.get(), (blockEntity, side) -> ((IlluminationBlockSandstoneBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BLOCK_ENDSTONE.get(), (blockEntity, side) -> ((IlluminationBlockEndstoneBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BLOCK_DIAMOND_ORE.get(), (blockEntity, side) -> ((IlluminationBlockDiamondOreBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BLOCK_IRON_ORE.get(), (blockEntity, side) -> ((IlluminationBlockIronOreBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BLOCK_GOLD_ORE.get(), (blockEntity, side) -> ((IlluminationBlockGoldOreBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BLOCK_EMERALD_ORE.get(), (blockEntity, side) -> ((IlluminationBlockEmeraldOreBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BLOCK_GOLD.get(), (blockEntity, side) -> ((IlluminationBlockGoldBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BLOCK_EMERALD.get(), (blockEntity, side) -> ((IlluminationBlockEmeraldBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BLOCK_ANCIENT_DEBRIS.get(), (blockEntity, side) -> ((IlluminationBlockAncientDebrisBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_COBBLESTONE_BLOCK.get(), (blockEntity, side) -> ((IlluminationCobblestoneBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_ACACIA_LOG_BLOCK.get(), (blockEntity, side) -> ((IlluminationAcaciaLogBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_ACACIA_PLANKS_BLOCK.get(), (blockEntity, side) -> ((IlluminationAcaciaPlanksBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BIRCH_LOG_BLOCK.get(), (blockEntity, side) -> ((IlluminationBirchLogBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BIRCH_PLANKS_BLOCK.get(), (blockEntity, side) -> ((IlluminationBirchPlanksBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_BOOKSHELF_BLOCK.get(), (blockEntity, side) -> ((IlluminationBookshelfBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_CHERRY_LOG_BLOCK.get(), (blockEntity, side) -> ((IlluminationCherryLogBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_CHERRY_PLANKS_BLOCK.get(), (blockEntity, side) -> ((IlluminationCherryPlanksBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_CLAY_BLOCK.get(), (blockEntity, side) -> ((IlluminationClayBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_COBBLED_DEEPSLATE_BLOCK.get(), (blockEntity, side) -> ((IlluminationCobbledDeepslateBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_CRIMSON_PLANKS_BLOCK.get(), (blockEntity, side) -> ((IlluminationCrimsonPlanksBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_DARK_OAK_LOG_BLOCK.get(), (blockEntity, side) -> ((IlluminationDarkOakLogBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_DARK_OAK_PLANKS_BLOCK.get(), (blockEntity, side) -> ((IlluminationDarkOakPlanksBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_DEEPSLATE_BLOCK.get(), (blockEntity, side) -> ((IlluminationDeepslateBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_DEEPSLATE_COAL_BLOCK.get(), (blockEntity, side) -> ((IlluminationDeepslateCoalBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_DEEPSLATE_IRON_BLOCK.get(), (blockEntity, side) -> ((IlluminationDeepslateIronBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_DEEPSALTE_COPPER_BLOCK.get(), (blockEntity, side) -> ((IlluminationDeepsalteCopperBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_DEEPSLATE_DIAMOND_BLOCK.get(), (blockEntity, side) -> ((IlluminationDeepslateDiamondBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_DEEPSALTE_EMERALD_BLOCK.get(), (blockEntity, side) -> ((IlluminationDeepsalteEmeraldBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_DEEPSLATE_GOLD_BLOCK.get(), (blockEntity, side) -> ((IlluminationDeepslateGoldBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_DEEPSLATE_LAPISLAZULI_BLOCK.get(), (blockEntity, side) -> ((IlluminationDeepslateLapislazuliBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_DEEPSLATE_REDSTONE_BLOCK.get(), (blockEntity, side) -> ((IlluminationDeepslateRedstoneBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_JUNGLE_LOG_BLOCK.get(), (blockEntity, side) -> ((IlluminationJungleLogBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_JUNGLE_PLANKS_BLOCK.get(), (blockEntity, side) -> ((IlluminationJunglePlanksBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_LAPISLAZULI_ORE_BLOCK.get(), (blockEntity, side) -> ((IlluminationLapislazuliOreBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_MANGROVE_LOG_BLOCK.get(), (blockEntity, side) -> ((IlluminationMangroveLogBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_MANGROVE_PLANKS_BLOCK.get(), (blockEntity, side) -> ((IlluminationMangrovePlanksBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_MUD_BLOCK.get(), (blockEntity, side) -> ((IlluminationMudBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_OAK_LOG_BLOCK.get(), (blockEntity, side) -> ((IlluminationOakLogBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_OAK_PLANKS_BLOCK.get(), (blockEntity, side) -> ((IlluminationOakPlanksBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_REDSTONE_BLOCK.get(), (blockEntity, side) -> ((IlluminationRedstoneBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_REDSTONE_ORE_BLOCK.get(), (blockEntity, side) -> ((IlluminationRedstoneOreBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_SNOW_BLOCK.get(), (blockEntity, side) -> ((IlluminationSnowBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_SPRUCE_LOG_BLOCK.get(), (blockEntity, side) -> ((IlluminationSpruceLogBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ILLUMINATION_SPRUCE_PLANKS_BLOCK.get(), (blockEntity, side) -> ((IlluminationSprucePlanksBlockBlockEntity) blockEntity).getItemHandler());
	}
}
