package com.leterio.minecraftmods.meteorsmod.items.tools.frezarite;

import java.util.List;

import com.leterio.minecraftmods.meteorsmod.items.ItemHelper;
import com.leterio.minecraftmods.meteorsmod.items.Items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemFrezariteSword extends ItemSword {
	public ItemFrezariteSword() {
		super(Items.TOOL_METEORITE);
		ItemHelper.registerItem(this, "tool_frezarite_sword", 1);
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		target.addPotionEffect(new PotionEffect(Potion.getPotionById(2), 100, 2, false, true));
		return super.hitEntity(stack, target, attacker);
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
