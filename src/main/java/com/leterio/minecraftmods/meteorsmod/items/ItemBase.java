package com.leterio.minecraftmods.meteorsmod.items;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
	public ItemBase(final String itemName, final int maxStackSize, final CreativeTabs creativeTab) {
		setRegistryName(MeteorsMod.MODID, itemName);
		setUnlocalizedName(getRegistryName().toString());
		setMaxStackSize(maxStackSize);
		setCreativeTab(creativeTab);

		Items.ITEMS.add(this);
	}
}
