package recipes;

import io.github.danielm59.sideslabs.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

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
	}
}
