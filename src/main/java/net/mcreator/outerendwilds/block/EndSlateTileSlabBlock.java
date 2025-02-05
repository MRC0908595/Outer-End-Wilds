
package net.mcreator.outerendwilds.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class EndSlateTileSlabBlock extends SlabBlock {
	public EndSlateTileSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE_TILES).strength(2f, 9f).requiresCorrectToolForDrops());
	}
}
