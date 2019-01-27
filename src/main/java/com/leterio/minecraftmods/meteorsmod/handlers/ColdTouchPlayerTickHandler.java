package com.leterio.minecraftmods.meteorsmod.handlers;

import java.util.Iterator;

import com.leterio.minecraftmods.meteorsmod.enchantment.Enchantments;

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
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

@EventBusSubscriber
public class ColdTouchPlayerTickHandler {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent event) {
		EntityPlayer player = event.player;
		World world = player.world;

		if (event.side.isServer() && !player.isInWater() && !player.isSneaking() && hasEnchantment(player) && player.fallDistance < 6) {
			BlockPos pos = new BlockPos(player);

			float factor = 3;
			BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos(0, 0, 0);

			for (BlockPos.MutableBlockPos blockpos$mutableblockpos1 : BlockPos.getAllInBoxMutable(pos.add((double) (-factor), -1.0D, (double) (-factor)), pos.add((double) factor, -1.0D, (double) factor))) {
				if (blockpos$mutableblockpos1.distanceSqToCenter(player.posX, player.posY, player.posZ) <= (double) (factor * factor)) {
					blockpos$mutableblockpos.setPos(blockpos$mutableblockpos1.getX(), blockpos$mutableblockpos1.getY() + 1, blockpos$mutableblockpos1.getZ());
					IBlockState iblockstate = world.getBlockState(blockpos$mutableblockpos);

					if (iblockstate.getMaterial() == Material.AIR) {
						IBlockState iblockstate1 = world.getBlockState(blockpos$mutableblockpos1);

						if (iblockstate1.getMaterial() == Material.WATER && (iblockstate1.getBlock() == net.minecraft.init.Blocks.WATER || iblockstate1.getBlock() == net.minecraft.init.Blocks.FLOWING_WATER)
								&& ((Integer) iblockstate1.getValue(BlockLiquid.LEVEL)).intValue() == 0 && world.mayPlace(Blocks.FROSTED_ICE, blockpos$mutableblockpos1, false, EnumFacing.DOWN, (Entity) null)) {
							world.setBlockState(blockpos$mutableblockpos1, Blocks.FROSTED_ICE.getDefaultState());
							world.scheduleUpdate(blockpos$mutableblockpos1.toImmutable(), Blocks.FROSTED_ICE, MathHelper.getInt(player.getRNG(), 60, 120));
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