package com.lingzero.gtc_core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.LinkedHashMap;
import java.util.Map;

public class ItemRegistryHandler {
    // 使用有序Map存储批量物品
    private static final Map<String, Item> ITEMS = new LinkedHashMap<>();

    // 批量注册方法
    public static void registerBatchItems() {
        // 示例：批量创建10个测试物品
        for (int i = 0; i < 10; i++) {
            String name = "prosthesis" + i;
            Item item = new Item()
                    .setTranslationKey(name)
                    .setRegistryName(GTC_Core.MOD_ID, name);
            ITEMS.put(name, item);
            // 设置创造模式标签页
            item.setCreativeTab(GTC_Core.creativeTab);
        }
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        registerBatchItems(); // 初始化批量物品
        ITEMS.values().forEach(event.getRegistry()::register);
    }

    public static Item getItem(String name) {
        return ITEMS.get(name);
    }
}
