
package net.saudade.vortex.block;

import net.saudade.vortex.init.VortexModFluids;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

public class LiquidMagicGoldBlock extends LiquidBlock {
	public LiquidMagicGoldBlock() {
		super(() -> VortexModFluids.LIQUID_MAGIC_GOLD.get(), BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
