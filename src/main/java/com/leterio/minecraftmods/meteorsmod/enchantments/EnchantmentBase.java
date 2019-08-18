package com.leterio.minecraftmods.meteorsmod.enchantments;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchantmentBase extends Enchantment {
	private final int maxEnchantmentLevel;

	protected EnchantmentBase(String enchantmentName, int maxEnchantmentLevel, Rarity rarityIn, EnumEnchantmentType typeIn, EntityEquipmentSlot... slots) {
		super(rarityIn, typeIn, slots);
		this.maxEnchantmentLevel = maxEnchantmentLevel;
		setRegistryName(MeteorsMod.MODID, enchantmentName);
		setName(enchantmentName);
		Enchantments.ENCHANTMENTS.add(this);
	}
	
	@Override
	public int getMaxLevel() {
		return maxEnchantmentLevel;
	}
}
