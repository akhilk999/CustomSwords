package org.akhilk999.customswords;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;
import org.akhilk999.customswords.CustomSwords;
import org.akhilk999.customswords.items.ModItems;

import java.util.function.Supplier;

public enum CrystalliteToolMaterial implements ToolMaterial {
    CRYSTALLITE(MiningLevels.DIAMOND, 2031, 8.0F, 4.0F, 10);

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;

    private CrystalliteToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
    }
    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.CRYSTALLITE_INGOT);
    }
}
