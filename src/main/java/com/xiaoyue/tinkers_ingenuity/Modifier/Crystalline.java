package com.xiaoyue.tinkers_ingenuity.Modifier;

import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class Crystalline extends Modifier {

    @Override
    public float getEntityDamage(IToolStackView tool, int level, ToolAttackContext context, float baseDamage, float damage) {
        int durability = tool.getCurrentDurability();
        if (durability > 1000) {
            return (float) (baseDamage + (durability - 1000 * 0.01) * level);
        }
        return baseDamage;
    }

}
