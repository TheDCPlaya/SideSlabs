package io.github.danielm59.sideslabs.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;

import static io.github.danielm59.sideslabs.block.ModBlocks.*;

public class ModItems
{

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
    public static final Item itemObsidianSideSlab = new ItemBlock(obsidianSideSlab);

	public static void init(RegistryEvent.Register<Item> event)
	{
        itemStoneSideSlab.setRegistryName(stoneSideSlab.getRegistryName());
        itemStoneSideSlab.setUnlocalizedName(itemStoneSideSlab.getRegistryName().toString());
        event.getRegistry().register(itemStoneSideSlab);

        itemSandstoneSideSlab.setRegistryName(sandstoneSideSlab.getRegistryName());
        itemSandstoneSideSlab.setUnlocalizedName(itemSandstoneSideSlab.getRegistryName().toString());
        event.getRegistry().register(itemSandstoneSideSlab);

        itemCobblestoneSideSlab.setRegistryName(cobblestoneSideSlab.getRegistryName());
        itemCobblestoneSideSlab.setUnlocalizedName(itemCobblestoneSideSlab.getRegistryName().toString());
        event.getRegistry().register(itemCobblestoneSideSlab);

        itemBrickSideSlab.setRegistryName(brickSideSlab.getRegistryName());
        itemBrickSideSlab.setUnlocalizedName(itemBrickSideSlab.getRegistryName().toString());
        event.getRegistry().register(itemBrickSideSlab);

        itemStonebrickSideSlab.setRegistryName(stonebrickSideSlab.getRegistryName());
        itemStonebrickSideSlab.setUnlocalizedName(itemStonebrickSideSlab.getRegistryName().toString());
        event.getRegistry().register(itemStonebrickSideSlab);

        itemNetherbrickSideSlab.setRegistryName(netherbrickSideSlab.getRegistryName());
        itemNetherbrickSideSlab.setUnlocalizedName(itemNetherbrickSideSlab.getRegistryName().toString());
        event.getRegistry().register(itemNetherbrickSideSlab);

        itemQuartzSideSlab.setRegistryName(quartzSideSlab.getRegistryName());
        itemQuartzSideSlab.setUnlocalizedName(itemQuartzSideSlab.getRegistryName().toString());
        event.getRegistry().register(itemQuartzSideSlab);

        itemOakSideSlab.setRegistryName(oakSideSlab.getRegistryName());
        itemOakSideSlab.setUnlocalizedName(itemOakSideSlab.getRegistryName().toString());
        event.getRegistry().register(itemOakSideSlab);

        itemSpruceSideSlab.setRegistryName(spruceSideSlab.getRegistryName());
        itemSpruceSideSlab.setUnlocalizedName(itemSpruceSideSlab.getRegistryName().toString());
        event.getRegistry().register(itemSpruceSideSlab);

        itemBirchSideSlab.setRegistryName(birchSideSlab.getRegistryName());
        itemBirchSideSlab.setUnlocalizedName(itemBirchSideSlab.getRegistryName().toString());
        event.getRegistry().register(itemBirchSideSlab);

        itemJungleSideSlab.setRegistryName(jungleSideSlab.getRegistryName());
        itemJungleSideSlab.setUnlocalizedName(itemJungleSideSlab.getRegistryName().toString());
        event.getRegistry().register(itemJungleSideSlab);

        itemAcaciaSideSlab.setRegistryName(acaciaSideSlab.getRegistryName());
        itemAcaciaSideSlab.setUnlocalizedName(itemAcaciaSideSlab.getRegistryName().toString());
        event.getRegistry().register(itemAcaciaSideSlab);

        itemDarkoakSideSlab.setRegistryName(darkoakSideSlab.getRegistryName());
        itemDarkoakSideSlab.setUnlocalizedName(itemDarkoakSideSlab.getRegistryName().toString());
        event.getRegistry().register(itemDarkoakSideSlab);

        itemRedsandstoneSideSlab.setRegistryName(redsandstoneSideSlab.getRegistryName());
        itemRedsandstoneSideSlab.setUnlocalizedName(itemRedsandstoneSideSlab.getRegistryName().toString());
        event.getRegistry().register(itemRedsandstoneSideSlab);

        itemPurpurSideSlab.setRegistryName(purpurSideSlab.getRegistryName());
        itemPurpurSideSlab.setUnlocalizedName(itemPurpurSideSlab.getRegistryName().toString());
        event.getRegistry().register(itemPurpurSideSlab);

        itemObsidianSideSlab.setRegistryName(obsidianSideSlab.getRegistryName());
        itemObsidianSideSlab.setUnlocalizedName(itemObsidianSideSlab.getRegistryName().toString());
        event.getRegistry().register(itemObsidianSideSlab);

	}

	public static void inittextures(ModelRegistryEvent event)
	{
	}

}
