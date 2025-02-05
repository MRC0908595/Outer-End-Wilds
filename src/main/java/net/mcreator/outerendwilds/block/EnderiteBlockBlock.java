
package net.mcreator.outerendwilds.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.mcreator.outerendwilds.procedures.EnderiteBlockAdditionalHarvestConditionProcedure;

public class EnderiteBlockBlock extends Block {
	public EnderiteBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(4f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		return super.canHarvestBlock(state, world, pos, player) && EnderiteBlockAdditionalHarvestConditionProcedure.execute(player);
	}
}
