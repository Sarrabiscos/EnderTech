package com.sarrabiscos.et.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

/**
 * EnderTech
 * 
 * Items
 * 
 * @author sarrabiscos
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class Items {
	
	public static Item enderWand;

	public static void init() {

		enderWand = new EnderWand(5000).setUnlocalizedName("enderWand");
		LanguageRegistry.addName(enderWand, "Ender Wand");
	}

}
