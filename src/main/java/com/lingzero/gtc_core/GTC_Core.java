package com.lingzero.gtc_core;

import com.lingzero.gtc_core.common.item.prosthesis.network_interface;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = GTC_Core.MOD_ID, name = GTC_Core.MOD_NAME, version = GTC_Core.VERSION)
public class GTC_Core {
    public static final String MOD_ID = "gtc_core";
    public static final String MOD_NAME = "GTC Core";
    public static final String VERSION = "@MOD_VERSION@";

    public static final Logger LOGGER = LogManager.getLogger(GTC_Core.MOD_NAME);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("正在加载 {}!", GTC_Core.MOD_NAME);
    }
    @Instance(MOD_ID)
    public static GTC_Core INSTANCE;

    @EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void onInit(FMLInitializationEvent event) {

    }

    @EventHandler
    public void onPostInit(FMLPostInitializationEvent event) {

    }

    public static CreativeTabs creativeTab = new CreativeTabs(MOD_ID)
    {
        @Override
        public ItemStack createIcon() {
            Item item = GameRegistry.findRegistry(Item.class).getValue(new ResourceLocation("gtc_core:", "network_interface"));
                return new ItemStack(item);
        }
    };
    @Mod.EventBusSubscriber
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ItemRegistryHandler.registerItems(event);
            event.getRegistry().register(new network_interface());
        }
    }
}
