package magpies.life.datagen

import magpies.life.registry.ModBlock
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.block.Blocks
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator

class ModModelsProvider(output: FabricDataOutput?) : FabricModelProvider(output) {
    override fun generateBlockStateModels(blockStateModelGenerator: BlockStateModelGenerator?) {
        /*
        * 杂项类型模型
        *
        * */
        val dirt = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.DIRT)
        dirt?.slab(ModBlock.DIRT_SLAB)
        dirt?.stairs(ModBlock.DIRT_STAIRS)
        dirt?.wall(ModBlock.DIRT_WALL)

        val cryingObsidian = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.CRYING_OBSIDIAN)
        cryingObsidian?.slab(ModBlock.CRYING_OBSIDIAN_SLAB)
        cryingObsidian?.stairs(ModBlock.CRYING_OBSIDIAN_STAIRS)
        cryingObsidian?.wall(ModBlock.CRYING_OBSIDIAN_WALL)

        val packedIce = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.PACKED_ICE)
        packedIce?.slab(ModBlock.PACKED_ICE_SLAB)
        packedIce?.stairs(ModBlock.PACKED_ICE_STAIRS)
        packedIce?.wall(ModBlock.PACKED_ICE_WALL)

        val blueIce = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.BLUE_ICE)
        blueIce?.slab(ModBlock.BLUE_ICE_SLAB)
        blueIce?.stairs(ModBlock.BLUE_ICE_STAIRS)
        blueIce?.wall(ModBlock.BLUE_ICE_WALL)

        val calcite = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.CALCITE)
        calcite?.slab(ModBlock.CALCITE_SLAB)
        calcite?.stairs(ModBlock.CALCITE_STAIRS)
        calcite?.wall(ModBlock.CALCITE_WALL)

        val tuff = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.TUFF)
        tuff?.slab(ModBlock.TUFF_SLAB)
        tuff?.stairs(ModBlock.TUFF_STAIRS)
        tuff?.wall(ModBlock.TUFF_WALL)

        val obsidian = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.OBSIDIAN)
        obsidian?.slab(ModBlock.OBSIDIAN_SLAB)
        obsidian?.stairs(ModBlock.OBSIDIAN_STAIRS)
        obsidian?.wall(ModBlock.OBSIDIAN_WALL)

        val endStone = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.END_STONE)
        endStone?.slab(ModBlock.END_STONE_SLAB)
        endStone?.stairs(ModBlock.END_STONE_STAIRS)
        endStone?.wall(ModBlock.END_STONE_WALL)


        /*
        * 羊毛类型模型
        *
        * */
        val whiteWool = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.WHITE_WOOL)
        whiteWool?.slab(ModBlock.WHITE_WOOL_SLAB)
        whiteWool?.stairs(ModBlock.WHITE_WOOL_STAIRS)
        whiteWool?.wall(ModBlock.WHITE_WOOL_WALL)

        val orangeWool = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.ORANGE_WOOL)
        orangeWool?.slab(ModBlock.ORANGE_WOOL_SLAB)
        orangeWool?.stairs(ModBlock.ORANGE_WOOL_STAIRS)
        orangeWool?.wall(ModBlock.ORANGE_WOOL_WALL)

        val magentaWool = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.MAGENTA_WOOL)
        magentaWool?.slab(ModBlock.MAGENTA_WOOL_SLAB)
        magentaWool?.stairs(ModBlock.MAGENTA_WOOL_STAIRS)
        magentaWool?.wall(ModBlock.MAGENTA_WOOL_WALL)

        val lightBlueWool = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_WOOL)
        lightBlueWool?.slab(ModBlock.LIGHT_BLUE_WOOL_SLAB)
        lightBlueWool?.stairs(ModBlock.LIGHT_BLUE_WOOL_STAIRS)
        lightBlueWool?.wall(ModBlock.LIGHT_BLUE_WOOL_WALL)

        val yellowWool = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.YELLOW_WOOL)
        yellowWool?.slab(ModBlock.YELLOW_WOOL_SLAB)
        yellowWool?.stairs(ModBlock.YELLOW_WOOL_STAIRS)
        yellowWool?.wall(ModBlock.YELLOW_WOOL_WALL)

        val limeWool = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.LIME_WOOL)
        limeWool?.slab(ModBlock.LIME_WOOL_SLAB)
        limeWool?.stairs(ModBlock.LIME_WOOL_STAIRS)
        limeWool?.wall(ModBlock.LIME_WOOL_WALL)

        val pinkWool = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.PINK_WOOL)
        pinkWool?.slab(ModBlock.PINK_WOOL_SLAB)
        pinkWool?.stairs(ModBlock.PINK_WOOL_STAIRS)
        pinkWool?.wall(ModBlock.PINK_WOOL_WALL)

        val grayWool = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.GRAY_WOOL)
        grayWool?.slab(ModBlock.GRAY_WOOL_SLAB)
        grayWool?.stairs(ModBlock.GRAY_WOOL_STAIRS)
        grayWool?.wall(ModBlock.GRAY_WOOL_WALL)

        val lightGrayWool = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_WOOL)
        lightGrayWool?.slab(ModBlock.LIGHT_GRAY_WOOL_SLAB)
        lightGrayWool?.stairs(ModBlock.LIGHT_GRAY_WOOL_STAIRS)
        lightGrayWool?.wall(ModBlock.LIGHT_GRAY_WOOL_WALL)

        val cyanWool = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.CYAN_WOOL)
        cyanWool?.slab(ModBlock.CYAN_WOOL_SLAB)
        cyanWool?.stairs(ModBlock.CYAN_WOOL_STAIRS)
        cyanWool?.wall(ModBlock.CYAN_WOOL_WALL)

        val purpleWool = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.PURPLE_WOOL)
        purpleWool?.slab(ModBlock.PURPLE_WOOL_SLAB)
        purpleWool?.stairs(ModBlock.PURPLE_WOOL_STAIRS)
        purpleWool?.wall(ModBlock.PURPLE_WOOL_WALL)

        val blueWool = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.BLUE_WOOL)
        blueWool?.slab(ModBlock.BLUE_WOOL_SLAB)
        blueWool?.stairs(ModBlock.BLUE_WOOL_STAIRS)
        blueWool?.wall(ModBlock.BLUE_WOOL_WALL)

        val brownWool = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.BROWN_WOOL)
        brownWool?.slab(ModBlock.BROWN_WOOL_SLAB)
        brownWool?.stairs(ModBlock.BROWN_WOOL_STAIRS)
        brownWool?.wall(ModBlock.BROWN_WOOL_WALL)

        val greenWool = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.GREEN_WOOL)
        greenWool?.slab(ModBlock.GREEN_WOOL_SLAB)
        greenWool?.stairs(ModBlock.GREEN_WOOL_STAIRS)
        greenWool?.wall(ModBlock.GREEN_WOOL_WALL)

        val redWool = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.RED_WOOL)
        redWool?.slab(ModBlock.RED_WOOL_SLAB)
        redWool?.stairs(ModBlock.RED_WOOL_STAIRS)
        redWool?.wall(ModBlock.RED_WOOL_WALL)

        val blackWool = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.BLACK_WOOL)
        blackWool?.slab(ModBlock.BLACK_WOOL_SLAB)
        blackWool?.stairs(ModBlock.BLACK_WOOL_STAIRS)
        blackWool?.wall(ModBlock.BLACK_WOOL_WALL)

        /*
        * 玻璃类型模型
        *
        * */
        val glass = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.GLASS)
        glass?.slab(ModBlock.GLASS_SLAB)
        val whiteGlass = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.WHITE_STAINED_GLASS)
        whiteGlass?.slab(ModBlock.WHITE_GLASS_SLAB)
        val orangeGlass = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.ORANGE_STAINED_GLASS)
        orangeGlass?.slab(ModBlock.ORANGE_GLASS_SLAB)
        val magentaGlass = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.MAGENTA_STAINED_GLASS)
        magentaGlass?.slab(ModBlock.MAGENTA_GLASS_SLAB)
        val lightBlueGlass = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_STAINED_GLASS)
        lightBlueGlass?.slab(ModBlock.LIGHT_BLUE_GLASS_SLAB)
        val yellowGlass = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.YELLOW_STAINED_GLASS)
        yellowGlass?.slab(ModBlock.YELLOW_GLASS_SLAB)
        val limeGlass = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.LIME_STAINED_GLASS)
        limeGlass?.slab(ModBlock.LIME_GLASS_SLAB)
        val pinkGlass = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.PINK_STAINED_GLASS)
        pinkGlass?.slab(ModBlock.PINK_GLASS_SLAB)
        val grayGlass = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.GRAY_STAINED_GLASS)
        grayGlass?.slab(ModBlock.GRAY_GLASS_SLAB)
        val lightGrayGlass = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_STAINED_GLASS)
        lightGrayGlass?.slab(ModBlock.LIGHT_GRAY_GLASS_SLAB)
        val cyanGlass = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.CYAN_STAINED_GLASS)
        cyanGlass?.slab(ModBlock.CYAN_GLASS_SLAB)
        val purpleGlass = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.PURPLE_STAINED_GLASS)
        purpleGlass?.slab(ModBlock.PURPLE_GLASS_SLAB)
        val blueGlass = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.BLUE_STAINED_GLASS)
        blueGlass?.slab(ModBlock.BLUE_GLASS_SLAB)
        val brownGlass = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.BROWN_STAINED_GLASS)
        brownGlass?.slab(ModBlock.BROWN_GLASS_SLAB)
        val greenGlass = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.GREEN_STAINED_GLASS)
        greenGlass?.slab(ModBlock.GREEN_GLASS_SLAB)
        val redGlass = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.RED_STAINED_GLASS)
        redGlass?.slab(ModBlock.RED_GLASS_SLAB)
        val blackGlass = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.BLACK_STAINED_GLASS)
        blackGlass?.slab(ModBlock.BLACK_GLASS_SLAB)

        /*
        * 陶瓦类型模型
        *
        * */
        val terracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.TERRACOTTA)
        terracotta?.slab(ModBlock.TERRACOTTA_SLAB)
        terracotta?.stairs(ModBlock.TERRACOTTA_STAIRS)
        terracotta?.wall(ModBlock.TERRACOTTA_WALL)

        val whiteTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.WHITE_TERRACOTTA)
        whiteTerracotta?.slab(ModBlock.WHITE_TERRACOTTA_SLAB)
        whiteTerracotta?.stairs(ModBlock.WHITE_TERRACOTTA_STAIRS)
        whiteTerracotta?.wall(ModBlock.WHITE_TERRACOTTA_WALL)

        val orangeTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.ORANGE_TERRACOTTA)
        orangeTerracotta?.slab(ModBlock.ORANGE_TERRACOTTA_SLAB)
        orangeTerracotta?.stairs(ModBlock.ORANGE_TERRACOTTA_STAIRS)
        orangeTerracotta?.wall(ModBlock.ORANGE_TERRACOTTA_WALL)

        val magentaTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.MAGENTA_TERRACOTTA)
        magentaTerracotta?.slab(ModBlock.MAGENTA_TERRACOTTA_SLAB)
        magentaTerracotta?.stairs(ModBlock.MAGENTA_TERRACOTTA_STAIRS)
        magentaTerracotta?.wall(ModBlock.MAGENTA_TERRACOTTA_WALL)

        val lightBlueTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_TERRACOTTA)
        lightBlueTerracotta?.slab(ModBlock.LIGHT_BLUE_TERRACOTTA_SLAB)
        lightBlueTerracotta?.stairs(ModBlock.LIGHT_BLUE_TERRACOTTA_STAIRS)
        lightBlueTerracotta?.wall(ModBlock.LIGHT_BLUE_TERRACOTTA_WALL)

        val yellowTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.YELLOW_TERRACOTTA)
        yellowTerracotta?.slab(ModBlock.YELLOW_TERRACOTTA_SLAB)
        yellowTerracotta?.stairs(ModBlock.YELLOW_TERRACOTTA_STAIRS)
        yellowTerracotta?.wall(ModBlock.YELLOW_TERRACOTTA_WALL)

        val limeTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.LIME_TERRACOTTA)
        limeTerracotta?.slab(ModBlock.LIME_TERRACOTTA_SLAB)
        limeTerracotta?.stairs(ModBlock.LIME_TERRACOTTA_STAIRS)
        limeTerracotta?.wall(ModBlock.LIME_TERRACOTTA_WALL)

        val pinkTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.PINK_TERRACOTTA)
        pinkTerracotta?.slab(ModBlock.PINK_TERRACOTTA_SLAB)
        pinkTerracotta?.stairs(ModBlock.PINK_TERRACOTTA_STAIRS)
        pinkTerracotta?.wall(ModBlock.PINK_TERRACOTTA_WALL)

        val grayTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.GRAY_TERRACOTTA)
        grayTerracotta?.slab(ModBlock.GRAY_TERRACOTTA_SLAB)
        grayTerracotta?.stairs(ModBlock.GRAY_TERRACOTTA_STAIRS)
        grayTerracotta?.wall(ModBlock.GRAY_TERRACOTTA_WALL)

        val lightGrayTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_TERRACOTTA)
        lightGrayTerracotta?.slab(ModBlock.LIGHT_GRAY_TERRACOTTA_SLAB)
        lightGrayTerracotta?.stairs(ModBlock.LIGHT_GRAY_TERRACOTTA_STAIRS)
        lightGrayTerracotta?.wall(ModBlock.LIGHT_GRAY_TERRACOTTA_WALL)

        val cyanTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.CYAN_TERRACOTTA)
        cyanTerracotta?.slab(ModBlock.CYAN_TERRACOTTA_SLAB)
        cyanTerracotta?.stairs(ModBlock.CYAN_TERRACOTTA_STAIRS)
        cyanTerracotta?.wall(ModBlock.CYAN_TERRACOTTA_WALL)

        val purpleTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.PURPLE_TERRACOTTA)
        purpleTerracotta?.slab(ModBlock.PURPLE_TERRACOTTA_SLAB)
        purpleTerracotta?.stairs(ModBlock.PURPLE_TERRACOTTA_STAIRS)
        purpleTerracotta?.wall(ModBlock.PURPLE_TERRACOTTA_WALL)

        val blueTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.BLUE_TERRACOTTA)
        blueTerracotta?.slab(ModBlock.BLUE_TERRACOTTA_SLAB)
        blueTerracotta?.stairs(ModBlock.BLUE_TERRACOTTA_STAIRS)
        blueTerracotta?.wall(ModBlock.BLUE_TERRACOTTA_WALL)

        val brownTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.BROWN_TERRACOTTA)
        brownTerracotta?.slab(ModBlock.BROWN_TERRACOTTA_SLAB)
        brownTerracotta?.stairs(ModBlock.BROWN_TERRACOTTA_STAIRS)
        brownTerracotta?.wall(ModBlock.BROWN_TERRACOTTA_WALL)

        val greenTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.GREEN_TERRACOTTA)
        greenTerracotta?.slab(ModBlock.GREEN_TERRACOTTA_SLAB)
        greenTerracotta?.stairs(ModBlock.GREEN_TERRACOTTA_STAIRS)
        greenTerracotta?.wall(ModBlock.GREEN_TERRACOTTA_WALL)

        val redTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.RED_TERRACOTTA)
        redTerracotta?.slab(ModBlock.RED_TERRACOTTA_SLAB)
        redTerracotta?.stairs(ModBlock.RED_TERRACOTTA_STAIRS)
        redTerracotta?.wall(ModBlock.RED_TERRACOTTA_WALL)

        val blackTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.BLACK_TERRACOTTA)
        blackTerracotta?.slab(ModBlock.BLACK_TERRACOTTA_SLAB)
        blackTerracotta?.stairs(ModBlock.BLACK_TERRACOTTA_STAIRS)
        blackTerracotta?.wall(ModBlock.BLACK_TERRACOTTA_WALL)

        val honeycombBlock = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.HONEYCOMB_BLOCK)
        honeycombBlock?.slab(ModBlock.HONEYCOMB_BLOCK_SLAB)
        honeycombBlock?.stairs(ModBlock.HONEYCOMB_BLOCK_STAIRS)
        honeycombBlock?.wall(ModBlock.HONEYCOMB_BLOCK_WALL)

        val amethystBlock = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.AMETHYST_BLOCK)
        amethystBlock?.slab(ModBlock.AMETHYST_BLOCK_SLAB)
        amethystBlock?.stairs(ModBlock.AMETHYST_BLOCK_STAIRS)
        amethystBlock?.wall(ModBlock.AMETHYST_BLOCK_WALL)

        val glowstone = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.GLOWSTONE)
        glowstone?.slab(ModBlock.GLOWSTONE_SLAB)
        glowstone?.stairs(ModBlock.GLOWSTONE_STAIRS)
        glowstone?.wall(ModBlock.GLOWSTONE_WALL)


    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerator?) {
    }
}