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
	public static final Block sandstoneSideSlab = new BlockSideSlab(Material.ROCK);
	public static final Block cobblestoneSideSlab = new BlockSideSlab(Material.ROCK);
	public static final Block brickSideSlab = new BlockSideSlab(Material.ROCK);
	public static final Block stonebrickSideSlab = new BlockSideSlab(Material.ROCK);
	public static final Block netherbrickSideSlab = new BlockSideSlab(Material.ROCK);
	public static final Block quartzSideSlab = new BlockSideSlab(Material.ROCK);
	public static final Block oakSideSlab = new BlockSideSlab(Material.WOOD);
	public static final Block spruceSideSlab = new BlockSideSlab(Material.WOOD);
	public static final Block birchSideSlab = new BlockSideSlab(Material.WOOD);
	public static final Block jungleSideSlab = new BlockSideSlab(Material.WOOD);
	public static final Block acaciaSideSlab = new BlockSideSlab(Material.WOOD);
	public static final Block darkoakSideSlab = new BlockSideSlab(Material.WOOD);
	public static final Block redsandstoneSideSlab = new BlockSideSlab(Material.ROCK);
	public static final Block purpurSideSlab = new BlockSideSlab(Material.ROCK);
	
	public static final Item itemStoneSideSlab = new ItemBlock(stoneSideSlab);
	public static final Item itemSandstoneSideSlab = new ItemBlock(sandstoneSideSlab);
	public static final Item itemCobblestoneSideSlab = new ItemBlock(cobblestoneSideSlab);
	public static final Item itemBrickSideSlab = new ItemBlock(brickSideSlab);
	public static final Item itemStonebrickSideSlab = new ItemBlock(stonebrickSideSlab);
	public static final Item itemNetherbrickSideSlab = new ItemBlock(netherbrickSideSlab);
	public static final Item itemQuartzSideSlab = new ItemBlock(quartzSideSlab);
	public static final Item itemOakSideSlab = new ItemBlock(oakSideSlab);
	public static final Item itemSpruceSideSlab = new ItemBlock(spruceSideSlab);
	public static final Item itemBirchSideSlab = new ItemBlock(birchSideSlab);
	public static final Item itemJungleSideSlab = new ItemBlock(jungleSideSlab);
	public static final Item itemAcaciaSideSlab = new ItemBlock(acaciaSideSlab);
	public static final Item itemDarkoakSideSlab = new ItemBlock(darkoakSideSlab);
	public static final Item itemRedsandstoneSideSlab = new ItemBlock(redsandstoneSideSlab);
	public static final Item itemPurpurSideSlab = new ItemBlock(purpurSideSlab);
	
	public static void init()
	{
		stoneSideSlab.setRegistryName(SideSlabs.MODID, "stonesideslab");
		stoneSideSlab.setUnlocalizedName(stoneSideSlab.getRegistryName().toString());
		GameRegistry.register(stoneSideSlab);
		
		sandstoneSideSlab.setRegistryName(SideSlabs.MODID, "sandstonesideslab");
		sandstoneSideSlab.setUnlocalizedName(sandstoneSideSlab.getRegistryName().toString());
		GameRegistry.register(sandstoneSideSlab);
		
		cobblestoneSideSlab.setRegistryName(SideSlabs.MODID, "cobblestonesideslab");
		cobblestoneSideSlab.setUnlocalizedName(cobblestoneSideSlab.getRegistryName().toString());
		GameRegistry.register(cobblestoneSideSlab);
		
		brickSideSlab.setRegistryName(SideSlabs.MODID, "bricksideslab");
		brickSideSlab.setUnlocalizedName(brickSideSlab.getRegistryName().toString());
		GameRegistry.register(brickSideSlab);
		
		stonebrickSideSlab.setRegistryName(SideSlabs.MODID, "stonebricksideslab");
		stonebrickSideSlab.setUnlocalizedName(stonebrickSideSlab.getRegistryName().toString());
		GameRegistry.register(stonebrickSideSlab);
		
		netherbrickSideSlab.setRegistryName(SideSlabs.MODID, "netherbricksideslab");
		netherbrickSideSlab.setUnlocalizedName(netherbrickSideSlab.getRegistryName().toString());
		GameRegistry.register(netherbrickSideSlab);
		
		quartzSideSlab.setRegistryName(SideSlabs.MODID, "quartzsideslab");
		quartzSideSlab.setUnlocalizedName(quartzSideSlab.getRegistryName().toString());
		GameRegistry.register(quartzSideSlab);
		
		oakSideSlab.setRegistryName(SideSlabs.MODID, "oaksideslab");
		oakSideSlab.setUnlocalizedName(oakSideSlab.getRegistryName().toString());
		GameRegistry.register(oakSideSlab);
		
		spruceSideSlab.setRegistryName(SideSlabs.MODID, "sprucesideslab");
		spruceSideSlab.setUnlocalizedName(spruceSideSlab.getRegistryName().toString());
		GameRegistry.register(spruceSideSlab);
		
		birchSideSlab.setRegistryName(SideSlabs.MODID, "birchsideslab");
		birchSideSlab.setUnlocalizedName(birchSideSlab.getRegistryName().toString());
		GameRegistry.register(birchSideSlab);
		
		jungleSideSlab.setRegistryName(SideSlabs.MODID, "junglesideslab");
		jungleSideSlab.setUnlocalizedName(jungleSideSlab.getRegistryName().toString());
		GameRegistry.register(jungleSideSlab);
		
		acaciaSideSlab.setRegistryName(SideSlabs.MODID, "acaciasideslab");
		acaciaSideSlab.setUnlocalizedName(acaciaSideSlab.getRegistryName().toString());
		GameRegistry.register(acaciaSideSlab);
		
		darkoakSideSlab.setRegistryName(SideSlabs.MODID, "darkoaksideslab");
		darkoakSideSlab.setUnlocalizedName(darkoakSideSlab.getRegistryName().toString());
		GameRegistry.register(darkoakSideSlab);
		
		redsandstoneSideSlab.setRegistryName(SideSlabs.MODID, "redsandstonesideslab");
		redsandstoneSideSlab.setUnlocalizedName(redsandstoneSideSlab.getRegistryName().toString());
		GameRegistry.register(redsandstoneSideSlab);
		
		purpurSideSlab.setRegistryName(SideSlabs.MODID, "purpursideslab");
		purpurSideSlab.setUnlocalizedName(purpurSideSlab.getRegistryName().toString());
		GameRegistry.register(purpurSideSlab);
		
		itemStoneSideSlab.setRegistryName(stoneSideSlab.getRegistryName());
		itemStoneSideSlab.setUnlocalizedName(itemStoneSideSlab.getRegistryName().toString());
		GameRegistry.register(itemStoneSideSlab);
		
		itemSandstoneSideSlab.setRegistryName(sandstoneSideSlab.getRegistryName());
		itemSandstoneSideSlab.setUnlocalizedName(itemSandstoneSideSlab.getRegistryName().toString());
		GameRegistry.register(itemSandstoneSideSlab);
		
		itemCobblestoneSideSlab.setRegistryName(cobblestoneSideSlab.getRegistryName());
		itemCobblestoneSideSlab.setUnlocalizedName(itemCobblestoneSideSlab.getRegistryName().toString());
		GameRegistry.register(itemCobblestoneSideSlab);
		
		itemBrickSideSlab.setRegistryName(brickSideSlab.getRegistryName());
		itemBrickSideSlab.setUnlocalizedName(itemBrickSideSlab.getRegistryName().toString());
		GameRegistry.register(itemBrickSideSlab);
		
		itemStonebrickSideSlab.setRegistryName(stonebrickSideSlab.getRegistryName());
		itemStonebrickSideSlab.setUnlocalizedName(itemStonebrickSideSlab.getRegistryName().toString());
		GameRegistry.register(itemStonebrickSideSlab);
		
		itemNetherbrickSideSlab.setRegistryName(netherbrickSideSlab.getRegistryName());
		itemNetherbrickSideSlab.setUnlocalizedName(itemNetherbrickSideSlab.getRegistryName().toString());
		GameRegistry.register(itemNetherbrickSideSlab);
		
		itemQuartzSideSlab.setRegistryName(quartzSideSlab.getRegistryName());
		itemQuartzSideSlab.setUnlocalizedName(itemQuartzSideSlab.getRegistryName().toString());
		GameRegistry.register(itemQuartzSideSlab);
		
		itemOakSideSlab.setRegistryName(oakSideSlab.getRegistryName());
		itemOakSideSlab.setUnlocalizedName(itemOakSideSlab.getRegistryName().toString());
		GameRegistry.register(itemOakSideSlab);
		
		itemSpruceSideSlab.setRegistryName(spruceSideSlab.getRegistryName());
		itemSpruceSideSlab.setUnlocalizedName(itemSpruceSideSlab.getRegistryName().toString());
		GameRegistry.register(itemSpruceSideSlab);
		
		itemBirchSideSlab.setRegistryName(birchSideSlab.getRegistryName());
		itemBirchSideSlab.setUnlocalizedName(itemBirchSideSlab.getRegistryName().toString());
		GameRegistry.register(itemBirchSideSlab);
		
		itemJungleSideSlab.setRegistryName(jungleSideSlab.getRegistryName());
		itemJungleSideSlab.setUnlocalizedName(itemJungleSideSlab.getRegistryName().toString());
		GameRegistry.register(itemJungleSideSlab);
		
		itemAcaciaSideSlab.setRegistryName(acaciaSideSlab.getRegistryName());
		itemAcaciaSideSlab.setUnlocalizedName(itemAcaciaSideSlab.getRegistryName().toString());
		GameRegistry.register(itemAcaciaSideSlab);
		
		itemDarkoakSideSlab.setRegistryName(darkoakSideSlab.getRegistryName());
		itemDarkoakSideSlab.setUnlocalizedName(itemDarkoakSideSlab.getRegistryName().toString());
		GameRegistry.register(itemDarkoakSideSlab);
		
		itemRedsandstoneSideSlab.setRegistryName(redsandstoneSideSlab.getRegistryName());
		itemRedsandstoneSideSlab.setUnlocalizedName(itemRedsandstoneSideSlab.getRegistryName().toString());
		GameRegistry.register(itemRedsandstoneSideSlab);
		
		itemPurpurSideSlab.setRegistryName(purpurSideSlab.getRegistryName());
		itemPurpurSideSlab.setUnlocalizedName(itemPurpurSideSlab.getRegistryName().toString());
		GameRegistry.register(itemPurpurSideSlab);
	}
	
	public static void inittextures()
	{
		TextureHelper.register(itemStoneSideSlab);
		TextureHelper.register(itemSandstoneSideSlab);
		TextureHelper.register(itemCobblestoneSideSlab);
		TextureHelper.register(itemBrickSideSlab);
		TextureHelper.register(itemStonebrickSideSlab);
		TextureHelper.register(itemNetherbrickSideSlab);
		TextureHelper.register(itemQuartzSideSlab);
		TextureHelper.register(itemOakSideSlab);
		TextureHelper.register(itemSpruceSideSlab);
		TextureHelper.register(itemBirchSideSlab);
		TextureHelper.register(itemJungleSideSlab);
		TextureHelper.register(itemAcaciaSideSlab);
		TextureHelper.register(itemDarkoakSideSlab);
		TextureHelper.register(itemRedsandstoneSideSlab);
		TextureHelper.register(itemPurpurSideSlab);
	}
	
}
