package io.github.danielm59.sideslabs.recipes;

import io.github.danielm59.sideslabs.SideSlabs;
import io.github.danielm59.sideslabs.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes 
{
	public static void init()
	{
		GameRegistry.addShapedRecipe(getRecipeName("acaciasideslab"), getRecipeName("acaciasideslab"), new ItemStack(ModBlocks.acaciaSideSlab, 6), "A", "A", "A", 'A', new ItemStack(Blocks.PLANKS, 1, 4 ));
		GameRegistry.addShapedRecipe(getRecipeName("birchsideslab"), getRecipeName("birchsideslab"), new ItemStack(ModBlocks.birchSideSlab, 6), "A", "A", "A", 'A', new ItemStack(Blocks.PLANKS, 1, 2 ));
		GameRegistry.addShapedRecipe(getRecipeName("bricksideslab"), getRecipeName("bricksideslab"), new ItemStack(ModBlocks.brickSideSlab, 6), "A", "A", "A", 'A', Blocks.BRICK_BLOCK );
		GameRegistry.addShapedRecipe(getRecipeName("cobblestonesideslab"), getRecipeName("cobblestonesideslab"), new ItemStack(ModBlocks.cobblestoneSideSlab, 6), "A", "A", "A", 'A', Blocks.COBBLESTONE );
		GameRegistry.addShapedRecipe(getRecipeName("darkoaksideslab"), getRecipeName("darkoaksideslab"), new ItemStack(ModBlocks.darkoakSideSlab, 6), "A", "A", "A", 'A', new ItemStack(Blocks.PLANKS, 1, 5 ));
		GameRegistry.addShapedRecipe(getRecipeName("junglesideslab"), getRecipeName("junglesideslab"), new ItemStack(ModBlocks.jungleSideSlab, 6), "A", "A", "A", 'A', new ItemStack(Blocks.PLANKS, 1, 3 ));
		GameRegistry.addShapedRecipe(getRecipeName("netherbricksideslab"), getRecipeName("netherbricksideslab"), new ItemStack(ModBlocks.netherbrickSideSlab, 6), "A", "A", "A", 'A', Blocks.NETHER_BRICK );
		GameRegistry.addShapedRecipe(getRecipeName("oaksideslab"), getRecipeName("oaksideslab"), new ItemStack(ModBlocks.oakSideSlab, 6), "A", "A", "A", 'A', new ItemStack(Blocks.PLANKS, 1, 0 ));
		GameRegistry.addShapedRecipe(getRecipeName("purpursideslab"), getRecipeName("purpursideslab"), new ItemStack(ModBlocks.purpurSideSlab, 6), "A", "A", "A", 'A', Blocks.PURPUR_BLOCK );
		GameRegistry.addShapedRecipe(getRecipeName("quartzsideslab"), getRecipeName("quartzsideslab"), new ItemStack(ModBlocks.quartzSideSlab, 6), "A", "A", "A", 'A', Blocks.QUARTZ_BLOCK );
		GameRegistry.addShapedRecipe(getRecipeName("redsandstonesideslab"), getRecipeName("redsandstonesideslab"), new ItemStack(ModBlocks.redsandstoneSideSlab, 6), "A", "A", "A", 'A', Blocks.RED_SANDSTONE );
		GameRegistry.addShapedRecipe(getRecipeName("sprucesideslab"), getRecipeName("sprucesideslab"), new ItemStack(ModBlocks.spruceSideSlab, 6), "A", "A", "A", 'A', new ItemStack(Blocks.PLANKS, 1, 1 ));
		GameRegistry.addShapedRecipe(getRecipeName("stonebricksideslab"), getRecipeName("stonebricksideslab"), new ItemStack(ModBlocks.stonebrickSideSlab, 6), "A", "A", "A", 'A', Blocks.STONEBRICK );
		GameRegistry.addShapedRecipe(getRecipeName("sandstonesideslab"), getRecipeName("sandstonesideslab"), new ItemStack(ModBlocks.sandstoneSideSlab, 6), "A", "A", "A", 'A', Blocks.SANDSTONE );
		GameRegistry.addShapedRecipe(getRecipeName("stonesideslab"), getRecipeName("stonesideslab"), new ItemStack(ModBlocks.stoneSideSlab, 6), "A", "A", "A", 'A', Blocks.STONE );
		
		GameRegistry.addShapelessRecipe(getRecipeName("acaciasideslab2"), getRecipeName("acaciasideslab2"), new ItemStack(ModBlocks.acaciaSideSlab), Ingredient.fromStacks(new ItemStack(Blocks.WOODEN_SLAB, 1, 4 )));
		GameRegistry.addShapelessRecipe(getRecipeName("birchsideslab2"), getRecipeName("birchsideslab2"), new ItemStack(ModBlocks.birchSideSlab), Ingredient.fromStacks(new ItemStack(Blocks.WOODEN_SLAB, 1, 2 )));
		GameRegistry.addShapelessRecipe(getRecipeName("bricksideslab2"), getRecipeName("bricksideslab2"), new ItemStack(ModBlocks.brickSideSlab), Ingredient.fromStacks(new ItemStack(Blocks.STONE_SLAB, 1, 4 )));
		GameRegistry.addShapelessRecipe(getRecipeName("cobblestonesideslab2"), getRecipeName("cobblestonesideslab2"), new ItemStack(ModBlocks.cobblestoneSideSlab), Ingredient.fromStacks(new ItemStack(Blocks.STONE_SLAB, 1 , 3 )));
		GameRegistry.addShapelessRecipe(getRecipeName("darkoaksideslab2"), getRecipeName("darkoaksideslab2"), new ItemStack(ModBlocks.darkoakSideSlab), Ingredient.fromStacks(new ItemStack(Blocks.WOODEN_SLAB, 1, 5 )));
		GameRegistry.addShapelessRecipe(getRecipeName("junglesideslab2"), getRecipeName("junglesideslab2"), new ItemStack(ModBlocks.jungleSideSlab), Ingredient.fromStacks(new ItemStack(Blocks.WOODEN_SLAB, 1, 3 )));
		GameRegistry.addShapelessRecipe(getRecipeName("netherbricksideslab2"), getRecipeName("netherbricksideslab2"), new ItemStack(ModBlocks.netherbrickSideSlab), Ingredient.fromStacks(new ItemStack(Blocks.STONE_SLAB, 1, 6 )));
		GameRegistry.addShapelessRecipe(getRecipeName("oaksideslab2"), getRecipeName("oaksideslab2"), new ItemStack(ModBlocks.oakSideSlab), Ingredient.fromStacks(new ItemStack(Blocks.WOODEN_SLAB, 1, 0 )));
		GameRegistry.addShapelessRecipe(getRecipeName("purpursideslab2"), getRecipeName("purpursideslab2"), new ItemStack(ModBlocks.purpurSideSlab), Ingredient.fromStacks(new ItemStack(Blocks.PURPUR_SLAB, 1, 0)));
		GameRegistry.addShapelessRecipe(getRecipeName("quartzsideslab2"), getRecipeName("quartzsideslab2"), new ItemStack(ModBlocks.quartzSideSlab),	Ingredient.fromStacks(new ItemStack(Blocks.STONE_SLAB, 1, 7 )));
		GameRegistry.addShapelessRecipe(getRecipeName("redsandstonesideslab2"), getRecipeName("redsandstonesideslab2"), new ItemStack(ModBlocks.redsandstoneSideSlab), Ingredient.fromStacks(new ItemStack(Blocks.STONE_SLAB2, 1, 0 )));
		GameRegistry.addShapelessRecipe(getRecipeName("sprucesideslab2"), getRecipeName("sprucesideslab2"), new ItemStack(ModBlocks.spruceSideSlab), Ingredient.fromStacks(new ItemStack(Blocks.WOODEN_SLAB, 1, 1 )));
		GameRegistry.addShapelessRecipe(getRecipeName("stonebricksideslab2"), getRecipeName("stonebricksideslab2"), new ItemStack(ModBlocks.stonebrickSideSlab), Ingredient.fromStacks(new ItemStack(Blocks.STONE_SLAB, 1, 5 )));
		GameRegistry.addShapelessRecipe(getRecipeName("sandstonesideslab2"), getRecipeName("sandstonesideslab2"), new ItemStack(ModBlocks.sandstoneSideSlab), Ingredient.fromStacks(new ItemStack(Blocks.STONE_SLAB, 1, 1 )));
		GameRegistry.addShapelessRecipe(getRecipeName("stonesideslab2"), getRecipeName("stonesideslab2"), new ItemStack(ModBlocks.stoneSideSlab), Ingredient.fromStacks(new ItemStack(Blocks.STONE_SLAB, 1, 0 )));

		GameRegistry.addShapelessRecipe(getRecipeName("acaciasideslabex"), getRecipeName("acaciasideslabex"), new ItemStack(Blocks.WOODEN_SLAB, 1, 4), Ingredient.fromStacks(new ItemStack(ModBlocks.acaciaSideSlab)));
		GameRegistry.addShapelessRecipe(getRecipeName("birchsideslabex"), getRecipeName("birchsideslabex"), new ItemStack(Blocks.WOODEN_SLAB, 1, 2), Ingredient.fromStacks(new ItemStack(ModBlocks.birchSideSlab)));
		GameRegistry.addShapelessRecipe(getRecipeName("bricksideslabex"), getRecipeName("bricksideslabex"), new ItemStack(Blocks.STONE_SLAB, 1, 4), Ingredient.fromStacks(new ItemStack(ModBlocks.brickSideSlab)));
		GameRegistry.addShapelessRecipe(getRecipeName("cobblestonesideslabex"), getRecipeName("cobblestonesideslabex"), new ItemStack(Blocks.STONE_SLAB, 1 , 3), Ingredient.fromStacks(new ItemStack(ModBlocks.cobblestoneSideSlab)));
		GameRegistry.addShapelessRecipe(getRecipeName("darkoaksideslabex"), getRecipeName("darkoaksideslabex"), new ItemStack(Blocks.WOODEN_SLAB, 1, 5), Ingredient.fromStacks(new ItemStack(ModBlocks.darkoakSideSlab)));
		GameRegistry.addShapelessRecipe(getRecipeName("junglesideslabex"), getRecipeName("junglesideslabex"), new ItemStack(Blocks.WOODEN_SLAB, 1, 3), Ingredient.fromStacks(new ItemStack(ModBlocks.jungleSideSlab)));
		GameRegistry.addShapelessRecipe(getRecipeName("netherbricksideslabex"), getRecipeName("netherbricksideslabex"), new ItemStack(Blocks.STONE_SLAB, 1, 6), Ingredient.fromStacks(new ItemStack(ModBlocks.netherbrickSideSlab)));
		GameRegistry.addShapelessRecipe(getRecipeName("oaksideslabex"), getRecipeName("oaksideslabex"), new ItemStack(Blocks.WOODEN_SLAB, 1, 0), Ingredient.fromStacks(new ItemStack(ModBlocks.oakSideSlab)));
		GameRegistry.addShapelessRecipe(getRecipeName("purpursideslabex"), getRecipeName("purpursideslabex"), new ItemStack(Blocks.PURPUR_SLAB, 1, 0), Ingredient.fromStacks(new ItemStack(ModBlocks.purpurSideSlab)));
		GameRegistry.addShapelessRecipe(getRecipeName("quartzsideslabex"), getRecipeName("quartzsideslabex"), new ItemStack(Blocks.STONE_SLAB, 1, 7), Ingredient.fromStacks(new ItemStack(ModBlocks.quartzSideSlab)));
		GameRegistry.addShapelessRecipe(getRecipeName("redsandstonesideslabex"), getRecipeName("redsandstonesideslabex"), new ItemStack(Blocks.STONE_SLAB2, 1, 0), Ingredient.fromStacks(new ItemStack(ModBlocks.redsandstoneSideSlab)));
		GameRegistry.addShapelessRecipe(getRecipeName("sprucesideslabex"), getRecipeName("sprucesideslabex"), new ItemStack(Blocks.WOODEN_SLAB, 1, 1), Ingredient.fromStacks(new ItemStack(ModBlocks.spruceSideSlab)));
		GameRegistry.addShapelessRecipe(getRecipeName("stonebricksideslabex"), getRecipeName("stonebricksideslabex"), new ItemStack(Blocks.STONE_SLAB, 1, 5), Ingredient.fromStacks(new ItemStack(ModBlocks.stonebrickSideSlab)));
		GameRegistry.addShapelessRecipe(getRecipeName("sandstonesideslabex"), getRecipeName("sandstonesideslabex"), new ItemStack(Blocks.STONE_SLAB, 1, 1), Ingredient.fromStacks(new ItemStack(ModBlocks.sandstoneSideSlab)));
		GameRegistry.addShapelessRecipe(getRecipeName("stonesideslabex"), getRecipeName("stonesideslabex"), new ItemStack(Blocks.STONE_SLAB, 1, 0), Ingredient.fromStacks(new ItemStack(ModBlocks.stoneSideSlab)));
	}

	private static ResourceLocation getRecipeName(String name)
    {
        return new ResourceLocation(SideSlabs.MODID, name);
    }
}
