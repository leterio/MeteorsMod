package com.leterio.minecraftmods.meteorsmod.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ToolsCreativeTab extends CreativeTabs {
	private static final String TAB_NAME = "toolsct";

	public ToolsCreativeTab() {
		super(TAB_NAME);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack createIcon() {
		return new ItemStack(Blocks.STONE);
	}
}
