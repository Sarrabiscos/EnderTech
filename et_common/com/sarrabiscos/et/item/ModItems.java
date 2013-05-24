package com.sarrabiscos.et.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

/** EnderTech
 * 
 * Items
 * 
 * @author sarrabiscos
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html) */

public class ModItems {

	public static Item enderWand;
	public static Item enderBag;
	public static Item enderMultiTool;

	public static void init() {

		enderWand = new EnderWand(500).setUnlocalizedName("enderWand");
		LanguageRegistry.addName(enderWand, "Ender Wand");
		
		enderBag = new EnderBag(501).setUnlocalizedName("enderBag");
		LanguageRegistry.addName(enderBag, "Ender Bag");
		
		// Disabled
		//enderMultiTool = new EnderMultiTool(502).setUnlocalizedName("enderMultiTool");
		//LanguageRegistry.addName(enderMultiTool, "Ender Multi Tool");
		
	}

}
