package com.slomaxonical.dustrial.decor.registry;

import com.slomaxonical.dustrial.decor.DustrialDecor;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class DustrialBlockSetTypes {
    public static final BlockSetType PADDED = new BlockSetTypeBuilder()
            .soundGroup(BlockSoundGroup.WOOL)
            .register(new Identifier(DustrialDecor.MOD_ID, "padded"));
    public static final BlockSetType CHAIN = new BlockSetTypeBuilder()
            .soundGroup(BlockSoundGroup.CHAIN)
            .register(new Identifier(DustrialDecor.MOD_ID, "chain"));
    public static final BlockSetType INDUSTRIAL = new BlockSetTypeBuilder()
            .soundGroup(BlockSoundGroup.NETHERITE)
            .register(new Identifier(DustrialDecor.MOD_ID, "industrial"));
    public static final BlockSetType SHEET_METAL = new BlockSetTypeBuilder()
            .soundGroup(BlockSoundGroup.METAL)
            .register(new Identifier(DustrialDecor.MOD_ID, "sheet_metal"));
    public static final BlockSetType RUSTY_SHEET_METAL = new BlockSetTypeBuilder()
            .soundGroup(BlockSoundGroup.METAL)
            .register(new Identifier(DustrialDecor.MOD_ID, "rusty_sheet_metal"));
    public static final BlockSetType CARDBOARD = new BlockSetTypeBuilder()
            .soundGroup(DustrialBlocks.CARDBOARD_SOUND)
            .register(new Identifier(DustrialDecor.MOD_ID, "cardboard"));
    public static final BlockSetType RUSTY_IRON = new BlockSetTypeBuilder()
            .register(new Identifier(DustrialDecor.MOD_ID, "rusty_iron"));
    public static final BlockSetType IRON_BAR = new BlockSetTypeBuilder()
            .register(new Identifier(DustrialDecor.MOD_ID, "iron_bar"));
}
