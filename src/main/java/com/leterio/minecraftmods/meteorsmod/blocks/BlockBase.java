package com.leterio.minecraftmods.meteorsmod.blocks;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;
import com.leterio.minecraftmods.meteorsmod.items.Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {
	public BlockBase(String blockName, Material material) {
		super(material);
		setRegistryName(MeteorsMod.MODID, blockName);
		setTranslationKey(getRegistryName().toString());
		setCreativeTab(MeteorsMod.METEORS_CT);
		
		Blocks.BLOCKS.add(this);
		Items.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
}
