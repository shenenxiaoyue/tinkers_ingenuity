package com.xiaoyue.tinkers_ingenuity.Tool;

import com.xiaoyue.tinkers_ingenuity.Register.BaseItems;
import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.tinkering.AbstractStationSlotLayoutProvider;
import slimeknights.tconstruct.tools.TinkerToolParts;

public class ToolLayout extends AbstractStationSlotLayoutProvider {
    public ToolLayout(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void addLayouts() {

        defineModifiable(BaseItems.BATTLEAXE)
                .sortIndex(2)
                .addInputItem(TinkerToolParts.broadAxeHead, 25, 20)
                .addInputItem(TinkerToolParts.broadAxeHead, 50, 48)
                .addInputItem(TinkerToolParts.toughHandle, 21, 52)
                .addInputItem(TinkerToolParts.toolBinding, 44, 29)
                .build();

        defineModifiable(BaseItems.BIGSICKLE)
                .sortIndex(2)
                .addInputItem(TinkerToolParts.broadBlade, 35, 20)
                .addInputItem(TinkerToolParts.toughHandle, 12, 55)
                .addInputItem(TinkerToolParts.largePlate, 50, 40)
                .addInputItem(TinkerToolParts.toughHandle, 30, 40)
                .build();

        defineModifiable(BaseItems.BOWIEKNIFE)
                .sortIndex(2)
                .addInputItem(TinkerToolParts.smallBlade, 48, 26)
                .addInputItem(TinkerToolParts.toolBinding, 30, 44)
                .addInputItem(TinkerToolParts.toolHandle, 12, 62)
                .build();

        defineModifiable(BaseItems.HAMMER)
                .sortIndex(2)
                .addInputItem(TinkerToolParts.hammerHead, 44, 29)
                .addInputItem(TinkerToolParts.toughHandle, 21, 52)
                .addInputItem(TinkerToolParts.smallBlade, 50, 48)
                .addInputItem(TinkerToolParts.largePlate, 25, 20)
                .build();

        defineModifiable(BaseItems.LOGRAZOR)
                .sortIndex(2)
                .addInputItem(TinkerToolParts.smallBlade, 48, 26)
                .addInputItem(TinkerToolParts.toughHandle, 12, 62)
                .addInputItem(TinkerToolParts.toolHandle, 30, 44)
                .build();

    }

    @Override
    public String getName() {
        return "tinkers_ingenuity tool layout";
    }
}
