package com.syntthetix.main;

import com.syntthetix.item.DarkRepulser;
import com.syntthetix.item.Elucidator;
import com.syntthetix.item.EnergySword;
import com.syntthetix.item.LaserCrystal;
import com.syntthetix.item.Lightsaber;
import com.syntthetix.item.MasterOreCrystal;
import com.syntthetix.item.MasterSword;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	public static void mainRegistry() {
		addCraftingRec();
	}
	
	public static void addCraftingRec() {
		
		GameRegistry.addRecipe(new ItemStack(Elucidator.eluc, 1), new Object[] 
				{
				" O ", 
				"OO ", 
				" S ", 
				'O', Blocks.obsidian,
				'S', Items.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(DarkRepulser.darkRep, 1), new Object[] 
				{
				" E ", 
				"EDE", 
				" S ",
				'E', Items.emerald,
				'D', Items.diamond,
				'S', Items.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(MasterSword.mSword, 1), new Object[] {
				" M ",
				"MGM",
				" S ",
				'S', Items.stick,
				'G', Items.gold_ingot,
				'M', MasterOreCrystal.mOreCrystal
				});
		
		GameRegistry.addRecipe(new ItemStack(EnergySword.eSword, 1), new Object[] 
				{
				"L L",
				"L L",
				"LIL",
				'I', Items.iron_ingot,
				'L', LaserCrystal.lCrystal
				});
		
		GameRegistry.addRecipe(new ItemStack(Lightsaber.lSaber, 1), new Object[] 
				{
				" L ",
				" L ",
				" O ",
				'O', Blocks.obsidian,
				'L', LaserCrystal.lCrystal
				});
		
		GameRegistry.addRecipe(new ItemStack(LaserCrystal.lCrystal, 1), new Object[] 
				{
				"GGG",
				"GRG",
				"GGG",
				'G', Blocks.glass,
				'R', Items.redstone
				});
	}	
}
