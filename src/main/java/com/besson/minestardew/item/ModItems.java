package com.besson.minestardew.item;

import com.besson.minestardew.MineStardew;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item test = registerItems("test", new Item(new Item.Settings()));

    public static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), new Identifier(MineStardew.MOD_ID, id)), item);
    }
    public static  void registerItems(){

    }
}

