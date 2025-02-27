package com.brand.blockus.data.provider;

import com.brand.blockus.blocks.base.LargeFlowerPotBlock;
import com.brand.blockus.content.BlockusBlocks;
import com.brand.blockus.content.types.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class BlockusBlockLootTableProvider extends FabricBlockLootTableProvider {
    public BlockusBlockLootTableProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateBlockLootTables() {

        for (BSSWTypes bsswType : BSSWTypes.values()) {
            this.addDrop(bsswType.block);
            this.addDrop(bsswType.stairs);
            this.addDrop(bsswType.slab, BlockLootTableGenerator::slabDrops);
            this.addDrop(bsswType.wall);
        }

        for (BSSTypes bssType : BSSTypes.values()) {
            this.addDrop(bssType.block);
            this.addDrop(bssType.stairs);
            this.addDrop(bssType.slab, BlockLootTableGenerator::slabDrops);
        }

        for (ConcreteTypes concreteType : ConcreteTypes.values()) {
            this.addDrop(concreteType.block);
            this.addDrop(concreteType.stairs);
            this.addDrop(concreteType.slab, BlockLootTableGenerator::slabDrops);
            this.addDrop(concreteType.wall);
            this.addDrop(concreteType.chiseled);
            this.addDrop(concreteType.pillar);
        }

        for (WoodTypesB woodType : WoodTypesB.values()) {
            this.addDrop(woodType.planks);
            this.addDrop(woodType.stairs);
            this.addDrop(woodType.slab, BlockLootTableGenerator::slabDrops);
            this.addDrop(woodType.fence);
            this.addDrop(woodType.fence_gate);
            this.addDrop(woodType.door, BlockLootTableGenerator::addDoorDrop);
            this.addDrop(woodType.trapdoor);
            this.addDrop(woodType.pressure_plate);
            this.addDrop(woodType.button);
            this.addDrop(woodType.standing_sign);
        }

        for (WoodTypesNB woodType : WoodTypesNB.values()) {
            this.addDrop(woodType.planks);
            this.addDrop(woodType.stairs);
            this.addDrop(woodType.slab, BlockLootTableGenerator::slabDrops);
            this.addDrop(woodType.fence);
            this.addDrop(woodType.fence_gate);
            this.addDrop(woodType.door, BlockLootTableGenerator::addDoorDrop);
            this.addDrop(woodType.trapdoor);
            this.addDrop(woodType.pressure_plate);
            this.addDrop(woodType.button);
            this.addDrop(woodType.standing_sign);
        }

        for (TimberFrameTypesB timberFrameType : TimberFrameTypesB.values()) {
            this.addDrop(timberFrameType.block);
            this.addDrop(timberFrameType.diagonal);
            this.addDrop(timberFrameType.cross);
        }

        for (TimberFrameTypesNB timberFrameType: TimberFrameTypesNB.values()) {
            this.addDrop(timberFrameType.block);
            this.addDrop(timberFrameType.diagonal);
            this.addDrop(timberFrameType.cross);
        }

        for (AsphaltTypes asphaltType : AsphaltTypes.values()) {
            this.addDrop(asphaltType.block);
            this.addDrop(asphaltType.stairs);
            this.addDrop(asphaltType.slab, BlockLootTableGenerator::slabDrops);
        }

        for (PottedLargeTypes pottedLargeType : PottedLargeTypes.values()) {
            this.addPottedLargePlantDrop(pottedLargeType.block);
        }

        // Viridite
        this.addDrop(BlockusBlocks.CHISELED_VIRIDITE);
        this.addDrop(BlockusBlocks.CHISELED_VIRIDITE_PILLAR);
        this.addDrop(BlockusBlocks.VIRIDITE_BUTTON);
        this.addDrop(BlockusBlocks.VIRIDITE_CIRCULAR_PAVING);
        this.addDrop(BlockusBlocks.VIRIDITE_PILLAR);
        this.addDrop(BlockusBlocks.VIRIDITE_PRESSURE_PLATE);
        this.addDrop(BlockusBlocks.VIRIDITE_SQUARES);
        this.addDrop(BlockusBlocks.VIRIDITE_LINES);

        // Amethyst
        this.addDrop(BlockusBlocks.POLISHED_AMETHYST);
        this.addDrop(BlockusBlocks.POLISHED_AMETHYST_STAIRS);
        this.addDrop(BlockusBlocks.POLISHED_AMETHYST_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(BlockusBlocks.AMETHYST_BRICKS);
        this.addDrop(BlockusBlocks.AMETHYST_BRICK_STAIRS);
        this.addDrop(BlockusBlocks.AMETHYST_BRICK_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(BlockusBlocks.AMETHYST_BRICK_WALL);
        this.addDrop(BlockusBlocks.CHISELED_AMETHYST);
        this.addDrop(BlockusBlocks.AMETHYST_PILLAR);

        // Herringbone Planks
        this.addDrop(BlockusBlocks.HERRINGBONE_OAK_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_BIRCH_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_SPRUCE_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_JUNGLE_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_ACACIA_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_DARK_OAK_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_MANGROVE_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_WHITE_OAK_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_BAMBOO_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_CRIMSON_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_WARPED_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_CHARRED_PLANKS);

        // Other
        this.addDrop(BlockusBlocks.LEGACY_LOG);
        this.addDrop(BlockusBlocks.LEGACY_SAPLING);
        this.addDrop(BlockusBlocks.ACACIA_SMALL_LOGS);
        this.addDrop(BlockusBlocks.ANDESITE_CIRCULAR_PAVING);
        this.addDrop(BlockusBlocks.APPLE_CRATE);
        this.addDrop(BlockusBlocks.BEETROOT_CRATE);
        this.addDrop(BlockusBlocks.BIRCH_SMALL_LOGS);
        this.addDrop(BlockusBlocks.BLACK_BLUE_COLORED_TILES);
        this.addDrop(BlockusBlocks.BLACK_COLORED_TILES);
        this.addDrop(BlockusBlocks.BLACK_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.BLACK_GLAZED_TERRACOTTA_PILLAR);
        this.addDrop(BlockusBlocks.BLACK_GRAY_COLORED_TILES);
        this.addDrop(BlockusBlocks.BLACK_NEON);
        this.addDrop(BlockusBlocks.BLACK_PATTERNED_WOOL);
        this.addDrop(BlockusBlocks.BLACK_RED_COLORED_TILES);
        this.addDrop(BlockusBlocks.BLACK_WHITE_COLORED_TILES);
        this.addDrop(BlockusBlocks.BLACKSTONE_TRAPDOOR);
        this.addDrop(BlockusBlocks.BLAZE_PILLAR);
        this.addDrop(BlockusBlocks.BLUE_COLORED_TILES);
        this.addDrop(BlockusBlocks.BLUE_CYAN_COLORED_TILES);
        this.addDrop(BlockusBlocks.BLUE_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.BLUE_GLAZED_TERRACOTTA_PILLAR);
        this.addDrop(BlockusBlocks.BLUE_NEON);
        this.addDrop(BlockusBlocks.BLUE_PATTERNED_WOOL);
        this.addDrop(BlockusBlocks.BLUE_REDSTONE_LAMP);
        this.addDrop(BlockusBlocks.BLUE_REDSTONE_LAMP_LIT);
        this.addDrop(BlockusBlocks.BLUE_WHITE_COLORED_TILES);
        this.addDrop(BlockusBlocks.BLUESTONE_BUTTON);
        this.addDrop(BlockusBlocks.BLUESTONE_CIRCULAR_PAVING);
        this.addDrop(BlockusBlocks.BLUESTONE_LINES);
        this.addDrop(BlockusBlocks.BLUESTONE_PILLAR);
        this.addDrop(BlockusBlocks.BLUESTONE_PRESSURE_PLATE);
        this.addDrop(BlockusBlocks.BLUESTONE_SQUARES);
        this.addDrop(BlockusBlocks.BREAD_BOX);
        this.addDrop(BlockusBlocks.BROWN_COLORED_TILES);
        this.addDrop(BlockusBlocks.BROWN_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.BROWN_GLAZED_TERRACOTTA_PILLAR);
        this.addDrop(BlockusBlocks.BROWN_NEON);
        this.addDrop(BlockusBlocks.BROWN_PATTERNED_WOOL);
        this.addDrop(BlockusBlocks.BROWN_REDSTONE_LAMP);
        this.addDrop(BlockusBlocks.BROWN_REDSTONE_LAMP_LIT);
        this.addDrop(BlockusBlocks.BROWN_WHITE_COLORED_TILES);
        this.addDrop(BlockusBlocks.CARROT_CRATE);
        this.addDrop(BlockusBlocks.CAUTION_BARRIER);
        this.addDrop(BlockusBlocks.CAUTION_BLOCK);
        this.addDrop(BlockusBlocks.CHARCOAL_BLOCK);
        this.addDrop(BlockusBlocks.CHARRED_NETHER_BRICK_PILLAR);
        this.addDrop(BlockusBlocks.CHISELED_ANDESITE_BRICKS);
        this.addDrop(BlockusBlocks.CHISELED_BLUESTONE);
        this.addDrop(BlockusBlocks.CHISELED_DARK_PRISMARINE);
        this.addDrop(BlockusBlocks.CHISELED_DIORITE_BRICKS);
        this.addDrop(BlockusBlocks.CHISELED_DRIPSTONE);
        this.addDrop(BlockusBlocks.CHISELED_END_STONE_BRICKS);
        this.addDrop(BlockusBlocks.CHISELED_GRANITE_BRICKS);
        this.addDrop(BlockusBlocks.CHISELED_LAVA_BRICKS);
        this.addDrop(BlockusBlocks.CHISELED_LAVA_POLISHED_BLACKSTONE);
        this.addDrop(BlockusBlocks.CHISELED_LIMESTONE);
        this.addDrop(BlockusBlocks.CHISELED_MAGMA_BRICKS);
        this.addDrop(BlockusBlocks.CHISELED_MARBLE);
        this.addDrop(BlockusBlocks.CHISELED_MARBLE_PILLAR);
        this.addDrop(BlockusBlocks.CHISELED_LIMESTONE_PILLAR);
        this.addDrop(BlockusBlocks.CHISELED_BLUESTONE_PILLAR);
        this.addDrop(BlockusBlocks.CHISELED_PHANTOM_PURPUR);
        this.addDrop(BlockusBlocks.CHISELED_POLISHED_BASALT);
        this.addDrop(BlockusBlocks.CHISELED_PRISMARINE);
        this.addDrop(BlockusBlocks.CHISELED_PURPUR);
        this.addDrop(BlockusBlocks.CHISELED_SOUL_SANDSTONE);
        this.addDrop(BlockusBlocks.CHISELED_TUFF);
        this.addDrop(BlockusBlocks.CHISELED_WATER_BRICKS);
        this.addDrop(BlockusBlocks.CHORUS_BLOCK);
        this.addDrop(BlockusBlocks.COD_CRATE);
        this.addDrop(BlockusBlocks.COMPANION_CUBE);
        this.addDrop(BlockusBlocks.CRACKED_ANDESITE_BRICKS);
        this.addDrop(BlockusBlocks.CRACKED_DIORITE_BRICKS);
        this.addDrop(BlockusBlocks.CRACKED_DRIPSTONE_BRICKS);
        this.addDrop(BlockusBlocks.CRACKED_END_STONE_BRICKS);
        this.addDrop(BlockusBlocks.CRACKED_GRANITE_BRICKS);
        this.addDrop(BlockusBlocks.CRACKED_OBSIDIAN_BRICKS);
        this.addDrop(BlockusBlocks.CRACKED_POLISHED_BASALT_BRICKS);
        this.addDrop(BlockusBlocks.CRACKED_TUFF_BRICKS);
        this.addDrop(BlockusBlocks.CRIMSON_SMALL_HEDGE);
        this.addDrop(BlockusBlocks.CRIMSON_SMALL_STEMS);
        this.addDrop(BlockusBlocks.CUT_SOUL_SANDSTONE);
        this.addDrop(BlockusBlocks.CYAN_COLORED_TILES);
        this.addDrop(BlockusBlocks.CYAN_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.CYAN_GLAZED_TERRACOTTA_PILLAR);
        this.addDrop(BlockusBlocks.CYAN_NEON);
        this.addDrop(BlockusBlocks.CYAN_PATTERNED_WOOL);
        this.addDrop(BlockusBlocks.CYAN_REDSTONE_LAMP);
        this.addDrop(BlockusBlocks.CYAN_REDSTONE_LAMP_LIT);
        this.addDrop(BlockusBlocks.CYAN_WHITE_COLORED_TILES);
        this.addDrop(BlockusBlocks.DARK_OAK_SMALL_LOGS);
        this.addDrop(BlockusBlocks.DARK_PRISMARINE_PILLAR);
        this.addDrop(BlockusBlocks.DEEPSLATE_CIRCULAR_PAVING);
        this.addDrop(BlockusBlocks.DEEPSLATE_PILLAR);
        this.addDrop(BlockusBlocks.DIORITE_CIRCULAR_PAVING);
        this.addDrop(BlockusBlocks.DRIPSTONE_PILLAR);
        this.addDrop(BlockusBlocks.END_STONE_PILLAR);
        this.addDrop(BlockusBlocks.ENDER_BLOCK);
        this.addDrop(BlockusBlocks.FRAMED_PAPER_BLOCK);
        this.addDrop(BlockusBlocks.GLOW_BERRIES_CRATE);
        this.addDrop(BlockusBlocks.GLOWING_OBSIDIAN);
        this.addDrop(BlockusBlocks.GOLD_DECORATED_POLISHED_BLACKSTONE);
        this.addDrop(BlockusBlocks.GOLD_DECORATED_RED_SANDSTONE);
        this.addDrop(BlockusBlocks.GOLD_DECORATED_SANDSTONE);
        this.addDrop(BlockusBlocks.GOLD_DECORATED_SOUL_SANDSTONE);
        this.addDrop(BlockusBlocks.GOLDEN_APPLE_CRATE);
        this.addDrop(BlockusBlocks.GOLDEN_BARS);
        this.addDrop(BlockusBlocks.GOLDEN_CARROT_CRATE);
        this.addDrop(BlockusBlocks.GOLDEN_CHAIN);
        this.addDrop(BlockusBlocks.GRANITE_CIRCULAR_PAVING);
        this.addDrop(BlockusBlocks.GRAY_BRIGHT_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.GRAY_COLORED_TILES);
        this.addDrop(BlockusBlocks.GRAY_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.GRAY_GLAZED_TERRACOTTA_PILLAR);
        this.addDrop(BlockusBlocks.GRAY_LIGHT_GRAY_COLORED_TILES);
        this.addDrop(BlockusBlocks.GRAY_NEON);
        this.addDrop(BlockusBlocks.GRAY_PATTERNED_WOOL);
        this.addDrop(BlockusBlocks.GRAY_REDSTONE_LAMP);
        this.addDrop(BlockusBlocks.GRAY_REDSTONE_LAMP_LIT);
        this.addDrop(BlockusBlocks.GRAY_WHITE_COLORED_TILES);
        this.addDrop(BlockusBlocks.GREEN_BROWN_COLORED_TILES);
        this.addDrop(BlockusBlocks.GREEN_COLORED_TILES);
        this.addDrop(BlockusBlocks.GREEN_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.GREEN_GLAZED_TERRACOTTA_PILLAR);
        this.addDrop(BlockusBlocks.GREEN_NEON);
        this.addDrop(BlockusBlocks.GREEN_ORANGE_COLORED_TILES);
        this.addDrop(BlockusBlocks.GREEN_PATTERNED_WOOL);
        this.addDrop(BlockusBlocks.GREEN_REDSTONE_LAMP);
        this.addDrop(BlockusBlocks.GREEN_REDSTONE_LAMP_LIT);
        this.addDrop(BlockusBlocks.GREEN_WHITE_COLORED_TILES);
        this.addDrop(BlockusBlocks.JUNGLE_SMALL_LOGS);
        this.addDrop(BlockusBlocks.LANTERN_BLOCK);
        this.addDrop(BlockusBlocks.LAPIS_DECORATED_RED_SANDSTONE);
        this.addDrop(BlockusBlocks.LAPIS_DECORATED_SANDSTONE);
        this.addDrop(BlockusBlocks.LAPIS_DECORATED_SOUL_SANDSTONE);
        this.addDrop(BlockusBlocks.LARGE_FLOWER_POT);
        this.addDrop(BlockusBlocks.LEGACY_BRICKS);
        this.addDrop(BlockusBlocks.LEGACY_COAL_BLOCK);
        this.addDrop(BlockusBlocks.LEGACY_COBBLESTONE);
        this.addDrop(BlockusBlocks.LEGACY_CRYING_OBSIDIAN);
        this.addDrop(BlockusBlocks.LEGACY_DIAMOND_BLOCK);
        this.addDrop(BlockusBlocks.LEGACY_EXPLOSION_PROOF_GOLD_BLOCK);
        this.addDrop(BlockusBlocks.LEGACY_FIRST_COBBLESTONE);
        this.addDrop(BlockusBlocks.LEGACY_FIRST_GRASS_BLOCK);
        this.addDrop(BlockusBlocks.LEGACY_GLOWING_OBSIDIAN);
        this.addDrop(BlockusBlocks.LEGACY_GOLD_BLOCK);
        this.addDrop(BlockusBlocks.LEGACY_GRASS_BLOCK);
        this.addDrop(BlockusBlocks.LEGACY_IRON_BLOCK);
        this.addDrop(BlockusBlocks.LEGACY_LAPIS_BLOCK);
        this.addDrop(BlockusBlocks.LEGACY_MOSSY_COBBLESTONE);
        this.addDrop(BlockusBlocks.LEGACY_PLANKS);
        this.addDrop(BlockusBlocks.LEGACY_SPONGE);
        this.addDrop(BlockusBlocks.LEGACY_STONECUTTER);
        this.addDrop(BlockusBlocks.LIGHT_BLUE_COLORED_TILES);
        this.addDrop(BlockusBlocks.LIGHT_BLUE_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_PILLAR);
        this.addDrop(BlockusBlocks.LIGHT_BLUE_NEON);
        this.addDrop(BlockusBlocks.LIGHT_BLUE_PATTERNED_WOOL);
        this.addDrop(BlockusBlocks.LIGHT_BLUE_REDSTONE_LAMP);
        this.addDrop(BlockusBlocks.LIGHT_BLUE_REDSTONE_LAMP_LIT);
        this.addDrop(BlockusBlocks.LIGHT_BLUE_WHITE_COLORED_TILES);
        this.addDrop(BlockusBlocks.LIGHT_BLUE_YELLOW_COLORED_TILES);
        this.addDrop(BlockusBlocks.LIGHT_GRAY_COLORED_TILES);
        this.addDrop(BlockusBlocks.LIGHT_GRAY_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_PILLAR);
        this.addDrop(BlockusBlocks.LIGHT_GRAY_NEON);
        this.addDrop(BlockusBlocks.LIGHT_GRAY_PATTERNED_WOOL);
        this.addDrop(BlockusBlocks.LIGHT_GRAY_REDSTONE_LAMP);
        this.addDrop(BlockusBlocks.LIGHT_GRAY_REDSTONE_LAMP_LIT);
        this.addDrop(BlockusBlocks.LIGHT_GRAY_WHITE_COLORED_TILES);
        this.addDrop(BlockusBlocks.LIME_COLORED_TILES);
        this.addDrop(BlockusBlocks.LIME_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.LIME_GLAZED_TERRACOTTA_PILLAR);
        this.addDrop(BlockusBlocks.LIME_NEON);
        this.addDrop(BlockusBlocks.LIME_PATTERNED_WOOL);
        this.addDrop(BlockusBlocks.LIME_REDSTONE_LAMP);
        this.addDrop(BlockusBlocks.LIME_REDSTONE_LAMP_LIT);
        this.addDrop(BlockusBlocks.LIME_WHITE_COLORED_TILES);
        this.addDrop(BlockusBlocks.LIME_YELLOW_COLORED_TILES);
        this.addDrop(BlockusBlocks.LIMESTONE_BUTTON);
        this.addDrop(BlockusBlocks.LIMESTONE_CIRCULAR_PAVING);
        this.addDrop(BlockusBlocks.LIMESTONE_PILLAR);
        this.addDrop(BlockusBlocks.LIMESTONE_PRESSURE_PLATE);
        this.addDrop(BlockusBlocks.LIMESTONE_SQUARES);
        this.addDrop(BlockusBlocks.LIMESTONE_LINES);
        this.addDrop(BlockusBlocks.LOVE_BLOCK);
        this.addDrop(BlockusBlocks.MAGENTA_BLACK_COLORED_TILES);
        this.addDrop(BlockusBlocks.MAGENTA_COLORED_TILES);
        this.addDrop(BlockusBlocks.MAGENTA_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.MAGENTA_GLAZED_TERRACOTTA_PILLAR);
        this.addDrop(BlockusBlocks.MAGENTA_NEON);
        this.addDrop(BlockusBlocks.MAGENTA_PATTERNED_WOOL);
        this.addDrop(BlockusBlocks.MAGENTA_REDSTONE_LAMP);
        this.addDrop(BlockusBlocks.MAGENTA_REDSTONE_LAMP_LIT);
        this.addDrop(BlockusBlocks.MAGENTA_WHITE_COLORED_TILES);
        this.addDrop(BlockusBlocks.MANGROVE_SMALL_LOGS);
        this.addDrop(BlockusBlocks.MARBLE_BUTTON);
        this.addDrop(BlockusBlocks.MARBLE_CIRCULAR_PAVING);
        this.addDrop(BlockusBlocks.MARBLE_PILLAR);
        this.addDrop(BlockusBlocks.MARBLE_PRESSURE_PLATE);
        this.addDrop(BlockusBlocks.MARBLE_SQUARES);
        this.addDrop(BlockusBlocks.MARBLE_LINES);
        this.addDrop(BlockusBlocks.MEMBRANE_BLOCK);
        this.addDrop(BlockusBlocks.MOSS_SMALL_HEDGE);
        this.addDrop(BlockusBlocks.NETHER_BRICK_PILLAR);
        this.addDrop(BlockusBlocks.NETHERITE_STAIRS);
        this.addDrop(BlockusBlocks.NETHERRACK_CIRCULAR_PAVING);
        this.addDrop(BlockusBlocks.OAK_SMALL_LOGS);
        this.addDrop(BlockusBlocks.OBSIDIAN_CIRCULAR_PAVING);
        this.addDrop(BlockusBlocks.OBSIDIAN_PILLAR);
        this.addDrop(BlockusBlocks.OBSIDIAN_REINFORCED_TRAPDOOR);
        this.addDrop(BlockusBlocks.ORANGE_COLORED_TILES);
        this.addDrop(BlockusBlocks.ORANGE_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.ORANGE_GLAZED_TERRACOTTA_PILLAR);
        this.addDrop(BlockusBlocks.ORANGE_NEON);
        this.addDrop(BlockusBlocks.ORANGE_PATTERNED_WOOL);
        this.addDrop(BlockusBlocks.ORANGE_REDSTONE_LAMP);
        this.addDrop(BlockusBlocks.ORANGE_REDSTONE_LAMP_LIT);
        this.addDrop(BlockusBlocks.ORANGE_WHITE_COLORED_TILES);
        this.addDrop(BlockusBlocks.PAPER_BLOCK);
        this.addDrop(BlockusBlocks.PAPER_LAMP);
        this.addDrop(BlockusBlocks.PAPER_TRAPDOOR);
        this.addDrop(BlockusBlocks.PAPER_WALL);
        this.addDrop(BlockusBlocks.PATH);
        this.addDrop(BlockusBlocks.PHANTOM_PURPUR_DECORATED_END_STONE);
        this.addDrop(BlockusBlocks.PHANTOM_PURPUR_LINES);
        this.addDrop(BlockusBlocks.PHANTOM_PURPUR_PILLAR);
        this.addDrop(BlockusBlocks.PHANTOM_PURPUR_SQUARES);
        this.addDrop(BlockusBlocks.PINK_COLORED_TILES);
        this.addDrop(BlockusBlocks.PINK_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.PINK_GLAZED_TERRACOTTA_PILLAR);
        this.addDrop(BlockusBlocks.PINK_MAGENTA_COLORED_TILES);
        this.addDrop(BlockusBlocks.PINK_NEON);
        this.addDrop(BlockusBlocks.PINK_PATTERNED_WOOL);
        this.addDrop(BlockusBlocks.PINK_REDSTONE_LAMP);
        this.addDrop(BlockusBlocks.PINK_REDSTONE_LAMP_LIT);
        this.addDrop(BlockusBlocks.PINK_WHITE_COLORED_TILES);
        this.addDrop(BlockusBlocks.POLISHED_ANDESITE_BUTTON);
        this.addDrop(BlockusBlocks.POLISHED_ANDESITE_PILLAR);
        this.addDrop(BlockusBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);
        this.addDrop(BlockusBlocks.POLISHED_BASALT_BUTTON);
        this.addDrop(BlockusBlocks.POLISHED_BASALT_CIRCULAR_PAVING);
        this.addDrop(BlockusBlocks.POLISHED_BASALT_PILLAR);
        this.addDrop(BlockusBlocks.POLISHED_BASALT_PRESSURE_PLATE);
        this.addDrop(BlockusBlocks.POLISHED_BLACKSTONE_CIRCULAR_PAVING);
        this.addDrop(BlockusBlocks.POLISHED_BLACKSTONE_PILLAR);
        this.addDrop(BlockusBlocks.POLISHED_CHARRED_NETHER_BRICKS);
        this.addDrop(BlockusBlocks.POLISHED_DEEPSLATE_BUTTON);
        this.addDrop(BlockusBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
        this.addDrop(BlockusBlocks.POLISHED_DIORITE_BUTTON);
        this.addDrop(BlockusBlocks.POLISHED_DIORITE_PILLAR);
        this.addDrop(BlockusBlocks.POLISHED_DIORITE_PRESSURE_PLATE);
        this.addDrop(BlockusBlocks.POLISHED_END_STONE_BUTTON);
        this.addDrop(BlockusBlocks.POLISHED_END_STONE_PRESSURE_PLATE);
        this.addDrop(BlockusBlocks.POLISHED_GRANITE_BUTTON);
        this.addDrop(BlockusBlocks.POLISHED_GRANITE_PILLAR);
        this.addDrop(BlockusBlocks.POLISHED_GRANITE_PRESSURE_PLATE);
        this.addDrop(BlockusBlocks.POLISHED_NETHER_BRICKS);
        this.addDrop(BlockusBlocks.POLISHED_NETHERRACK_BUTTON);
        this.addDrop(BlockusBlocks.POLISHED_NETHERRACK_PRESSURE_PLATE);
        this.addDrop(BlockusBlocks.POLISHED_RED_NETHER_BRICKS);
        this.addDrop(BlockusBlocks.POLISHED_TEAL_NETHER_BRICKS);
        this.addDrop(BlockusBlocks.POLISHED_TUFF_BUTTON);
        this.addDrop(BlockusBlocks.POLISHED_TUFF_PRESSURE_PLATE);
        this.addDrop(BlockusBlocks.POTATO_CRATE);
        this.addDrop(BlockusBlocks.PRISMARINE_CIRCULAR_PAVING);
        this.addDrop(BlockusBlocks.PRISMARINE_PILLAR);
        this.addDrop(BlockusBlocks.PUFFERFISH_CRATE);
        this.addDrop(BlockusBlocks.PURPLE_BLUE_COLORED_TILES);
        this.addDrop(BlockusBlocks.PURPLE_COLORED_TILES);
        this.addDrop(BlockusBlocks.PURPLE_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.PURPLE_GLAZED_TERRACOTTA_PILLAR);
        this.addDrop(BlockusBlocks.PURPLE_NEON);
        this.addDrop(BlockusBlocks.PURPLE_ORANGE_COLORED_TILES);
        this.addDrop(BlockusBlocks.PURPLE_PATTERNED_WOOL);
        this.addDrop(BlockusBlocks.PURPLE_REDSTONE_LAMP);
        this.addDrop(BlockusBlocks.PURPLE_REDSTONE_LAMP_LIT);
        this.addDrop(BlockusBlocks.PURPLE_WHITE_COLORED_TILES);
        this.addDrop(BlockusBlocks.PURPUR_DECORATED_END_STONE);
        this.addDrop(BlockusBlocks.PURPUR_LINES);
        this.addDrop(BlockusBlocks.PURPUR_SQUARES);
        this.addDrop(BlockusBlocks.QUARTZ_CIRCULAR_PAVING);
        this.addDrop(BlockusBlocks.RAINBOW_ASPHALT);
        this.addDrop(BlockusBlocks.RAINBOW_BEVELED_GLASS);
        this.addDrop(BlockusBlocks.RAINBOW_BEVELED_GLASS_PANE);
        this.addDrop(BlockusBlocks.RAINBOW_BLOCK);
        this.addDrop(BlockusBlocks.RAINBOW_COLORED_TILES);
        this.addDrop(BlockusBlocks.RAINBOW_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.RAINBOW_GLASS);
        this.addDrop(BlockusBlocks.RAINBOW_GLASS_PANE);
        this.addDrop(BlockusBlocks.RAINBOW_LAMP);
        this.addDrop(BlockusBlocks.RAINBOW_LAMP_LIT);
        this.addDrop(BlockusBlocks.RED_BLUE_COLORED_TILES);
        this.addDrop(BlockusBlocks.RED_COLORED_TILES);
        this.addDrop(BlockusBlocks.RED_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.RED_GLAZED_TERRACOTTA_PILLAR);
        this.addDrop(BlockusBlocks.RED_NEON);
        this.addDrop(BlockusBlocks.RED_NETHER_BRICK_PILLAR);
        this.addDrop(BlockusBlocks.RED_PATTERNED_WOOL);
        this.addDrop(BlockusBlocks.RED_REDSTONE_LAMP);
        this.addDrop(BlockusBlocks.RED_REDSTONE_LAMP_LIT);
        this.addDrop(BlockusBlocks.RED_SANDSTONE_PILLAR);
        this.addDrop(BlockusBlocks.RED_WHITE_COLORED_TILES);
        this.addDrop(BlockusBlocks.REDSTONE_LAMP_LIT);
        this.addDrop(BlockusBlocks.REDSTONE_SAND);
        this.addDrop(BlockusBlocks.ROAD_BARRIER);
        this.addDrop(BlockusBlocks.ROTTEN_FLESH_BLOCK);
        this.addDrop(BlockusBlocks.SALMON_CRATE);
        this.addDrop(BlockusBlocks.SANDSTONE_PILLAR);
        this.addDrop(BlockusBlocks.SMOOTH_STONE_STAIRS);
        this.addDrop(BlockusBlocks.SNOW_BRICK_STAIRS);
        this.addDrop(BlockusBlocks.SNOW_BRICK_WALL);
        this.addDrop(BlockusBlocks.SNOW_BRICKS);
        this.addDrop(BlockusBlocks.SNOW_PILLAR);
        this.addDrop(BlockusBlocks.SOUL_LANTERN_BLOCK);
        this.addDrop(BlockusBlocks.SOUL_O_LANTERN);
        this.addDrop(BlockusBlocks.SOUL_SANDSTONE_PILLAR);
        this.addDrop(BlockusBlocks.SPRUCE_SMALL_LOGS);
        this.addDrop(BlockusBlocks.STARS_BLOCK);
        this.addDrop(BlockusBlocks.STONE_BRICK_PILLAR);
        this.addDrop(BlockusBlocks.STONE_CIRCULAR_PAVING);
        this.addDrop(BlockusBlocks.STONE_TRAPDOOR);
        this.addDrop(BlockusBlocks.STRIPPED_WHITE_OAK_LOG);
        this.addDrop(BlockusBlocks.STRIPPED_WHITE_OAK_WOOD);
        this.addDrop(BlockusBlocks.STURDY_BLACKSTONE);
        this.addDrop(BlockusBlocks.STURDY_DEEPSLATE);
        this.addDrop(BlockusBlocks.STURDY_STONE);
        this.addDrop(BlockusBlocks.SUGAR_BLOCK);
        this.addDrop(BlockusBlocks.SWEET_BERRIES_CRATE);
        this.addDrop(BlockusBlocks.TEAL_NETHER_BRICK_PILLAR);
        this.addDrop(BlockusBlocks.TROPICAL_FISH_CRATE);
        this.addDrop(BlockusBlocks.TUFF_CIRCULAR_PAVING);
        this.addDrop(BlockusBlocks.TUFF_PILLAR);
        this.addDrop(BlockusBlocks.WARPED_SMALL_HEDGE);
        this.addDrop(BlockusBlocks.WARPED_SMALL_STEMS);
        this.addDrop(BlockusBlocks.WEIGHT_STORAGE_CUBE);
        this.addDrop(BlockusBlocks.WHITE_COLORED_TILES);
        this.addDrop(BlockusBlocks.WHITE_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.WHITE_GLAZED_TERRACOTTA_PILLAR);
        this.addDrop(BlockusBlocks.WHITE_NEON);
        this.addDrop(BlockusBlocks.WHITE_OAK_LOG);
        this.addDrop(BlockusBlocks.WHITE_OAK_SAPLING);
        this.addDrop(BlockusBlocks.WHITE_OAK_SMALL_LOGS);
        this.addDrop(BlockusBlocks.WHITE_OAK_WOOD);
        this.addDrop(BlockusBlocks.WHITE_PATTERNED_WOOL);
        this.addDrop(BlockusBlocks.WHITE_REDSTONE_LAMP);
        this.addDrop(BlockusBlocks.WHITE_REDSTONE_LAMP_LIT);
        this.addDrop(BlockusBlocks.WOODEN_FRAME);
        this.addDrop(BlockusBlocks.YELLOW_COLORED_TILES);
        this.addDrop(BlockusBlocks.YELLOW_FUTURNEO_BLOCK);
        this.addDrop(BlockusBlocks.YELLOW_GLAZED_TERRACOTTA_PILLAR);
        this.addDrop(BlockusBlocks.YELLOW_NEON);
        this.addDrop(BlockusBlocks.YELLOW_PATTERNED_WOOL);
        this.addDrop(BlockusBlocks.YELLOW_REDSTONE_LAMP);
        this.addDrop(BlockusBlocks.YELLOW_REDSTONE_LAMP_LIT);
        this.addDrop(BlockusBlocks.YELLOW_WHITE_COLORED_TILES);
        this.addDrop(BlockusBlocks.HERRINGBONE_ANDESITE_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_CHARRED_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_CHARRED_NETHER_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_DEEPSLATE_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_DIORITE_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_END_STONE_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_GRANITE_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_NETHER_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_POLISHED_BASALT_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_POLISHED_BLACKSTONE_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_RED_NETHER_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_SANDY_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_SOAKED_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_STONE_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_TEAL_NETHER_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_TUFF_BRICKS);
        this.addDrop(BlockusBlocks.RAINBOW_ROSE);
        this.addDrop(BlockusBlocks.TINTED_BEVELED_GLASS);

        this.addDrop(BlockusBlocks.CUT_SOUL_SANDSTONE_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(BlockusBlocks.NETHERITE_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(BlockusBlocks.SNOW_BRICK_SLAB, BlockLootTableGenerator::slabDrops);

        this.addDrop(BlockusBlocks.BLACKSTONE_DOOR, BlockLootTableGenerator::addDoorDrop);
        this.addDrop(BlockusBlocks.GOLDEN_GATE, BlockLootTableGenerator::addDoorDrop);
        this.addDrop(BlockusBlocks.IRON_GATE, BlockLootTableGenerator::addDoorDrop);
        this.addDrop(BlockusBlocks.OBSIDIAN_REINFORCED_DOOR, BlockLootTableGenerator::addDoorDrop);
        this.addDrop(BlockusBlocks.PAPER_DOOR, BlockLootTableGenerator::addDoorDrop);
        this.addDrop(BlockusBlocks.STONE_DOOR, BlockLootTableGenerator::addDoorDrop);

        this.addPottedPlantDrop(BlockusBlocks.POTTED_WHITE_OAK_SAPLING);
        this.addPottedPlantDrop(BlockusBlocks.POTTED_RAINBOW_ROSE);
        this.addPottedPlantDrop(BlockusBlocks.POTTED_LEGACY_SAPLING);

        this.addDropWithSilkTouch(BlockusBlocks.BEVELED_GLASS);
        this.addDropWithSilkTouch(BlockusBlocks.BEVELED_GLASS_PANE);
        this.addDropWithSilkTouch(BlockusBlocks.BLACK_BEVELED_GLASS);
        this.addDropWithSilkTouch(BlockusBlocks.BLACK_BEVELED_GLASS_PANE);
        this.addDropWithSilkTouch(BlockusBlocks.BLUE_BEVELED_GLASS);
        this.addDropWithSilkTouch(BlockusBlocks.BLUE_BEVELED_GLASS_PANE);
        this.addDropWithSilkTouch(BlockusBlocks.BROWN_BEVELED_GLASS);
        this.addDropWithSilkTouch(BlockusBlocks.BROWN_BEVELED_GLASS_PANE);
        this.addDropWithSilkTouch(BlockusBlocks.CYAN_BEVELED_GLASS);
        this.addDropWithSilkTouch(BlockusBlocks.CYAN_BEVELED_GLASS_PANE);
        this.addDropWithSilkTouch(BlockusBlocks.GRAY_BEVELED_GLASS);
        this.addDropWithSilkTouch(BlockusBlocks.GRAY_BEVELED_GLASS_PANE);
        this.addDropWithSilkTouch(BlockusBlocks.GREEN_BEVELED_GLASS);
        this.addDropWithSilkTouch(BlockusBlocks.GREEN_BEVELED_GLASS_PANE);
        this.addDropWithSilkTouch(BlockusBlocks.ICE_BRICK_WALL);
        this.addDropWithSilkTouch(BlockusBlocks.ICE_BRICKS);
        this.addDropWithSilkTouch(BlockusBlocks.ICE_PILLAR);
        this.addDropWithSilkTouch(BlockusBlocks.LIGHT_BLUE_BEVELED_GLASS);
        this.addDropWithSilkTouch(BlockusBlocks.LIGHT_BLUE_BEVELED_GLASS_PANE);
        this.addDropWithSilkTouch(BlockusBlocks.LIGHT_GRAY_BEVELED_GLASS);
        this.addDropWithSilkTouch(BlockusBlocks.LIGHT_GRAY_BEVELED_GLASS_PANE);
        this.addDropWithSilkTouch(BlockusBlocks.LIME_BEVELED_GLASS);
        this.addDropWithSilkTouch(BlockusBlocks.LIME_BEVELED_GLASS_PANE);
        this.addDropWithSilkTouch(BlockusBlocks.MAGENTA_BEVELED_GLASS);
        this.addDropWithSilkTouch(BlockusBlocks.MAGENTA_BEVELED_GLASS_PANE);
        this.addDropWithSilkTouch(BlockusBlocks.ORANGE_BEVELED_GLASS);
        this.addDropWithSilkTouch(BlockusBlocks.ORANGE_BEVELED_GLASS_PANE);
        this.addDropWithSilkTouch(BlockusBlocks.PINK_BEVELED_GLASS);
        this.addDropWithSilkTouch(BlockusBlocks.PINK_BEVELED_GLASS_PANE);
        this.addDropWithSilkTouch(BlockusBlocks.PURPLE_BEVELED_GLASS);
        this.addDropWithSilkTouch(BlockusBlocks.PURPLE_BEVELED_GLASS_PANE);
        this.addDropWithSilkTouch(BlockusBlocks.RED_BEVELED_GLASS);
        this.addDropWithSilkTouch(BlockusBlocks.RED_BEVELED_GLASS_PANE);
        this.addDropWithSilkTouch(BlockusBlocks.WHITE_BEVELED_GLASS);
        this.addDropWithSilkTouch(BlockusBlocks.WHITE_BEVELED_GLASS_PANE);
        this.addDropWithSilkTouch(BlockusBlocks.YELLOW_BEVELED_GLASS);
        this.addDropWithSilkTouch(BlockusBlocks.YELLOW_BEVELED_GLASS_PANE);

        this.addDrop(BlockusBlocks.ACACIA_SMALL_HEDGE, (blockx) -> {
            return dropsWithSilkTouchOrShears(blockx, addSurvivesExplosionCondition(blockx, ItemEntry.builder(Items.STICK)));
        });
        this.addDrop(BlockusBlocks.AZALEA_SMALL_HEDGE, (blockx) -> {
            return dropsWithSilkTouchOrShears(blockx, addSurvivesExplosionCondition(blockx, ItemEntry.builder(Items.STICK)));
        });
        this.addDrop(BlockusBlocks.FLOWERING_AZALEA_SMALL_HEDGE, (blockx) -> {
            return dropsWithSilkTouchOrShears(blockx, addSurvivesExplosionCondition(blockx, ItemEntry.builder(Items.STICK)));
        });
        this.addDrop(BlockusBlocks.BIRCH_SMALL_HEDGE, (blockx) -> {
            return dropsWithSilkTouchOrShears(blockx, addSurvivesExplosionCondition(blockx, ItemEntry.builder(Items.STICK)));
        });
        this.addDrop(BlockusBlocks.DARK_OAK_SMALL_HEDGE, (blockx) -> {
            return dropsWithSilkTouchOrShears(blockx, addSurvivesExplosionCondition(blockx, ItemEntry.builder(Items.STICK)));
        });
        this.addDrop(BlockusBlocks.JUNGLE_SMALL_HEDGE, (blockx) -> {
            return dropsWithSilkTouchOrShears(blockx, addSurvivesExplosionCondition(blockx, ItemEntry.builder(Items.STICK)));
        });
        this.addDrop(BlockusBlocks.OAK_SMALL_HEDGE, (blockx) -> {
            return dropsWithSilkTouchOrShears(blockx, addSurvivesExplosionCondition(blockx, ItemEntry.builder(Items.STICK)));
        });
        this.addDrop(BlockusBlocks.SPRUCE_SMALL_HEDGE, (blockx) -> {
            return dropsWithSilkTouchOrShears(blockx, addSurvivesExplosionCondition(blockx, ItemEntry.builder(Items.STICK)));
        });
        this.addDrop(BlockusBlocks.MANGROVE_SMALL_HEDGE, (blockx) -> {
            return dropsWithSilkTouchOrShears(blockx, addSurvivesExplosionCondition(blockx, ItemEntry.builder(Items.STICK)));
        });
        this.addDrop(BlockusBlocks.WHITE_OAK_SMALL_HEDGE, (blockx) -> {
            return dropsWithSilkTouchOrShears(blockx, addSurvivesExplosionCondition(blockx, ItemEntry.builder(Items.STICK)));
        });
    }

    public static LootTable.Builder pottedLargePlantDrops(ItemConvertible plant) {
        return LootTable.builder().pool(addSurvivesExplosionCondition(BlockusBlocks.LARGE_FLOWER_POT, LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F)).with(ItemEntry.builder(BlockusBlocks.LARGE_FLOWER_POT)))).pool(addSurvivesExplosionCondition(plant, LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F)).with(ItemEntry.builder(plant))));
    }

     public void addPottedLargePlantDrop(Block block) {
        this.addDrop(block, (flowerPot) -> {
            return pottedLargePlantDrops(((LargeFlowerPotBlock)flowerPot).getContent());
        });
    }
}
