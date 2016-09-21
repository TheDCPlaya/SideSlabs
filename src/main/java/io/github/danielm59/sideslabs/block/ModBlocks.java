package io.github.danielm59.sideslabs.block;

import io.github.danielm59.sideslabs.SideSlabs;
import io.github.danielm59.sideslabs.util.TextureHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
	public static final Block stoneSideSlab = new BlockSideSlab(Material.ROCK);
	public static final Item itemStoneSideSlab = new ItemBlock(stoneSideSlab);
	
	public static void init()
	{
		stoneSideSlab.setRegistryName(SideSlabs.MODID, "stonesideslab");
		stoneSideSlab.setUnlocalizedName(stoneSideSlab.getRegistryName().toString());
		GameRegistry.register(stoneSideSlab);
		
		itemStoneSideSlab.setRegistryName(SideSlabs.MODID, "stonesideslab");
		itemStoneSideSlab.setUnlocalizedName(stoneSideSlab.getRegistryName().toString());
		GameRegistry.register(itemStoneSideSlab);
	}
	
	public static void inittextures()
	{
		TextureHelper.register(itemStoneSideSlab);
	}
	
}
