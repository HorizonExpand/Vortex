package net.saudade.vortex.procedures;

import net.saudade.vortex.network.VortexModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class DenseFogSetProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		if (BoolArgumentType.getBool(arguments, "boolean") == true) {
			VortexModVariables.MapVariables.get(world).DenseFog = true;
			VortexModVariables.MapVariables.get(world).syncData(world);
		} else {
			VortexModVariables.MapVariables.get(world).DenseFog = false;
			VortexModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
