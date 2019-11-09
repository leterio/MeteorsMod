package com.leterio.minecraftmods.meteorsmod.world;

import java.util.Random;

import com.leterio.minecraftmods.meteorsmod.blocks.Blocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGen implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(Blocks.BLOCK_METEORITE_ORE.getDefaultState(),  world, random, chunkX * 16, chunkZ * 16, 1, 48, random.nextInt(2) + 3, 4);
		generateOre(Blocks.BLOCK_FREZARITE_ORE.getDefaultState(),  world, random, chunkX * 16, chunkZ * 16, 1, 24, random.nextInt(2) + 2, 4);
		generateOre(Blocks.BLOCK_KREKNORITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(2) + 2, 3);
	}

	private void generateOre(
			IBlockState ore,
			World world,
			Random random,
			int x,
			int z,
			int minY,
			int maxY,
			int size,
			int chances) {
		int deltaY = maxY - minY;

		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
}
