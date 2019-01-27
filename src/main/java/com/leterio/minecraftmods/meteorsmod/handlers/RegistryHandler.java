package com.leterio.minecraftmods.meteorsmod.handlers;

import java.util.Collections;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;
import com.leterio.minecraftmods.meteorsmod.blocks.Blocks;
import com.leterio.minecraftmods.meteorsmod.enchantment.Enchantments;
import com.leterio.minecraftmods.meteorsmod.items.Items;
import com.leterio.minecraftmods.meteorsmod.util.Logger;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@EventBusSubscriber
public class RegistryHandler {

	public static void registerRecipes() {

	}

	public static void registerOreDictionary() {

	}

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		Logger.debug(() -> "Registrando itens ...");
		Collections.sort(Items.ITEMS, (i1, i2) -> i1.getRegistryName().compareTo(i2.getRegistryName()));
		event.getRegistry().registerAll(Items.ITEMS.toArray(new Item[Items.ITEMS.size()]));

		Logger.debug(() -> "Registrando oredict");
		OreDictionary.registerOre("ingotRedGem", Items.ITEM_REDMETEOR_GEM);
		OreDictionary.registerOre("ingotMeteorite", Items.ITEM_INGOT_METEORITE);
		OreDictionary.registerOre("ingotFrezarite", Items.ITEM_INGOT_FREZARITE);
		OreDictionary.registerOre("ingotKreknorite", Items.ITEM_INGOT_KREKNORITE);

		Logger.debug(() -> "Registrando forjas");
		GameRegistry.addSmelting(Items.ITEM_METEOR_CHIPS, new ItemStack(Items.ITEM_INGOT_METEORITE), 1000);
		GameRegistry.addSmelting(Items.ITEM_FREZARITE_CRYSTAL, new ItemStack(Items.ITEM_INGOT_FREZARITE), 1000);
		GameRegistry.addSmelting(Items.ITEM_KREKNORITE_CHIP, new ItemStack(Items.ITEM_INGOT_KREKNORITE), 1000);
	}

	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		Logger.debug(() -> "Registrando blocos ...");
		Collections.sort(Blocks.BLOCKS, (i1, i2) -> i1.getRegistryName().compareTo(i2.getRegistryName()));
		event.getRegistry().registerAll(Blocks.BLOCKS.toArray(new Block[Blocks.BLOCKS.size()]));
	}

	@SubscribeEvent
	public static void onEnchantmentRegister(RegistryEvent.Register<Enchantment> event) {
		Logger.debug(() -> "Registrando encantamentos ...");
		event.getRegistry().registerAll(Enchantments.ENCHANTMENTS.toArray(new Enchantment[Enchantments.ENCHANTMENTS.size()]));
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for (Item item : Items.ITEMS) {
			MeteorsMod.proxy.registerItemRenderer(item, 0, "inventory");
		}
		for (Block block : Blocks.BLOCKS) {
			MeteorsMod.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
		}
	}
}
