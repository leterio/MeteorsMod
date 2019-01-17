package com.leterio.minecraftmods.meteorsmod.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class Blocks {

	private Blocks() {}

	public static final List<Block> BLOCKS = new ArrayList<>();

	// METEOR
	public static final BlockBase BLOCK_FALLEN_METEOR = new BlockBase("fallen_meteor", Material.IRON);
	public static final BlockBase BLOCK_METEORITE_RARE = new BlockBase("meteorite_rare", Material.IRON);
	public static final BlockBase BLOCK_METEORITE_HOT = new BlockBase("meteorite_hot", Material.IRON);
	public static final BlockBase BLOCK_METEORITE_HOT_RARE = new BlockBase("meteorite_hot_rare", Material.IRON);
	public static final BlockBase BLOCK_METEORITE_ORE = new BlockBase("meteorite_ore", Material.IRON);
	public static final BlockBase BLOCK_METEORITE_BLOCK = new BlockBase("meteorite_block", Material.IRON);

	// KREKNORITE
	public static final BlockBase BLOCK_KREKNORITE = new BlockBase("kreknorite", Material.IRON);
	public static final BlockBase BLOCK_KREKNORITE_BLOCK = new BlockBase("kreknorite_block", Material.IRON);

	// FREZARITE
	public static final BlockBase BLOCK_FREZARITE = new BlockBase("frezarite", Material.IRON);
	public static final BlockBase BLOCK_FREZARITE_ORE = new BlockBase("frezarite_ore", Material.IRON);
	public static final BlockBase BLOCK_FREZARITE_BLOCK = new BlockBase("frezarite_block", Material.IRON);

	// RED GEM
	public static final BlockBase BLOCK_RED_GEM_BLOCK = new BlockBase("block_red_gem", Material.IRON);

	// METEORITE TIMER
	public static final BlockBase BLOCK_METEORITE_TIMER = new BlockBase("meteorite_timer", Material.IRON);

}
