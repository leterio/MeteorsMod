package com.leterio.minecraftmods.meteorsmod.items.tools.frezarite;

import java.util.List;

import com.leterio.minecraftmods.meteorsmod.items.ItemHelper;
import com.leterio.minecraftmods.meteorsmod.items.Items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemFrezariteAxe extends ItemAxe {
	public ItemFrezariteAxe(float speed) {
		super(Items.TOOL_METEORITE, Items.TOOL_METEORITE.getAttackDamage(), speed);
		ItemHelper.registerItem(this, "tool_frezarite_axe", 1);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		ItemHelper.addInformation(this, tooltip);
	}
}
