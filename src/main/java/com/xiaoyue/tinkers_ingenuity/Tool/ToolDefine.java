package com.xiaoyue.tinkers_ingenuity.Tool;

import com.xiaoyue.tinkers_ingenuity.Register.Modifiers;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.ToolActions;
import slimeknights.tconstruct.library.data.tinkering.AbstractToolDefinitionDataProvider;
import slimeknights.tconstruct.library.tools.definition.aoe.BoxAOEIterator;
import slimeknights.tconstruct.library.tools.stat.ToolStats;
import slimeknights.tconstruct.tools.TinkerModifiers;
import slimeknights.tconstruct.tools.TinkerToolParts;

import static com.xiaoyue.tinkers_ingenuity.tinkers_ingenuity.MOD_ID;

public class ToolDefine extends AbstractToolDefinitionDataProvider {
    public ToolDefine(DataGenerator generator) {
        super(generator, MOD_ID);
    }

    @Override
    protected void addToolDefinitions() {

        define(ToolBuild.BATTLEAXE)
                //part
                .part(TinkerToolParts.broadAxeHead)
                .part(TinkerToolParts.broadAxeHead)
                .part(TinkerToolParts.toughHandle)
                .part(TinkerToolParts.toolBinding)
                ///stat
                .stat(ToolStats.ATTACK_DAMAGE, 2.5f)
                .stat(ToolStats.ATTACK_SPEED, 1.0f)
                .multiplier(ToolStats.MINING_SPEED, 0.7f)
                .multiplier(ToolStats.ATTACK_DAMAGE, 0.5f)
                .multiplier(ToolStats.ATTACK_SPEED, 1.6f)
                .multiplier(ToolStats.DURABILITY, 2.3f)
                //trait
                .trait(TinkerModifiers.knockback, 1)
                //other
                .action(ToolActions.SWORD_DIG);

        define(ToolBuild.BIGSICKLE)
                //part
                .part(TinkerToolParts.broadBlade)
                .part(TinkerToolParts.toughHandle)
                .part(TinkerToolParts.largePlate)
                .part(TinkerToolParts.toughHandle)
                ///stat
                .stat(ToolStats.ATTACK_DAMAGE, 2.85f)
                .stat(ToolStats.ATTACK_SPEED, 1.05f)
                .multiplier(ToolStats.MINING_SPEED, 0.8f)
                .multiplier(ToolStats.ATTACK_DAMAGE, 1.25f)
                .multiplier(ToolStats.ATTACK_SPEED, 0.85f)
                .multiplier(ToolStats.DURABILITY, 1.7f)
                //trait
                .trait(TinkerModifiers.harvest, 1)
                .trait(TinkerModifiers.padded, 1)
                //other
                .aoe(BoxAOEIterator.builder(2, 2, 1).addWidth(2).addHeight(2).addDepth(1).build())
                .action(ToolActions.SWORD_DIG);

        define(ToolBuild.BOWIEKNIFE)
                //part
                .part(TinkerToolParts.smallBlade)
                .part(TinkerToolParts.toolBinding)
                .part(TinkerToolParts.toolHandle)
                ///stat
                .stat(ToolStats.ATTACK_DAMAGE, 3.0f)
                .stat(ToolStats.ATTACK_SPEED, 1.15f)
                .multiplier(ToolStats.ATTACK_DAMAGE, 0.8f)
                .multiplier(ToolStats.ATTACK_SPEED, 1.75f)
                .multiplier(ToolStats.DURABILITY, 1.2f)
                //trait
                .trait(TinkerModifiers.parrying, 1)
                .trait(TinkerModifiers.lacerating, 1)
                //other
                .action(ToolActions.SWORD_DIG);

        define(ToolBuild.HAMMER)
                //part
                .part(TinkerToolParts.hammerHead)
                .part(TinkerToolParts.toughHandle)
                .part(TinkerToolParts.smallBlade)
                .part(TinkerToolParts.largePlate)
                ///stat
                .stat(ToolStats.ATTACK_DAMAGE, 4.5f)
                .stat(ToolStats.ATTACK_SPEED, 0.55f)
                .multiplier(ToolStats.MINING_SPEED, 0.4f)
                .multiplier(ToolStats.ATTACK_DAMAGE, 1.25f)
                .multiplier(ToolStats.ATTACK_SPEED, 1.6f)
                .multiplier(ToolStats.DURABILITY, 3.5f)
                //trait
                .trait(Modifiers.STRIKEFLY, 1)
                .trait(TinkerModifiers.offhanded, 1);

        define(ToolBuild.LOGRAZOR)
                //part
                .part(TinkerToolParts.smallBlade)
                .part(TinkerToolParts.toughHandle)
                .part(TinkerToolParts.toolHandle)
                ///stat
                .stat(ToolStats.ATTACK_DAMAGE, 3.5f)
                .stat(ToolStats.ATTACK_SPEED, 1.2f)
                .multiplier(ToolStats.MINING_SPEED, 0.5f)
                .multiplier(ToolStats.DURABILITY, 1.5f)
                //trait
                .trait(TinkerModifiers.expanded, 1)
                //other
                .action(ToolActions.SWORD_DIG);

    }

    @Override
    public String getName() {
        return "tinkers_ingenuity tool define";
    }
}
