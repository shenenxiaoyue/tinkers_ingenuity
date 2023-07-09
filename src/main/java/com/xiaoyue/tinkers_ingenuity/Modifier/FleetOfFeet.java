package com.xiaoyue.tinkers_ingenuity.Modifier;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class FleetOfFeet extends Modifier {

    public int afterEntityHit(IToolStackView tool, int level, ToolAttackContext context, float damageDealt) {
        boolean critical = context.isCritical();
        Player attacker = context.getPlayerAttacker();
        if (attacker != null && critical) {
            attacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, level * 2, true, true));
        }
        return level;
    }

}
