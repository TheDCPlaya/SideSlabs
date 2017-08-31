package io.github.danielm59.sideslabs.proxy;

import io.github.danielm59.sideslabs.block.ModBlocks;
import io.github.danielm59.sideslabs.item.ModItems;
import io.github.danielm59.sideslabs.recipes.Recipes;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public abstract class CommonProxy
{

	public void preInit(FMLPreInitializationEvent e)
	{
        MinecraftForge.EVENT_BUS.register(this);
	}

    @SubscribeEvent
    public void onBlockRegistry(RegistryEvent.Register<Block> event) {
        ModBlocks.init(event);
    }

    @SubscribeEvent
    public void onItemRegistry(RegistryEvent.Register<Item> event)
    {
        ModItems.init(event);
    }

    @SubscribeEvent
    public void onRecipeRegistry(RegistryEvent.Register<IRecipe> event)
    {
        Recipes.init();
    }

	public void init(FMLInitializationEvent e)
	{

	}

	public void postInit(FMLPostInitializationEvent e)
	{

	}

}
