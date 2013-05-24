package com.sarrabiscos.et.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

import com.sarrabiscos.et.EnderTech;
import com.sarrabiscos.et.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/** EnderTech
 * 
 * ItemET
 * 
 * @author sarrabiscos
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html) */

public class ItemET extends Item {

	public ItemET(int id) {
		super(id);
		maxStackSize = 1;
		setNoRepair();
		this.setCreativeTab(EnderTech.tabsET);
	}

	@Override
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
 {
     this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
 }
}
