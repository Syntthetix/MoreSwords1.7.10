package com.syntthetix.block;

import java.util.Random;

import com.syntthetix.item.MasterOreCrystal;
import com.syntthetix.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class mOre extends Block {

	protected mOre(Material ground) {
		super(ground);
		this.setBlockName("mOre");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockTextureName(RefStrings.MODID + ":Master Ore");
		this.setHardness(3);
	}

	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune) {
		return MasterOreCrystal.mOreCrystal;
	}
}
