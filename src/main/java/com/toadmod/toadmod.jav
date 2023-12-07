package com.toadmod;

import com.toadmod.items.drill;
import com.toadmod.tools.drillmat;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ToadMod implements ModInitializer {

    public static final drillmat DRILL_MAT = new drillmat();
    public static final Item DRILL = new drill(DRILL_MAT, 0, -2.8F, new Item.settings().group(ItemGroup.TOOLS));

    @Override
    public void onInitialize() {

        Registry.register(Registry.ITEM, new Identifier("toadmod", "drill"), DRILL);
        
    }

}