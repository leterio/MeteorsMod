package com.leterio.minecraftmods.meteorsmod.items;

import java.util.LinkedList;
import java.util.List;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;
import com.leterio.minecraftmods.meteorsmod.enchantment.Enchantments;
import com.leterio.minecraftmods.meteorsmod.items.armor.ItemEnchantedArmor;
import com.leterio.minecraftmods.meteorsmod.items.tools.ItemEnchantedAxe;
import com.leterio.minecraftmods.meteorsmod.items.tools.ItemEnchantedHoe;
import com.leterio.minecraftmods.meteorsmod.items.tools.ItemEnchantedPickaxe;
import com.leterio.minecraftmods.meteorsmod.items.tools.ItemEnchantedSpade;
import com.leterio.minecraftmods.meteorsmod.items.tools.ItemEnchantedSword;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import scala.actors.threadpool.Arrays;

public final class Items {
	private Items() {}

	// @formatter:off
	// Armor Material
	public static final ArmorMaterial ARMOR_METEORITE = EnumHelper.addArmorMaterial("meteorite_armor_material", MeteorsMod.MODID + ":armor_meteorite", 36, new int[] { 2, 7, 5, 2 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F).setRepairItem(new ItemStack(Items.ITEM_INGOT_METEORITE));
	public static final ArmorMaterial ARMOR_FREZARITE = EnumHelper.addArmorMaterial("frezarite_armor_material", MeteorsMod.MODID + ":armor_frezarite", 7, new int[] { 2, 5, 3, 1 }, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F) .setRepairItem(new ItemStack(Items.ITEM_INGOT_FREZARITE));
	public static final ArmorMaterial ARMOR_KREKNORITE = EnumHelper.addArmorMaterial("kreknorite_armor_material", MeteorsMod.MODID + ":armor_kreknorite", 40, new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F) .setRepairItem(new ItemStack(Items.ITEM_INGOT_KREKNORITE));

	// ToolMaterial
	public static final ToolMaterial TOOL_METEORITE = EnumHelper.addToolMaterial("meteorite_tool_material"  , 2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial TOOL_FREZARITE = EnumHelper.addToolMaterial("frezarite_tool_material"  , 2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial TOOL_KREKNORITE = EnumHelper.addToolMaterial("kreknorite_tool_material", 2, 250, 6.0F, 2.0F, 14);

	// ITEMS
	public static final List<Item> ITEMS = new LinkedList<>();

	// GEMS
	public static final GenericItem ITEM_METEOR_CHIPS      = new GenericItem("gem_meteor_chips"     , 64);
	public static final GenericItem ITEM_FREZARITE_CRYSTAL = new GenericItem("gem_frezarite_crystal", 64);
	public static final GenericItem ITEM_KREKNORITE_CHIP   = new GenericItem("gem_kreknorite_chip"  , 64);
	public static final GenericItem ITEM_REDMETEOR_GEM     = new GenericItem("gem_red_meteor"       , 64);

	// Ice Creams
	// Desativado até existir uma recipe
//	public static final ItemFood ITEM_ICECREAM_VANILLA  = new ItemFood("ice_cream_vanilla"  , 6, 1);
//	public static final ItemFood ITEM_ICECREAM_CHCOLATE = new ItemFood("ice_cream_chocolate", 6, 1);

	// Ingots
	public static final GenericItem ITEM_INGOT_METEORITE  = new GenericItem("ingot_meteorite" , 64);
	public static final GenericItem ITEM_INGOT_FREZARITE  = new GenericItem("ingot_frezarite" , 64);
	public static final GenericItem ITEM_INGOT_KREKNORITE = new GenericItem("ingot_kreknorite", 64);
	
	// Armours and tools
	// Meteorite tools
	public static final ItemEnchantedArmor   ARMOR_METEORITE_HELMET     = new ItemEnchantedArmor  ("armor_meteorite_helmet"    , Enchantments.ENCHANTMENT_MAGNETO, 2, ARMOR_METEORITE, EntityEquipmentSlot.HEAD);
	public static final ItemEnchantedArmor   ARMOR_METEORITE_CHESTPLATE = new ItemEnchantedArmor  ("armor_meteorite_chestplate", Enchantments.ENCHANTMENT_MAGNETO, 2, ARMOR_METEORITE, EntityEquipmentSlot.CHEST);
	public static final ItemEnchantedArmor   ARMOR_METEORITE_LEGGINGS   = new ItemEnchantedArmor  ("armor_meteorite_leggings"  , Enchantments.ENCHANTMENT_MAGNETO, 2, ARMOR_METEORITE, EntityEquipmentSlot.LEGS);
	public static final ItemEnchantedArmor   ARMOR_METEORITE_BOOTS      = new ItemEnchantedArmor  ("armor_meteorite_boots"     , Enchantments.ENCHANTMENT_MAGNETO, 2, ARMOR_METEORITE, EntityEquipmentSlot.FEET);
	public static final ItemEnchantedSword   TOOL_METEORITE_SWORD       = new ItemEnchantedSword  ("tool_meteorite_sword"      , Enchantments.ENCHANTMENT_MAGNETO, 2, TOOL_METEORITE);
	public static final ItemEnchantedPickaxe TOOL_METEORITE_PICKAXE     = new ItemEnchantedPickaxe("tool_meteorite_pickaxe"    , Enchantments.ENCHANTMENT_MAGNETO, 2, TOOL_METEORITE);
	public static final ItemEnchantedSpade   TOOL_METEORITE_SPADE       = new ItemEnchantedSpade  ("tool_meteorite_spade"      , Enchantments.ENCHANTMENT_MAGNETO, 2, TOOL_METEORITE);
	public static final ItemEnchantedAxe     TOOL_METEORITE_AXE         = new ItemEnchantedAxe    ("tool_meteorite_axe"        , Enchantments.ENCHANTMENT_MAGNETO, 2, TOOL_METEORITE, -3.1F);
	public static final ItemEnchantedHoe     TOOL_METEORITE_HOE         = new ItemEnchantedHoe    ("tool_meteorite_hoe"        , Enchantments.ENCHANTMENT_MAGNETO, 2, TOOL_METEORITE);
	// @formatter:on

	// GENERIC METHODS
	public static void registerItem(Item item, String itemName, int maxStackSize) {
		item.setRegistryName(MeteorsMod.MODID, itemName);
		item.setTranslationKey(item.getRegistryName().toString());
		item.setMaxStackSize(maxStackSize);
		item.setCreativeTab(MeteorsMod.METEORS_CT);

		Items.ITEMS.add(item);
	}

	@SuppressWarnings("unchecked")
	public static void addInformation(Item item, ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		String key = item.getTranslationKey() + ".tooltip";
		String tooltipString;
		if (I18n.hasKey(key) && (tooltipString = I18n.format(key)).length() > 0) {
			tooltip.addAll(Arrays.asList(tooltipString.split(System.lineSeparator())));
		}
	}
}
