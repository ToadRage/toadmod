package com.toadmod.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.AmbientEntity;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.serverplayerentity;

public class GuineaPig extends AmbientEntity {

    public GuineaPig(EntityType<? extends GuineaPig> entityType, World world) {
        super(entityType, world);
    }

    @override
    public void tick() {
        super.tick();

        double range = 10.0;
        double speed = 0.3;

        player 
    }

}
