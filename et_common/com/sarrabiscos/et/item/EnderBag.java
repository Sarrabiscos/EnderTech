package com.sarrabiscos.et.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryEnderChest;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/** EnderTech
 * 
 * EnderBag
 * 
 * @author sarrabiscos
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html) */

public class EnderBag extends ItemET {

	public EnderBag(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabTools);
	}

	public ItemStack onItemRightClick(ItemStack itemStack, World world,
			EntityPlayer entityPlayer) {
		InventoryEnderChest inventoryenderchest = entityPlayer
				.getInventoryEnderChest();
		if (!world.isRemote) {
			entityPlayer.displayGUIChest(inventoryenderchest);
			world.playSoundAtEntity(entityPlayer, "random.chestopen", 0.5F,
					0.85F);
		}
		return itemStack;
	}

}
