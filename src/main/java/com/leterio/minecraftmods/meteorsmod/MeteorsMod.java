package com.leterio.minecraftmods.meteorsmod;

import com.leterio.minecraftmods.meteorsmod.creativetabs.MeteorsCreativeTab;
import com.leterio.minecraftmods.meteorsmod.proxies.CommomProxy;
import com.leterio.minecraftmods.meteorsmod.utils.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MeteorsMod.MODID, name = MeteorsMod.NAME, acceptedMinecraftVersions = MeteorsMod.ACCEPTED_VERSIONS, version = MeteorsMod.VERSION)
public class MeteorsMod {
	// TODO @ leterio - Externalizar as configs

	public static final boolean DEBUG_MODE = true;

	public static final String MODID = "meteorsmod";
	public static final String NAME = "${mod_name}";
	public static final String ACCEPTED_VERSIONS = "[1.12.2]";
	public static final String VERSION = "${mod_version}";

	@Instance(MeteorsMod.MODID)
	public static MeteorsMod instance;

	@SidedProxy(modId = MeteorsMod.MODID, serverSide = "com.leterio.minecraftmods.meteorsmod.proxies.CommomProxy", clientSide = "com.leterio.minecraftmods.meteorsmod.proxies.ClientProxy")
	public static CommomProxy proxy;

	public static final MeteorsCreativeTab METEORS_CT = new MeteorsCreativeTab();

	@EventHandler
	public void preInit(final FMLPreInitializationEvent event) {
		Logger.setLogger(event.getModLog());
		Logger.info(() -> "Iniciando " + MODID);
	}
}
