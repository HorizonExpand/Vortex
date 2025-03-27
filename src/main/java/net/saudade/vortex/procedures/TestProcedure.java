package net.saudade.vortex.procedures;

import net.saudade.vortex.init.VortexModItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TestProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean YourCondition = false;
		if (world.isClientSide() && entity instanceof Player) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == VortexModItems.DEFAMED_CRYSTAL_OUTGROWTH_HELMET.get()) {
				if (Minecraft.getInstance().gameRenderer.currentEffect() == null) {
					Minecraft.getInstance().gameRenderer.loadEffect(new ResourceLocation("vortex:shaders/post/spider.json"));
				}
			} else {
				if (Minecraft.getInstance().gameRenderer.currentEffect() != null) {
					Minecraft.getInstance().gameRenderer.shutdownEffect();
				}
			}
		}
	}
}
