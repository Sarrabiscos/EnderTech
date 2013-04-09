package com.sarrabiscos.et;

import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

import com.sarrabiscos.et.items.Items;

@Mod(modid = EnderTech.modid, name = "EnderTech", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class EnderTech {

	public static final String modid = "Sarrabiscos_EnderTech";

	@Init
	public void load(FMLInitializationEvent event) {
		Items.init();
	}

}