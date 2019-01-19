package com.leterio.minecraftmods.meteorsmod.items;

import java.util.List;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GenericItem extends Item {
	public GenericItem(String itemName, int maxStackSize) {
		super();
		setRegistryName(MeteorsMod.MODID, itemName);
		setTranslationKey(getRegistryName().toString());
		setMaxStackSize(maxStackSize);
		setCreativeTab(MeteorsMod.METEORS_CT);

		Items.ITEMS.add(this);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		ItemHelper.addInformation(this, tooltip);
	}
}
