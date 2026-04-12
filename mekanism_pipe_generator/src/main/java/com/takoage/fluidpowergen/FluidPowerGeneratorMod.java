package com.takoage.fluidpowergen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = FluidPowerGeneratorMod.MODID, name = FluidPowerGeneratorMod.NAME, version = FluidPowerGeneratorMod.VERSION)
public class FluidPowerGeneratorMod {
    public static final String MODID = "mekanism_pipe_generator";
    public static final String NAME = "Mekanism Pipe Generator";
    public static final String VERSION = "1.0.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Pre-initialization code
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Initialization code
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // Post-initialization code
    }

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
        // Server starting code
    }
}