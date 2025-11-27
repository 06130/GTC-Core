package com.lingzero.gtc_core.common.item;

import com.lingzero.gtc_core.GTC_Core;
import net.minecraft.item.Item;

public class item1 extends Item{
    public item1() {
        setCreativeTab(GTC_Core.creativeTab);
        setRegistryName("item1");
        maxStackSize = 64;
    }
}
