package com.leterio.minecraftmods.meteorsmod.model;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;
import com.leterio.minecraftmods.meteorsmod.items.Items;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = MeteorsMod.MODID)
public class ModModelManager {
	public static final ModModelManager INSTANCE = new ModModelManager();

	@SubscribeEvent
	public static void registerAllModels(final ModelRegistryEvent event) {
		INSTANCE.registerItemModels();
	}

	private void registerItemModels() {
		for (Item item : Items.ITEMS) {
			final ModelResourceLocation fullModelLocation = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
			ModelBakery.registerItemVariants(item, fullModelLocation);
			ModelLoader.setCustomMeshDefinition(item, s -> fullModelLocation);
		}
		
//		for (Block block : Blocks.BLOCKS) {
//			final Item item = Item.getItemFromBlock(block);
//			final ModelResourceLocation fullModelLocation = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
//			ModelBakery.registerItemVariants(item, fullModelLocation);
//			ModelLoader.setCustomMeshDefinition(item, s -> fullModelLocation);
//		}
	}
}
