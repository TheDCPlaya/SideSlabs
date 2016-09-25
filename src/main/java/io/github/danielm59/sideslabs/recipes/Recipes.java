package io.github.danielm59.sideslabs.recipes;

import io.github.danielm59.sideslabs.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes 
{
	public static void init()
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.acaciaSideSlab, 6), "A", "A", "A", 'A', new ItemStack(Blocks.PLANKS, 1, 4 )));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.birchSideSlab, 6), "A", "A", "A", 'A', new ItemStack(Blocks.PLANKS, 1, 2 )));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.brickSideSlab, 6), "A", "A", "A", 'A', Blocks.BRICK_BLOCK ));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.cobblestoneSideSlab, 6), "A", "A", "A", 'A', Blocks.COBBLESTONE ));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.darkoakSideSlab, 6), "A", "A", "A", 'A', new ItemStack(Blocks.PLANKS, 1, 5 )));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.jungleSideSlab, 6), "A", "A", "A", 'A', new ItemStack(Blocks.PLANKS, 1, 3 )));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherbrickSideSlab, 6), "A", "A", "A", 'A', Blocks.NETHER_BRICK ));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.oakSideSlab, 6), "A", "A", "A", 'A', new ItemStack(Blocks.PLANKS, 1, 0 )));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.purpurSideSlab, 6), "A", "A", "A", 'A', Blocks.PURPUR_BLOCK ));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quartzSideSlab, 6), "A", "A", "A", 'A', Blocks.QUARTZ_BLOCK ));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.redsandstoneSideSlab, 6), "A", "A", "A", 'A', Blocks.RED_SANDSTONE ));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.spruceSideSlab, 6), "A", "A", "A", 'A', new ItemStack(Blocks.PLANKS, 1, 1 )));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stonebrickSideSlab, 6), "A", "A", "A", 'A', Blocks.STONEBRICK ));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.sandstoneSideSlab, 6), "A", "A", "A", 'A', Blocks.SANDSTONE ));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stoneSideSlab, 6), "A", "A", "A", 'A', Blocks.STONE ));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.acaciaSideSlab, new ItemStack(Blocks.WOODEN_SLAB, 1, 4 )));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.birchSideSlab, new ItemStack(Blocks.WOODEN_SLAB, 1, 2 )));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.brickSideSlab, new ItemStack(Blocks.STONE_SLAB, 1, 4 )));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.cobblestoneSideSlab, new ItemStack(Blocks.STONE_SLAB, 1 , 3 )));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.darkoakSideSlab, new ItemStack(Blocks.WOODEN_SLAB, 1, 5 )));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.jungleSideSlab, new ItemStack(Blocks.WOODEN_SLAB, 1, 3 )));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.netherbrickSideSlab, new ItemStack(Blocks.STONE_SLAB, 1, 6 )));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.oakSideSlab, new ItemStack(Blocks.WOODEN_SLAB, 1, 0 )));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.purpurSideSlab, Blocks.PURPUR_SLAB ));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.quartzSideSlab,	new ItemStack(Blocks.STONE_SLAB, 1, 7 )));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.redsandstoneSideSlab, new ItemStack(Blocks.STONE_SLAB2, 1, 0 )));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.spruceSideSlab, new ItemStack(Blocks.WOODEN_SLAB, 1, 1 )));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.stonebrickSideSlab, new ItemStack(Blocks.STONE_SLAB, 1, 5 )));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.sandstoneSideSlab, new ItemStack(Blocks.STONE_SLAB, 1, 1 )));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.stoneSideSlab, new ItemStack(Blocks.STONE_SLAB, 1, 0 )));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.WOODEN_SLAB, 1, 4), ModBlocks.acaciaSideSlab ));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.WOODEN_SLAB, 1, 2), ModBlocks.birchSideSlab ));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.STONE_SLAB, 1, 4), ModBlocks.brickSideSlab ));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.STONE_SLAB, 1 , 3), ModBlocks.cobblestoneSideSlab ));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.WOODEN_SLAB, 1, 5), ModBlocks.darkoakSideSlab ));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.WOODEN_SLAB, 1, 3), ModBlocks.jungleSideSlab ));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.STONE_SLAB, 1, 6), ModBlocks.netherbrickSideSlab ));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.WOODEN_SLAB, 1, 0), ModBlocks.oakSideSlab ));
		GameRegistry.addRecipe(new ShapelessOreRecipe(Blocks.PURPUR_SLAB, ModBlocks.purpurSideSlab ));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.STONE_SLAB, 1, 7), ModBlocks.quartzSideSlab ));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.STONE_SLAB2, 1, 0), ModBlocks.redsandstoneSideSlab ));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.WOODEN_SLAB, 1, 1), ModBlocks.spruceSideSlab ));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.STONE_SLAB, 1, 5), ModBlocks.stonebrickSideSlab ));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.STONE_SLAB, 1, 1), ModBlocks.sandstoneSideSlab ));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.STONE_SLAB, 1, 0), ModBlocks.stoneSideSlab ));
	}
}
