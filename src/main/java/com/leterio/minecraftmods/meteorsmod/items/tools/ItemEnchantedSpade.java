package com.leterio.minecraftmods.meteorsmod.items.tools;

import com.leterio.minecraftmods.meteorsmod.items.ItemHelper;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class ItemEnchantedSpade extends ItemSpade {
	private final Enchantment defaultEnchantment;
	private final int defaultEnchantmentLevel;

	public ItemEnchantedSpade(String itemName, Enchantment defaultEnchantment, int defaultEnchantmentLevel, ToolMaterial material) {
		super(material);
		this.defaultEnchantment = defaultEnchantment;
		this.defaultEnchantmentLevel = defaultEnchantmentLevel >= 0 ? defaultEnchantmentLevel : 0;
		ItemHelper.registerItem(this, itemName, 1);
	}

	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		if (defaultEnchantment != null) {
			stack.addEnchantment(defaultEnchantment, defaultEnchantmentLevel);
		}
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab)) {
			ItemStack is = new ItemStack(this);
			is.addEnchantment(defaultEnchantment, defaultEnchantmentLevel);
			items.add(is);
		}
	}

}
