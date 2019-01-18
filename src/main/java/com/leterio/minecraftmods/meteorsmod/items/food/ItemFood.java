package com.leterio.minecraftmods.meteorsmod.items.food;

import java.util.List;

import com.leterio.minecraftmods.meteorsmod.items.Items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemFood extends net.minecraft.item.ItemFood {
	public ItemFood(String itemName, int amount, int maxStackSize) {
		super(amount, false);
		Items.registerItem(this, itemName, maxStackSize);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		Items.addInformation(this, stack, worldIn, tooltip, flagIn);
	}
}