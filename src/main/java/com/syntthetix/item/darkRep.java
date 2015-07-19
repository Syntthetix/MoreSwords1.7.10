package com.syntthetix.item;

import com.syntthetix.lib.RefStrings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class darkRep extends ItemSword{

	public darkRep(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setUnlocalizedName("darkRep");
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setTextureName(RefStrings.MODID + ":Dark Repulser");
	}

}
