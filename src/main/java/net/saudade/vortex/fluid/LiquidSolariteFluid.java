
package net.saudade.vortex.fluid;

import net.saudade.vortex.init.VortexModFluids;
import net.saudade.vortex.init.VortexModFluidTypes;
import net.saudade.vortex.init.VortexModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

public abstract class LiquidSolariteFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> VortexModFluidTypes.LIQUID_SOLARITE_TYPE.get(), () -> VortexModFluids.LIQUID_SOLARITE.get(), () -> VortexModFluids.FLOWING_LIQUID_SOLARITE.get())
			.explosionResistance(100f).slopeFindDistance(1).block(() -> (LiquidBlock) VortexModBlocks.LIQUID_SOLARITE.get());

	private LiquidSolariteFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LiquidSolariteFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquidSolariteFluid {
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
