package com.syntthetix.item;

import com.syntthetix.lib.RefStrings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class mSword extends ItemSword{

	public mSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setUnlocalizedName("mSword");
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setTextureName(RefStrings.MODID + ":Master Sword");
	}

}
