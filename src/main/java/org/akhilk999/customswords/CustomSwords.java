package org.akhilk999.customswords;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomSwords implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("customswords");
    public static final Item DARK_REPULSER = new Item(new Item.Settings().maxCount(1));
    public static final Item ELUCIDATOR = new Item(new Item.Settings().maxCount(1));
    public static final Item LAMBENT_LIGHT = new Item(new Item.Settings().maxCount(1));
    @Override
    public void onInitialize() {
        LOGGER.info("CustomSwords has started up.");
        Registry.register(Registries.ITEM, new Identifier("customswords", "dark-repulser"), DARK_REPULSER);
        Registry.register(Registries.ITEM, new Identifier("customswords", "elucidator"), ELUCIDATOR);
        Registry.register(Registries.ITEM, new Identifier("customswords", "lambent-light"), LAMBENT_LIGHT);
    }
}
