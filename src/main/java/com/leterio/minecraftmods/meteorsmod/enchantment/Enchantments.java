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
	
	public static final EnchantmentMagnetion ENCHANTMENT_MAGNETIZATION = new EnchantmentMagnetion();
	
	// Enchantments behaviors
	
	
}
