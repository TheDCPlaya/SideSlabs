package io.github.danielm59.sideslabs.creativetab;

import io.github.danielm59.sideslabs.SideSlabs;
import io.github.danielm59.sideslabs.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabSS 
{
	public static final CreativeTabs SIDESLABS_TAB = new CreativeTabs(SideSlabs.MODID)
	{
		@Override
		public ItemStack getTabIconItem()
		{
			return new ItemStack(ModItems.itemStoneSideSlab);
		}
	};
}