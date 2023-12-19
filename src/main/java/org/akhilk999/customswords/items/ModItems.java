package org.akhilk999.customswords.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.akhilk999.customswords.CustomSwords;

import static org.akhilk999.customswords.CustomToolMaterial.CRYSTALLITE;

public class ModItems {
    public static final Item CRYSTALLITE_INGOT = registerItem("crystallite-ingot", new Item(new Item.Settings()));
    //////////
    //SWORDS//
    /////////
    public static final Item DARK_REPULSER = registerItem("dark-repulser", new SwordItem(CRYSTALLITE,4, -2.4f, new Item.Settings()));
    public static final Item ELUCIDATOR = registerItem("elucidator", new SwordItem(CRYSTALLITE,4, -2.4f, new Item.Settings()));
    public static final Item LAMBENT_LIGHT = registerItem("lambent-light", new SwordItem(CRYSTALLITE,4, -2.4f, new Item.Settings()));
    public static final Item DIVINE_RADIANCE = registerItem("divine-radiance", new SwordItem(CRYSTALLITE,4, -2.4f, new Item.Settings()));

    /* Registers given item with name
       @param name the name of the item
       @param item the actual item
       @return the item after being registered
     */
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier("customswords", name), item);
    }

    /* Adds all items to their respective ItemGroup
     */
    public static void addToGroup(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.addAfter(Items.NETHERITE_SWORD,DARK_REPULSER);
            entries.addAfter(DARK_REPULSER,ELUCIDATOR);
            entries.addAfter(ELUCIDATOR,LAMBENT_LIGHT);
            entries.addAfter(LAMBENT_LIGHT,DIVINE_RADIANCE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.addAfter(Items.DIAMOND,CRYSTALLITE_INGOT);
        });
    }
    /* Registers all items
     */
    public static void registerModItems(){
        CustomSwords.LOGGER.info("Registering items for customswords");
        addToGroup();
    }


}
