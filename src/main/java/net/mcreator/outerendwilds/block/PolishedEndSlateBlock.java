
package net.mcreator.outerendwilds.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class PolishedEndSlateBlock extends Block {
	public PolishedEndSlateBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE_TILES).strength(2f, 9f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
