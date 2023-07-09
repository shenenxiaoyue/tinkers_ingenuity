package com.xiaoyue.tinkers_ingenuity.Modifier;

import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class Impact extends Modifier {

    @Override
    public float getEntityDamage(IToolStackView tool, int level, ToolAttackContext context, float baseDamage, float damage) {
        float speed = context.getPlayerAttacker().getSpeed();
        return baseDamage + (speed * level);
    }

}
