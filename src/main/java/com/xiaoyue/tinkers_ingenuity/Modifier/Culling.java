package com.xiaoyue.tinkers_ingenuity.Modifier;

import net.minecraft.world.entity.LivingEntity;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class Culling extends Modifier {

    @Override
    public float getEntityDamage(IToolStackView tool, int level, ToolAttackContext context, float baseDamage, float damage) {
        LivingEntity attacker = context.getPlayerAttacker();
        LivingEntity target = context.getLivingTarget();
        if (target != null && attacker != null && attacker.getMaxHealth() > target.getMaxHealth()) {
            return (float) (baseDamage + (attacker.getMaxHealth() - target.getMaxHealth()) * level);
        }
        return baseDamage;
    }

}
