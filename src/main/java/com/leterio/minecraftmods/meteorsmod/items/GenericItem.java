package com.leterio.minecraftmods.meteorsmod.items;

import java.util.List;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.actors.threadpool.Arrays;


public class GenericItem extends Item {
	public GenericItem(final String itemName, final int maxStackSize) {
		super();
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
