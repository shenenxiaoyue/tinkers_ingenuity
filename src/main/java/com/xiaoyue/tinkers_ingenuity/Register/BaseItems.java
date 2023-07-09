package com.xiaoyue.tinkers_ingenuity.Register;

import com.xiaoyue.tinkers_ingenuity.Tool.ToolBuild;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import slimeknights.tconstruct.library.tools.item.ModifiableItem;

import static com.xiaoyue.tinkers_ingenuity.tinkers_ingenuity.MOD_ID;

public class BaseItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,MOD_ID);

    private static final Item.Properties TOOL = new Item.Properties().stacksTo(1).tab(CreativeTabs.TOOLS);

    public static final RegistryObject<ModifiableItem> BATTLEAXE = ITEMS.register("battleaxe",
    () -> new ModifiableItem(TOOL, ToolBuild.BATTLEAXE));
    public static final RegistryObject<ModifiableItem> BIGSICKLE = ITEMS.register("bigsickle",
            () -> new ModifiableItem(TOOL, ToolBuild.BIGSICKLE));
    public static final RegistryObject<ModifiableItem> BOWIEKNIFE = ITEMS.register("bowieknife",
            () -> new ModifiableItem(TOOL, ToolBuild.BOWIEKNIFE));
    public static final RegistryObject<ModifiableItem> HAMMER = ITEMS.register("hammer",
            () -> new ModifiableItem(TOOL, ToolBuild.HAMMER));
    public static final RegistryObject<ModifiableItem> LOGRAZOR = ITEMS.register("lograzor",
            () -> new ModifiableItem(TOOL, ToolBuild.LOGRAZOR));

    public static final RegistryObject<Item> KNIGHT_CRYSTAL_INGOT = ITEMS.register("knight_crystal_ingot",
    () -> new Item(new Item.Properties().tab(CreativeTabs.MATERIALS)));

    public static final RegistryObject<Item> OCEAN_ALLOY_INGOT = ITEMS.register("ocean_alloy_ingot",
    () -> new Item(new Item.Properties().tab(CreativeTabs.MATERIALS)));

    public static final RegistryObject<Item> BLOOD_STEEL_INGOT = ITEMS.register("blood_steel_ingot",
    () -> new Item(new Item.Properties().tab(CreativeTabs.MATERIALS)));

    public static final RegistryObject<Item> SHINE_ALLOY_INGOT = ITEMS.register("shine_alloy_ingot",
    () -> new Item(new Item.Properties().tab(CreativeTabs.MATERIALS)));

    public static final RegistryObject<Item> PRINCE_SLIME_INGOT = ITEMS.register("prince_slime_ingot",
    () -> new Item(new Item.Properties().tab(CreativeTabs.MATERIALS)));

    public static final RegistryObject<Item> LEFIGARO_INGOT = ITEMS.register("lefigaro_ingot",
    () -> new Item(new Item.Properties().tab(CreativeTabs.MATERIALS)));

    public static final RegistryObject<Item> LABOLAS_INGOT = ITEMS.register("labolas_ingot",
    () -> new Item(new Item.Properties().tab(CreativeTabs.MATERIALS)));

    public static final RegistryObject<Item> CROCELL_INGOT = ITEMS.register("crocell_ingot",
    () -> new Item(new Item.Properties().tab(CreativeTabs.MATERIALS)));

    public static final RegistryObject<Item> GLASYA_INGOT = ITEMS.register("glasya_ingot",
    () -> new Item(new Item.Properties().tab(CreativeTabs.MATERIALS)));

    public static final RegistryObject<Item> AURORAL_ALLOY_INGOT = ITEMS.register("auroral_alloy_ingot",
    () -> new Item(new Item.Properties().tab(CreativeTabs.MATERIALS)));

    public static final RegistryObject<Item> ZESLEY_INGOT = ITEMS.register("zesley_ingot",
            () -> new Item(new Item.Properties().tab(CreativeTabs.MATERIALS)));

    public static final RegistryObject<Item> SUNLIT_INGOT = ITEMS.register("sunlit_ingot",
            () -> new Item(new Item.Properties().tab(CreativeTabs.MATERIALS)));

    public static final RegistryObject<Item> SIMIR_INGOT = ITEMS.register("simir_ingot",
            () -> new Item(new Item.Properties().tab(CreativeTabs.MATERIALS)));

    public static void ItemRegister(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
