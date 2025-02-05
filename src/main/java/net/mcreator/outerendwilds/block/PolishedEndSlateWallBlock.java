
package net.mcreator.outerendwilds.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class PolishedEndSlateWallBlock extends WallBlock {
	public PolishedEndSlateWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE_TILES).strength(2f, 9f).requiresCorrectToolForDrops().forceSolidOn());
	}
}
