package net.saudade.vortex.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

public class ContainerBlockDescProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		return Component.translatable(("block.vortex." + (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("vortex:", ""))).getString();
	}
}
