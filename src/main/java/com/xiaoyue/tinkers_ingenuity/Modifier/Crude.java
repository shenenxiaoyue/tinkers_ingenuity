package com.xiaoyue.tinkers_ingenuity.Modifier;

import net.minecraft.world.entity.LivingEntity;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class Crude extends Modifier {

    @Override
    public float getEntityDamage(IToolStackView tool, int level, ToolAttackContext context, float baseDamage, float damage) {
        LivingEntity target = context.getLivingTarget();
        if (target != null) {
            if (target.getArmorValue() < 1) {
                return baseDamage * level * 1.5f;
            }
        }
        return baseDamage;
    }

}
