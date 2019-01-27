package com.leterio.minecraftmods.meteorsmod.items.tools;

import java.util.List;

import com.leterio.minecraftmods.meteorsmod.items.ItemHelper;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemEnchantedPickaxe extends ItemPickaxe {
	private final Enchantment defaultEnchantment;
	private final int defaultEnchantmentLevel;

	public ItemEnchantedPickaxe(String itemName, Enchantment defaultEnchantment, int defaultEnchantmentLevel, ToolMaterial material) {
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

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		ItemHelper.addInformation(this, tooltip);
	}
}
