package org.akhilk999.customswords.items;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class CustomSwordsSwordItem extends SwordItem {
    String[] repairIngredient;

    public CustomSwordsSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Item.Settings settings, String... repairIngredient){
        super(toolMaterial, attackDamage, attackSpeed, settings);
        this.repairIngredient = repairIngredient;
    }

}
