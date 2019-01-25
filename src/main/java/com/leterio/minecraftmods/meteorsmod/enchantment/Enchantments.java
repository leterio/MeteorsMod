package com.leterio.minecraftmods.meteorsmod.enchantment;

import java.util.ArrayList;
import java.util.List;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;

import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MeteorsMod.MODID)
public class Enchantments {
	private Enchantments() {}

	public static final List<Enchantment> ENCHANTMENTS = new ArrayList<>();

	public static final EnchantmentMagneto   ENCHANTMENT_MAGNETO    = new EnchantmentMagneto();
	public static final EnchantmentColdTouch ENCHANTMENT_COLD_TOUCH = new EnchantmentColdTouch();
}
