package com.leterio.minecraftmods.meteorsmod.items;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

public final class Items {
	private Items() {}

	public static final List<Item> ITEMS = new ArrayList<>();

	// GEMS
	public static final ItemBase ITEM_METEOR_CHIPS = new ItemMeteorGems("gem_meteor_chips");
	public static final ItemBase ITEM_FREZARITE_CRYSTAL = new ItemMeteorGems("gem_frezarite_crystal");
	public static final ItemBase ITEM_KREKNORITE_CHIP = new ItemMeteorGems("gem_kreknorite_chip");
	public static final ItemBase ITEM_REDMETEOR_GEM = new ItemMeteorGems("gem_red_meteor");

	// Ice Creams
	public static final ItemFood ITEM_ICECREAM_VANILLA = new ItemIceCream("ice_cream_vanilla", 6, 1);
	public static final ItemFood ITEM_ICECREAM_CHCOLATE = new ItemIceCream("ice_cream_chocolate", 6, 1);

	// Ingots
	public static final ItemBase ITEM_INGOT_METEORITE = new ItemIngot("ingot_meteorite");
	public static final ItemBase ITEM_INGOT_FREZARITE = new ItemIngot("ingot_frezarite");
	public static final ItemBase ITEM_INGOT_KREKNORITE = new ItemIngot("ingot_kreknorite");

	// Armours and tools
	// Meteorite tools
	public static final ItemArmor ARMOR_METEORITE_HELMET = new ItemArmor("armor_meteorite_helmet", ItemArmor.ARMOR_METEORITE, EntityEquipmentSlot.HEAD);
	public static final ItemArmor ARMOR_METEORITE_CHESTPLATE = new ItemArmor("armor_meteorite_chestplate", ItemArmor.ARMOR_METEORITE, EntityEquipmentSlot.CHEST);
	public static final ItemArmor ARMOR_METEORITE_LEGGINGS = new ItemArmor("armor_meteorite_leggings", ItemArmor.ARMOR_METEORITE, EntityEquipmentSlot.LEGS);
	public static final ItemArmor ARMOR_METEORITE_BOOTS = new ItemArmor("armor_meteorite_boots", ItemArmor.ARMOR_METEORITE, EntityEquipmentSlot.FEET);
	public static final ItemArmor TOOL_METEORITE_SWORD = null;
	public static final ItemArmor TOOL_METEORITE_PICKAXE = null;
	public static final ItemArmor TOOL_METEORITE_SHOVEL = null;
	public static final ItemArmor TOOL_METEORITE_AXE = null;
	public static final ItemArmor TOOL_METEORITE_HOE = null;
}
