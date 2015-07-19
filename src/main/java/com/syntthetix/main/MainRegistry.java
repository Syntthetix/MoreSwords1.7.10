package com.syntthetix.main;

import com.syntthetix.block.MasterOre;
import com.syntthetix.item.Elucidator;
import com.syntthetix.item.DarkRepulser;
import com.syntthetix.item.EnergySword;
import com.syntthetix.item.LaserCrystal;
import com.syntthetix.item.Lightsaber;
import com.syntthetix.item.MasterOreCrystal;
import com.syntthetix.item.MasterSword;
import com.syntthetix.lib.RefStrings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)

public class MainRegistry {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent) {
		Elucidator.mainRegistry();
		DarkRepulser.mainRegistry();
		MasterSword.mainRegistry();
		EnergySword.mainRegistry();
		Lightsaber.mainRegistry();
		MasterOreCrystal.mainRegistry();
		MasterOre.mainRegistry();
		LaserCrystal.mainRegistry();
		CraftingManager.mainRegistry();
		GameRegistry.registerWorldGenerator(new OreGeneration(), 0);
		proxy.registerRenderInfo();
	}
	
	@EventHandler
	public static void Load(FMLInitializationEvent Event) {
		
	}
	
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent) {
		
	}
}