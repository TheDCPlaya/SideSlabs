package io.github.danielm59.sideslabs.block;

import io.github.danielm59.sideslabs.SideSlabs;
import io.github.danielm59.sideslabs.util.TextureHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockObsidian;
import net.minecraft.block.material.Material;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;

import static io.github.danielm59.sideslabs.item.ModItems.*;

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
	public static final Block obsidianSideSlab = new BlockSideSlab(Material.ROCK);
	
	public static void init(RegistryEvent.Register<Block> event)
	{

		stoneSideSlab.setRegistryName(SideSlabs.MODID, "stonesideslab");
		stoneSideSlab.setUnlocalizedName(stoneSideSlab.getRegistryName().toString());
        event.getRegistry().register(stoneSideSlab);

		sandstoneSideSlab.setRegistryName(SideSlabs.MODID, "sandstonesideslab");
		sandstoneSideSlab.setUnlocalizedName(sandstoneSideSlab.getRegistryName().toString());
        event.getRegistry().register(sandstoneSideSlab);
		
		cobblestoneSideSlab.setRegistryName(SideSlabs.MODID, "cobblestonesideslab");
		cobblestoneSideSlab.setUnlocalizedName(cobblestoneSideSlab.getRegistryName().toString());
        event.getRegistry().register(cobblestoneSideSlab);
		
		brickSideSlab.setRegistryName(SideSlabs.MODID, "bricksideslab");
		brickSideSlab.setUnlocalizedName(brickSideSlab.getRegistryName().toString());
        event.getRegistry().register(brickSideSlab);
		
		stonebrickSideSlab.setRegistryName(SideSlabs.MODID, "stonebricksideslab");
		stonebrickSideSlab.setUnlocalizedName(stonebrickSideSlab.getRegistryName().toString());
        event.getRegistry().register(stonebrickSideSlab);
		
		netherbrickSideSlab.setRegistryName(SideSlabs.MODID, "netherbricksideslab");
		netherbrickSideSlab.setUnlocalizedName(netherbrickSideSlab.getRegistryName().toString());
        event.getRegistry().register(netherbrickSideSlab);
		
		quartzSideSlab.setRegistryName(SideSlabs.MODID, "quartzsideslab");
		quartzSideSlab.setUnlocalizedName(quartzSideSlab.getRegistryName().toString());
        event.getRegistry().register(quartzSideSlab);
		
		oakSideSlab.setRegistryName(SideSlabs.MODID, "oaksideslab");
		oakSideSlab.setUnlocalizedName(oakSideSlab.getRegistryName().toString());
        event.getRegistry().register(oakSideSlab);
		
		spruceSideSlab.setRegistryName(SideSlabs.MODID, "sprucesideslab");
		spruceSideSlab.setUnlocalizedName(spruceSideSlab.getRegistryName().toString());
        event.getRegistry().register(spruceSideSlab);
		
		birchSideSlab.setRegistryName(SideSlabs.MODID, "birchsideslab");
		birchSideSlab.setUnlocalizedName(birchSideSlab.getRegistryName().toString());
        event.getRegistry().register(birchSideSlab);
		
		jungleSideSlab.setRegistryName(SideSlabs.MODID, "junglesideslab");
		jungleSideSlab.setUnlocalizedName(jungleSideSlab.getRegistryName().toString());
        event.getRegistry().register(jungleSideSlab);
		
		acaciaSideSlab.setRegistryName(SideSlabs.MODID, "acaciasideslab");
		acaciaSideSlab.setUnlocalizedName(acaciaSideSlab.getRegistryName().toString());
        event.getRegistry().register(acaciaSideSlab);
		
		darkoakSideSlab.setRegistryName(SideSlabs.MODID, "darkoaksideslab");
		darkoakSideSlab.setUnlocalizedName(darkoakSideSlab.getRegistryName().toString());
        event.getRegistry().register(darkoakSideSlab);
		
		redsandstoneSideSlab.setRegistryName(SideSlabs.MODID, "redsandstonesideslab");
		redsandstoneSideSlab.setUnlocalizedName(redsandstoneSideSlab.getRegistryName().toString());
        event.getRegistry().register(redsandstoneSideSlab);
		
		purpurSideSlab.setRegistryName(SideSlabs.MODID, "purpursideslab");
		purpurSideSlab.setUnlocalizedName(purpurSideSlab.getRegistryName().toString());
        event.getRegistry().register(purpurSideSlab);

		obsidianSideSlab.setRegistryName(SideSlabs.MODID, "obsidiansideslab");
		obsidianSideSlab.setUnlocalizedName(obsidianSideSlab.getRegistryName().toString());
		event.getRegistry().register(obsidianSideSlab);



	}

	public static void inittextures(ModelRegistryEvent event)
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
		TextureHelper.register(itemObsidianSideSlab);


	}
	
}
