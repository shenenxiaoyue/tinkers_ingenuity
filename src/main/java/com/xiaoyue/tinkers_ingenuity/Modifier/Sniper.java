package com.xiaoyue.tinkers_ingenuity.Modifier;

import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolRebuildContext;
import slimeknights.tconstruct.library.tools.stat.FloatToolStat;
import slimeknights.tconstruct.library.tools.stat.ModifierStatsBuilder;
import slimeknights.tconstruct.library.tools.stat.ToolStats;

public class Sniper extends Modifier {

    @Override
    public void addToolStats(ToolRebuildContext context, int level, ModifierStatsBuilder builder) {
        FloatToolStat accuracy = ToolStats.ACCURACY;
        FloatToolStat attackDamage = ToolStats.ATTACK_DAMAGE;
        accuracy.add(builder, 0.2f * level);
        attackDamage.add(builder, 1.2f * level);
    }

}
