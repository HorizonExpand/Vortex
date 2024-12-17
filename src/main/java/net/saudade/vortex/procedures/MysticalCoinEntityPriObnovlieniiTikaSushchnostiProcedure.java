package net.saudade.vortex.procedures;

import net.minecraft.world.entity.Entity;

public class MysticalCoinEntityPriObnovlieniiTikaSushchnostiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.noCulling = true;
		entity.getPersistentData().putDouble("Live", (entity.getPersistentData().getDouble("Live") + 1));
		if (entity.getPersistentData().getDouble("Live") == 34) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
