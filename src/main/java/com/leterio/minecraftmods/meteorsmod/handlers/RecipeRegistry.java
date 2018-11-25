package com.leterio.minecraftmods.meteorsmod.handlers;

import com.leterio.minecraftmods.meteorsmod.items.Items;
import com.leterio.minecraftmods.meteorsmod.util.Logger;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeRegistry {
	public static void registerRecipes() {
		Logger.debug(() -> "Registrando forjas");
		
		// @formatter:off
		GameRegistry.addSmelting(Items.itemMeteorChips     , new ItemStack(Items.itemIngotMeteorite ), 1000);
		GameRegistry.addSmelting(Items.itemFrezariteCrystal, new ItemStack(Items.itemIngotFrezarite ), 1000);
		GameRegistry.addSmelting(Items.itemKreknoriteChip  , new ItemStack(Items.itemIngotKreknorite), 1000);
		// @formatter:on
	}
}
