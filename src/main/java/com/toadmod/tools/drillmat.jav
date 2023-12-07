package com.toadmod.tools;

import net.minecraft.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class Drill implements ToolMaterial {
    @Override
    public int getDurability() {
        return 4500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 15.0F;
    }

    @Override
    public float getAttackDamage() {
        return 3.0F;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.GOLD_BLOCK)
    }
}