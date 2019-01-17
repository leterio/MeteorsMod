package com.leterio.minecraftmods.meteorsmod.items.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class ItemEnchantedArmor extends ItemArmor {
	private final Enchantment defaultEnchantment;
	private final int defaultEnchantmentLevel;

	public ItemEnchantedArmor(String itemName, Enchantment defaultEnchantment, int defaultEnchantmentLevel, ArmorMaterial armorMaterial, EntityEquipmentSlot equipmentSlotIn) {
		super(itemName, armorMaterial, equipmentSlotIn);
		this.defaultEnchantment = defaultEnchantment;
		this.defaultEnchantmentLevel = defaultEnchantmentLevel >= 0 ? defaultEnchantmentLevel : 0;
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
