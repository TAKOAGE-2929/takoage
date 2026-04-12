package com.takoage.fluidpowergen.registration;

import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import com.takoage.fluidpowergen.FluidPowerGen;

public class ModBlocks {
    public static final Block FLUID_POWER_GENERATOR = registerBlock("fluid_power_generator", new Block(AbstractBlock.Settings.of(net.minecraft.block.Material.STONE)));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(FluidPowerGen.MODID, name), block);
    }
}