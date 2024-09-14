
package net.saudade.vortex.item;

import net.saudade.vortex.procedures.AdvancedRunestoneDopolnitielnaiaInformatsiiaProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import java.util.List;

public class AdvancedRunestoneItem extends Item {
	public AdvancedRunestoneItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		Entity entity = itemstack.getEntityRepresentation();
		list.add(Component.literal(AdvancedRunestoneDopolnitielnaiaInformatsiiaProcedure.execute()));
	}
}
