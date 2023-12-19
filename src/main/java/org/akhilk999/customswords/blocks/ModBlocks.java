package org.akhilk999.customswords.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import org.akhilk999.customswords.CustomSwords;

public class ModBlocks {
    public static final Block CRYSTALLITE_ORE = registerBlock("crystallite-ore", new ExperienceDroppingBlock(AbstractBlock.Settings.create().instrument(Instrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)), Items.ANCIENT_DEBRIS,ItemGroups.NATURAL);
    public static final Block CRYSTALLITE_BLOCK = registerBlock("crystallite-block", new Block(AbstractBlock.Settings.create().requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)), Items.NETHERITE_BLOCK, ItemGroups.BUILDING_BLOCKS);
    //public static final Block CRYSTALLITE_BLOCK = registerBlock("crystallite-block", new Block(FabricBlockSettings.create().strength(4f).requiresTool()), Items.NETHERITE_BLOCK, ItemGroups.BUILDING_BLOCKS);
    private static Block registerBlock(String name, Block block, Item prev, RegistryKey<ItemGroup> group){
        registerBlockItem(name, block, prev, group);
        return Registry.register(Registries.BLOCK, new Identifier("customswords", name), block);
    }

    private static void registerBlockItem(String name, Block block, Item prev, RegistryKey<ItemGroup> group){
        Item item = Registry.register(Registries.ITEM, new Identifier("customswords", name), new BlockItem(block, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> {entries.addAfter(prev,item);});
    }

    public static void registerModBlocks(){
        CustomSwords.LOGGER.info("Registering blocks for customswords");

    }

}
