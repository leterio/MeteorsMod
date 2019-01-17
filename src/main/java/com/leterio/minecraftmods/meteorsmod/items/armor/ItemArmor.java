package com.leterio.minecraftmods.meteorsmod.items.armor;

import java.util.List;

import com.leterio.minecraftmods.meteorsmod.items.Items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemArmor extends net.minecraft.item.ItemArmor {
	public ItemArmor(String itemName, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 1, equipmentSlotIn);
		Items.registerItem(this, itemName, 1);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		Items.addInformation(this, stack, worldIn, tooltip, flagIn);
	}
}
