package com.sarrabiscos.et.creativetab;

import com.sarrabiscos.et.block.ModBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabET extends CreativeTabs {

	public CreativeTabET(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		return ModBlocks.enderBlock.blockID;
	}

	public String getTranslatedTabLabel() {
		return "Ender Tech";
	}

}
