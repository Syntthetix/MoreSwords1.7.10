package com.syntthetix.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class MasterSword {
	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static ToolMaterial masterOre = EnumHelper.addToolMaterial("Master Ore", 0, 1850, 2, 10, 10);
	
	public static Item mSword;
	
	public static void initializeItem() {
		mSword = new mSword(MasterSword.masterOre);
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(mSword, mSword.getUnlocalizedName());
	}
}
