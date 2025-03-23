package net.saudade.vortex.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.saudade.vortex.init.VortexModItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BowShootingWithOrcishQuiverProcedure {
	@SubscribeEvent
	public static void onUseItemStop(LivingEntityUseItemEvent.Stop event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getItem());
		}
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == Items.BOW || itemstack.getItem() == Items.CROSSBOW) {
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(VortexModItems.ORCISH_QUIVER.get(), lv).isPresent() : false) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, entity instanceof LivingEntity _entUseTicks5 ? _entUseTicks5.getTicksUsingItem() : 0, 0, false, false));
			}
		}
	}
}
