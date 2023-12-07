package com.toadmod;

import com.toadmod.entities.guineapig;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ToadMod implements ModInitializer {

    public static final EntityType<guineapig> GUINEA_PIG_TYPE = Registry.register(
        Registry.ENTITY_TYPE,
        new Identifier("toadmod", "guinea_pig"),
        EntityType.builder.create(guineapig::new, EntityCategory.AMBIENT)
            .size(0.5F, 0.5F)
            .build()
    )

    @Override
    public void onInitialize() {

    }

}