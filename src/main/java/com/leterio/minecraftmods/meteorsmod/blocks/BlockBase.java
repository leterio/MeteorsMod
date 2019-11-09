package com.leterio.minecraftmods.meteorsmod.blocks;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;
import com.leterio.minecraftmods.meteorsmod.items.Items;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockBase extends Block {
	public BlockBase(String blockName, Material material, SoundType soundType, float hardness, float resistance, float lightLevel) {
		super(material);
		setRegistryName(MeteorsMod.MODID, blockName);
		setTranslationKey(getRegistryName().toString());
		setCreativeTab(MeteorsMod.METEORS_CT);
		setHardness(hardness);
		setResistance(resistance);
		setLightLevel(lightLevel);

		Blocks.BLOCKS.add(this);
		Items.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		super.getDrops(drops, world, pos, state, fortune);
	}
}
