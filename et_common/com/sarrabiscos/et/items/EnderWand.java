package com.sarrabiscos.et.items;

import com.sarrabiscos.et.EnderTech;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * EnderTech
 * 
 * EnderWand
 * 
 * @author sarrabiscos
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class EnderWand extends Item {

	public EnderWand(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabTools);
	}

	public void updateIcons(IconRegister par1IconRegister) {
		this.iconIndex = par1IconRegister.registerIcon(EnderTech.modid + ":"
				+ this.getUnlocalizedName());
	}

}
