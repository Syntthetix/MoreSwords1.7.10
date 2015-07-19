package com.syntthetix.item;

import com.syntthetix.lib.RefStrings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class Elucidator{

	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static ToolMaterial obsidian = EnumHelper.addToolMaterial("Obsidian", 0, 1800, 2, 7, 10);
	
	public static Item eluc;
	
	public static void initializeItem() {
		eluc = new eluc(obsidian);
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(eluc, eluc.getUnlocalizedName());
	}
	
}
