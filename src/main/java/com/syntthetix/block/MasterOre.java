package com.syntthetix.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MasterOre {
	public static void mainRegistry() {
		initializeBlock();
		registerBlock();
	}
	
	public static Block mOre;
	
	public static void initializeBlock() {
		mOre = new mOre(Material.ground);
	}
	
	public static void registerBlock() {
		GameRegistry.registerBlock(mOre, mOre.getUnlocalizedName());
	}
	
}
