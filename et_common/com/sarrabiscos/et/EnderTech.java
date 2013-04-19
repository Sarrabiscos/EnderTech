package com.sarrabiscos.et;

import com.sarrabiscos.et.item.Items;
import com.sarrabiscos.et.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

/** EnderTech
 * 
 * EnderTech
 * 
 * @author sarrabiscos
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html) */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class EnderTech {

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Items.init();
	}

	@Init
	public void load(FMLInitializationEvent event) {

	}

	@PostInit
	public void modsLoaded(FMLPostInitializationEvent event) {
	}

}