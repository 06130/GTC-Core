package com.lingzero.gtc_core;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.LinkedHashMap;
import java.util.Map;

public class ItemRegistryHandler {
    private static final Map<String, Item> ITEMS = new LinkedHashMap<>();
    public static void registerBatchItems() {

        for (int i = 0; i < 10; i++) {
            String name = "prosthesis_" + i;
            Item item = new Item()
                    .setTranslationKey(name)
                    .setRegistryName(GTC_Core.MOD_ID, name);
            ITEMS.put(name, item);
            item.setCreativeTab(GTC_Core.creativeTab);
        }
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        registerBatchItems();
        ITEMS.values().forEach(event.getRegistry()::register);
    }
}
