package com.leterio.minecraftmods.meteorsmod.handlers;

import com.leterio.minecraftmods.meteorsmod.items.Items;
import com.leterio.minecraftmods.meteorsmod.util.Logger;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeRegistry {
	public static void registerRecipes() {
		Logger.debug(() -> "Registrando forjas");
		
		// @formatter:off
		GameRegistry.addSmelting(Items.ITEM_METEOR_CHIPS     , new ItemStack(Items.ITEM_INGOT_METEORITE ), 1000);
		GameRegistry.addSmelting(Items.ITEM_FREZARITE_CRYSTAL, new ItemStack(Items.ITEM_INGOT_FREZARITE ), 1000);
		GameRegistry.addSmelting(Items.ITEM_KREKNORITE_CHIP  , new ItemStack(Items.ITEM_INGOT_KREKNORITE), 1000);
		// @formatter:on
	}
}
