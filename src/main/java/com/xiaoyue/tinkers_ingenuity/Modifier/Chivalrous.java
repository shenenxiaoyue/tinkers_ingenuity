package com.xiaoyue.tinkers_ingenuity.Modifier;

import net.minecraft.world.entity.LivingEntity;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class Chivalrous extends Modifier {

    @Override
    public float getEntityDamage(IToolStackView tool, int level, ToolAttackContext context, float baseDamage, float damage) {
        LivingEntity attacker = context.getPlayerAttacker();
        if (attacker != null) {
            return (float) (baseDamage + attacker.getHealth() * 0.5 + level);
        } else {
            return baseDamage;
        }
    }

}
