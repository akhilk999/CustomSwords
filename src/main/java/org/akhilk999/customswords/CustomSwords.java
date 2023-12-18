package org.akhilk999.customswords;

import net.fabricmc.api.ModInitializer;
import org.akhilk999.customswords.blocks.ModBlocks;
import org.akhilk999.customswords.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.item.Items.register;

public class CustomSwords implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("customswords");

    @Override
    public void onInitialize() {
        LOGGER.info("CustomSwords has started up.");
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
