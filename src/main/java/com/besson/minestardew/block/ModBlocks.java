package com.besson.minestardew.block;

import com.besson.minestardew.MineStardew;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //方块注册
    public static final Block IRIDIUM_BLOCK = register("iridium_block",new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block RAW_IRIDIUM_BLOCK = register("raw_iridium_block",new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f,3.0f)));
    public static final Block IRIDIUM_ORE = register("iridium_ore",new Block(AbstractBlock.Settings.create().requiresTool().strength(7.0f,7.0f).sounds(BlockSoundGroup.DEEPSLATE)));

    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(MineStardew.MOD_ID, id), block);
    }

    public static void registerBlockItems(String id, Block block){
        Registry.register(Registries.ITEM, new Identifier(MineStardew.MOD_ID, id),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {//初始化

    }
}
