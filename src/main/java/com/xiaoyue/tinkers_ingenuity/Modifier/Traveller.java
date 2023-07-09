package com.xiaoyue.tinkers_ingenuity.Modifier;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class Traveller extends Modifier {

    @Override
    public float getEntityDamage(IToolStackView tool, int level, ToolAttackContext context, float baseDamage, float damage) {
        Player attacker = context.getPlayerAttacker();
        if (attacker != null && attacker.level != attacker.level.getServer().getLevel(Level.OVERWORLD)) {
            return baseDamage + (2 * level);
        }
        return baseDamage;
    }

}
