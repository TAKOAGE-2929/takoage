package com.takoage.fluidpowergen.registration;

import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.takoage.fluidpowergen.screen.FluidPowerGeneratorMenu;

public class ModMenus {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, "fluidpowergen");
    public static final RegistryObject<MenuType<FluidPowerGeneratorMenu>> FLUID_POWER_GENERATOR_MENU = MENUS.register("fluid_power_generator_menu", () -> new MenuType<>(FluidPowerGeneratorMenu::new));
}