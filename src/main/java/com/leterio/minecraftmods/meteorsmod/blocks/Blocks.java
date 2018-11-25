package com.leterio.minecraftmods.meteorsmod.blocks;

import java.util.ArrayList;
import java.util.List;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class Blocks {
	
	private Blocks() {
	}

	public static final List<Block> BLOCKS = new ArrayList<>();

	//METEOR
	public static final BlockBase BLOCK_FALLEN_METEOR = new BlockBase("fallen_meteor", MeteorsMod.METEORS_BLOCK_CT, Material.IRON);
	public static final BlockBase BLOCK_METEORITE_RARE = new BlockBase("meteorite_rare", MeteorsMod.METEORS_BLOCK_CT, Material.IRON);
	public static final BlockBase BLOCK_METEORITE_HOT = new BlockBase("meteorite_hot", MeteorsMod.METEORS_BLOCK_CT, Material.IRON);
	public static final BlockBase BLOCK_METEORITE_HOT_RARE = new BlockBase("meteorite_hot_rare", MeteorsMod.METEORS_BLOCK_CT, Material.IRON);
	public static final BlockBase BLOCK_METEORITE_ORE = new BlockBase("meteorite_ore", MeteorsMod.METEORS_BLOCK_CT, Material.IRON);
	public static final BlockBase BLOCK_METEORITE_BLOCK = new BlockBase("meteorite_block", MeteorsMod.METEORS_BLOCK_CT, Material.IRON);
	                                          
	//KREKNORITE
	public static final BlockBase BLOCK_KREKNORITE = new BlockBase("kreknorite", MeteorsMod.METEORS_BLOCK_CT, Material.IRON);
	public static final BlockBase BLOCK_KREKNORITE_BLOCK = new BlockBase("kreknorite_block", MeteorsMod.METEORS_BLOCK_CT, Material.IRON);
	
	//FREZARITE
	public static final BlockBase BLOCK_FREZARITE = new BlockBase("frezarite", MeteorsMod.METEORS_BLOCK_CT, Material.IRON);
	public static final BlockBase BLOCK_FREZARITE_ORE = new BlockBase("frezarite_ore", MeteorsMod.METEORS_BLOCK_CT, Material.IRON);
	public static final BlockBase BLOCK_FREZARITE_BLOCK = new BlockBase("frezarite_block", MeteorsMod.METEORS_BLOCK_CT, Material.IRON);
	
	//RED GEM
	public static final BlockBase BLOCK_RED_GEM_BLOCK = new BlockBase("block_red_gem", MeteorsMod.METEORS_BLOCK_CT, Material.IRON); 
	
	//METEORITE TIMER
	public static final BlockBase BLOCK_METEORITE_TIMER = new BlockBase("meteorite_timer", MeteorsMod.METEORS_BLOCK_CT, Material.IRON);
	
}
