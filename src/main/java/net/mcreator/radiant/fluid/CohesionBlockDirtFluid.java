
package net.mcreator.radiant.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.radiant.init.RadiantModFluids;
import net.mcreator.radiant.init.RadiantModFluidTypes;
import net.mcreator.radiant.init.RadiantModBlocks;

public abstract class CohesionBlockDirtFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> RadiantModFluidTypes.COHESION_BLOCK_DIRT_TYPE.get(), () -> RadiantModFluids.COHESION_BLOCK_DIRT.get(),
			() -> RadiantModFluids.FLOWING_COHESION_BLOCK_DIRT.get()).explosionResistance(100f).tickRate(2400).slopeFindDistance(10).block(() -> (LiquidBlock) RadiantModBlocks.COHESION_BLOCK_DIRT.get());

	private CohesionBlockDirtFluid() {
		super(PROPERTIES);
	}

	public static class Source extends CohesionBlockDirtFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CohesionBlockDirtFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
