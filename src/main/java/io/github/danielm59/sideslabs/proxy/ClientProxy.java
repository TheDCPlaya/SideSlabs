package io.github.danielm59.sideslabs.proxy;

import io.github.danielm59.sideslabs.block.ModBlocks;
import io.github.danielm59.sideslabs.item.ModItems;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy
{

	public void preInit(FMLPreInitializationEvent e)
	{
		super.preInit(e);
        MinecraftForge.EVENT_BUS.register(this);
	}

    @SubscribeEvent
    public void onModelRegistry(ModelRegistryEvent event)
    {
        ModBlocks.inittextures(event);
        ModItems.inittextures(event);
    }

	public void init(FMLInitializationEvent e)
	{
		super.init(e);
	}

	public void postInit(FMLPostInitializationEvent e)
	{
		super.postInit(e);
	}
	
}
