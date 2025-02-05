
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.outerendwilds.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.outerendwilds.item.TwistPetalsItem;
import net.mcreator.outerendwilds.item.SnarelingGoopItem;
import net.mcreator.outerendwilds.item.ObsidianClaymoreItem;
import net.mcreator.outerendwilds.item.EnderiteSmithingTemplateItem;
import net.mcreator.outerendwilds.item.EnderiteNuggetItem;
import net.mcreator.outerendwilds.item.EnderiteItem;
import net.mcreator.outerendwilds.item.EnderiteIngotItem;
import net.mcreator.outerendwilds.item.AcidItem;
import net.mcreator.outerendwilds.OuterEndWildsMod;

public class OuterEndWildsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(OuterEndWildsMod.MODID);
	public static final DeferredItem<Item> WILD_LOG = block(OuterEndWildsModBlocks.WILD_LOG);
	public static final DeferredItem<Item> WILD_PLANKS = block(OuterEndWildsModBlocks.WILD_PLANKS);
	public static final DeferredItem<Item> WILD_LEAVES = block(OuterEndWildsModBlocks.WILD_LEAVES);
	public static final DeferredItem<Item> WILD_STAIRS = block(OuterEndWildsModBlocks.WILD_STAIRS);
	public static final DeferredItem<Item> WILD_SLAB = block(OuterEndWildsModBlocks.WILD_SLAB);
	public static final DeferredItem<Item> WILD_FENCE = block(OuterEndWildsModBlocks.WILD_FENCE);
	public static final DeferredItem<Item> WILD_FENCE_GATE = block(OuterEndWildsModBlocks.WILD_FENCE_GATE);
	public static final DeferredItem<Item> WILD_PRESSURE_PLATE = block(OuterEndWildsModBlocks.WILD_PRESSURE_PLATE);
	public static final DeferredItem<Item> WILD_BUTTON = block(OuterEndWildsModBlocks.WILD_BUTTON);
	public static final DeferredItem<Item> WILD_NYLIUM = block(OuterEndWildsModBlocks.WILD_NYLIUM);
	public static final DeferredItem<Item> WILD_WOOD = block(OuterEndWildsModBlocks.WILD_WOOD);
	public static final DeferredItem<Item> WILD_ROOT = block(OuterEndWildsModBlocks.WILD_ROOT);
	public static final DeferredItem<Item> END_ROD_BLOCK = block(OuterEndWildsModBlocks.END_ROD_BLOCK);
	public static final DeferredItem<Item> OBSIDIAN_CLAYMORE = REGISTRY.register("obsidian_claymore", ObsidianClaymoreItem::new);
	public static final DeferredItem<Item> SNARELING_SPAWN_EGG = REGISTRY.register("snareling_spawn_egg", () -> new DeferredSpawnEggItem(OuterEndWildsModEntities.SNARELING, -14935276, -2563772, new Item.Properties()));
	public static final DeferredItem<Item> SNARELING_GOOP = REGISTRY.register("snareling_goop", SnarelingGoopItem::new);
	public static final DeferredItem<Item> END_SLATE = block(OuterEndWildsModBlocks.END_SLATE);
	public static final DeferredItem<Item> ENDERITE_BLOCK = block(OuterEndWildsModBlocks.ENDERITE_BLOCK);
	public static final DeferredItem<Item> TWIST_FLOWER = doubleBlock(OuterEndWildsModBlocks.TWIST_FLOWER);
	public static final DeferredItem<Item> TWIST_PETALS = REGISTRY.register("twist_petals", TwistPetalsItem::new);
	public static final DeferredItem<Item> ACID_BUCKET = REGISTRY.register("acid_bucket", AcidItem::new);
	public static final DeferredItem<Item> END_SLATE_BRICKS = block(OuterEndWildsModBlocks.END_SLATE_BRICKS);
	public static final DeferredItem<Item> END_SLATE_BRICK_SLAB = block(OuterEndWildsModBlocks.END_SLATE_BRICK_SLAB);
	public static final DeferredItem<Item> END_SLATE_BRICK_STAIRS = block(OuterEndWildsModBlocks.END_SLATE_BRICK_STAIRS);
	public static final DeferredItem<Item> END_SLATE_BRICK_WALL = block(OuterEndWildsModBlocks.END_SLATE_BRICK_WALL);
	public static final DeferredItem<Item> END_SLATE_TILES = block(OuterEndWildsModBlocks.END_SLATE_TILES);
	public static final DeferredItem<Item> END_SLATE_TILE_SLAB = block(OuterEndWildsModBlocks.END_SLATE_TILE_SLAB);
	public static final DeferredItem<Item> END_SLATE_TILE_STAIRS = block(OuterEndWildsModBlocks.END_SLATE_TILE_STAIRS);
	public static final DeferredItem<Item> END_SLATE_TILE_WALL = block(OuterEndWildsModBlocks.END_SLATE_TILE_WALL);
	public static final DeferredItem<Item> POLISHED_END_SLATE = block(OuterEndWildsModBlocks.POLISHED_END_SLATE);
	public static final DeferredItem<Item> POLISHED_END_SLATE_SLAB = block(OuterEndWildsModBlocks.POLISHED_END_SLATE_SLAB);
	public static final DeferredItem<Item> POLISHED_END_SLATE_STAIRS = block(OuterEndWildsModBlocks.POLISHED_END_SLATE_STAIRS);
	public static final DeferredItem<Item> POLISHED_END_SLATE_WALL = block(OuterEndWildsModBlocks.POLISHED_END_SLATE_WALL);
	public static final DeferredItem<Item> COBBLED_END_SLATE = block(OuterEndWildsModBlocks.COBBLED_END_SLATE);
	public static final DeferredItem<Item> COBBLED_END_SLATE_SLAB = block(OuterEndWildsModBlocks.COBBLED_END_SLATE_SLAB);
	public static final DeferredItem<Item> COBBLED_END_SLATE_STAIRS = block(OuterEndWildsModBlocks.COBBLED_END_SLATE_STAIRS);
	public static final DeferredItem<Item> COBBLED_END_SLATE_WALL = block(OuterEndWildsModBlocks.COBBLED_END_SLATE_WALL);
	public static final DeferredItem<Item> CANVAS_BLOCK = block(OuterEndWildsModBlocks.CANVAS_BLOCK);
	public static final DeferredItem<Item> ENDERITE_INGOT = REGISTRY.register("enderite_ingot", EnderiteIngotItem::new);
	public static final DeferredItem<Item> ENDERITE_NUGGET = REGISTRY.register("enderite_nugget", EnderiteNuggetItem::new);
	public static final DeferredItem<Item> CANVAS_BLOCK_1 = block(OuterEndWildsModBlocks.CANVAS_BLOCK_1);
	public static final DeferredItem<Item> CANVAS_BLOCK_2 = block(OuterEndWildsModBlocks.CANVAS_BLOCK_2);
	public static final DeferredItem<Item> CANVAS_BLOCK_3 = block(OuterEndWildsModBlocks.CANVAS_BLOCK_3);
	public static final DeferredItem<Item> CANVAS_BLOCK_4 = block(OuterEndWildsModBlocks.CANVAS_BLOCK_4);
	public static final DeferredItem<Item> CANVAS_BLOCK_5 = block(OuterEndWildsModBlocks.CANVAS_BLOCK_5);
	public static final DeferredItem<Item> CANVAS_BLOCK_6 = block(OuterEndWildsModBlocks.CANVAS_BLOCK_6);
	public static final DeferredItem<Item> CANVAS_BLOCK_7 = block(OuterEndWildsModBlocks.CANVAS_BLOCK_7);
	public static final DeferredItem<Item> CANVAS_BLOCK_8 = block(OuterEndWildsModBlocks.CANVAS_BLOCK_8);
	public static final DeferredItem<Item> END_STONE_PILLAR = block(OuterEndWildsModBlocks.END_STONE_PILLAR);
	public static final DeferredItem<Item> END_STONE_LAMP = block(OuterEndWildsModBlocks.END_STONE_LAMP);
	public static final DeferredItem<Item> STRIPPED_WILD_LOG = block(OuterEndWildsModBlocks.STRIPPED_WILD_LOG);
	public static final DeferredItem<Item> STRIPPED_WILD_WOOD = block(OuterEndWildsModBlocks.STRIPPED_WILD_WOOD);
	public static final DeferredItem<Item> ENDERITE_SMITHING_TEMPLATE = REGISTRY.register("enderite_smithing_template", EnderiteSmithingTemplateItem::new);
	public static final DeferredItem<Item> ENDERITE_HELMET = REGISTRY.register("enderite_helmet", EnderiteItem.Helmet::new);
	public static final DeferredItem<Item> ENDERITE_CHESTPLATE = REGISTRY.register("enderite_chestplate", EnderiteItem.Chestplate::new);
	public static final DeferredItem<Item> ENDERITE_LEGGINGS = REGISTRY.register("enderite_leggings", EnderiteItem.Leggings::new);
	public static final DeferredItem<Item> ENDERITE_BOOTS = REGISTRY.register("enderite_boots", EnderiteItem.Boots::new);
	public static final DeferredItem<Item> WILD_SAPLING = block(OuterEndWildsModBlocks.WILD_SAPLING);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
