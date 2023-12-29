package com.slomaxonical.dustrial.decor.data.tags;

import com.slomaxonical.dustrial.decor.DustrialDecor;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;


public final class DustrialTags {
    //todo: find where this is used maybe recipe then change name
    public static final TagKey<Item> CARDBOARD_BLOCKS = createItemTag("cardboard_blocks");
    public static final TagKey<Item> INDUSTRIAL_IRON_BLOCKS = createItemTag("industrial_iron_blocks");
    public static final TagKey<Item> PADDED_BLOCKS = createItemTag("padded_blocks");
    public static final TagKey<Item> NEON_BLOCKS = createItemTag("neon_blocks");
//C
    public static final TagKey<Item> CONCRETE_POWDER = TagKey.of(RegistryKeys.ITEM, new Identifier("c", "concrete_powder"));

    private static TagKey<Item> createItemTag(String id) {
        return TagKey.of(RegistryKeys.ITEM,new Identifier(DustrialDecor.MOD_ID, id));
    }
}
