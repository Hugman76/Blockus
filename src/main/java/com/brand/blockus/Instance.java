package com.brand.blockus;

import com.brand.blockus.content.BlockusBlocks;
import com.brand.blockus.content.BlockusItems;
import com.brand.blockus.content.types.TimberFrameTypesB;
import com.brand.blockus.content.types.WoodTypesB;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.*;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.item.*;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;

import java.util.HashMap;

public class Instance {

    public static void init() {


// Flammable

        // general		
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WOODEN_FRAME, 30, 60);

        // small hedges
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.OAK_SMALL_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.ACACIA_SMALL_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BIRCH_SMALL_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.DARK_OAK_SMALL_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.JUNGLE_SMALL_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.SPRUCE_SMALL_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.MANGROVE_SMALL_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_SMALL_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.AZALEA_SMALL_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.FLOWERING_AZALEA_SMALL_HEDGE, 30, 60);

        // paper
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.FRAMED_PAPER_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.PAPER_WALL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.PAPER_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BURNT_PAPER_BLOCK, 5, 60);

        // thatch
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.THATCH.block, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.THATCH.slab, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.THATCH.stairs, 60, 20);

        // timber frames
        for (TimberFrameTypesB timberFrameType : TimberFrameTypesB.values()) {
            FlammableBlockRegistry.getDefaultInstance().add(timberFrameType.block, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(timberFrameType.diagonal, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(timberFrameType.cross, 5, 20);
        }

        // patterned wools
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.ORANGE_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.MAGENTA_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.LIGHT_BLUE_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.YELLOW_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.LIME_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.PINK_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.GRAY_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.LIGHT_GRAY_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.CYAN_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.PURPLE_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BLUE_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BROWN_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.GREEN_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.RED_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BLACK_PATTERNED_WOOL, 30, 60);

        // bamboo

        for (WoodTypesB woodType : WoodTypesB.values()) {
            FlammableBlockRegistry.getDefaultInstance().add(woodType.planks, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(woodType.stairs, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(woodType.slab, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(woodType.fence, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(woodType.fence_gate, 5, 20);
        }

        // white oak
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.STRIPPED_WHITE_OAK_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.STRIPPED_WHITE_OAK_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_LEAVES, 30, 60);

        // herringbone planks
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_OAK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_BIRCH_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_SPRUCE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_JUNGLE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_ACACIA_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_DARK_OAK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_MANGROVE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_WHITE_OAK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_BAMBOO_PLANKS, 5, 20);

        // small logs		
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.OAK_SMALL_LOGS, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BIRCH_SMALL_LOGS, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.SPRUCE_SMALL_LOGS, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.JUNGLE_SMALL_LOGS, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.ACACIA_SMALL_LOGS, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.DARK_OAK_SMALL_LOGS, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.MANGROVE_SMALL_LOGS, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_SMALL_LOGS, 5, 5);

        // legacy
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.LEGACY_LOG, 5, 5);


// Fuel
        // general
        FuelRegistry.INSTANCE.add(Items.DRIED_KELP, 200);
        FuelRegistry.INSTANCE.add(BlockusBlocks.LEGACY_COAL_BLOCK, 16000);
        FuelRegistry.INSTANCE.add(BlockusBlocks.CHARCOAL_BLOCK, 16000);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WOODEN_FRAME, 300);

        // paper
        FuelRegistry.INSTANCE.add(Items.PAPER, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.PAPER_DOOR, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.PAPER_TRAPDOOR, 150);
        FuelRegistry.INSTANCE.add(BlockusBlocks.FRAMED_PAPER_BLOCK, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.PAPER_WALL, 150);
        FuelRegistry.INSTANCE.add(BlockusBlocks.PAPER_LAMP, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.PAPER_BLOCK, 400);

        // timber frames

        for (TimberFrameTypesB timberFrameType : TimberFrameTypesB.values()) {
            FuelRegistry.INSTANCE.add(timberFrameType.block, 300);
            FuelRegistry.INSTANCE.add(timberFrameType.diagonal, 300);
            FuelRegistry.INSTANCE.add(timberFrameType.cross, 300);
        }

        for (WoodTypesB woodType : WoodTypesB.values()) {
            FuelRegistry.INSTANCE.add(woodType.fence, 300);
            FuelRegistry.INSTANCE.add(woodType.fence_gate, 300);
        }

        // barrels
        FuelRegistry.INSTANCE.add(BlockusBlocks.OAK_BARREL, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BIRCH_BARREL, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.JUNGLE_BARREL, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.ACACIA_BARREL, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.DARK_OAK_BARREL, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_BARREL, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BAMBOO_BARREL, 300);

// Composting
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.OAK_SMALL_HEDGE, 0.30f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.ACACIA_SMALL_HEDGE, 0.30f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.BIRCH_SMALL_HEDGE, 0.30f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.DARK_OAK_SMALL_HEDGE, 0.30f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.JUNGLE_SMALL_HEDGE, 0.30f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.SPRUCE_SMALL_HEDGE, 0.30f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.MANGROVE_SMALL_HEDGE, 0.30f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.AZALEA_SMALL_HEDGE, 0.30f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_SMALL_HEDGE, 0.30f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_LEAVES, 0.30f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_SAPLING, 0.30f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.LEGACY_SAPLING, 0.30f);
        CompostingChanceRegistry.INSTANCE.add(BlockusItems.RAINBOW_PETAL, 0.30f);
        CompostingChanceRegistry.INSTANCE.add(Items.BAMBOO, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.SWEET_BERRIES_CRATE, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.FLOWERING_AZALEA_SMALL_HEDGE, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.MOSS_SMALL_HEDGE, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.RAINBOW_ROSE, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.THATCH.slab, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.THATCH.block, 0.75f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.THATCH.stairs, 0.75f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.WARPED_SMALL_HEDGE, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.CRIMSON_SMALL_HEDGE, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.APPLE_CRATE, 0.95f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.BEETROOT_CRATE, 0.95f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.CARROT_CRATE, 0.95f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.POTATO_CRATE, 0.95f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.BREAD_BOX, 1.0f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.COOKIE_BLOCK, 1.0f);


// Instance

        addStrippables();
        addPathBlocks();
        addTradeOffers();
    }

    public static void addStrippables() {
        StrippableBlockRegistry.register(BlockusBlocks.WHITE_OAK_LOG, BlockusBlocks.STRIPPED_WHITE_OAK_LOG);
        StrippableBlockRegistry.register(BlockusBlocks.WHITE_OAK_WOOD, BlockusBlocks.STRIPPED_WHITE_OAK_WOOD);
    }

    public static void addPathBlocks() {
        FlattenableBlockRegistry.register(Blocks.DIRT_PATH, BlockusBlocks.PATH.getDefaultState());
        FlattenableBlockRegistry.register(BlockusBlocks.PATH, Blocks.DIRT.getDefaultState());

    }

    public static void addTradeOffers() {
        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add(new SellItemFactory(BlockusBlocks.LEGACY_SAPLING, 5, 1, 8));
            factories.add(new SellItemFactory(BlockusBlocks.WHITE_OAK_SAPLING, 5, 1, 8));
            factories.add(new SellItemFactory(BlockusItems.RAINBOW_PETAL, 1, 3, 12));
            factories.add(new SellItemFactory(BlockusBlocks.RAINBOW_ROSE, 1, 1, 12));
        });
    }


    static class SellItemFactory implements TradeOffers.Factory {
        private final ItemStack sell;
        private final int price;
        private final int count;
        private final int maxUses;

        public SellItemFactory(ItemConvertible stack, int price, int count, int maxUses) {
            this.sell = new ItemStack(stack);
            this.price = price;
            this.count = count;
            this.maxUses = maxUses;
        }

        public TradeOffer create(Entity entity, Random random) {
            return new TradeOffer(new ItemStack(Items.EMERALD, this.price), new ItemStack(this.sell.getItem(), this.count), this.maxUses, 1, 0.05f);
        }
    }
}
