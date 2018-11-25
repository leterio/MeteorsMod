package com.leterio.minecraftmods.meteorsmod.blocks;

import java.util.ArrayList;
import java.util.List;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class Blocks {
	private Blocks() {}

	public static final List<Block> BLOCKS = new ArrayList<>();

	// @formatter:off
	//METEORS
	public static final BlockBase blockMeteor  = new BlockBase("meteor", MeteorsMod.meteorsCTab, Material.IRON);
	
	// @formatter:on
}
