package com.leterio.minecraftmods.meteorsmod.creativetabs;

import com.leterio.minecraftmods.meteorsmod.items.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MeteorsCreativeTab extends CreativeTabs {
	private static final String TAB_NAME = "meteorsct";

	public MeteorsCreativeTab() {
		super(TAB_NAME);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.itemRedMeteorGem);
	}
}
