package com.leterio.minecraftmods.meteorsmod.handlers;

import java.util.Random;

import com.leterio.minecraftmods.meteorsmod.blocks.Blocks;
import com.leterio.minecraftmods.meteorsmod.items.Items;

import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class BlockEventHandler {
	private final static Random RNG = new Random(System.currentTimeMillis() / 2048);

	@SubscribeEvent
	public static void harvestDrops(final BlockEvent.HarvestDropsEvent event) {
		if (Blocks.BLOCK_METEORITE_ORE.equals(event.getState().getBlock())) {
			event.getDrops().clear();
			event.getDrops().add(new ItemStack(Items.ITEM_METEOR_CHIPS, 1));
			if (RNG.nextFloat() < 0.05f) {
				event.getDrops().add(new ItemStack(Items.ITEM_REDMETEOR_GEM, 1));
			}
			return;
		}
		if (Blocks.BLOCK_FREZARITE_ORE.equals(event.getState().getBlock())) {
			event.getDrops().clear();
			event.getDrops().add(new ItemStack(Items.ITEM_FREZARITE_CRYSTAL, 1));
			return;
		}
		if (Blocks.BLOCK_KREKNORITE_ORE.equals(event.getState().getBlock())) {
			event.getDrops().clear();
			event.getDrops().add(new ItemStack(Items.ITEM_KREKNORITE_CHIP, 1));
			return;
		}
	}
}
