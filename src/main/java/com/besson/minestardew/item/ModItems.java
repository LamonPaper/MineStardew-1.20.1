package com.besson.minestardew.item;

import com.besson.minestardew.MineStardew;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item lucky_purple_shorts = registerItems("lucky_purple_shorts", new Item(new Item.Settings().maxDamage(110)));
    public static final Item trimmed_lucky_purple_shorts = registerItems("trimmed_lucky_purple_shorts", new Item(new Item.Settings().maxDamage(138)));
    public static final Item minestardewicon = registerItems("minestardewicon", new Item(new Item.Settings()));
    public static final Item iridium_ingot = registerItems("iridium_ingot", new Item(new Item.Settings()));
    public static final Item raw_iridium_ore = registerItems("raw_iridium_ore", new Item(new Item.Settings()));

    public static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), new Identifier(MineStardew.MOD_ID, id)), item);
    }
    public static  void registerItems(){

    }
}

