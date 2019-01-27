package com.leterio.minecraftmods.meteorsmod.proxy;

import com.leterio.minecraftmods.meteorsmod.handlers.RegistryHandler;

import net.minecraft.item.Item;

public class CommomProxy {
	public void registerItemRenderer(Item item, int meta, String id) {}

	public void init() {
		RegistryHandler.registerRecipes();
	}
}
