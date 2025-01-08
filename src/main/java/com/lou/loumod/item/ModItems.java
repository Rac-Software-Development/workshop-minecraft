package com.lou.loumod.item;

import com.lou.loumod.LouMod;
import com.lou.loumod.tool.ModTools;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item PINK_GARNET=registerItem("pink_garnet",new Item(new Item.Settings()));
    public static Item RAW_PINK_GARNET=registerItem("raw_pink_garnet",new Item(new Item.Settings()));


    public static final Item PINK_GARNET_SWORD = registerItem("pink_garnet_sword",
            new SwordItem(ModTools.INSTANCE, new Item.Settings()));

    public static final Item PINK_GARNET_PICKAXE = registerItem("pink_garnet_pickaxe",
            new SwordItem(ModTools.INSTANCE, new Item.Settings()));

    public static final Item PINK_GARNET_HOE = registerItem("pink_garnet_hoe",
            new SwordItem(ModTools.INSTANCE, new Item.Settings()));

    public static final Item PINK_GARNET_SHOVEL = registerItem("pink_garnet_shovel",
            new SwordItem(ModTools.INSTANCE, new Item.Settings()));

    public static final Item PINK_GARNET_AXE = registerItem("pink_garnet_axe",
            new SwordItem(ModTools.INSTANCE, new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LouMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LouMod.LOGGER.info("Registering Items for " + LouMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(PINK_GARNET_SWORD);
            entries.add(PINK_GARNET_AXE);
            entries.add(PINK_GARNET_PICKAXE);
            entries.add(PINK_GARNET_SHOVEL);
            entries.add(PINK_GARNET_HOE);
        });
    }
}
