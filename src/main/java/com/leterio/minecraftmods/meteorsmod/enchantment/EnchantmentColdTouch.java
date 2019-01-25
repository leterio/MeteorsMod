package com.leterio.minecraftmods.meteorsmod.enchantment;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;

import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchantmentColdTouch extends EnchantmentBase {
	protected EnchantmentColdTouch() {
		super(Rarity.VERY_RARE, EnumEnchantmentType.ARMOR_FEET, EntityEquipmentSlot.FEET);
		setRegistryName(MeteorsMod.MODID, "cold_touch");
		setName("cold_touch");
	}

	@Override
	public int getMaxLevel() {
		return 1;
	}
}
