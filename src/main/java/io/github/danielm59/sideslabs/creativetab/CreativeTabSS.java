package io.github.danielm59.sideslabs.creativetab;

import io.github.danielm59.sideslabs.SideSlabs;
import io.github.danielm59.sideslabs.block.BlockSideSlab;
import io.github.danielm59.sideslabs.block.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabSS 
{
	public static final CreativeTabs SIDESLABS_TAB = new CreativeTabs(SideSlabs.MODID)
			{
		@Override
		public Item getTabIconItem()
		{
			return ModBlocks.itemStoneSideSlab;
		}
	};
}