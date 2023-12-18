package org.akhilk999.customswords;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.akhilk999.customswords.blocks.ModBlocks;
import org.akhilk999.customswords.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.item.Items.register;
import static org.akhilk999.customswords.CrystalliteToolMaterial.CRYSTALLITE;

public class CustomSwords implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("customswords");

    @Override
    public void onInitialize() {
        LOGGER.info("CustomSwords has started up.");
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
