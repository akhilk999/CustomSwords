package org.akhilk999.customswords.items;

import net.fabricmc.fabric.api.entity.event.v1.EntityElytraEvents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.akhilk999.customswords.CrystalliteToolMaterial;
import org.akhilk999.customswords.CustomSwords;

import static org.akhilk999.customswords.CrystalliteToolMaterial.CRYSTALLITE;

public class ModItems {
    //public static final Block CRYSTALLITE_ORE_BLOCK = register("diamond_ore", new ExperienceDroppingBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)));
    //public static final Item CRYSTALLITE_ORE = new BlockItem(CRYSTALLITE_ORE_BLOCK, new Item.Settings());
    public static final Item CRYSTALLITE_INGOT = registerItem("crystallite-ingot", new Item(new Item.Settings()));
    //////////
    //SWORDS//
    /////////
    public static final Item DARK_REPULSER = registerItem("dark-repulser", new SwordItem(CRYSTALLITE,4, -2.4f, new Item.Settings()));
    public static final Item ELUCIDATOR = registerItem("elucidator", new SwordItem(CRYSTALLITE,4, -2.4f, new Item.Settings()));
    public static final Item LAMBENT_LIGHT = registerItem("lambent-light", new SwordItem(CRYSTALLITE,4, -2.4f, new Item.Settings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier("customswords", name), item);
    }

    public static void addToGroup(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.addAfter(Items.NETHERITE_SWORD,DARK_REPULSER);
            entries.addAfter(DARK_REPULSER,ELUCIDATOR);
            entries.addAfter(ELUCIDATOR,LAMBENT_LIGHT);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.addAfter(Items.DIAMOND,CRYSTALLITE_INGOT);
        });
    }

    public static void registerModItems(){
        CustomSwords.LOGGER.info("Registering items for customswords");
        addToGroup();
    }


}
