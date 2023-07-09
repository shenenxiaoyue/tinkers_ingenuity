package com.xiaoyue.tinkers_ingenuity.Register;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabs {

    public static final CreativeModeTab MATERIALS = new CreativeModeTab("materials") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BaseItems.KNIGHT_CRYSTAL_INGOT.get());
        }
    };

    public static final CreativeModeTab TOOLS = new CreativeModeTab("tools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BaseItems.BATTLEAXE.get());
        }
    };

}
