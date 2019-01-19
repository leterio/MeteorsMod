package com.leterio.minecraftmods.meteorsmod.items;

import java.util.List;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;

import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import scala.actors.threadpool.Arrays;

public class ItemHelper {
	public static void registerItem(Item item, String itemName, int maxStackSize) {
		item.setRegistryName(MeteorsMod.MODID, itemName);
		item.setTranslationKey(item.getRegistryName().toString());
		item.setMaxStackSize(maxStackSize);
		item.setCreativeTab(MeteorsMod.METEORS_CT);

		Items.ITEMS.add(item);
	}

	public static void addInformation(Item item, List<String> tooltip) {
		String key = item.getTranslationKey() + ".tooltip";
		addInformation(key, tooltip);
	}
	
	@SuppressWarnings("unchecked")
	public static void addInformation(String key, List<String> tooltip) {
		String tooltipString;
		if (I18n.hasKey(key) && (tooltipString = I18n.format(key)).length() > 0) {
			tooltip.addAll(Arrays.asList(tooltipString.split(System.lineSeparator())));
		}
	}
}
