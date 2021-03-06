package com.leterio.minecraftmods.meteorsmod.handlers;

import java.util.Iterator;
import java.util.List;

import com.leterio.minecraftmods.meteorsmod.enchantments.Enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

@EventBusSubscriber
public class EnchantmentMagnetoPlayerTickHandler {

	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent event) {
		EntityPlayer player = event.player;
		World world = player.world;

		int enchLevel = getPower(player);
		if (enchLevel > 0) {
			double distance = (6 + enchLevel * 0.7) > 24 ? 24 : (6 + enchLevel * 0.7);
			BlockPos rangeStart = new BlockPos(player.posX - distance, player.posY - distance, player.posZ - distance);
			BlockPos rangeEnd = new BlockPos(player.posX + distance, player.posY + distance, player.posZ + distance);
			List<Entity> entities = world.getEntitiesWithinAABB(EntityItem.class, new AxisAlignedBB(rangeStart, rangeEnd));
			for (Entity en : entities) {
				double var3 = (player.posX - en.posX) / distance;
				double var5 = (player.posY + (player.getEyeHeight() / 2) - en.posY) / distance;
				double var7 = (player.posZ - en.posZ) / distance;
				double var9 = Math.sqrt(var3 * var3 + var5 * var5 + var7 * var7);
				double var11 = 1.0D - var9;

				if (var11 > 0.0D) {
					var11 *= var11;
					en.motionX += var3 / var9 * var11 * 0.1D;
					en.motionY += var5 / var9 * var11 * 0.1D;
					en.motionZ += var7 / var9 * var11 * 0.1D;
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
				if (Enchantment.getEnchantmentByID((int) e.getInteger("id")) == Enchantments.ENCHANTMENT_MAGNETO) {
					power += e.getInteger("lvl");
				}
			}
		}
		return power;
	}

	private static ItemStack[] getHeldItems(EntityPlayer player) {
		return new ItemStack[] { 
			player.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND), 
			player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 
			player.getItemStackFromSlot(EntityEquipmentSlot.LEGS),
			player.getItemStackFromSlot(EntityEquipmentSlot.CHEST), 
			player.getItemStackFromSlot(EntityEquipmentSlot.HEAD) 
		};
	}
}
