package com.slomaxonical.dustrial.decor.data.provider;

import com.slomaxonical.dustrial.decor.data.tags.DustrialTags;
import com.slomaxonical.dustrial.decor.registry.DustrialBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class DustrialItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public DustrialItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable FabricTagProvider.BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    private FabricTagBuilder getOrCreateTagBuilder(Identifier id) {
        TagKey<Item> tag = TagKey.of(RegistryKeys.ITEM, id);
        return this.getOrCreateTagBuilder(tag);
    }

    private void copy(Identifier id) {
        TagKey<Block> blockTag = TagKey.of(RegistryKeys.BLOCK, id);
        TagKey<Item> itemTag = TagKey.of(RegistryKeys.ITEM, id);
        this.copy(blockTag, itemTag);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        this.getOrCreateTagBuilder(ItemTags.DOORS)
                .add(DustrialBlocks.CARDBOARD_DOOR.asItem())
                .add(DustrialBlocks.CHAIN_DOOR.asItem())
                .add(DustrialBlocks.INDUSTRIAL_IRON_DOOR.asItem())
                .add(DustrialBlocks.IRON_BAR_DOOR.asItem())
                .add(DustrialBlocks.PADDED_DOOR.asItem())
                .add(DustrialBlocks.RUSTY_IRON_DOOR.asItem())
                .add(DustrialBlocks.SHEET_METAL_DOOR .asItem())
                .add(DustrialBlocks.RUSTY_SHEET_METAL_DOOR.asItem());

        this.getOrCreateTagBuilder(ItemTags.TRAPDOORS)
                .add(DustrialBlocks.CARDBOARD_TRAPDOOR.asItem())
                .add(DustrialBlocks.CHAIN_TRAPDOOR.asItem())
                .add(DustrialBlocks.INDUSTRIAL_IRON_TRAPDOOR.asItem())
                .add(DustrialBlocks.IRON_BAR_TRAPDOOR.asItem())
                .add(DustrialBlocks.PADDED_TRAPDOOR.asItem())
                .add(DustrialBlocks.RUSTY_IRON_TRAPDOOR.asItem())
                .add(DustrialBlocks.SHEET_METAL_TRAPDOOR .asItem())
                .add(DustrialBlocks.RUSTY_SHEET_METAL_TRAPDOOR.asItem());

        this.getOrCreateTagBuilder(DustrialTags.CARDBOARD_BLOCKS)
                .add(DustrialBlocks.SMOOTH_CARDBOARD.asItem())
                .add(DustrialBlocks.FOLDED_CARDBOARD.asItem())
                .add(DustrialBlocks.CARDBOARD_BOX.asItem());

        this.getOrCreateTagBuilder(DustrialTags.INDUSTRIAL_IRON_BLOCKS)
                .add(DustrialBlocks.INDUSTRIAL_IRON_BLOCK.asItem())
                .add(DustrialBlocks.INDUSTRIAL_IRON_PILLAR.asItem())
                .add(DustrialBlocks.BOLTED_INDUSTRIAL_IRON_BLOCK.asItem());

        this.getOrCreateTagBuilder(DustrialTags.PADDED_BLOCKS)
                .add(DustrialBlocks.PADDED_BLOCK.asItem())
                .add(DustrialBlocks.MINI_PADDED_BLOCK.asItem());

        this.getOrCreateTagBuilder(DustrialTags.NEON_BLOCKS)
                .add(DustrialBlocks.RED_NEON_LIGHT.asItem())
                .add(DustrialBlocks.ORANGE_NEON_LIGHT.asItem())
                .add(DustrialBlocks.YELLOW_NEON_LIGHT.asItem())
                .add(DustrialBlocks.GREEN_NEON_LIGHT.asItem())
                .add(DustrialBlocks.CYAN_NEON_LIGHT.asItem())
                .add(DustrialBlocks.BLUE_NEON_LIGHT.asItem())
                .add(DustrialBlocks.PURPLE_NEON_LIGHT.asItem())
                .add(DustrialBlocks.PINK_NEON_LIGHT.asItem());

        this.getOrCreateTagBuilder(DustrialTags.CONCRETE_POWDER)
                .add(Items.BLACK_CONCRETE_POWDER)
                .add(Items.GRAY_CONCRETE_POWDER)
                .add(Items.LIGHT_GRAY_CONCRETE_POWDER)
                .add(Items.WHITE_CONCRETE_POWDER)
                .add(Items.RED_CONCRETE_POWDER)
                .add(Items.ORANGE_CONCRETE_POWDER)
                .add(Items.YELLOW_CONCRETE_POWDER)
                .add(Items.LIME_CONCRETE_POWDER)
                .add(Items.GREEN_CONCRETE_POWDER)
                .add(Items.CYAN_CONCRETE_POWDER)
                .add(Items.BLUE_CONCRETE_POWDER)
                .add(Items.LIGHT_BLUE_CONCRETE_POWDER)
                .add(Items.PURPLE_CONCRETE_POWDER)
                .add(Items.MAGENTA_CONCRETE_POWDER)
                .add(Items.PINK_CONCRETE_POWDER)
                .add(Items.BROWN_CONCRETE_POWDER);


    }
}
