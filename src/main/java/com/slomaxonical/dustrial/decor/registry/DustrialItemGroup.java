package com.slomaxonical.dustrial.decor.registry;

import com.slomaxonical.dustrial.decor.DustrialDecor;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class DustrialItemGroup {
    public static List<ItemStack> ITEMGROUP_LIST = new ArrayList<>();
    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(DustrialDecor.MOD_ID, "group"));
    public static void registerItemgroup() {
        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("itemGroup.dustrial_decor.group"))
                .icon(() -> new ItemStack(DustrialBlocks.LARGE_GLOW_LANTERN))
                .entries((displayContext, stackList) -> stackList.addAll(ITEMGROUP_LIST))
                .build());

    }
}
