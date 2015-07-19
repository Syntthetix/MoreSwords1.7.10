package com.syntthetix.item;

import com.syntthetix.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class DarkRepulser {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}

	public static ToolMaterial emerald = EnumHelper.addToolMaterial("Emerald", 0, 2000, 2, 9, 10);
	
	public static Item darkRep;
	
	public static void initializeItem() {
		darkRep = new darkRep(emerald);
	}

	public static void registerItem() {
		GameRegistry.registerItem(darkRep, darkRep.getUnlocalizedName());
	}
}