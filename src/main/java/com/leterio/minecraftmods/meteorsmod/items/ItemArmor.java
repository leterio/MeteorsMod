package com.leterio.minecraftmods.meteorsmod.items;

import java.util.List;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.actors.threadpool.Arrays;

public class ItemArmor extends net.minecraft.item.ItemArmor {

	// @formatter:off
	public static final ArmorMaterial ARMOR_METEORITE     = EnumHelper.addArmorMaterial("meteorite_armor_material" , MeteorsMod.MODID + ":armor_meteorite" , 36, new int[] { 2, 7, 5, 2 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F)
			.setRepairItem(new ItemStack(Items.ITEM_INGOT_METEORITE ));

	public static final ArmorMaterial ARMOR_FREZARITE     = EnumHelper.addArmorMaterial("frezarite_armor_material" , MeteorsMod.MODID + ":armor_frezarite" , 7 , new int[] { 2, 5, 3, 1 }, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F)
			.setRepairItem(new ItemStack(Items.ITEM_INGOT_FREZARITE ));

	public static final ArmorMaterial ARMOR_KREKNORITE    = EnumHelper.addArmorMaterial("kreknorite_armor_material", MeteorsMod.MODID + ":armor_kreknorite", 40, new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F)
			.setRepairItem(new ItemStack(Items.ITEM_INGOT_KREKNORITE));
	// @formatter:on

	public ItemArmor(String itemName, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 1, equipmentSlotIn);
		setRegistryName(MeteorsMod.MODID, itemName);
		setTranslationKey(getRegistryName().toString());
		setMaxStackSize(maxStackSize);
		setCreativeTab(MeteorsMod.METEORS_CT);
		Items.ITEMS.add(this);
	}

	@SideOnly(Side.CLIENT)
	@SuppressWarnings("unchecked")
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		String key = this.getTranslationKey() + ".tooltip";
		String tooltipString;
		if (I18n.hasKey(key) && (tooltipString = I18n.format(key)).length() > 0) {
			tooltip.addAll(Arrays.asList(tooltipString.split(System.lineSeparator())));
		}
	}
}
