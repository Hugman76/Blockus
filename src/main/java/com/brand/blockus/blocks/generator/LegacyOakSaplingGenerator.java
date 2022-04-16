package com.brand.blockus.blocks.generator;

import com.brand.blockus.world.BlockusConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

public class LegacyOakSaplingGenerator extends SaplingGenerator {


    protected ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
        return BlockusConfiguredFeatures.LEGACY_OAK_TREE;
    }
}