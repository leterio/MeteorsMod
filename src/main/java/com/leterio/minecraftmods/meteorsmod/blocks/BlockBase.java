package com.leterio.minecraftmods.meteorsmod.blocks;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBase extends Block {
	public BlockBase(String blockName, CreativeTabs creativeTab) {
		super(Material.IRON);
		
		setRegistryName(MeteorsMod.MODID, blockName);
		setUnlocalizedName(getRegistryName().toString());
		setCreativeTab(creativeTab);
	}
}
