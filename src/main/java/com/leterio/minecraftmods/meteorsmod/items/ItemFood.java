package com.leterio.minecraftmods.meteorsmod.items;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;

import net.minecraft.creativetab.CreativeTabs;

public class ItemFood extends net.minecraft.item.ItemFood {
	public ItemFood(final String itemName, final int amount, int maxStackSize, CreativeTabs creativeTab) {
		super(amount, false);
		setRegistryName(MeteorsMod.MODID, itemName);
		setUnlocalizedName(getRegistryName().toString());
		setMaxStackSize(maxStackSize);
		setCreativeTab(creativeTab);

		Items.ITEMS.add(this);
	}

}