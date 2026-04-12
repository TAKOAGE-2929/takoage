package com.takoage.fluidpowergen.blockentity;

import mekanism.common.tile.base.TileEntityMekanism;
import mekanism.common.tier.FluidTank;
import mekanism.common.tier.EnergyStorage;
import mekanism.common.util.math.MathUtils;

public class FluidPowerGeneratorBlockEntity extends TileEntityMekanism {
    private static final int MAX_FLUID_STORAGE = 10000; // in mB
    private static final int MAX_ENERGY_STORAGE = 50000; // in FE
    private static final int MAX_OUTPUT = 5549; // in FE/t
    
    private FluidTank fluidTank;
    private EnergyStorage energyStorage;
    private float powerGenerated;

    public FluidPowerGeneratorBlockEntity() {
        super();
        this.fluidTank = new FluidTank(MAX_FLUID_STORAGE);
        this.energyStorage = new EnergyStorage(MAX_ENERGY_STORAGE);
        this.powerGenerated = 0;
    }

    public void updateGenerator() {
        // Logic to generate power
        if (fluidTank.getFluidAmount() > 256) { // 256 mB required per tick
            // Calculate power based on fluid consumption
            fluidTank.drain(256);
            powerGenerated = MathUtils.logarithmicFunction(fluidTank.getFluidAmount()); // Example of logarithmic power generation
            if (powerGenerated > MAX_OUTPUT) {
                powerGenerated = MAX_OUTPUT;
            }
            energyStorage.receiveEnergy((int)powerGenerated);
        }
    }

    public FluidTank getFluidTank() {
        return fluidTank;
    }

    public EnergyStorage getEnergyStorage() {
        return energyStorage;
    }
}