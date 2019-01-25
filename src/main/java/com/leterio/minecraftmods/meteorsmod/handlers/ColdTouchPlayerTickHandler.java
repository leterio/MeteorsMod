package com.leterio.minecraftmods.meteorsmod.handlers;

import java.util.Iterator;

import com.leterio.minecraftmods.meteorsmod.enchantment.Enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
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

		int totalLevel = getPower(player);
		if (totalLevel > 0 && !player.isInWater() && event.side.isServer()) {
			Vec3d playerPos = player.getPositionVector();
			int l = (int) Math.round(playerPos.x);
			int y = (int) playerPos.y - 1;
			int k1 = (int) Math.round(playerPos.z);
			for (int x = l - totalLevel; x < l + totalLevel; x++) {
				for (int z = k1 - totalLevel; z < k1 + totalLevel; z++) {
					BlockPos pos = new BlockPos(x, y, z);
					if ((world.getBlockState(pos).getBlock() == Blocks.WATER) || (world.getBlockState(pos).getBlock() == Blocks.FLOWING_WATER)) {
						world.setBlockState(pos, Blocks.ICE.getDefaultState());
					}
				}
			}
		}
	}

	public static int getPower(EntityPlayer player) {
		int power = 0;
		ItemStack[] itemsOnPlayer = getHeldItems(player);
		for (int i = 0; i < itemsOnPlayer.length; i++) {
			Iterator<NBTBase> itr = itemsOnPlayer[i].getEnchantmentTagList().iterator();
			while (itr.hasNext()) {
				NBTTagCompound e = (NBTTagCompound) itr.next();
				if (Enchantment.getEnchantmentByID((int) e.getInteger("id")) == Enchantments.ENCHANTMENT_COLD_TOUCH) {
					power += e.getInteger("lvl");
				}
			}
		}
		return power < 0 ? 0 : power > 3 ? 3 : power;
	}

	private static ItemStack[] getHeldItems(EntityPlayer player) {
		return new ItemStack[] { player.getItemStackFromSlot(EntityEquipmentSlot.FEET) };
	}
}
