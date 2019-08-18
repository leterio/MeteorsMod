package com.leterio.minecraftmods.meteorsmod.enchantments;

import java.util.ArrayList;
import java.util.List;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MeteorsMod.MODID)
public class Enchantments {
	private Enchantments() {}

	public static final List<Enchantment> ENCHANTMENTS = new ArrayList<>();

	public static final EnchantmentBase ENCHANTMENT_MAGNETO = new EnchantmentBase("magneto", 5, Rarity.VERY_RARE, EnumEnchantmentType.ALL, EntityEquipmentSlot.values());
	public static final EnchantmentBase ENCHANTMENT_COLD_TOUCH = new EnchantmentBase("cold_touch", 1, Rarity.VERY_RARE, EnumEnchantmentType.ARMOR_FEET, EntityEquipmentSlot.FEET);
}
