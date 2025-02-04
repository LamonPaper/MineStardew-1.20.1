package com.besson.minestardew.item;

import com.besson.minestardew.MineStardew;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> MINESTARDEW_GROUP_MAIN = register("minestardew_group_main");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MineStardew.MOD_ID, id));
    }

    public static void registerGroups() {
        Registry.register(Registries.ITEM_GROUP,
                MINESTARDEW_GROUP_MAIN,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                        .displayName(Text.translatable("itemGroup.minestardew_group_main"))
                        .icon(() -> new ItemStack(ModItems.minestardewicon))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.trimmed_lucky_purple_shorts);
                            entries.add(ModItems.lucky_purple_shorts);
                        }).build());
    }
}
