package com.leterio.minecraftmods.meteorsmod.items.armor;

import java.util.List;

import com.leterio.minecraftmods.meteorsmod.items.ItemHelper;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemKreknoriteArmor extends ItemEnchantedArmor {

	public ItemKreknoriteArmor(String itemName, Enchantment defaultEnchantment, int defaultEnchantmentLevel, ArmorMaterial armorMaterial, EntityEquipmentSlot equipmentSlotIn) {
		super(itemName, defaultEnchantment, defaultEnchantmentLevel, armorMaterial, equipmentSlotIn);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);
		ItemHelper.addInformation("item.meteorsmod:armor_kreknorite_bonus.tooltip", tooltip);
	}
}
