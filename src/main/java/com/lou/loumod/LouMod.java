package com.lou.loumod;

import com.lou.loumod.block.ModBlocks;
import com.lou.loumod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LouMod implements ModInitializer {
	public static final String MOD_ID = "loumod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}