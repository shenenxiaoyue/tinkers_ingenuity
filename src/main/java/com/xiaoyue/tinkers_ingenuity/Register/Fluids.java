package com.xiaoyue.tinkers_ingenuity.Register;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import slimeknights.mantle.registration.deferred.FluidDeferredRegister;
import slimeknights.mantle.registration.object.FluidObject;

import static com.xiaoyue.tinkers_ingenuity.tinkers_ingenuity.MOD_ID;

public class Fluids{

    public static final FluidDeferredRegister FLUIDS = new FluidDeferredRegister(MOD_ID);

    private static FluidObject<ForgeFlowingFluid> register(String name, int temp) {
        String still = String.format("%s:block/fluid/%s/still", MOD_ID, name);
        String flow = String.format("%s:block/fluid/%s/flowing", MOD_ID, name);
        return FLUIDS.register(name, FluidAttributes.builder(new ResourceLocation(still), new ResourceLocation(flow))
                .density(2000).viscosity(10000).temperature(temp).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA),
                Material.LAVA, 15);
    }

    public static FluidObject<ForgeFlowingFluid> MOLTEN_KNIGHT_CRYSTAL = register("molten_knight_crystal", 800);
    public static FluidObject<ForgeFlowingFluid> MOLTEN_OCEAN_ALLOY = register("molten_ocean_alloy", 780);
    public static FluidObject<ForgeFlowingFluid> MOLTEN_BLOOD_STEEL = register("molten_blood_steel", 811);
    public static FluidObject<ForgeFlowingFluid> MOLTEN_SHINE_ALLOY = register("molten_shine_alloy", 1200);
    public static FluidObject<ForgeFlowingFluid> MOLTEN_PRINCE_SLIME = register("molten_prince_slime", 650);
    public static FluidObject<ForgeFlowingFluid> MOLTEN_LEFIGARO = register("molten_lefigaro", 800);
    public static FluidObject<ForgeFlowingFluid> MOLTEN_LABOLAS = register("molten_labolas", 800);
    public static FluidObject<ForgeFlowingFluid> MOLTEN_CROCELL = register("molten_crocell", 750);
    public static FluidObject<ForgeFlowingFluid> MOLTEN_GLASYA = register("molten_glasya", 850);
    public static FluidObject<ForgeFlowingFluid> MOLTEN_AURORAL_ALLOY = register("molten_auroral_alloy", 1020);
    public static FluidObject<ForgeFlowingFluid> MOLTEN_ZESLEY = register("molten_zesley", 820);
    public static FluidObject<ForgeFlowingFluid> MOLTEN_SUNLIT = register("molten_sunlit",  1200);
    public static FluidObject<ForgeFlowingFluid> MOLTEN_SIMIR = register("molten_simir", 850);

}
