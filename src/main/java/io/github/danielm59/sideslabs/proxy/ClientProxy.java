package io.github.danielm59.sideslabs.proxy;

import io.github.danielm59.sideslabs.block.ModBlocks;
import io.github.danielm59.sideslabs.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{

	public void preInit(FMLPreInitializationEvent e)
	{
		super.preInit(e);
	}

	public void init(FMLInitializationEvent e)
	{
		super.init(e);
		ModBlocks.inittextures();
		ModItems.inittextures();
	}

	public void postInit(FMLPostInitializationEvent e)
	{
		super.postInit(e);
	}
	
}
