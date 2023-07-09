package com.xiaoyue.tinkers_ingenuity.Register;

import com.xiaoyue.tinkers_ingenuity.Modifier.*;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.modifiers.util.ModifierDeferredRegister;
import slimeknights.tconstruct.library.modifiers.util.StaticModifier;

import static com.xiaoyue.tinkers_ingenuity.tinkers_ingenuity.MOD_ID;

public class Modifiers {

    public static ModifierDeferredRegister MODIFIERS = ModifierDeferredRegister.create(MOD_ID);

    public static StaticModifier<Modifier> CHIVALROUS = MODIFIERS.register("chivalrous", Chivalrous::new);
    public static StaticModifier<Modifier> BLOODY_MARY = MODIFIERS.register("bloody_mary", BloodyMary::new);
    public static StaticModifier<Modifier> POSEIDON = MODIFIERS.register("poseidon", Poseidon::new);
    public static StaticModifier<Modifier> RED_HEART = MODIFIERS.register("red_heart", RedHeart::new);
    public static StaticModifier<Modifier> SUNSHINE = MODIFIERS.register("sunshine", Sunshine::new);
    public static StaticModifier<Modifier> EXQUISITE = MODIFIERS.register("exquisite", Exquisite::new);
    public static StaticModifier<Modifier> STRIKEFLY = MODIFIERS.register("strike_fly", StrikeFly::new);
    public static StaticModifier<Modifier> BOWLIGHT = MODIFIERS.register("bow_light", BowLight::new);
    public static StaticModifier<Modifier> SNIPER = MODIFIERS.register("sniper", Sniper::new);
    public static StaticModifier<Modifier> RELENTLESS = MODIFIERS.register("relentless", Relentless::new);
    public static StaticModifier<Modifier> CRUDE = MODIFIERS.register("crude", Crude::new);
    public static StaticModifier<Modifier> SHARPBLADE = MODIFIERS.register("sharp_blade", SharpBlade::new);
    public static StaticModifier<Modifier> SUNDERING = MODIFIERS.register("sundering", Sunderimg::new);
    public static StaticModifier<Modifier> CULLING = MODIFIERS.register("culling", Culling::new);
    public static StaticModifier<Modifier> CRYSTALLINE = MODIFIERS.register("crystalline", Crystalline::new);
    public static StaticModifier<Modifier> REALISM = MODIFIERS.register("realism", Realism::new);
    public static StaticModifier<Modifier> TRAVELLER = MODIFIERS.register("traveller", Traveller::new);
    public static StaticModifier<Modifier> FLEETOFFEET = MODIFIERS.register("fleet_of_feet", FleetOfFeet::new);
    public static StaticModifier<Modifier> IMPACT = MODIFIERS.register("impact", Impact::new);
    public static StaticModifier<Modifier> MORTALWOUND = MODIFIERS.register("mortal_wound", MortalWound::new);
    public static StaticModifier<Modifier> NIRVANA = MODIFIERS.register("nirvana", Nirvana::new);
    public static StaticModifier<Modifier> AFTERSHOCK = MODIFIERS.register("aftershock", AfterShock::new);

}


