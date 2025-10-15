package net.mcreator.radiant.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class AluminumOreBlock extends Block {
	public AluminumOreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GILDED_BLACKSTONE).strength(1.4f, 6f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}