package com.xiaoyue.tinkers_ingenuity.Modifier;

import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolRebuildContext;
import slimeknights.tconstruct.library.tools.stat.FloatToolStat;
import slimeknights.tconstruct.library.tools.stat.ModifierStatsBuilder;
import slimeknights.tconstruct.library.tools.stat.ToolStats;

public class BowLight extends Modifier {

    @Override
    public void addToolStats(ToolRebuildContext context, int level, ModifierStatsBuilder builder) {
        FloatToolStat drawSpeed = ToolStats.DRAW_SPEED;
        FloatToolStat durability = ToolStats.DURABILITY;
        drawSpeed.add(builder, 0.2f * level);
        durability.add(builder, -200 * level);
    }

}
