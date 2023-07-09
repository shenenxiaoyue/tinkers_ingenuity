package com.xiaoyue.tinkers_ingenuity.Modifier;

import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolRebuildContext;
import slimeknights.tconstruct.library.tools.stat.FloatToolStat;
import slimeknights.tconstruct.library.tools.stat.ModifierStatsBuilder;
import slimeknights.tconstruct.library.tools.stat.ToolStats;

public class Exquisite extends Modifier {

    @Override
    public void addToolStats(ToolRebuildContext context, int level, ModifierStatsBuilder builder) {
        FloatToolStat projectileDamage = ToolStats.PROJECTILE_DAMAGE;
        FloatToolStat attackDamage = ToolStats.ATTACK_DAMAGE;
        projectileDamage.add(builder, 1.2f * level);
        attackDamage.add(builder, 1.2f * level);
    }

}
