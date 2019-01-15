package com.leterio.minecraftmods.meteorsmod.enchantment;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;

import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchantmentMagneto extends EnchantmentBase {
	protected EnchantmentMagneto() {
		super(Rarity.VERY_RARE, EnumEnchantmentType.ALL, EntityEquipmentSlot.values());
		setRegistryName(MeteorsMod.MODID, "magneto");
		setName("magneto");
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}
}
