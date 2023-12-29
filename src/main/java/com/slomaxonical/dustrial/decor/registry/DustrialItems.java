package com.slomaxonical.dustrial.decor.registry;

import com.slomaxonical.dustrial.decor.DustrialDecor;
import com.slomaxonical.dustrial.decor.items.CardboardArmor;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.slomaxonical.dustrial.decor.registry.DustrialBlocks.CARDBOARD_ARMOR_MATERIAL;

public class DustrialItems {
    public static final Item INDUSTRIAL_IRON_BILLET = createItem("industrial_iron_billet", new Item(new Item.Settings()));
    public static final Item CAST_IRON_BILLET = createItem("cast_iron_billet", new Item(new Item.Settings()));
    public static final Item SHEET_METAL = createItem("sheet_metal", new Item(new Item.Settings()));
    public static final Item RUSTY_SHEET_METAL = createItem("rusty_sheet_metal", new Item(new Item.Settings()));
    public static final Item CARDBOARD = createItem("cardboard", new Item(new Item.Settings()));

    public static final Item CARDBOARD_HELMET = createItem("cardboard_helmet", new CardboardArmor(CARDBOARD_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item CARDBOARD_CHESTPLATE = createItem("cardboard_chestplate", new CardboardArmor(CARDBOARD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item CARDBOARD_LEGGINGS = createItem("cardboard_leggings", new CardboardArmor(CARDBOARD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item CARDBOARD_BOOTS = createItem("cardboard_boots", new CardboardArmor(CARDBOARD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static final Item RUSTY_IRON_INGOT = createItem("rusty_iron_ingot", new Item(new Item.Settings()));
    public static final Item RUSTY_IRON_NUGGET = createItem("rusty_iron_nugget", new Item(new Item.Settings()));
    public static <I extends Item> I createItem(String name, I item) {
        I registeredItem = Registry.register(Registries.ITEM, new Identifier(DustrialDecor.MOD_ID, name), item);
        DustrialItemGroup.ITEMGROUP_LIST.add(new ItemStack(item));
        return registeredItem;
    }
    public static void registerItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(INDUSTRIAL_IRON_BILLET);
            entries.add(CAST_IRON_BILLET);
            entries.add(SHEET_METAL);
            entries.add(RUSTY_SHEET_METAL);
            entries.add(CARDBOARD);
            entries.add(RUSTY_IRON_INGOT);
            entries.add(RUSTY_IRON_NUGGET);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(CARDBOARD_HELMET);
            entries.add(CARDBOARD_CHESTPLATE);
            entries.add(CARDBOARD_LEGGINGS);
            entries.add(CARDBOARD_BOOTS);
        });
    }
}
    