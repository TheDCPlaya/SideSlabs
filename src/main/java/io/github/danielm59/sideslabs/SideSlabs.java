package io.github.danielm59.sideslabs;

import org.apache.logging.log4j.Logger;

import io.github.danielm59.sideslabs.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SideSlabs.MODID, version = SideSlabs.VERSION)
public class SideSlabs
{
	public static final String MODID = "sideslabs";
	public static final String VERSION = "1.0";

	public static final String ClientProxy = "io.github.danielm59." + MODID + ".proxy.ClientProxy";
	public static final String ServerProxy = "io.github.danielm59." + MODID + ".proxy.ServerProxy";
	@SidedProxy(clientSide = ClientProxy, serverSide = ServerProxy)
	public static CommonProxy proxy;

	@Mod.Instance
	public static SideSlabs instance;

	public static Logger Logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Logger = event.getModLog();
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}
}
