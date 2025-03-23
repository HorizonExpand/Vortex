package net.saudade.vortex.procedures;

import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class DefamedCrystalOutgrowthTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if ((entity instanceof Player _plrCldRem2 ? _plrCldRem2.getCooldowns().getCooldownPercent(itemstack.getItem(), 0f) * 100 : 0) == 0 && Math.random() < 0.1) {
				int horizontalRadiusSquare = (int) 4 - 1;
				int verticalRadiusSquare = (int) 4 - 1;
				int yIterationsSquare = verticalRadiusSquare;
				for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
					for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
						for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
							// Execute the desired statements within the square/cube
							if ((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock() instanceof BonemealableBlock) {
								if (world instanceof Level _level) {
									BlockPos _bp = BlockPos.containing(x + xi, y + i, z + zi);
									if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
										if (!_level.isClientSide())
											_level.levelEvent(2005, _bp, 0);
									}
								}
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(itemstack.getItem(), 30);
							}
						}
					}
				}
			}
		}
	}
}
