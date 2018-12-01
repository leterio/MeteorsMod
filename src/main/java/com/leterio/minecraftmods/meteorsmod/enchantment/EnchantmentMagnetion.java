package com.leterio.minecraftmods.meteorsmod.enchantment;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;

import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchantmentMagnetion extends EnchantmentBase {
	protected EnchantmentMagnetion() {
		super(Rarity.VERY_RARE, EnumEnchantmentType.ALL, EntityEquipmentSlot.values());
		setRegistryName(MeteorsMod.MODID, "magnetization");
		setName("magnetization");
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}
}
