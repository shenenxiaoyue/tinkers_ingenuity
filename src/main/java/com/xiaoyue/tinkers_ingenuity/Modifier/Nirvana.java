package com.xiaoyue.tinkers_ingenuity.Modifier;

import com.xiaoyue.tinkers_ingenuity.Register.Effects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.EquipmentContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class Nirvana extends Modifier {

    @Override
    public void onAttacked(IToolStackView tool, int level, EquipmentContext context, EquipmentSlot slotType, DamageSource source, float amount, boolean isDirectDamage) {
        LivingEntity entity = context.getEntity();
        if (!tool.isBroken()) {
            if (amount >= entity.getHealth()) {
                entity.addEffect(new MobEffectInstance(Effects.NIRVANA.get()));
                tool.setDamage(tool.getCurrentDurability());
            }
        }
    }

}
