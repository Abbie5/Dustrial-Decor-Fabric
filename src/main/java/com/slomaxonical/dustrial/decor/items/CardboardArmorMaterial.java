package com.slomaxonical.dustrial.decor.items;

import com.slomaxonical.dustrial.decor.registry.DustrialItems;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import com.slomaxonical.dustrial.decor.registry.DustrialBlocks;

import static net.fabricmc.api.EnvType.CLIENT;

public class CardboardArmorMaterial implements ArmorMaterial {

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
   
    @Override
    public int getDurability(ArmorItem.Type type) {
        return MAX_DAMAGE_ARRAY[type.ordinal()] * 10;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 5;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.BLOCK_BEEHIVE_ENTER;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(DustrialItems.CARDBOARD);
    }

    @Environment(CLIENT)
    @Override
    public String getName() {
            return "cardboard";
    }

    @Override
    public float getToughness() {
        return 1.0f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
