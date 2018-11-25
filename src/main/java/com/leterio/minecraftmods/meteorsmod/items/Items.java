package com.leterio.minecraftmods.meteorsmod.items;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;

public final class Items {
	private Items() {}

	public static final List<Item> ITEMS = new ArrayList<>();

	// @formatter:off
	// GEMS
	public static final ItemBase ITEM_METEOR_CHIPS      = new ItemMeteorGems("gem_meteor_chips"         );
	public static final ItemBase ITEM_FREZARITE_CRYSTAL = new ItemMeteorGems("gem_frezarite_crystal"    );
	public static final ItemBase ITEM_KREKNORITE_CHIP   = new ItemMeteorGems("gem_kreknorite_chip"      );
	public static final ItemBase ITEM_REDMETEOR_GEM     = new ItemMeteorGems("gem_red_meteor"           );
	
	// Ice Creams
	public static final ItemFood ITEM_ICECREAMV_ANILLA  = new ItemIceCream  ("ice_cream_vanilla"  , 6, 1);
	public static final ItemFood ITEM_ICECREAM_CHCOLATE = new ItemIceCream  ("ice_cream_chocolate", 6, 1);

	// Ingots
	public static final ItemBase ITEM_INGOT_METEORITE   = new ItemIngot     ("ingot_meteorite"          );
	public static final ItemBase ITEM_INGOT_FREZARITE   = new ItemIngot     ("ingot_frezarite"          );
	public static final ItemBase ITEM_INGOT_KREKNORITE  = new ItemIngot     ("ingot_kreknorite"         );
	// @formatter:on
}
