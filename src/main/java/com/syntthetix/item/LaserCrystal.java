package com.syntthetix.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.syntthetix.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;

public class LaserCrystal {
	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static Item lCrystal;
	
	public static void initializeItem() {
		lCrystal = new Item().setUnlocalizedName("lCrystal").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":Laser Crystal");
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(lCrystal, lCrystal.getUnlocalizedName());
	}
}
