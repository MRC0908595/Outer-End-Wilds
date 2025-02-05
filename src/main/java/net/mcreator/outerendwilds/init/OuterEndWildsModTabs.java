
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.outerendwilds.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.outerendwilds.OuterEndWildsMod;

public class OuterEndWildsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OuterEndWildsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> OUTER_END_WILDS = REGISTRY.register("outer_end_wilds",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.outer_end_wilds.outer_end_wilds")).icon(() -> new ItemStack(OuterEndWildsModBlocks.WILD_NYLIUM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(OuterEndWildsModItems.SNARELING_SPAWN_EGG.get());
				tabData.accept(OuterEndWildsModItems.SNARELING_GOOP.get());
				tabData.accept(OuterEndWildsModItems.ACID_BUCKET.get());
				tabData.accept(OuterEndWildsModBlocks.END_STONE_PILLAR.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.END_STONE_LAMP.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.CANVAS_BLOCK.get().asItem());
				tabData.accept(OuterEndWildsModItems.ENDERITE_SMITHING_TEMPLATE.get());
				tabData.accept(OuterEndWildsModBlocks.ENDERITE_BLOCK.get().asItem());
				tabData.accept(OuterEndWildsModItems.ENDERITE_INGOT.get());
				tabData.accept(OuterEndWildsModItems.ENDERITE_NUGGET.get());
				tabData.accept(OuterEndWildsModItems.ENDERITE_HELMET.get());
				tabData.accept(OuterEndWildsModItems.ENDERITE_CHESTPLATE.get());
				tabData.accept(OuterEndWildsModItems.ENDERITE_LEGGINGS.get());
				tabData.accept(OuterEndWildsModItems.ENDERITE_BOOTS.get());
				tabData.accept(OuterEndWildsModBlocks.END_ROD_BLOCK.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.WILD_NYLIUM.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.WILD_ROOT.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.TWIST_FLOWER.get().asItem());
				tabData.accept(OuterEndWildsModItems.TWIST_PETALS.get());
				tabData.accept(OuterEndWildsModBlocks.WILD_SAPLING.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.WILD_LEAVES.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.WILD_LOG.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.WILD_WOOD.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.STRIPPED_WILD_LOG.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.STRIPPED_WILD_WOOD.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.WILD_PLANKS.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.WILD_STAIRS.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.WILD_SLAB.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.WILD_FENCE.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.WILD_FENCE_GATE.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.WILD_PRESSURE_PLATE.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.WILD_BUTTON.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.END_SLATE.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.END_SLATE_BRICKS.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.END_SLATE_BRICK_SLAB.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.END_SLATE_BRICK_STAIRS.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.END_SLATE_BRICK_WALL.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.END_SLATE_TILES.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.END_SLATE_TILE_SLAB.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.END_SLATE_TILE_STAIRS.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.END_SLATE_TILE_WALL.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.POLISHED_END_SLATE.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.POLISHED_END_SLATE_SLAB.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.POLISHED_END_SLATE_STAIRS.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.POLISHED_END_SLATE_WALL.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.COBBLED_END_SLATE.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.COBBLED_END_SLATE_SLAB.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.COBBLED_END_SLATE_STAIRS.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.COBBLED_END_SLATE_WALL.get().asItem());
				tabData.accept(OuterEndWildsModItems.OBSIDIAN_CLAYMORE.get());
			}).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CANVAS_BLOCKS = REGISTRY.register("canvas_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.outer_end_wilds.canvas_blocks")).icon(() -> new ItemStack(OuterEndWildsModBlocks.CANVAS_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(OuterEndWildsModBlocks.CANVAS_BLOCK.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.CANVAS_BLOCK_1.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.CANVAS_BLOCK_3.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.CANVAS_BLOCK_2.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.CANVAS_BLOCK_4.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.CANVAS_BLOCK_5.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.CANVAS_BLOCK_6.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.CANVAS_BLOCK_7.get().asItem());
				tabData.accept(OuterEndWildsModBlocks.CANVAS_BLOCK_8.get().asItem());
			}).withTabsBefore(OUTER_END_WILDS.getId()).build());
}
