package com.xiaoyue.tinkers_ingenuity.Register;

import com.xiaoyue.tinkers_ingenuity.Effect.LastStand;
import com.xiaoyue.tinkers_ingenuity.Effect.MortalWound;
import com.xiaoyue.tinkers_ingenuity.Effect.Nirvana;
import com.xiaoyue.tinkers_ingenuity.tinkers_ingenuity;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.xiaoyue.tinkers_ingenuity.tinkers_ingenuity.MOD_ID;

public class Effects {

    public static final DeferredRegister<MobEffect> EFFECT = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MOD_ID);

    public static final RegistryObject<MobEffect> LAST_STAND = EFFECT.register("last_stand", LastStand::new);
    public static final RegistryObject<MobEffect> MORTALWOUND = EFFECT.register("mortal_wound", MortalWound::new);
    public static final RegistryObject<MobEffect> NIRVANA = EFFECT.register("nirvana", Nirvana::new);

}
