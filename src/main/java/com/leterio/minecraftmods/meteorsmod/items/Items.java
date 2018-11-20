package com.leterio.minecraftmods.meteorsmod.items;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;

public final class Items {
	private Items() {}

	public static final List<Item> ITEMS = new ArrayList<>();

	// @formatter:off
	// GEMS
	public static final ItemBase itemMeteorChips      = new ItemMeteorGems("meteor_chips"             );
	public static final ItemBase itemRedMeteorGem     = new ItemMeteorGems("red_meteor_gem"           );
	public static final ItemBase itemFrezariteCrystal = new ItemMeteorGems("frezarite_crystal"        );
	public static final ItemBase itemKreknoriteChip   = new ItemMeteorGems("kreknorite_chip"          );
	
	// Ice Creams
	public static final ItemFood itemIceCreamVanilla  = new ItemIceCream  ("ice_cream_vanilla"  , 6, 1);
	public static final ItemFood itemIceCreamChcolate = new ItemIceCream  ("ice_cream_chocolate", 6, 1);
	// @formatter:on
}
