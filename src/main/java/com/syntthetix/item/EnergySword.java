package com.syntthetix.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class EnergySword {
	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static ToolMaterial laserCrystal = EnumHelper.addToolMaterial("Laser Crystal", 0, 1300, 2, 8, 10);
	
	public static Item eSword;
	
	public static void initializeItem() {
		eSword = new eSword(EnergySword.laserCrystal);
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(eSword, eSword.getUnlocalizedName());
	}
}
