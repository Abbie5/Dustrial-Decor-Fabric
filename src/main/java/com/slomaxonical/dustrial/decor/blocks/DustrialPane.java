package com.slomaxonical.dustrial.decor.blocks;

import com.slomaxonical.dustrial.decor.DustrialDecor;
import net.minecraft.block.BlockState;
import net.minecraft.block.PaneBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DustrialPane extends PaneBlock {
    public static final RegistryKey<DamageType> BARBED = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, new Identifier(DustrialDecor.MOD_ID, "barb"));
    public boolean isBarbed;
    public DustrialPane(Settings builder) {
        super(builder);
        isBarbed = false;
    }
    public DustrialPane(Settings builder, boolean isBarbed) {
        super(builder);
        this.isBarbed = isBarbed;
    }

    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        if (worldIn.isClient) return;
        if (isBarbed && worldIn.getRandom().nextInt(10) < 1) {
            RegistryEntry.Reference<DamageType> damageType = worldIn.getRegistryManager().getWrapperOrThrow(RegistryKeys.DAMAGE_TYPE).getOrThrow(BARBED);
            DamageSource damageSource = new DamageSource(damageType);
            entityIn.damage(damageSource, 1);
        }
    }
}
