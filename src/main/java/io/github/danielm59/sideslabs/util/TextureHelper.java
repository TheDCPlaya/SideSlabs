package io.github.danielm59.sideslabs.util;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class TextureHelper {
	public static void register(Item item) {

		String name = item.getUnlocalizedName();
		name = name.substring(name.indexOf(".") + 1);
        ModelLoader.setCustomModelResourceLocation(
                item, 0, new ModelResourceLocation(name, "inventory"));
	}

	public static void register(Block block) {

		Item item = Item.getItemFromBlock(block);
		register(item);
	}
}
