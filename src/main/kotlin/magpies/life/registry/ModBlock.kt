package magpies.life.registry

import magpies.life.DiverseBlocks
import magpies.life.DiverseBlocks.MOD_ID
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.block.SlabBlock
import net.minecraft.block.StairsBlock
import net.minecraft.item.BlockItem
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModBlock {

    val DIRT_SLAB = registerBlocks("dirt_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)))
    val DIRT_STAIRS = registerBlocks("dirt_stairs", StairsBlock(Blocks.DIRT.defaultState,FabricBlockSettings.copyOf(Blocks.DIRT)))

    val CRYING_OBSIDIAN_SLAB =
        registerBlocks("crying_obsidian_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.CRYING_OBSIDIAN)))
    val CRYING_OBSIDIAN_STAIRS = registerBlocks(
        "crying_obsidian_stairs",
        StairsBlock(Blocks.CRYING_OBSIDIAN.defaultState, FabricBlockSettings.copyOf(Blocks.CRYING_OBSIDIAN))
    )

    val PACKED_ICE_SLAB = registerBlocks("packed_ice_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE)))
    val PACKED_ICE_STAIRS = registerBlocks(
        "packed_ice_stairs",
        StairsBlock(Blocks.PACKED_ICE.defaultState, FabricBlockSettings.copyOf(Blocks.PACKED_ICE))
    )

    val BLUE_ICE_SLAB = registerBlocks("blue_ice_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_ICE)))
    val BLUE_ICE_STAIRS = registerBlocks(
        "blue_ice_stairs",
        StairsBlock(Blocks.BLUE_ICE.defaultState, FabricBlockSettings.copyOf(Blocks.BLUE_ICE))
    )

    val CALCITE_SLAB = registerBlocks("calcite_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)))
    val CALCITE_STAIRS = registerBlocks(
        "calcite_stairs",
        StairsBlock(Blocks.CALCITE.defaultState, FabricBlockSettings.copyOf(Blocks.CALCITE))
    )

    val TUFF_SLAB = registerBlocks("tuff_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.TUFF)))
    val TUFF_STAIRS =
        registerBlocks("tuff_stairs", StairsBlock(Blocks.TUFF.defaultState, FabricBlockSettings.copyOf(Blocks.TUFF)))

    val OBSIDIAN_SLAB = registerBlocks("obsidian_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)))
    val OBSIDIAN_STAIRS = registerBlocks(
        "obsidian_stairs",
        StairsBlock(Blocks.OBSIDIAN.defaultState, FabricBlockSettings.copyOf(Blocks.OBSIDIAN))
    )

    val END_STONE_SLAB = registerBlocks("end_stone_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)))
    val END_STONE_STAIRS = registerBlocks(
        "end_stone_stairs",
        StairsBlock(Blocks.END_STONE.defaultState, FabricBlockSettings.copyOf(Blocks.END_STONE))
    )

    val WHITE_WOOL_SLAB = registerBlocks("white_wool_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)))
    val WHITE_WOOL_STAIRS = registerBlocks(
        "white_wool_stairs",
        StairsBlock(Blocks.WHITE_WOOL.defaultState, FabricBlockSettings.copyOf(Blocks.WHITE_WOOL))
    )

    val GLASS_SLAB = registerBlocks("glass_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()))
    val WHITE_GLASS_SLAB = registerBlocks("white_glass_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS).nonOpaque()))
    val ORANGE_GLASS_SLAB = registerBlocks("orange_glass_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_STAINED_GLASS).nonOpaque()))
    val MAGENTA_GLASS_SLAB = registerBlocks("magenta_glass_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_STAINED_GLASS).nonOpaque()))
    val LIGHT_BLUE_GLASS_SLAB = registerBlocks("light_blue_glass_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_STAINED_GLASS).nonOpaque()))
    val YELLOW_GLASS_SLAB = registerBlocks("yellow_glass_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_STAINED_GLASS).nonOpaque()))
    val LIME_GLASS_SLAB = registerBlocks("lime_glass_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_STAINED_GLASS).nonOpaque()))
    val PINK_GLASS_SLAB = registerBlocks("pink_glass_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_STAINED_GLASS).nonOpaque()))
    val GRAY_GLASS_SLAB = registerBlocks("gray_glass_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_STAINED_GLASS).nonOpaque()))
    val LIGHT_GRAY_GLASS_SLAB = registerBlocks("light_gray_glass_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_STAINED_GLASS).nonOpaque()))
    val CYAN_GLASS_SLAB = registerBlocks("cyan_glass_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_STAINED_GLASS).nonOpaque()))
    val PURPLE_GLASS_SLAB = registerBlocks("purple_glass_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_STAINED_GLASS).nonOpaque()))
    val BLUE_GLASS_SLAB = registerBlocks("blue_glass_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_STAINED_GLASS).nonOpaque()))
    val BROWN_GLASS_SLAB = registerBlocks("brown_glass_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_STAINED_GLASS).nonOpaque()))
    val GREEN_GLASS_SLAB = registerBlocks("green_glass_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_STAINED_GLASS).nonOpaque()))
    val RED_GLASS_SLAB = registerBlocks("red_glass_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_STAINED_GLASS).nonOpaque()))
    val BLACK_GLASS_SLAB = registerBlocks("black_glass_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS).nonOpaque()))


    val TERRACOTTA_SLAB = registerBlocks("terracotta_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)))
    val TERRACOTTA_STAIRS = registerBlocks("terracotta_stairs", StairsBlock(Blocks.TERRACOTTA.defaultState,FabricBlockSettings.copyOf(Blocks.TERRACOTTA)))

    val WHITE_TERRACOTTA_SLAB = registerBlocks("white_terracotta_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)))
    val WHITE_TERRACOTTA_STAIRS = registerBlocks("white_terracotta_stairs", StairsBlock(Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)))

    val ORANGE_TERRACOTTA_SLAB = registerBlocks("orange_terracotta_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)))
    val ORANGE_TERRACOTTA_STAIRS = registerBlocks("orange_terracotta_stairs", StairsBlock(Blocks.ORANGE_TERRACOTTA.defaultState, FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)))

    val MAGENTA_TERRACOTTA_SLAB = registerBlocks("magenta_terracotta_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)))
    val MAGENTA_TERRACOTTA_STAIRS = registerBlocks("magenta_terracotta_stairs", StairsBlock(Blocks.MAGENTA_TERRACOTTA.defaultState, FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)))

    val LIGHT_BLUE_TERRACOTTA_SLAB = registerBlocks("light_blue_terracotta_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)))
    val LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlocks("light_blue_terracotta_stairs", StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.defaultState, FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)))

    val YELLOW_TERRACOTTA_SLAB = registerBlocks("yellow_terracotta_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)))
    val YELLOW_TERRACOTTA_STAIRS = registerBlocks("yellow_terracotta_stairs", StairsBlock(Blocks.YELLOW_TERRACOTTA.defaultState, FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)))

    val LIME_TERRACOTTA_SLAB = registerBlocks("lime_terracotta_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)))
    val LIME_TERRACOTTA_STAIRS = registerBlocks("lime_terracotta_stairs", StairsBlock(Blocks.LIME_TERRACOTTA.defaultState, FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)))

    val PINK_TERRACOTTA_SLAB = registerBlocks("pink_terracotta_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)))
    val PINK_TERRACOTTA_STAIRS = registerBlocks("pink_terracotta_stairs", StairsBlock(Blocks.PINK_TERRACOTTA.defaultState, FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)))

    val GRAY_TERRACOTTA_SLAB = registerBlocks("gray_terracotta_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)))
    val GRAY_TERRACOTTA_STAIRS = registerBlocks("gray_terracotta_stairs", StairsBlock(Blocks.GRAY_TERRACOTTA.defaultState, FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)))

    val LIGHT_GRAY_TERRACOTTA_SLAB = registerBlocks("light_gray_terracotta_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)))
    val LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlocks("light_gray_terracotta_stairs", StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.defaultState, FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)))

    val CYAN_TERRACOTTA_SLAB = registerBlocks("cyan_terracotta_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)))
    val CYAN_TERRACOTTA_STAIRS = registerBlocks("cyan_terracotta_stairs", StairsBlock(Blocks.CYAN_TERRACOTTA.defaultState, FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)))

    val PURPLE_TERRACOTTA_SLAB = registerBlocks("purple_terracotta_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)))
    val PURPLE_TERRACOTTA_STAIRS = registerBlocks("purple_terracotta_stairs", StairsBlock(Blocks.PURPLE_TERRACOTTA.defaultState, FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)))

    val BLUE_TERRACOTTA_SLAB = registerBlocks("blue_terracotta_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)))
    val BLUE_TERRACOTTA_STAIRS = registerBlocks("blue_terracotta_stairs", StairsBlock(Blocks.BLUE_TERRACOTTA.defaultState, FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)))

    val BROWN_TERRACOTTA_SLAB = registerBlocks("brown_terracotta_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)))
    val BROWN_TERRACOTTA_STAIRS = registerBlocks("brown_terracotta_stairs", StairsBlock(Blocks.BROWN_TERRACOTTA.defaultState, FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)))

    val GREEN_TERRACOTTA_SLAB = registerBlocks("green_terracotta_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)))
    val GREEN_TERRACOTTA_STAIRS = registerBlocks("green_terracotta_stairs", StairsBlock(Blocks.GREEN_TERRACOTTA.defaultState, FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)))

    val RED_TERRACOTTA_SLAB = registerBlocks("red_terracotta_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)))
    val RED_TERRACOTTA_STAIRS = registerBlocks("red_terracotta_stairs", StairsBlock(Blocks.RED_TERRACOTTA.defaultState, FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)))

    val BLACK_TERRACOTTA_SLAB = registerBlocks("black_terracotta_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)))
    val BLACK_TERRACOTTA_STAIRS = registerBlocks("black_terracotta_stairs", StairsBlock(Blocks.BLACK_TERRACOTTA.defaultState, FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)))




    val HONEYCOMB_BLOCK_SLAB = registerBlocks("honeycomb_block_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.HONEYCOMB_BLOCK)))
    val HONEYCOMB_BLOCK_STAIRS = registerBlocks("honeycomb_block_stairs", StairsBlock(Blocks.HONEYCOMB_BLOCK.defaultState,FabricBlockSettings.copyOf(Blocks.HONEYCOMB_BLOCK)))

    val AMETHYST_BLOCK_SLAB = registerBlocks("amethyst_block_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)))
    val AMETHYST_BLOCK_STAIRS = registerBlocks("amethyst_block_stairs", StairsBlock(Blocks.AMETHYST_BLOCK.defaultState,FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)))

    val GLOWSTONE_SLAB = registerBlocks("glowstone_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)))
    val GLOWSTONE_STAIRS = registerBlocks("glowstone_stairs", StairsBlock(Blocks.GLOWSTONE.defaultState,FabricBlockSettings.copyOf(Blocks.GLOWSTONE)))


    private fun registerBlocks(name: String, block: Block): Block {
        registerBlockItems(name, block)
        return Registry.register(Registries.BLOCK, Identifier(MOD_ID, name), block)
    }

    private fun registerBlockItems(name: String, block: Block) {
        Registry.register(Registries.ITEM, Identifier(MOD_ID, name), BlockItem(block, FabricItemSettings()))
    }

    fun registerModBlocksLog() {
        DiverseBlocks.logger.info("Registering Mod Blocks for $MOD_ID")
    }
}