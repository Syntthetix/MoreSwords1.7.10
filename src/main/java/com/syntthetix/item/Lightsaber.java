package com.syntthetix.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class Lightsaber {
	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static Item lSaber;
	
	public static void initializeItem() {
		lSaber = new lSaber(EnergySword.laserCrystal);
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(lSaber, lSaber.getUnlocalizedName());
	}
}
