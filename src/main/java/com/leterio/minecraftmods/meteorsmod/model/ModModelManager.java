package com.leterio.minecraftmods.meteorsmod.model;

import java.util.Objects;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;
import com.leterio.minecraftmods.meteorsmod.items.Items;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = MeteorsMod.MODID)
public class ModModelManager {
	public static final ModModelManager INSTANCE = new ModModelManager();

	@SubscribeEvent
	public static void registerAllModels(final ModelRegistryEvent event) {
		INSTANCE.registerItemModels();
	}

	private void registerItemModels() {
		for (Item item : Items.ITEMS) {
			registerItemModel(item);
		}
	}

	private void registerItemModel(Item item) {
		final ResourceLocation registryName = Objects.requireNonNull(item.getRegistryName());
		final ModelResourceLocation fullModelLocation = new ModelResourceLocation(registryName.toString(), "inventory");
		ModelBakery.registerItemVariants(item, fullModelLocation);
		ModelLoader.setCustomMeshDefinition(item, s -> fullModelLocation);
	}
}
