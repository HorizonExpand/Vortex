package net.saudade.vortex.procedures;

import net.minecraft.network.chat.Component;

public class InventoryDescProcedure {
	public static String execute() {
		return Component.translatable("container.inventory").getString();
	}
}
