package net.tslat.aoa3.structure.voxponds;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class ToxicTree2 extends AoAStructure { //StructureSize: 7x8x7
	private static final IBlockState toxicLog = BlockRegister.TOXIC_LOG.getDefaultState();

	public ToxicTree2() {
		super("ToxicTree2");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 3, 0, 3, toxicLog);
		addBlock(world, basePos, 3, 1, 3, toxicLog);
		addBlock(world, basePos, 3, 2, 3, toxicLog);
		addBlock(world, basePos, 3, 3, 3, toxicLog);
		addBlock(world, basePos, 3, 4, 3, toxicLog);
		addBlock(world, basePos, 0, 5, 3, toxicLog);
		addBlock(world, basePos, 3, 5, 0, toxicLog);
		addBlock(world, basePos, 3, 5, 3, toxicLog);
		addBlock(world, basePos, 3, 5, 6, toxicLog);
		addBlock(world, basePos, 6, 5, 3, toxicLog);
		addBlock(world, basePos, 0, 6, 3, toxicLog);
		addBlock(world, basePos, 1, 6, 3, toxicLog);
		addBlock(world, basePos, 2, 6, 3, toxicLog);
		addBlock(world, basePos, 3, 6, 0, toxicLog);
		addBlock(world, basePos, 3, 6, 1, toxicLog);
		addBlock(world, basePos, 3, 6, 2, toxicLog);
		addBlock(world, basePos, 3, 6, 3, toxicLog);
		addBlock(world, basePos, 3, 6, 4, toxicLog);
		addBlock(world, basePos, 3, 6, 5, toxicLog);
		addBlock(world, basePos, 3, 6, 6, toxicLog);
		addBlock(world, basePos, 4, 6, 3, toxicLog);
		addBlock(world, basePos, 5, 6, 3, toxicLog);
		addBlock(world, basePos, 6, 6, 3, toxicLog);
		addBlock(world, basePos, 0, 7, 3, toxicLog);
		addBlock(world, basePos, 3, 7, 0, toxicLog);
		addBlock(world, basePos, 3, 7, 6, toxicLog);
		addBlock(world, basePos, 6, 7, 3, toxicLog);
	}
}
