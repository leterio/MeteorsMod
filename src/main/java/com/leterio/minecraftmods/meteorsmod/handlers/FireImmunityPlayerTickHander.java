package com.leterio.minecraftmods.meteorsmod.handlers;

import java.lang.reflect.Field;

import com.leterio.minecraftmods.meteorsmod.items.armor.ItemKreknoriteArmor;
import com.leterio.minecraftmods.meteorsmod.util.Logger;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

@EventBusSubscriber
public class FireImmunityPlayerTickHander {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent event) {
		EntityPlayer player = event.player;

		ItemStack[] heldItems = getHeldItems(player);

		// Just for speed
		if (
				   heldItems[0] != null && heldItems[0].getItem() instanceof ItemKreknoriteArmor 
				&& heldItems[1] != null && heldItems[1].getItem() instanceof ItemKreknoriteArmor 
				&& heldItems[2] != null && heldItems[2].getItem() instanceof ItemKreknoriteArmor
				&& heldItems[3] != null && heldItems[3].getItem() instanceof ItemKreknoriteArmor) {
			updateImmunity(player, true);
		} else {
			updateImmunity(player, false);
		}
	}

	private static void updateImmunity(Entity entity, boolean is) {
		if (entity.isImmuneToFire() != is) {
			try {
				Field f;
				try {
					f = Entity.class.getDeclaredField("field_70178_ae");
				} catch (NoSuchFieldException | SecurityException e) {
					f = Entity.class.getDeclaredField("isImmuneToFire");
				}
				f.setAccessible(true);
				f.set(entity, is);
				f.setAccessible(false);
			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
				Logger.error(() -> "Fatal error ocurred when setting fire immunity. Please, open a issue on github. Tanks.", e);
			}
		}
	}

	private static ItemStack[] getHeldItems(EntityPlayer player) {
		return new ItemStack[] { player.getItemStackFromSlot(EntityEquipmentSlot.FEET), player.getItemStackFromSlot(EntityEquipmentSlot.LEGS), player.getItemStackFromSlot(EntityEquipmentSlot.CHEST),
				player.getItemStackFromSlot(EntityEquipmentSlot.HEAD) };
	}
}
