package com.leterio.minecraftmods.meteorsmod.handlers;

import org.apache.commons.lang3.ArrayUtils;

import com.leterio.minecraftmods.meteorsmod.items.Items;
import com.leterio.minecraftmods.meteorsmod.utils.Logger;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class FrezariteToolsBreakSpeedModifierHandler {
	private static final Item[] MODIFIED_ITEMS = new Item[] { Items.TOOL_FREZARITE_PICKAXE, Items.TOOL_FREZARITE_SPADE, Items.TOOL_FREZARITE_AXE };

	@SubscribeEvent
	public static void onBreakSpeedModify(BreakSpeed event) {
		EntityPlayer player = event.getEntityPlayer();
		ItemStack heldItemStack = player.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND);
		if ((heldItemStack != null) && (player.isInsideOfMaterial(Material.WATER))) {
			if (ArrayUtils.contains(MODIFIED_ITEMS, heldItemStack.getItem())) {
				Logger.debug(() -> "Speed modified");
				event.setNewSpeed(event.getOriginalSpeed() * 5);
			}
		}
	}
}
