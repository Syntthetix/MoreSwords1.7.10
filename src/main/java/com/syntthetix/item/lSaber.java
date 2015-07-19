package com.syntthetix.item;

import com.syntthetix.lib.RefStrings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class lSaber extends ItemSword {

	public lSaber(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setUnlocalizedName("lSaber");
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setTextureName(RefStrings.MODID + ":Lightsaber");
	}

}
