package com.leterio.minecraftmods.meteorsmod;

import com.leterio.minecraftmods.meteorsmod.creativetabs.MeteorsCreativeTab;
import com.leterio.minecraftmods.meteorsmod.creativetabs.ToolsCreativeTab;
import com.leterio.minecraftmods.meteorsmod.proxy.CommomProxy;
import com.leterio.minecraftmods.meteorsmod.util.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MeteorsMod.MODID, name = MeteorsMod.NAME, acceptedMinecraftVersions = MeteorsMod.ACCEPTED_VERSIONS, version = MeteorsMod.VERSION)
public class MeteorsMod {
	public static final String MODID = "meteorsmod";
	public static final String NAME = "${mod_name}";
	public static final String ACCEPTED_VERSIONS = "[1.12.2]";
	public static final String VERSION = "${mod_version}";

	@Instance(MeteorsMod.MODID)
	public static MeteorsMod instance;

	@SidedProxy(modId = MeteorsMod.MODID, serverSide = "com.leterio.minecraftmods.meteorsmod.proxy.CommomProxy", clientSide = "com.leterio.minecraftmods.meteorsmod.proxy.ClientProxy")
	public static CommomProxy proxy;

	// @formatter:off
	public static final MeteorsCreativeTab meteorsCTab = new MeteorsCreativeTab();
	public static final ToolsCreativeTab   toolsCTab   = new ToolsCreativeTab();
	// @formatter:on

	@EventHandler
	public void preInit(final FMLPreInitializationEvent event) {
		Logger.setLogger(event.getModLog());
		Logger.info(() -> "Iniciando " + MODID);
	}
}
