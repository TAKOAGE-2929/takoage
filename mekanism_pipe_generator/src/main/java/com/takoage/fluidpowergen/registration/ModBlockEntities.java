package com.takoage.fluidpowergen.registration;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, "fluidpowergen");

    // Example block entity registration
    public static final RegistryObject<BlockEntityType<YourBlockEntity>> YOUR_BLOCK_ENTITY = BLOCK_ENTITIES.register("your_block_entity", () -> BlockEntityType.Builder.of(YourBlockEntity::new, ModBlocks.YOUR_BLOCK).build(null));
}