package com.leterio.minecraftmods.meteorsmod.handlers;

import java.util.Iterator;

import com.leterio.minecraftmods.meteorsmod.enchantments.Enchantments;

import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockPos.MutableBlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

@EventBusSubscriber
public class EnchantmentColdTouchPlayerTickHandler {
	private static final int FROST_FACTOR = 3;
	private static final int FALL_LIMIT = 5;

	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent event) {
		EntityPlayer player = event.player;
		World world = player.world;
		if (hasEnchantment(player) && event.side.isServer() && !player.isInWater() && !player.isSneaking() && player.fallDistance < FALL_LIMIT) {
			BlockPos playerPosition = new BlockPos(player);
			for (MutableBlockPos blockBellowPlayer : BlockPos.getAllInBoxMutable(playerPosition.add((double) (-FROST_FACTOR), -1.0D, (double) (-FROST_FACTOR)),
					playerPosition.add((double) FROST_FACTOR, -1.0D, (double) FROST_FACTOR))) {
				if (blockBellowPlayer.distanceSqToCenter(player.posX, player.posY, player.posZ) <= (double) (FROST_FACTOR * FROST_FACTOR)) {
					if (world.getBlockState(new BlockPos(blockBellowPlayer.getX(), blockBellowPlayer.getY() + 1, blockBellowPlayer.getZ())).getMaterial() != Material.WATER) {
						IBlockState blockBellowPlayerState = world.getBlockState(blockBellowPlayer);
						if (blockBellowPlayerState.getMaterial() == Material.WATER
								&& (blockBellowPlayerState.getBlock() == net.minecraft.init.Blocks.WATER
										|| blockBellowPlayerState.getBlock() == net.minecraft.init.Blocks.FLOWING_WATER)
								&& ((Integer) blockBellowPlayerState.getValue(BlockLiquid.LEVEL)).intValue() == 0
								&& world.mayPlace(Blocks.FROSTED_ICE, blockBellowPlayer, false, EnumFacing.DOWN, (Entity) null)) {
							world.setBlockState(blockBellowPlayer, Blocks.FROSTED_ICE.getDefaultState());
							world.scheduleUpdate(blockBellowPlayer.toImmutable(), Blocks.FROSTED_ICE, MathHelper.getInt(player.getRNG(), 60, 120));
						}
					}
				}
			}
		}
	}

	public static boolean hasEnchantment(EntityPlayer player) {
		ItemStack feet = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);
		if (feet != null) {
			Iterator<NBTBase> itr = feet.getEnchantmentTagList().iterator();
			while (itr.hasNext()) {
				if (Enchantment.getEnchantmentByID((int) ((NBTTagCompound) itr.next()).getInteger("id")) == Enchantments.ENCHANTMENT_COLD_TOUCH) {
					return true;
				}
			}
		}
		return false;
	}
}