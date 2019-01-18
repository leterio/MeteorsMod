package com.leterio.minecraftmods.meteorsmod.items.tools;

import com.leterio.minecraftmods.meteorsmod.items.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class ItemEnchantedAxe extends ItemAxe {
	private final Enchantment defaultEnchantment;
	private final int defaultEnchantmentLevel;

	public ItemEnchantedAxe(String itemName, Enchantment defaultEnchantment, int defaultEnchantmentLevel, ToolMaterial material, float attackSpeed) {
		super(material, material.getAttackDamage(), attackSpeed);
		this.defaultEnchantment = defaultEnchantment;
		this.defaultEnchantmentLevel = defaultEnchantmentLevel >= 0 ? defaultEnchantmentLevel : 0;
		Items.registerItem(this, itemName, 1);
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