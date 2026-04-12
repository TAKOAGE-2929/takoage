package com.takoage.fluidpowergen.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class FluidPowerGeneratorBlock extends Block {

    public FluidPowerGeneratorBlock() {
        super(BlockBehaviour.Properties.of(Material.METAL));
    }

    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean isMoving) {
        // Custom logic for when the block is placed
    }

    @Override
    public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
        // Custom logic for when the block is removed
    }

    // Additional methods and logic for the block
}