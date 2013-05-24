package com.sarrabiscos.et.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import com.sarrabiscos.et.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks {

	public static Block enderBlock;

	public static void init() {

		enderBlock = new EnderBlock(500, Material.iron)
				.setUnlocalizedName("enderBlock").setHardness(5.0F)
				.setResistance(10.0F);
		MinecraftForge.setBlockHarvestLevel(enderBlock, "pickaxe", 1);
		GameRegistry.registerBlock(enderBlock,
				Reference.MOD_ID + enderBlock.getUnlocalizedName2());
		LanguageRegistry.addName(enderBlock, "Ender Block");

		GameRegistry.addRecipe(new ItemStack(ModBlocks.enderBlock, 1), new Object[] { "XXX",
				"XXX", "XXX", 'X', Item.enderPearl });

		GameRegistry.addShapelessRecipe(new ItemStack(Item.enderPearl, 9),
				new Object[] { new ItemStack(ModBlocks.enderBlock) });

	}

}
