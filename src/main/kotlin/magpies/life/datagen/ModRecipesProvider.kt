package magpies.life.datagen

import magpies.life.DiverseBlocks
import magpies.life.registry.ModBlock
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder
import net.minecraft.item.Item
import net.minecraft.item.Items
import net.minecraft.recipe.book.RecipeCategory
import net.minecraft.util.Identifier

class ModRecipesProvider(output: FabricDataOutput) : FabricRecipeProvider(output) {
    override fun generate(exporter: RecipeExporter) {
        // 泥土
        slabSynthesis(exporter, "dirt_slab", ModBlock.DIRT_SLAB, Blocks.DIRT, Items.DIRT)
        stairsSynthesis(exporter, "dirt_stairs", ModBlock.DIRT_STAIRS, Blocks.DIRT, Items.DIRT)
        slabSynthesis(
            exporter,
            "crying_obsidian_slab",
            ModBlock.CRYING_OBSIDIAN_SLAB,
            Blocks.CRYING_OBSIDIAN,
            Items.CRYING_OBSIDIAN
        )
        stairsSynthesis(
            exporter,
            "crying_obsidian_stairs",
            ModBlock.CRYING_OBSIDIAN_STAIRS,
            Blocks.CRYING_OBSIDIAN,
            Items.CRYING_OBSIDIAN
        )

        slabSynthesis(exporter, "packed_ice_slab", ModBlock.PACKED_ICE_SLAB, Blocks.PACKED_ICE, Items.PACKED_ICE)
        stairsSynthesis(exporter, "packed_ice_stairs", ModBlock.PACKED_ICE_STAIRS, Blocks.PACKED_ICE, Items.PACKED_ICE)

        slabSynthesis(exporter, "blue_ice_slab", ModBlock.BLUE_ICE_SLAB, Blocks.BLUE_ICE, Items.BLUE_ICE)
        stairsSynthesis(exporter, "blue_ice_stairs", ModBlock.BLUE_ICE_STAIRS, Blocks.BLUE_ICE, Items.BLUE_ICE)

        slabSynthesis(exporter, "calcite_slab", ModBlock.CALCITE_SLAB, Blocks.CALCITE, Items.CALCITE)
        stairsSynthesis(exporter, "calcite_stairs", ModBlock.CALCITE_STAIRS, Blocks.CALCITE, Items.CALCITE)

        slabSynthesis(exporter, "tuff_slab", ModBlock.TUFF_SLAB, Blocks.TUFF, Items.TUFF)
        stairsSynthesis(exporter, "tuff_stairs", ModBlock.TUFF_STAIRS, Blocks.TUFF, Items.TUFF)

        slabSynthesis(exporter, "obsidian_slab", ModBlock.OBSIDIAN_SLAB, Blocks.OBSIDIAN, Items.OBSIDIAN)
        stairsSynthesis(exporter, "obsidian_stairs", ModBlock.OBSIDIAN_STAIRS, Blocks.OBSIDIAN, Items.OBSIDIAN)

        slabSynthesis(exporter, "end_stone_slab", ModBlock.END_STONE_SLAB, Blocks.END_STONE, Items.END_STONE)
        stairsSynthesis(exporter, "end_stone_stairs", ModBlock.END_STONE_STAIRS, Blocks.END_STONE, Items.END_STONE)

        slabSynthesis(exporter, "white_wool_slab", ModBlock.WHITE_WOOL_SLAB, Blocks.WHITE_WOOL, Items.WHITE_WOOL)
        stairsSynthesis(exporter, "white_wool_stairs", ModBlock.WHITE_WOOL_STAIRS, Blocks.WHITE_WOOL, Items.WHITE_WOOL)

        slabSynthesis(exporter, "glass_slab", ModBlock.GLASS_SLAB, Blocks.GLASS, Items.GLASS)
        slabSynthesis(exporter, "white_glass_stairs", ModBlock.WHITE_GLASS_SLAB, Blocks.WHITE_STAINED_GLASS, Items.WHITE_STAINED_GLASS)
        slabSynthesis(exporter, "orange_glass_stairs", ModBlock.ORANGE_GLASS_SLAB, Blocks.ORANGE_STAINED_GLASS, Items.ORANGE_STAINED_GLASS)
        slabSynthesis(exporter, "magenta_glass_stairs", ModBlock.MAGENTA_GLASS_SLAB, Blocks.MAGENTA_STAINED_GLASS, Items.MAGENTA_STAINED_GLASS)
        slabSynthesis(exporter, "light_blue_glass_stairs", ModBlock.LIGHT_BLUE_GLASS_SLAB, Blocks.LIGHT_BLUE_STAINED_GLASS, Items.LIGHT_BLUE_STAINED_GLASS)
        slabSynthesis(exporter, "yellow_glass_stairs", ModBlock.YELLOW_GLASS_SLAB, Blocks.YELLOW_STAINED_GLASS, Items.YELLOW_STAINED_GLASS)
        slabSynthesis(exporter, "lime_glass_stairs", ModBlock.LIME_GLASS_SLAB, Blocks.LIME_STAINED_GLASS, Items.LIME_STAINED_GLASS)
        slabSynthesis(exporter, "pink_glass_stairs", ModBlock.PINK_GLASS_SLAB, Blocks.PINK_STAINED_GLASS, Items.PINK_STAINED_GLASS)
        slabSynthesis(exporter, "gray_glass_stairs", ModBlock.GRAY_GLASS_SLAB, Blocks.GRAY_STAINED_GLASS, Items.GRAY_STAINED_GLASS)
        slabSynthesis(exporter, "light_gray_glass_stairs", ModBlock.LIGHT_GRAY_GLASS_SLAB, Blocks.LIGHT_GRAY_STAINED_GLASS, Items.LIGHT_GRAY_STAINED_GLASS)
        slabSynthesis(exporter, "cyan_glass_stairs", ModBlock.CYAN_GLASS_SLAB, Blocks.CYAN_STAINED_GLASS, Items.CYAN_STAINED_GLASS)
        slabSynthesis(exporter, "purple_glass_stairs", ModBlock.PURPLE_GLASS_SLAB, Blocks.PURPLE_STAINED_GLASS, Items.PURPLE_STAINED_GLASS)
        slabSynthesis(exporter, "blue_glass_stairs", ModBlock.BLUE_GLASS_SLAB, Blocks.BLUE_STAINED_GLASS, Items.BLUE_STAINED_GLASS)
        slabSynthesis(exporter, "brown_glass_stairs", ModBlock.BROWN_GLASS_SLAB, Blocks.BROWN_STAINED_GLASS, Items.BROWN_STAINED_GLASS)
        slabSynthesis(exporter, "green_glass_stairs", ModBlock.GREEN_GLASS_SLAB, Blocks.GREEN_STAINED_GLASS, Items.GREEN_STAINED_GLASS)
        slabSynthesis(exporter, "red_glass_stairs", ModBlock.RED_GLASS_SLAB, Blocks.RED_STAINED_GLASS, Items.RED_STAINED_GLASS)
        slabSynthesis(exporter, "black_glass_stairs", ModBlock.BLACK_GLASS_SLAB, Blocks.BLACK_STAINED_GLASS, Items.BLACK_STAINED_GLASS)

        slabSynthesis(exporter, "terracotta_slab", ModBlock.TERRACOTTA_SLAB, Blocks.TERRACOTTA, Items.TERRACOTTA)
        stairsSynthesis(exporter, "terracotta_stairs", ModBlock.TERRACOTTA_STAIRS, Blocks.TERRACOTTA, Items.TERRACOTTA)

        slabSynthesis(exporter, "white_terracotta_slab", ModBlock.WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA, Items.WHITE_TERRACOTTA)
        stairsSynthesis(exporter, "white_terracotta_stairs", ModBlock.WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA, Items.WHITE_TERRACOTTA)

        slabSynthesis(exporter, "orange_terracotta_slab", ModBlock.ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA, Items.ORANGE_TERRACOTTA)
        stairsSynthesis(exporter, "orange_terracotta_stairs", ModBlock.ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA, Items.ORANGE_TERRACOTTA)

        slabSynthesis(exporter, "pink_terracotta_slab", ModBlock.PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA, Items.PINK_TERRACOTTA)
        stairsSynthesis(exporter, "pink_terracotta_stairs", ModBlock.PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA, Items.PINK_TERRACOTTA)

        slabSynthesis(exporter, "light_blue_terracotta_slab", ModBlock.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA, Items.LIGHT_BLUE_TERRACOTTA)
        stairsSynthesis(exporter, "light_blue_terracotta_stairs", ModBlock.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA, Items.LIGHT_BLUE_TERRACOTTA)

        slabSynthesis(exporter, "yellow_terracotta_slab", ModBlock.YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA, Items.YELLOW_TERRACOTTA)
        stairsSynthesis(exporter, "yellow_terracotta_stairs", ModBlock.YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA, Items.YELLOW_TERRACOTTA)

        slabSynthesis(exporter, "lime_terracotta_slab", ModBlock.LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA, Items.LIME_TERRACOTTA)
        stairsSynthesis(exporter, "lime_terracotta_stairs", ModBlock.LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA, Items.LIME_TERRACOTTA)

        slabSynthesis(exporter, "magenta_terracotta_slab", ModBlock.MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA, Items.MAGENTA_TERRACOTTA)
        stairsSynthesis(exporter, "magenta_terracotta_stairs", ModBlock.MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA, Items.MAGENTA_TERRACOTTA)

        slabSynthesis(exporter, "purple_terracotta_slab", ModBlock.PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA, Items.PURPLE_TERRACOTTA)
        stairsSynthesis(exporter, "purple_terracotta_stairs", ModBlock.PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA, Items.PURPLE_TERRACOTTA)

        slabSynthesis(exporter, "cyan_terracotta_slab", ModBlock.CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA, Items.CYAN_TERRACOTTA)
        stairsSynthesis(exporter, "cyan_terracotta_stairs", ModBlock.CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA, Items.CYAN_TERRACOTTA)

        slabSynthesis(exporter, "blue_terracotta_slab", ModBlock.BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA, Items.BLUE_TERRACOTTA)
        stairsSynthesis(exporter, "blue_terracotta_stairs", ModBlock.BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA, Items.BLUE_TERRACOTTA)

        slabSynthesis(exporter, "brown_terracotta_slab", ModBlock.BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA, Items.BROWN_TERRACOTTA)
        stairsSynthesis(exporter, "brown_terracotta_stairs", ModBlock.BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA, Items.BROWN_TERRACOTTA)

        slabSynthesis(exporter, "green_terracotta_slab", ModBlock.GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA, Items.GREEN_TERRACOTTA)
        stairsSynthesis(exporter, "green_terracotta_stairs", ModBlock.GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA, Items.GREEN_TERRACOTTA)

        slabSynthesis(exporter, "red_terracotta_slab", ModBlock.RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA, Items.RED_TERRACOTTA)
        stairsSynthesis(exporter, "red_terracotta_stairs", ModBlock.RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA, Items.RED_TERRACOTTA)

        slabSynthesis(exporter, "black_terracotta_slab", ModBlock.BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA, Items.BLACK_TERRACOTTA)
        stairsSynthesis(exporter, "black_terracotta_stairs", ModBlock.BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA, Items.BLACK_TERRACOTTA)

        slabSynthesis(exporter, "honeycomb_block_slab", ModBlock.HONEYCOMB_BLOCK_SLAB, Blocks.HONEYCOMB_BLOCK, Items.HONEYCOMB_BLOCK)
        stairsSynthesis(exporter, "honeycomb_block_stairs", ModBlock.HONEYCOMB_BLOCK_STAIRS, Blocks.HONEYCOMB_BLOCK, Items.HONEYCOMB_BLOCK)

        slabSynthesis(exporter, "amethyst_block_slab", ModBlock.AMETHYST_BLOCK_SLAB, Blocks.AMETHYST_BLOCK, Items.AMETHYST_BLOCK)
        stairsSynthesis(exporter, "amethyst_block_stairs", ModBlock.AMETHYST_BLOCK_STAIRS, Blocks.AMETHYST_BLOCK, Items.AMETHYST_BLOCK)

        slabSynthesis(exporter, "glowstone_slab", ModBlock.GLOWSTONE_SLAB, Blocks.GLOWSTONE, Items.GLOWSTONE)
        stairsSynthesis(exporter, "glowstone_stairs", ModBlock.GLOWSTONE_STAIRS, Blocks.GLOWSTONE, Items.GLOWSTONE)
    }

    private fun stairsSynthesis(
        exporter: RecipeExporter,
        name: String,
        result: Block,
        blockMaterials: Block,
        itemMaterials: Item
    ) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, result, 4)
            .pattern("#  ")
            .pattern("## ")
            .pattern("###")
            .input('#', itemMaterials)
            .criterion(hasItem(blockMaterials), conditionsFromItem(blockMaterials))
            .offerTo(exporter, Identifier(DiverseBlocks.MOD_ID, name))
    }


    private fun slabSynthesis(
        exporter: RecipeExporter,
        name: String,
        result: Block,
        blockMaterials: Block,
        itemMaterialstem: Item
    ) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, result, 6)
            .pattern("###")
            .input('#', itemMaterialstem)
            .criterion(hasItem(blockMaterials), conditionsFromItem(blockMaterials))
            .offerTo(exporter, Identifier(DiverseBlocks.MOD_ID, name))
    }
}