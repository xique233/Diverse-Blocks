package magpies.life.datagen

import magpies.life.registry.ModBlock
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.block.Blocks
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator

class ModModelsProvider(output: FabricDataOutput?) : FabricModelProvider(output) {
    override fun generateBlockStateModels(blockStateModelGenerator: BlockStateModelGenerator?) {
        val dirt = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.DIRT)
        dirt?.slab(ModBlock.DIRT_SLAB)
        dirt?.stairs(ModBlock.DIRT_STAIRS)

        val cryingObsidian = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.CRYING_OBSIDIAN)
        cryingObsidian?.slab(ModBlock.CRYING_OBSIDIAN_SLAB)
        cryingObsidian?.stairs(ModBlock.CRYING_OBSIDIAN_STAIRS)

        val packedIce = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.PACKED_ICE)
        packedIce?.slab(ModBlock.PACKED_ICE_SLAB)
        packedIce?.stairs(ModBlock.PACKED_ICE_STAIRS)

        val blueIce = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.BLUE_ICE)
        blueIce?.slab(ModBlock.BLUE_ICE_SLAB)
        blueIce?.stairs(ModBlock.BLUE_ICE_STAIRS)

        val calcite = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.CALCITE)
        calcite?.slab(ModBlock.CALCITE_SLAB)
        calcite?.stairs(ModBlock.CALCITE_STAIRS)

        val tuff = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.TUFF)
        tuff?.slab(ModBlock.TUFF_SLAB)
        tuff?.stairs(ModBlock.TUFF_STAIRS)

        val obsidian = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.OBSIDIAN)
        obsidian?.slab(ModBlock.OBSIDIAN_SLAB)
        obsidian?.stairs(ModBlock.OBSIDIAN_STAIRS)
        val endStone = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.END_STONE)
        endStone?.slab(ModBlock.END_STONE_SLAB)
        endStone?.stairs(ModBlock.END_STONE_STAIRS)

        val whiteWool = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.WHITE_WOOL)
        whiteWool?.slab(ModBlock.WHITE_WOOL_SLAB)
        whiteWool?.stairs(ModBlock.WHITE_WOOL_STAIRS)

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


        val terracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.TERRACOTTA)
        terracotta?.slab(ModBlock.TERRACOTTA_SLAB)
        terracotta?.stairs(ModBlock.TERRACOTTA_STAIRS)
        val whiteTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.WHITE_TERRACOTTA)
        whiteTerracotta?.slab(ModBlock.WHITE_TERRACOTTA_SLAB)
        whiteTerracotta?.stairs(ModBlock.WHITE_TERRACOTTA_STAIRS)

        val orangeTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.ORANGE_TERRACOTTA)
        orangeTerracotta?.slab(ModBlock.ORANGE_TERRACOTTA_SLAB)
        orangeTerracotta?.stairs(ModBlock.ORANGE_TERRACOTTA_STAIRS)

        val magentaTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.MAGENTA_TERRACOTTA)
        magentaTerracotta?.slab(ModBlock.MAGENTA_TERRACOTTA_SLAB)
        magentaTerracotta?.stairs(ModBlock.MAGENTA_TERRACOTTA_STAIRS)

        val lightBlueTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_TERRACOTTA)
        lightBlueTerracotta?.slab(ModBlock.LIGHT_BLUE_TERRACOTTA_SLAB)
        lightBlueTerracotta?.stairs(ModBlock.LIGHT_BLUE_TERRACOTTA_STAIRS)

        val yellowTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.YELLOW_TERRACOTTA)
        yellowTerracotta?.slab(ModBlock.YELLOW_TERRACOTTA_SLAB)
        yellowTerracotta?.stairs(ModBlock.YELLOW_TERRACOTTA_STAIRS)

        val limeTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.LIME_TERRACOTTA)
        limeTerracotta?.slab(ModBlock.LIME_TERRACOTTA_SLAB)
        limeTerracotta?.stairs(ModBlock.LIME_TERRACOTTA_STAIRS)

        val pinkTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.PINK_TERRACOTTA)
        pinkTerracotta?.slab(ModBlock.PINK_TERRACOTTA_SLAB)
        pinkTerracotta?.stairs(ModBlock.PINK_TERRACOTTA_STAIRS)

        val grayTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.GRAY_TERRACOTTA)
        grayTerracotta?.slab(ModBlock.GRAY_TERRACOTTA_SLAB)
        grayTerracotta?.stairs(ModBlock.GRAY_TERRACOTTA_STAIRS)

        val lightGrayTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_TERRACOTTA)
        lightGrayTerracotta?.slab(ModBlock.LIGHT_GRAY_TERRACOTTA_SLAB)
        lightGrayTerracotta?.stairs(ModBlock.LIGHT_GRAY_TERRACOTTA_STAIRS)

        val cyanTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.CYAN_TERRACOTTA)
        cyanTerracotta?.slab(ModBlock.CYAN_TERRACOTTA_SLAB)
        cyanTerracotta?.stairs(ModBlock.CYAN_TERRACOTTA_STAIRS)

        val purpleTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.PURPLE_TERRACOTTA)
        purpleTerracotta?.slab(ModBlock.PURPLE_TERRACOTTA_SLAB)
        purpleTerracotta?.stairs(ModBlock.PURPLE_TERRACOTTA_STAIRS)

        val blueTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.BLUE_TERRACOTTA)
        blueTerracotta?.slab(ModBlock.BLUE_TERRACOTTA_SLAB)
        blueTerracotta?.stairs(ModBlock.BLUE_TERRACOTTA_STAIRS)

        val brownTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.BROWN_TERRACOTTA)
        brownTerracotta?.slab(ModBlock.BROWN_TERRACOTTA_SLAB)
        brownTerracotta?.stairs(ModBlock.BROWN_TERRACOTTA_STAIRS)

        val greenTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.GREEN_TERRACOTTA)
        greenTerracotta?.slab(ModBlock.GREEN_TERRACOTTA_SLAB)
        greenTerracotta?.stairs(ModBlock.GREEN_TERRACOTTA_STAIRS)

        val redTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.RED_TERRACOTTA)
        redTerracotta?.slab(ModBlock.RED_TERRACOTTA_SLAB)
        redTerracotta?.stairs(ModBlock.RED_TERRACOTTA_STAIRS)

        val blackTerracotta = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.BLACK_TERRACOTTA)
        blackTerracotta?.slab(ModBlock.BLACK_TERRACOTTA_SLAB)
        blackTerracotta?.stairs(ModBlock.BLACK_TERRACOTTA_STAIRS)



        val honeycombBlock = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.HONEYCOMB_BLOCK)
        honeycombBlock?.slab(ModBlock.HONEYCOMB_BLOCK_SLAB)
        honeycombBlock?.stairs(ModBlock.HONEYCOMB_BLOCK_STAIRS)

        val amethystBlock = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.AMETHYST_BLOCK)
        amethystBlock?.slab(ModBlock.AMETHYST_BLOCK_SLAB)
        amethystBlock?.stairs(ModBlock.AMETHYST_BLOCK_STAIRS)

        val glowstone = blockStateModelGenerator?.registerCubeAllModelTexturePool(Blocks.GLOWSTONE)
        glowstone?.slab(ModBlock.GLOWSTONE_SLAB)
        glowstone?.stairs(ModBlock.GLOWSTONE_STAIRS)
    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerator?) {
    }
}