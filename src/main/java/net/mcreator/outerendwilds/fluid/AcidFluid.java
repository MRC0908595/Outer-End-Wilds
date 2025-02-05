
package net.mcreator.outerendwilds.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.outerendwilds.init.OuterEndWildsModItems;
import net.mcreator.outerendwilds.init.OuterEndWildsModFluids;
import net.mcreator.outerendwilds.init.OuterEndWildsModFluidTypes;
import net.mcreator.outerendwilds.init.OuterEndWildsModBlocks;

public abstract class AcidFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> OuterEndWildsModFluidTypes.ACID_TYPE.get(), () -> OuterEndWildsModFluids.ACID.get(), () -> OuterEndWildsModFluids.FLOWING_ACID.get())
			.explosionResistance(100f).bucket(() -> OuterEndWildsModItems.ACID_BUCKET.get()).block(() -> (LiquidBlock) OuterEndWildsModBlocks.ACID.get());

	private AcidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends AcidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AcidFluid {
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
