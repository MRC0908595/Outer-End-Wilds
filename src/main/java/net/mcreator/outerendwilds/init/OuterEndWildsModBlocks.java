
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.outerendwilds.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.outerendwilds.block.WildWoodBlock;
import net.mcreator.outerendwilds.block.WildStairsBlock;
import net.mcreator.outerendwilds.block.WildSlabBlock;
import net.mcreator.outerendwilds.block.WildSaplingBlock;
import net.mcreator.outerendwilds.block.WildRootBlock;
import net.mcreator.outerendwilds.block.WildPressurePlateBlock;
import net.mcreator.outerendwilds.block.WildPlanksBlock;
import net.mcreator.outerendwilds.block.WildNyliumBlock;
import net.mcreator.outerendwilds.block.WildLogBlock;
import net.mcreator.outerendwilds.block.WildLeavesBlock;
import net.mcreator.outerendwilds.block.WildFenceGateBlock;
import net.mcreator.outerendwilds.block.WildFenceBlock;
import net.mcreator.outerendwilds.block.WildButtonBlock;
import net.mcreator.outerendwilds.block.TwistFlowerBlock;
import net.mcreator.outerendwilds.block.StrippedWildWoodBlock;
import net.mcreator.outerendwilds.block.StrippedWildLogBlock;
import net.mcreator.outerendwilds.block.PolishedEndSlateWallBlock;
import net.mcreator.outerendwilds.block.PolishedEndSlateStairsBlock;
import net.mcreator.outerendwilds.block.PolishedEndSlateSlabBlock;
import net.mcreator.outerendwilds.block.PolishedEndSlateBlock;
import net.mcreator.outerendwilds.block.EnderiteBlockBlock;
import net.mcreator.outerendwilds.block.EndStonePillarBlock;
import net.mcreator.outerendwilds.block.EndStoneLampBlock;
import net.mcreator.outerendwilds.block.EndSlateTilesBlock;
import net.mcreator.outerendwilds.block.EndSlateTileWallBlock;
import net.mcreator.outerendwilds.block.EndSlateTileStairsBlock;
import net.mcreator.outerendwilds.block.EndSlateTileSlabBlock;
import net.mcreator.outerendwilds.block.EndSlateBricksBlock;
import net.mcreator.outerendwilds.block.EndSlateBrickWallBlock;
import net.mcreator.outerendwilds.block.EndSlateBrickStairsBlock;
import net.mcreator.outerendwilds.block.EndSlateBrickSlabBlock;
import net.mcreator.outerendwilds.block.EndSlateBlock;
import net.mcreator.outerendwilds.block.EndRodBlockBlock;
import net.mcreator.outerendwilds.block.CobbledEndSlateWallBlock;
import net.mcreator.outerendwilds.block.CobbledEndSlateStairsBlock;
import net.mcreator.outerendwilds.block.CobbledEndSlateSlabBlock;
import net.mcreator.outerendwilds.block.CobbledEndSlateBlock;
import net.mcreator.outerendwilds.block.CanvasBlockBlock;
import net.mcreator.outerendwilds.block.CanvasBlock8Block;
import net.mcreator.outerendwilds.block.CanvasBlock7Block;
import net.mcreator.outerendwilds.block.CanvasBlock6Block;
import net.mcreator.outerendwilds.block.CanvasBlock5Block;
import net.mcreator.outerendwilds.block.CanvasBlock4Block;
import net.mcreator.outerendwilds.block.CanvasBlock3Block;
import net.mcreator.outerendwilds.block.CanvasBlock2Block;
import net.mcreator.outerendwilds.block.CanvasBlock1Block;
import net.mcreator.outerendwilds.block.AcidBlock;
import net.mcreator.outerendwilds.OuterEndWildsMod;

public class OuterEndWildsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(OuterEndWildsMod.MODID);
	public static final DeferredBlock<Block> WILD_LOG = REGISTRY.register("wild_log", WildLogBlock::new);
	public static final DeferredBlock<Block> WILD_PLANKS = REGISTRY.register("wild_planks", WildPlanksBlock::new);
	public static final DeferredBlock<Block> WILD_LEAVES = REGISTRY.register("wild_leaves", WildLeavesBlock::new);
	public static final DeferredBlock<Block> WILD_STAIRS = REGISTRY.register("wild_stairs", WildStairsBlock::new);
	public static final DeferredBlock<Block> WILD_SLAB = REGISTRY.register("wild_slab", WildSlabBlock::new);
	public static final DeferredBlock<Block> WILD_FENCE = REGISTRY.register("wild_fence", WildFenceBlock::new);
	public static final DeferredBlock<Block> WILD_FENCE_GATE = REGISTRY.register("wild_fence_gate", WildFenceGateBlock::new);
	public static final DeferredBlock<Block> WILD_PRESSURE_PLATE = REGISTRY.register("wild_pressure_plate", WildPressurePlateBlock::new);
	public static final DeferredBlock<Block> WILD_BUTTON = REGISTRY.register("wild_button", WildButtonBlock::new);
	public static final DeferredBlock<Block> WILD_NYLIUM = REGISTRY.register("wild_nylium", WildNyliumBlock::new);
	public static final DeferredBlock<Block> WILD_WOOD = REGISTRY.register("wild_wood", WildWoodBlock::new);
	public static final DeferredBlock<Block> WILD_ROOT = REGISTRY.register("wild_root", WildRootBlock::new);
	public static final DeferredBlock<Block> END_ROD_BLOCK = REGISTRY.register("end_rod_block", EndRodBlockBlock::new);
	public static final DeferredBlock<Block> END_SLATE = REGISTRY.register("end_slate", EndSlateBlock::new);
	public static final DeferredBlock<Block> ENDERITE_BLOCK = REGISTRY.register("enderite_block", EnderiteBlockBlock::new);
	public static final DeferredBlock<Block> TWIST_FLOWER = REGISTRY.register("twist_flower", TwistFlowerBlock::new);
	public static final DeferredBlock<Block> ACID = REGISTRY.register("acid", AcidBlock::new);
	public static final DeferredBlock<Block> END_SLATE_BRICKS = REGISTRY.register("end_slate_bricks", EndSlateBricksBlock::new);
	public static final DeferredBlock<Block> END_SLATE_BRICK_SLAB = REGISTRY.register("end_slate_brick_slab", EndSlateBrickSlabBlock::new);
	public static final DeferredBlock<Block> END_SLATE_BRICK_STAIRS = REGISTRY.register("end_slate_brick_stairs", EndSlateBrickStairsBlock::new);
	public static final DeferredBlock<Block> END_SLATE_BRICK_WALL = REGISTRY.register("end_slate_brick_wall", EndSlateBrickWallBlock::new);
	public static final DeferredBlock<Block> END_SLATE_TILES = REGISTRY.register("end_slate_tiles", EndSlateTilesBlock::new);
	public static final DeferredBlock<Block> END_SLATE_TILE_SLAB = REGISTRY.register("end_slate_tile_slab", EndSlateTileSlabBlock::new);
	public static final DeferredBlock<Block> END_SLATE_TILE_STAIRS = REGISTRY.register("end_slate_tile_stairs", EndSlateTileStairsBlock::new);
	public static final DeferredBlock<Block> END_SLATE_TILE_WALL = REGISTRY.register("end_slate_tile_wall", EndSlateTileWallBlock::new);
	public static final DeferredBlock<Block> POLISHED_END_SLATE = REGISTRY.register("polished_end_slate", PolishedEndSlateBlock::new);
	public static final DeferredBlock<Block> POLISHED_END_SLATE_SLAB = REGISTRY.register("polished_end_slate_slab", PolishedEndSlateSlabBlock::new);
	public static final DeferredBlock<Block> POLISHED_END_SLATE_STAIRS = REGISTRY.register("polished_end_slate_stairs", PolishedEndSlateStairsBlock::new);
	public static final DeferredBlock<Block> POLISHED_END_SLATE_WALL = REGISTRY.register("polished_end_slate_wall", PolishedEndSlateWallBlock::new);
	public static final DeferredBlock<Block> COBBLED_END_SLATE = REGISTRY.register("cobbled_end_slate", CobbledEndSlateBlock::new);
	public static final DeferredBlock<Block> COBBLED_END_SLATE_SLAB = REGISTRY.register("cobbled_end_slate_slab", CobbledEndSlateSlabBlock::new);
	public static final DeferredBlock<Block> COBBLED_END_SLATE_STAIRS = REGISTRY.register("cobbled_end_slate_stairs", CobbledEndSlateStairsBlock::new);
	public static final DeferredBlock<Block> COBBLED_END_SLATE_WALL = REGISTRY.register("cobbled_end_slate_wall", CobbledEndSlateWallBlock::new);
	public static final DeferredBlock<Block> CANVAS_BLOCK = REGISTRY.register("canvas_block", CanvasBlockBlock::new);
	public static final DeferredBlock<Block> CANVAS_BLOCK_1 = REGISTRY.register("canvas_block_1", CanvasBlock1Block::new);
	public static final DeferredBlock<Block> CANVAS_BLOCK_2 = REGISTRY.register("canvas_block_2", CanvasBlock2Block::new);
	public static final DeferredBlock<Block> CANVAS_BLOCK_3 = REGISTRY.register("canvas_block_3", CanvasBlock3Block::new);
	public static final DeferredBlock<Block> CANVAS_BLOCK_4 = REGISTRY.register("canvas_block_4", CanvasBlock4Block::new);
	public static final DeferredBlock<Block> CANVAS_BLOCK_5 = REGISTRY.register("canvas_block_5", CanvasBlock5Block::new);
	public static final DeferredBlock<Block> CANVAS_BLOCK_6 = REGISTRY.register("canvas_block_6", CanvasBlock6Block::new);
	public static final DeferredBlock<Block> CANVAS_BLOCK_7 = REGISTRY.register("canvas_block_7", CanvasBlock7Block::new);
	public static final DeferredBlock<Block> CANVAS_BLOCK_8 = REGISTRY.register("canvas_block_8", CanvasBlock8Block::new);
	public static final DeferredBlock<Block> END_STONE_PILLAR = REGISTRY.register("end_stone_pillar", EndStonePillarBlock::new);
	public static final DeferredBlock<Block> END_STONE_LAMP = REGISTRY.register("end_stone_lamp", EndStoneLampBlock::new);
	public static final DeferredBlock<Block> STRIPPED_WILD_LOG = REGISTRY.register("stripped_wild_log", StrippedWildLogBlock::new);
	public static final DeferredBlock<Block> STRIPPED_WILD_WOOD = REGISTRY.register("stripped_wild_wood", StrippedWildWoodBlock::new);
	public static final DeferredBlock<Block> WILD_SAPLING = REGISTRY.register("wild_sapling", WildSaplingBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
