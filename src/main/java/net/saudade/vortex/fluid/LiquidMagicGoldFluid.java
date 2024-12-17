
package net.saudade.vortex.fluid;

import net.saudade.vortex.init.VortexModFluids;
import net.saudade.vortex.init.VortexModFluidTypes;
import net.saudade.vortex.init.VortexModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

public abstract class LiquidMagicGoldFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> VortexModFluidTypes.LIQUID_MAGIC_GOLD_TYPE.get(), () -> VortexModFluids.LIQUID_MAGIC_GOLD.get(),
			() -> VortexModFluids.FLOWING_LIQUID_MAGIC_GOLD.get()).explosionResistance(100f).slopeFindDistance(1).block(() -> (LiquidBlock) VortexModBlocks.LIQUID_MAGIC_GOLD.get());

	private LiquidMagicGoldFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LiquidMagicGoldFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquidMagicGoldFluid {
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
