package com.xiaoyue.tinkers_ingenuity.Effect.Event;

import com.xiaoyue.tinkers_ingenuity.Register.Effects;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHealEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ELivingEvent {

    @SubscribeEvent
    public void LastStand(LivingHurtEvent event) {
        if (event.getEntity() instanceof Player player) {
            if (player.hasEffect(Effects.LAST_STAND.get())) {
                if (event.getAmount() > player.getHealth()) {
                    event.setCanceled(true);
                }
            }
        }
    }

    @SubscribeEvent
    public void MortalWound(LivingHealEvent event) {
        if (event.getEntity() instanceof Player player) {
            if (player.hasEffect(Effects.MORTALWOUND.get())) {
                event.setAmount(event.getAmount() * 0.25f);
            }
        }
    }

    @SubscribeEvent
    public void Nirvana(LivingDeathEvent event) {
        if (event.getEntity() instanceof Player player) {
            event.setCanceled(true);
            player.heal(10);
            player.removeAllEffects();
        }
    }

}
