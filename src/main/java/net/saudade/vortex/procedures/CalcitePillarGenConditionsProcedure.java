package net.saudade.vortex.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class CalcitePillarGenConditionsProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		ItemStack UnderSoil = ItemStack.EMPTY;
		ItemStack Air = ItemStack.EMPTY;
		ItemStack TopSoil = ItemStack.EMPTY;
		String AirTagName = "";
		String TopSoilTagName = "";
		String UnderSoilTagName = "";
		boolean EnableSoilReplacement = false;
		boolean DontSpawnStructure = false;
		boolean EnableTagSupport = false;
		double PositionX2 = 0;
		double PositionZ = 0;
		double ScriptOffsetY = 0;
		double PositionOffsetZ = 0;
		double PositionOffsetX = 0;
		double StructureSizeZ = 0;
		double StructureSizeX = 0;
		double PositionX = 0;
		EnableSoilReplacement = true;
		EnableTagSupport = true;
		AirTagName = "vortex:structure_spawning_script_air";
		UnderSoilTagName = "vortex:structure_spawning_script_dirt";
		TopSoilTagName = "vortex:structure_spawning_script_grass";
		TopSoil = new ItemStack(Blocks.GRASS_BLOCK).copy();
		UnderSoil = new ItemStack(Blocks.DIRT).copy();
		Air = new ItemStack(Blocks.AIR).copy();
		ScriptOffsetY = y + 0;
		PositionOffsetX = x + 0;
		PositionOffsetZ = z + 0;
		StructureSizeX = 8;
		StructureSizeZ = 8;
		PositionX = 0;
		PositionZ = 0;
		PositionX2 = PositionX;
		DontSpawnStructure = false;
		for (int index0 = 0; index0 < (int) StructureSizeZ; index0++) {
			for (int index1 = 0; index1 < (int) StructureSizeX; index1++) {
				if (EnableTagSupport == true) {
					if ((world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY + 1, PositionOffsetZ + PositionZ))).is(BlockTags.create(new ResourceLocation((AirTagName).toLowerCase(java.util.Locale.ENGLISH))))
							&& (world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY, PositionOffsetZ + PositionZ))).is(BlockTags.create(new ResourceLocation((TopSoilTagName).toLowerCase(java.util.Locale.ENGLISH))))
							&& (world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY - 1, PositionOffsetZ + PositionZ)))
									.is(BlockTags.create(new ResourceLocation((UnderSoilTagName).toLowerCase(java.util.Locale.ENGLISH))))
							|| (world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY + 1, PositionOffsetZ + PositionZ))).is(BlockTags.create(new ResourceLocation((AirTagName).toLowerCase(java.util.Locale.ENGLISH))))
									&& (world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY, PositionOffsetZ + PositionZ))).is(BlockTags.create(new ResourceLocation((AirTagName).toLowerCase(java.util.Locale.ENGLISH))))
									&& (world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY - 1, PositionOffsetZ + PositionZ)))
											.is(BlockTags.create(new ResourceLocation((TopSoilTagName).toLowerCase(java.util.Locale.ENGLISH))))
							|| (world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY + 1, PositionOffsetZ + PositionZ))).is(BlockTags.create(new ResourceLocation((TopSoilTagName).toLowerCase(java.util.Locale.ENGLISH))))
									&& (world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY, PositionOffsetZ + PositionZ)))
											.is(BlockTags.create(new ResourceLocation((UnderSoilTagName).toLowerCase(java.util.Locale.ENGLISH))))
									&& (world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY - 1, PositionOffsetZ + PositionZ)))
											.is(BlockTags.create(new ResourceLocation((UnderSoilTagName).toLowerCase(java.util.Locale.ENGLISH))))) {
						DontSpawnStructure = false;
					} else {
						DontSpawnStructure = true;
						break;
					}
				} else {
					if ((world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY + 1, PositionOffsetZ + PositionZ)))
							.getBlock() == (Air.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()
							&& (world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY, PositionOffsetZ + PositionZ)))
									.getBlock() == (TopSoil.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()
							&& (world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY - 1, PositionOffsetZ + PositionZ)))
									.getBlock() == (UnderSoil.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()
							|| (world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY + 1, PositionOffsetZ + PositionZ)))
									.getBlock() == (Air.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()
									&& (world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY, PositionOffsetZ + PositionZ)))
											.getBlock() == (Air.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()
									&& (world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY - 1, PositionOffsetZ + PositionZ)))
											.getBlock() == (TopSoil.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()
							|| (world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY + 1, PositionOffsetZ + PositionZ)))
									.getBlock() == (TopSoil.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()
									&& (world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY, PositionOffsetZ + PositionZ)))
											.getBlock() == (UnderSoil.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()
									&& (world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY - 1, PositionOffsetZ + PositionZ)))
											.getBlock() == (UnderSoil.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()) {
						DontSpawnStructure = false;
					} else {
						DontSpawnStructure = true;
						break;
					}
				}
				PositionX = PositionX + 1;
			}
			if (DontSpawnStructure == true) {
				break;
			}
			PositionX = PositionX2;
			PositionZ = PositionZ + 1;
		}
		if (DontSpawnStructure == false) {
			PositionX = 0;
			PositionZ = 0;
			for (int index2 = 0; index2 < (int) StructureSizeZ; index2++) {
				for (int index3 = 0; index3 < (int) StructureSizeX; index3++) {
					if (EnableSoilReplacement == true) {
						if (EnableTagSupport == true) {
							if ((world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY - 1, PositionOffsetZ + PositionZ)))
									.getBlock() == (TopSoil.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()
									&& !((world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY, PositionOffsetZ + PositionZ)))
											.getBlock() == (Air.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock())) {
								world.setBlock(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY - 1, PositionOffsetZ + PositionZ),
										(UnderSoil.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()), 3);
							}
						} else {
							if ((world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY - 1, PositionOffsetZ + PositionZ))).is(BlockTags.create(new ResourceLocation((TopSoilTagName).toLowerCase(java.util.Locale.ENGLISH))))
									&& !(world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY, PositionOffsetZ + PositionZ)))
											.is(BlockTags.create(new ResourceLocation((AirTagName).toLowerCase(java.util.Locale.ENGLISH))))) {
								world.setBlock(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY - 1, PositionOffsetZ + PositionZ),
										(UnderSoil.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()), 3);
							}
						}
					} else {
						if (EnableTagSupport == true) {
							if ((world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY - 1, PositionOffsetZ + PositionZ)))
									.getBlock() == (TopSoil.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()) {
								world.setBlock(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY - 1, PositionOffsetZ + PositionZ),
										(UnderSoil.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()), 3);
							}
						} else {
							if ((world.getBlockState(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY - 1, PositionOffsetZ + PositionZ)))
									.is(BlockTags.create(new ResourceLocation((TopSoilTagName).toLowerCase(java.util.Locale.ENGLISH))))) {
								world.setBlock(BlockPos.containing(PositionOffsetX + PositionX, ScriptOffsetY - 1, PositionOffsetZ + PositionZ),
										(UnderSoil.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()), 3);
							}
						}
					}
					PositionX = PositionX + 1;
				}
				if (DontSpawnStructure == true) {
					break;
				}
				PositionX = PositionX2;
				PositionZ = PositionZ + 1;
			}
			return true;
		}
		return false;
	}
}
