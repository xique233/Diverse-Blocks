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

        /*
        * 杂项类型合成表
        *
        * */
        slabSynthesis(exporter, "dirt_slab", ModBlock.DIRT_SLAB, Blocks.DIRT, Items.DIRT)
        stairsSynthesis(exporter, "dirt_stairs", ModBlock.DIRT_STAIRS, Blocks.DIRT, Items.DIRT)
        wallSynthesis(exporter, "dirt_wall", ModBlock.DIRT_WALL, Blocks.DIRT, Items.DIRT)

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
        wallSynthesis(
            exporter,
            "crying_obsidian_wall",
            ModBlock.CRYING_OBSIDIAN_WALL,
            Blocks.CRYING_OBSIDIAN,
            Items.CRYING_OBSIDIAN
        )

        slabSynthesis(exporter, "packed_ice_slab", ModBlock.PACKED_ICE_SLAB, Blocks.PACKED_ICE, Items.PACKED_ICE)
        stairsSynthesis(exporter, "packed_ice_stairs", ModBlock.PACKED_ICE_STAIRS, Blocks.PACKED_ICE, Items.PACKED_ICE)
        wallSynthesis(exporter, "packed_ice_wall", ModBlock.PACKED_ICE_WALL, Blocks.PACKED_ICE, Items.PACKED_ICE)

        slabSynthesis(exporter, "blue_ice_slab", ModBlock.BLUE_ICE_SLAB, Blocks.BLUE_ICE, Items.BLUE_ICE)
        stairsSynthesis(exporter, "blue_ice_stairs", ModBlock.BLUE_ICE_STAIRS, Blocks.BLUE_ICE, Items.BLUE_ICE)
        wallSynthesis(exporter, "blue_ice_wall", ModBlock.BLUE_ICE_WALL, Blocks.BLUE_ICE, Items.BLUE_ICE)

        slabSynthesis(exporter, "calcite_slab", ModBlock.CALCITE_SLAB, Blocks.CALCITE, Items.CALCITE)
        stairsSynthesis(exporter, "calcite_stairs", ModBlock.CALCITE_STAIRS, Blocks.CALCITE, Items.CALCITE)
        wallSynthesis(exporter, "calcite_wall", ModBlock.CALCITE_WALL, Blocks.CALCITE, Items.CALCITE)

        slabSynthesis(exporter, "tuff_slab", ModBlock.TUFF_SLAB, Blocks.TUFF, Items.TUFF)
        stairsSynthesis(exporter, "tuff_stairs", ModBlock.TUFF_STAIRS, Blocks.TUFF, Items.TUFF)
        wallSynthesis(exporter, "tuff_wall", ModBlock.TUFF_WALL, Blocks.TUFF, Items.TUFF)

        slabSynthesis(exporter, "obsidian_slab", ModBlock.OBSIDIAN_SLAB, Blocks.OBSIDIAN, Items.OBSIDIAN)
        stairsSynthesis(exporter, "obsidian_stairs", ModBlock.OBSIDIAN_STAIRS, Blocks.OBSIDIAN, Items.OBSIDIAN)
        wallSynthesis(exporter, "obsidian_wall", ModBlock.OBSIDIAN_WALL, Blocks.OBSIDIAN, Items.OBSIDIAN)

        slabSynthesis(exporter, "end_stone_slab", ModBlock.END_STONE_SLAB, Blocks.END_STONE, Items.END_STONE)
        stairsSynthesis(exporter, "end_stone_stairs", ModBlock.END_STONE_STAIRS, Blocks.END_STONE, Items.END_STONE)
        wallSynthesis(exporter, "end_stone_wall", ModBlock.END_STONE_WALL, Blocks.END_STONE, Items.END_STONE)

        /*
        * 羊毛类型合成表
        *
        * */
        slabSynthesis(exporter, "white_wool_slab", ModBlock.WHITE_WOOL_SLAB, Blocks.WHITE_WOOL, Items.WHITE_WOOL)
        stairsSynthesis(exporter, "white_wool_stairs", ModBlock.WHITE_WOOL_STAIRS, Blocks.WHITE_WOOL, Items.WHITE_WOOL)
        wallSynthesis(exporter, "white_wool_wall", ModBlock.WHITE_WOOL_WALL, Blocks.WHITE_WOOL, Items.WHITE_WOOL)

        slabSynthesis(exporter, "yellow_wool_slab", ModBlock.YELLOW_WOOL_SLAB, Blocks.YELLOW_WOOL, Items.YELLOW_WOOL)
        stairsSynthesis(exporter, "yellow_wool_stairs", ModBlock.YELLOW_WOOL_STAIRS, Blocks.YELLOW_WOOL, Items.YELLOW_WOOL)
        wallSynthesis(exporter, "yellow_wool_wall", ModBlock.YELLOW_WOOL_WALL, Blocks.YELLOW_WOOL, Items.YELLOW_WOOL)

        slabSynthesis(exporter, "lime_wool_slab", ModBlock.LIME_WOOL_SLAB, Blocks.LIME_WOOL, Items.LIME_WOOL)
        stairsSynthesis(exporter, "lime_wool_stairs", ModBlock.LIME_WOOL_STAIRS, Blocks.LIME_WOOL, Items.LIME_WOOL)
        wallSynthesis(exporter, "lime_wool_wall", ModBlock.LIME_WOOL_WALL, Blocks.LIME_WOOL, Items.LIME_WOOL)

        slabSynthesis(exporter, "pink_wool_slab", ModBlock.PINK_WOOL_SLAB, Blocks.PINK_WOOL, Items.PINK_WOOL)
        stairsSynthesis(exporter, "pink_wool_stairs", ModBlock.PINK_WOOL_STAIRS, Blocks.PINK_WOOL, Items.PINK_WOOL)
        wallSynthesis(exporter, "pink_wool_wall", ModBlock.PINK_WOOL_WALL, Blocks.PINK_WOOL, Items.PINK_WOOL)

        slabSynthesis(exporter, "gray_wool_slab", ModBlock.GRAY_WOOL_SLAB, Blocks.GRAY_WOOL, Items.GRAY_WOOL)
        stairsSynthesis(exporter, "gray_wool_stairs", ModBlock.GRAY_WOOL_STAIRS, Blocks.GRAY_WOOL, Items.GRAY_WOOL)
        wallSynthesis(exporter, "gray_wool_wall", ModBlock.GRAY_WOOL_WALL, Blocks.GRAY_WOOL, Items.GRAY_WOOL)

        slabSynthesis(exporter, "orange_wool_slab", ModBlock.ORANGE_WOOL_SLAB, Blocks.ORANGE_WOOL, Items.ORANGE_WOOL)
        stairsSynthesis(exporter, "orange_wool_stairs", ModBlock.ORANGE_WOOL_STAIRS, Blocks.ORANGE_WOOL, Items.ORANGE_WOOL)
        wallSynthesis(exporter, "orange_wool_wall", ModBlock.ORANGE_WOOL_WALL, Blocks.ORANGE_WOOL, Items.ORANGE_WOOL)

        slabSynthesis(exporter, "magenta_wool_slab", ModBlock.MAGENTA_WOOL_SLAB, Blocks.MAGENTA_WOOL, Items.MAGENTA_WOOL)
        stairsSynthesis(exporter, "magenta_wool_stairs", ModBlock.MAGENTA_WOOL_STAIRS, Blocks.MAGENTA_WOOL, Items.MAGENTA_WOOL)
        wallSynthesis(
            exporter,
            "magenta_wool_wall",
            ModBlock.MAGENTA_WOOL_WALL,
            Blocks.MAGENTA_WOOL,
            Items.MAGENTA_WOOL
        )

        slabSynthesis(exporter, "light_blue_wool_slab", ModBlock.LIGHT_BLUE_WOOL_SLAB, Blocks.LIGHT_BLUE_WOOL, Items.LIGHT_BLUE_WOOL)
        stairsSynthesis(exporter, "light_blue_wool_stairs", ModBlock.LIGHT_BLUE_WOOL_STAIRS, Blocks.LIGHT_BLUE_WOOL, Items.LIGHT_BLUE_WOOL)
        wallSynthesis(
            exporter,
            "light_blue_wool_wall",
            ModBlock.LIGHT_BLUE_WOOL_WALL,
            Blocks.LIGHT_BLUE_WOOL,
            Items.LIGHT_BLUE_WOOL
        )

        slabSynthesis(exporter, "cyan_wool_slab", ModBlock.CYAN_WOOL_SLAB, Blocks.CYAN_WOOL, Items.CYAN_WOOL)
        stairsSynthesis(exporter, "cyan_wool_stairs", ModBlock.CYAN_WOOL_STAIRS, Blocks.CYAN_WOOL, Items.CYAN_WOOL)
        wallSynthesis(exporter, "cyan_wool_wall", ModBlock.CYAN_WOOL_WALL, Blocks.CYAN_WOOL, Items.CYAN_WOOL)

        slabSynthesis(exporter, "purple_wool_slab", ModBlock.PURPLE_WOOL_SLAB, Blocks.PURPLE_WOOL, Items.PURPLE_WOOL)
        stairsSynthesis(exporter, "purple_wool_stairs", ModBlock.PURPLE_WOOL_STAIRS, Blocks.PURPLE_WOOL, Items.PURPLE_WOOL)
        wallSynthesis(exporter, "purple_wool_wall", ModBlock.PURPLE_WOOL_WALL, Blocks.PURPLE_WOOL, Items.PURPLE_WOOL)

        slabSynthesis(exporter, "blue_wool_slab", ModBlock.BLUE_WOOL_SLAB, Blocks.BLUE_WOOL, Items.BLUE_WOOL)
        stairsSynthesis(exporter, "blue_wool_stairs", ModBlock.BLUE_WOOL_STAIRS, Blocks.BLUE_WOOL, Items.BLUE_WOOL)
        wallSynthesis(exporter, "blue_wool_wall", ModBlock.BLUE_WOOL_WALL, Blocks.BLUE_WOOL, Items.BLUE_WOOL)

        slabSynthesis(exporter, "brown_wool_slab", ModBlock.BROWN_WOOL_SLAB, Blocks.BROWN_WOOL, Items.BROWN_WOOL)
        stairsSynthesis(exporter, "brown_wool_stairs", ModBlock.BROWN_WOOL_STAIRS, Blocks.BROWN_WOOL, Items.BROWN_WOOL)
        wallSynthesis(exporter, "brown_wool_wall", ModBlock.BROWN_WOOL_WALL, Blocks.BROWN_WOOL, Items.BROWN_WOOL)

        slabSynthesis(exporter, "green_wool_slab", ModBlock.GREEN_WOOL_SLAB, Blocks.GREEN_WOOL, Items.GREEN_WOOL)
        stairsSynthesis(exporter, "green_wool_stairs", ModBlock.GREEN_WOOL_STAIRS, Blocks.GREEN_WOOL, Items.GREEN_WOOL)
        wallSynthesis(exporter, "green_wool_wall", ModBlock.GREEN_WOOL_WALL, Blocks.GREEN_WOOL, Items.GREEN_WOOL)

        slabSynthesis(exporter, "red_wool_slab", ModBlock.RED_WOOL_SLAB, Blocks.RED_WOOL, Items.RED_WOOL)
        stairsSynthesis(exporter, "red_wool_stairs", ModBlock.RED_WOOL_STAIRS, Blocks.RED_WOOL, Items.RED_WOOL)
        wallSynthesis(exporter, "red_wool_wall", ModBlock.RED_WOOL_WALL, Blocks.RED_WOOL, Items.RED_WOOL)

        slabSynthesis(exporter, "black_wool_slab", ModBlock.BLACK_WOOL_SLAB, Blocks.BLACK_WOOL, Items.BLACK_WOOL)
        stairsSynthesis(exporter, "black_wool_stairs", ModBlock.BLACK_WOOL_STAIRS, Blocks.BLACK_WOOL, Items.BLACK_WOOL)
        wallSynthesis(exporter, "black_wool_wall", ModBlock.BLACK_WOOL_WALL, Blocks.BLACK_WOOL, Items.BLACK_WOOL)


        /*
        * 玻璃类型合成表
        *
        * */
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
        wallSynthesis(exporter, "terracotta_wall", ModBlock.TERRACOTTA_WALL, Blocks.TERRACOTTA, Items.TERRACOTTA)

        /*
        * 陶瓦类型合成表
        *
        * */

        slabSynthesis(exporter, "white_terracotta_slab", ModBlock.WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA, Items.WHITE_TERRACOTTA)
        stairsSynthesis(exporter, "white_terracotta_stairs", ModBlock.WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA, Items.WHITE_TERRACOTTA)
        wallSynthesis(
            exporter,
            "white_terracotta_wall",
            ModBlock.WHITE_TERRACOTTA_WALL,
            Blocks.WHITE_TERRACOTTA,
            Items.WHITE_TERRACOTTA
        )

        slabSynthesis(exporter, "orange_terracotta_slab", ModBlock.ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA, Items.ORANGE_TERRACOTTA)
        stairsSynthesis(exporter, "orange_terracotta_stairs", ModBlock.ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA, Items.ORANGE_TERRACOTTA)
        wallSynthesis(
            exporter,
            "orange_terracotta_wall",
            ModBlock.ORANGE_TERRACOTTA_WALL,
            Blocks.ORANGE_TERRACOTTA,
            Items.ORANGE_TERRACOTTA
        )

        slabSynthesis(exporter, "pink_terracotta_slab", ModBlock.PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA, Items.PINK_TERRACOTTA)
        stairsSynthesis(exporter, "pink_terracotta_stairs", ModBlock.PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA, Items.PINK_TERRACOTTA)
        wallSynthesis(
            exporter,
            "pink_terracotta_wall",
            ModBlock.PINK_TERRACOTTA_WALL,
            Blocks.PINK_TERRACOTTA,
            Items.PINK_TERRACOTTA
        )

        slabSynthesis(exporter, "light_blue_terracotta_slab", ModBlock.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA, Items.LIGHT_BLUE_TERRACOTTA)
        stairsSynthesis(exporter, "light_blue_terracotta_stairs", ModBlock.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA, Items.LIGHT_BLUE_TERRACOTTA)
        wallSynthesis(
            exporter,
            "light_blue_terracotta_wall",
            ModBlock.LIGHT_BLUE_TERRACOTTA_WALL,
            Blocks.LIGHT_BLUE_TERRACOTTA,
            Items.LIGHT_BLUE_TERRACOTTA
        )

        slabSynthesis(exporter, "yellow_terracotta_slab", ModBlock.YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA, Items.YELLOW_TERRACOTTA)
        stairsSynthesis(exporter, "yellow_terracotta_stairs", ModBlock.YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA, Items.YELLOW_TERRACOTTA)
        wallSynthesis(
            exporter,
            "yellow_terracotta_wall",
            ModBlock.YELLOW_TERRACOTTA_WALL,
            Blocks.YELLOW_TERRACOTTA,
            Items.YELLOW_TERRACOTTA
        )

        slabSynthesis(exporter, "lime_terracotta_slab", ModBlock.LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA, Items.LIME_TERRACOTTA)
        stairsSynthesis(exporter, "lime_terracotta_stairs", ModBlock.LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA, Items.LIME_TERRACOTTA)
        wallSynthesis(
            exporter,
            "lime_terracotta_wall",
            ModBlock.LIME_TERRACOTTA_WALL,
            Blocks.LIME_TERRACOTTA,
            Items.LIME_TERRACOTTA
        )

        slabSynthesis(exporter, "magenta_terracotta_slab", ModBlock.MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA, Items.MAGENTA_TERRACOTTA)
        stairsSynthesis(exporter, "magenta_terracotta_stairs", ModBlock.MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA, Items.MAGENTA_TERRACOTTA)
        wallSynthesis(
            exporter,
            "magenta_terracotta_wall",
            ModBlock.MAGENTA_TERRACOTTA_WALL,
            Blocks.MAGENTA_TERRACOTTA,
            Items.MAGENTA_TERRACOTTA
        )

        slabSynthesis(exporter, "purple_terracotta_slab", ModBlock.PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA, Items.PURPLE_TERRACOTTA)
        stairsSynthesis(exporter, "purple_terracotta_stairs", ModBlock.PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA, Items.PURPLE_TERRACOTTA)
        wallSynthesis(
            exporter,
            "purple_terracotta_wall",
            ModBlock.PURPLE_TERRACOTTA_WALL,
            Blocks.PURPLE_TERRACOTTA,
            Items.PURPLE_TERRACOTTA
        )

        slabSynthesis(exporter, "cyan_terracotta_slab", ModBlock.CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA, Items.CYAN_TERRACOTTA)
        stairsSynthesis(exporter, "cyan_terracotta_stairs", ModBlock.CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA, Items.CYAN_TERRACOTTA)
        wallSynthesis(
            exporter,
            "cyan_terracotta_wall",
            ModBlock.CYAN_TERRACOTTA_WALL,
            Blocks.CYAN_TERRACOTTA,
            Items.CYAN_TERRACOTTA
        )

        slabSynthesis(exporter, "blue_terracotta_slab", ModBlock.BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA, Items.BLUE_TERRACOTTA)
        stairsSynthesis(exporter, "blue_terracotta_stairs", ModBlock.BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA, Items.BLUE_TERRACOTTA)
        wallSynthesis(
            exporter,
            "blue_terracotta_wall",
            ModBlock.BLUE_TERRACOTTA_WALL,
            Blocks.BLUE_TERRACOTTA,
            Items.BLUE_TERRACOTTA
        )

        slabSynthesis(exporter, "brown_terracotta_slab", ModBlock.BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA, Items.BROWN_TERRACOTTA)
        stairsSynthesis(exporter, "brown_terracotta_stairs", ModBlock.BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA, Items.BROWN_TERRACOTTA)
        wallSynthesis(
            exporter,
            "brown_terracotta_wall",
            ModBlock.BROWN_TERRACOTTA_WALL,
            Blocks.BROWN_TERRACOTTA,
            Items.BROWN_TERRACOTTA
        )

        slabSynthesis(exporter, "green_terracotta_slab", ModBlock.GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA, Items.GREEN_TERRACOTTA)
        stairsSynthesis(exporter, "green_terracotta_stairs", ModBlock.GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA, Items.GREEN_TERRACOTTA)
        wallSynthesis(
            exporter,
            "green_terracotta_wall",
            ModBlock.GREEN_TERRACOTTA_WALL,
            Blocks.GREEN_TERRACOTTA,
            Items.GREEN_TERRACOTTA
        )

        slabSynthesis(exporter, "red_terracotta_slab", ModBlock.RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA, Items.RED_TERRACOTTA)
        stairsSynthesis(exporter, "red_terracotta_stairs", ModBlock.RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA, Items.RED_TERRACOTTA)
        wallSynthesis(
            exporter,
            "red_terracotta_wall",
            ModBlock.RED_TERRACOTTA_WALL,
            Blocks.RED_TERRACOTTA,
            Items.RED_TERRACOTTA
        )

        slabSynthesis(exporter, "black_terracotta_slab", ModBlock.BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA, Items.BLACK_TERRACOTTA)
        stairsSynthesis(exporter, "black_terracotta_stairs", ModBlock.BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA, Items.BLACK_TERRACOTTA)
        wallSynthesis(
            exporter,
            "black_terracotta_wall",
            ModBlock.BLACK_TERRACOTTA_WALL,
            Blocks.BLACK_TERRACOTTA,
            Items.BLACK_TERRACOTTA
        )

        slabSynthesis(exporter, "honeycomb_block_slab", ModBlock.HONEYCOMB_BLOCK_SLAB, Blocks.HONEYCOMB_BLOCK, Items.HONEYCOMB_BLOCK)
        stairsSynthesis(exporter, "honeycomb_block_stairs", ModBlock.HONEYCOMB_BLOCK_STAIRS, Blocks.HONEYCOMB_BLOCK, Items.HONEYCOMB_BLOCK)
        wallSynthesis(
            exporter,
            "honeycomb_block_wall",
            ModBlock.HONEYCOMB_BLOCK_WALL,
            Blocks.HONEYCOMB_BLOCK,
            Items.HONEYCOMB_BLOCK
        )

        slabSynthesis(exporter, "amethyst_block_slab", ModBlock.AMETHYST_BLOCK_SLAB, Blocks.AMETHYST_BLOCK, Items.AMETHYST_BLOCK)
        stairsSynthesis(exporter, "amethyst_block_stairs", ModBlock.AMETHYST_BLOCK_STAIRS, Blocks.AMETHYST_BLOCK, Items.AMETHYST_BLOCK)
        wallSynthesis(
            exporter,
            "amethyst_block_wall",
            ModBlock.AMETHYST_BLOCK_WALL,
            Blocks.AMETHYST_BLOCK,
            Items.AMETHYST_BLOCK
        )

        slabSynthesis(exporter, "glowstone_slab", ModBlock.GLOWSTONE_SLAB, Blocks.GLOWSTONE, Items.GLOWSTONE)
        stairsSynthesis(exporter, "glowstone_stairs", ModBlock.GLOWSTONE_STAIRS, Blocks.GLOWSTONE, Items.GLOWSTONE)
        wallSynthesis(exporter, "glowstone_wall", ModBlock.GLOWSTONE_WALL, Blocks.GLOWSTONE, Items.GLOWSTONE)

        wallSynthesis(
            exporter,
            "smooth_quartz_stairs_wall",
            ModBlock.SMOOTH_QUARTZ_WALL,
            Blocks.SMOOTH_QUARTZ,
            Items.SMOOTH_QUARTZ
        )
        wallSynthesis(
            exporter,
            "prismarine_bricks_wall",
            ModBlock.PRISMARINE_BRICKS_WALL,
            Blocks.PRISMARINE_BRICKS,
            Items.PRISMARINE_BRICKS
        )
        wallSynthesis(
            exporter,
            "purpur_block_wall",
            ModBlock.PURPUR_BLOCK_WALL,
            Blocks.PURPUR_BLOCK,
            Items.PURPUR_BLOCK
        )
        wallSynthesis(
            exporter,
            "dark_prismarine_wall",
            ModBlock.DARK_PRISMARINE_WALL,
            Blocks.DARK_PRISMARINE,
            Items.DARK_PRISMARINE
        )
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
    private fun wallSynthesis(
        exporter: RecipeExporter,
        name: String,
        result: Block,
        blockMaterials: Block,
        itemMaterials: Item
    ) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, result, 6)
            .pattern("###")
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