package io.github.danielm59.sideslabs.proxy;

import io.github.danielm59.sideslabs.block.ModBlocks;
import io.github.danielm59.sideslabs.item.ModItems;
import io.github.danielm59.sideslabs.recipes.Recipes;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public abstract class CommonProxy
{

	public void preInit(FMLPreInitializationEvent e)
	{
		ModBlocks.init();
		ModItems.init();
	}

	public void init(FMLInitializationEvent e)
	{

	}

	public void postInit(FMLPostInitializationEvent e)
	{
		Recipes.init();
	}

}
