package com.leterio.minecraftmods.meteorsmod.creativetabs;

import com.leterio.minecraftmods.meteorsmod.blocks.Blocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MeteorsBolcksCreativeTab extends CreativeTabs {
	private static final String TAB_NAME = "meteorsblocskct";

	public MeteorsBolcksCreativeTab() {
		super(TAB_NAME);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Blocks.BLOCK_METEORITE_HOT_RARE);
	}
}
