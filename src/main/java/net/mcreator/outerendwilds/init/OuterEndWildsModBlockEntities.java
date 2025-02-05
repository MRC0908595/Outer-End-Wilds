
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.outerendwilds.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.outerendwilds.block.entity.CanvasBlock7BlockEntity;
import net.mcreator.outerendwilds.OuterEndWildsMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class OuterEndWildsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, OuterEndWildsMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> CANVAS_BLOCK_7 = register("canvas_block_7", OuterEndWildsModBlocks.CANVAS_BLOCK_7, CanvasBlock7BlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CANVAS_BLOCK_7.get(), (blockEntity, side) -> ((CanvasBlock7BlockEntity) blockEntity).getItemHandler());
	}
}
