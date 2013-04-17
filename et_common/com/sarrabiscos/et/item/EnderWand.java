package com.sarrabiscos.et.item;

import com.sarrabiscos.et.EnderTech;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/** EnderTech
 * 
 * EnderWand
 * 
 * @author sarrabiscos
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html) */

public class EnderWand extends Item {

	public EnderWand(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabTools);
	}

	public void updateIcons(IconRegister par1IconRegister) {
		this.iconIndex = par1IconRegister.registerIcon(EnderTech.modid + ":"
				+ this.getUnlocalizedName());
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		if (!par2World.isRemote) {
			EntityEnderPearl var1 = new EntityEnderPearl(par2World,
					par3EntityPlayer);
			par2World.spawnEntityInWorld(var1);
			par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F,
					0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

		}
		return par1ItemStack;
	}

	@SideOnly(Side.CLIENT)
	/**
	 * Returns True is the item is renderer in full 3D when hold.
	 */
	public boolean isFull3D() {
		return true;
	}

}
