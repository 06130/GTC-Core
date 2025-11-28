package com.lingzero.gtc_core.common.item.prosthesis;

// 导入必要的类
import com.lingzero.gtc_core.GTC_Core;

import flaxbeard.cyberware.common.CyberwareContent;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import flaxbeard.cyberware.api.item.ICyberware;

import java.util.Collections;
import java.util.List;

public class network_interface extends Item implements ICyberware {

    public network_interface() {
        setCreativeTab(GTC_Core.creativeTab);// 设置物品的创造菜单分组
        setRegistryName(GTC_Core.MOD_ID, "network_interface"); // 设置物品注册名
        setTranslationKey(GTC_Core.MOD_ID + ".network_interface"); // 设置物品未本地化名
    }

    // 获取物品安装的插槽类型
    @Override
    public EnumSlot getSlot(ItemStack itemStack) {
        return EnumSlot.CRANIUM;
    }

    // 获取物品安装后的堆叠大小
    @Override
    public int installedStackSize(ItemStack itemStack) {
        return 1;
    }

    // 获取物品安装所需的物品列表
    @Override
    public NonNullList<NonNullList<ItemStack>> required(ItemStack itemStack) {
        NonNullList<NonNullList<ItemStack>> required = NonNullList.create();
        NonNullList<ItemStack> list = NonNullList.create();
        list.add(new ItemStack(CyberwareContent.cybereyes));
        required.add(list);
        return required;
    }

    // 检查物品是否与其他物品不兼容
    @Override
    public boolean isIncompatible(ItemStack itemStack, ItemStack itemStack1) {
        return false;
    }

    // 检查物品是否为必需品
    @Override
    public boolean isEssential(ItemStack itemStack) {
        return false;
    }

    // 获取物品的详细信息列表
    @Override
    public List<String> getInfo(ItemStack itemStack) {
        return Collections.emptyList();

    }

    // 获取物品的能量容量
    @Override
    public int getCapacity(ItemStack itemStack) {
        return 0;
    }

    // 获取物品的质量等级
    @Override
    public Quality getQuality(ItemStack itemStack) {
        return null;
    }

    // 设置物品的质量等级
    @Override
    public ItemStack setQuality(ItemStack stack, ICyberware.Quality quality) {
        return stack;
    }

    // 检查物品是否可以持有指定的质量等级
    @Override
    public boolean canHoldQuality(ItemStack itemStack, Quality quality) {
        return false;
    }

    // 当物品被添加到实体时调用的方法
    @Override
    public void onAdded(EntityLivingBase entityLivingBase, ItemStack itemStack) {

    }

    // 当物品从实体移除时调用的方法
    @Override
    public void onRemoved(EntityLivingBase entityLivingBase, ItemStack itemStack) {

    }

    // 获取物品的能量消耗成本
    @Override
    public int getEssenceCost(ItemStack itemStack) {
        return 1;
    }
}
