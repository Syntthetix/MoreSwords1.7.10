package com.syntthetix.item;

import com.syntthetix.lib.RefStrings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class MasterOreCrystal {
	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static Item mOreCrystal;
	
	public static void initializeItem() {
		mOreCrystal = new Item().setUnlocalizedName("mOreCrystal").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":Master Ore Crystal");
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(mOreCrystal, mOreCrystal.getUnlocalizedName());
	}
}
