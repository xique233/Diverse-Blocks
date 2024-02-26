package magpies.life.datagen

import magpies.life.registry.ModBlock
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider

class ModLootTableProvider(dataOutput: FabricDataOutput?) : FabricBlockLootTableProvider(dataOutput) {
    override fun generate() {
        /*
        * 杂项类型掉落表
        *
        * */
        addDrop(ModBlock.DIRT_STAIRS)
        addDrop(ModBlock.DIRT_SLAB, slabDrops(ModBlock.DIRT_SLAB))
        addDrop(ModBlock.DIRT_WALL)

        addDrop(ModBlock.CRYING_OBSIDIAN_STAIRS)
        addDrop(ModBlock.CRYING_OBSIDIAN_SLAB, slabDrops(ModBlock.CRYING_OBSIDIAN_SLAB))
        addDrop(ModBlock.CRYING_OBSIDIAN_WALL)

        addDrop(ModBlock.PACKED_ICE_STAIRS)
        addDrop(ModBlock.PACKED_ICE_SLAB, slabDrops(ModBlock.PACKED_ICE_SLAB))
        addDrop(ModBlock.PACKED_ICE_WALL)

        addDrop(ModBlock.BLUE_ICE_STAIRS)
        addDrop(ModBlock.BLUE_ICE_SLAB, slabDrops(ModBlock.BLUE_ICE_SLAB))
        addDrop(ModBlock.BLUE_ICE_WALL)

        addDrop(ModBlock.CALCITE_STAIRS)
        addDrop(ModBlock.CALCITE_SLAB, slabDrops(ModBlock.CALCITE_SLAB))
        addDrop(ModBlock.CALCITE_WALL)

        addDrop(ModBlock.TUFF_STAIRS)
        addDrop(ModBlock.TUFF_SLAB, slabDrops(ModBlock.TUFF_SLAB))
        addDrop(ModBlock.TUFF_WALL)

        addDrop(ModBlock.OBSIDIAN_STAIRS)
        addDrop(ModBlock.OBSIDIAN_SLAB, slabDrops(ModBlock.OBSIDIAN_SLAB))
        addDrop(ModBlock.OBSIDIAN_WALL)

        addDrop(ModBlock.END_STONE_STAIRS)
        addDrop(ModBlock.END_STONE_SLAB, slabDrops(ModBlock.END_STONE_SLAB))
        addDrop(ModBlock.END_STONE_WALL)

        /*
        * 陶瓦类型掉落表
        *
        * */
        addDrop(ModBlock.TERRACOTTA_STAIRS)
        addDrop(ModBlock.TERRACOTTA_SLAB, slabDrops(ModBlock.TERRACOTTA_SLAB))
        addDrop(ModBlock.TERRACOTTA_WALL)

        addDrop(ModBlock.WHITE_TERRACOTTA_STAIRS)
        addDrop(ModBlock.WHITE_TERRACOTTA_SLAB, slabDrops(ModBlock.WHITE_TERRACOTTA_SLAB))
        addDrop(ModBlock.WHITE_TERRACOTTA_WALL)

        addDrop(ModBlock.ORANGE_TERRACOTTA_STAIRS)
        addDrop(ModBlock.ORANGE_TERRACOTTA_SLAB, slabDrops(ModBlock.ORANGE_TERRACOTTA_SLAB))
        addDrop(ModBlock.ORANGE_TERRACOTTA_WALL)

        addDrop(ModBlock.MAGENTA_TERRACOTTA_STAIRS)
        addDrop(ModBlock.MAGENTA_TERRACOTTA_SLAB, slabDrops(ModBlock.MAGENTA_TERRACOTTA_SLAB))
        addDrop(ModBlock.MAGENTA_TERRACOTTA_WALL)

        addDrop(ModBlock.LIGHT_BLUE_TERRACOTTA_STAIRS)
        addDrop(ModBlock.LIGHT_BLUE_TERRACOTTA_SLAB, slabDrops(ModBlock.LIGHT_BLUE_TERRACOTTA_SLAB))
        addDrop(ModBlock.LIGHT_BLUE_TERRACOTTA_WALL)

        addDrop(ModBlock.YELLOW_TERRACOTTA_STAIRS)
        addDrop(ModBlock.YELLOW_TERRACOTTA_SLAB, slabDrops(ModBlock.YELLOW_TERRACOTTA_SLAB))
        addDrop(ModBlock.YELLOW_TERRACOTTA_WALL)

        addDrop(ModBlock.LIME_TERRACOTTA_STAIRS)
        addDrop(ModBlock.LIME_TERRACOTTA_SLAB, slabDrops(ModBlock.LIME_TERRACOTTA_SLAB))
        addDrop(ModBlock.LIME_TERRACOTTA_WALL)

        addDrop(ModBlock.PINK_TERRACOTTA_STAIRS)
        addDrop(ModBlock.PINK_TERRACOTTA_SLAB, slabDrops(ModBlock.PINK_TERRACOTTA_SLAB))
        addDrop(ModBlock.PINK_TERRACOTTA_WALL)

        addDrop(ModBlock.GRAY_TERRACOTTA_STAIRS)
        addDrop(ModBlock.GRAY_TERRACOTTA_SLAB, slabDrops(ModBlock.GRAY_TERRACOTTA_SLAB))
        addDrop(ModBlock.GRAY_TERRACOTTA_WALL)

        addDrop(ModBlock.LIGHT_GRAY_TERRACOTTA_STAIRS)
        addDrop(ModBlock.LIGHT_GRAY_TERRACOTTA_SLAB, slabDrops(ModBlock.LIGHT_GRAY_TERRACOTTA_SLAB))
        addDrop(ModBlock.LIGHT_GRAY_TERRACOTTA_WALL)

        addDrop(ModBlock.CYAN_TERRACOTTA_STAIRS)
        addDrop(ModBlock.CYAN_TERRACOTTA_SLAB, slabDrops(ModBlock.CYAN_TERRACOTTA_SLAB))
        addDrop(ModBlock.CYAN_TERRACOTTA_WALL)

        addDrop(ModBlock.PURPLE_TERRACOTTA_STAIRS)
        addDrop(ModBlock.PURPLE_TERRACOTTA_SLAB, slabDrops(ModBlock.PURPLE_TERRACOTTA_SLAB))
        addDrop(ModBlock.PURPLE_TERRACOTTA_WALL)

        addDrop(ModBlock.BLUE_TERRACOTTA_STAIRS)
        addDrop(ModBlock.BLUE_TERRACOTTA_SLAB, slabDrops(ModBlock.BLUE_TERRACOTTA_SLAB))
        addDrop(ModBlock.BLUE_TERRACOTTA_WALL)

        addDrop(ModBlock.BROWN_TERRACOTTA_STAIRS)
        addDrop(ModBlock.BROWN_TERRACOTTA_SLAB, slabDrops(ModBlock.BROWN_TERRACOTTA_SLAB))
        addDrop(ModBlock.BROWN_TERRACOTTA_WALL)

        addDrop(ModBlock.GREEN_TERRACOTTA_STAIRS)
        addDrop(ModBlock.GREEN_TERRACOTTA_SLAB, slabDrops(ModBlock.GREEN_TERRACOTTA_SLAB))
        addDrop(ModBlock.GREEN_TERRACOTTA_WALL)

        addDrop(ModBlock.RED_TERRACOTTA_STAIRS)
        addDrop(ModBlock.RED_TERRACOTTA_SLAB, slabDrops(ModBlock.RED_TERRACOTTA_SLAB))
        addDrop(ModBlock.RED_TERRACOTTA_WALL)

        addDrop(ModBlock.BLACK_TERRACOTTA_STAIRS)
        addDrop(ModBlock.BLACK_TERRACOTTA_SLAB, slabDrops(ModBlock.BLACK_TERRACOTTA_SLAB))
        addDrop(ModBlock.BLACK_TERRACOTTA_WALL)

        addDrop(ModBlock.HONEYCOMB_BLOCK_STAIRS)
        addDrop(ModBlock.HONEYCOMB_BLOCK_SLAB, slabDrops(ModBlock.HONEYCOMB_BLOCK_SLAB))
        addDrop(ModBlock.HONEYCOMB_BLOCK_WALL)

        addDrop(ModBlock.AMETHYST_BLOCK_STAIRS)
        addDrop(ModBlock.AMETHYST_BLOCK_SLAB, slabDrops(ModBlock.AMETHYST_BLOCK_SLAB))
        addDrop(ModBlock.AMETHYST_BLOCK_WALL)

        addDrop(ModBlock.GLOWSTONE_STAIRS)
        addDrop(ModBlock.GLOWSTONE_SLAB, slabDrops(ModBlock.GLOWSTONE_SLAB))
        addDrop(ModBlock.GLOWSTONE_WALL)

        addDrop(ModBlock.SMOOTH_QUARTZ_WALL)
        addDrop(ModBlock.DARK_PRISMARINE_WALL)
        addDrop(ModBlock.PURPUR_BLOCK_WALL)
        addDrop(ModBlock.PRISMARINE_BRICKS_WALL)

        /*
        * 羊毛类型掉落表
        *
        * */
        addDrop(ModBlock.WHITE_WOOL_STAIRS)
        addDrop(ModBlock.WHITE_WOOL_SLAB, slabDrops(ModBlock.WHITE_WOOL_SLAB))
        addDrop(ModBlock.WHITE_WOOL_WALL)

        addDrop(ModBlock.ORANGE_WOOL_STAIRS)
        addDrop(ModBlock.ORANGE_WOOL_SLAB, slabDrops(ModBlock.ORANGE_WOOL_SLAB))
        addDrop(ModBlock.ORANGE_WOOL_WALL)

        addDrop(ModBlock.MAGENTA_WOOL_STAIRS)
        addDrop(ModBlock.MAGENTA_WOOL_SLAB, slabDrops(ModBlock.MAGENTA_WOOL_SLAB))
        addDrop(ModBlock.MAGENTA_WOOL_WALL)

        addDrop(ModBlock.LIGHT_BLUE_WOOL_STAIRS)
        addDrop(ModBlock.LIGHT_BLUE_WOOL_SLAB, slabDrops(ModBlock.LIGHT_BLUE_WOOL_SLAB))
        addDrop(ModBlock.LIGHT_BLUE_WOOL_WALL)

        addDrop(ModBlock.YELLOW_WOOL_STAIRS)
        addDrop(ModBlock.YELLOW_WOOL_SLAB, slabDrops(ModBlock.YELLOW_WOOL_SLAB))
        addDrop(ModBlock.YELLOW_WOOL_WALL)

        addDrop(ModBlock.LIME_WOOL_STAIRS)
        addDrop(ModBlock.LIME_WOOL_SLAB, slabDrops(ModBlock.LIME_WOOL_SLAB))
        addDrop(ModBlock.LIME_WOOL_WALL)

        addDrop(ModBlock.PINK_WOOL_STAIRS)
        addDrop(ModBlock.PINK_WOOL_SLAB, slabDrops(ModBlock.PINK_WOOL_SLAB))
        addDrop(ModBlock.PINK_WOOL_WALL)

        addDrop(ModBlock.GRAY_WOOL_STAIRS)
        addDrop(ModBlock.GRAY_WOOL_SLAB, slabDrops(ModBlock.GRAY_WOOL_SLAB))
        addDrop(ModBlock.GRAY_WOOL_WALL)

        addDrop(ModBlock.LIGHT_GRAY_WOOL_STAIRS)
        addDrop(ModBlock.LIGHT_GRAY_WOOL_SLAB, slabDrops(ModBlock.LIGHT_GRAY_WOOL_SLAB))
        addDrop(ModBlock.LIGHT_GRAY_WOOL_WALL)

        addDrop(ModBlock.CYAN_WOOL_STAIRS)
        addDrop(ModBlock.CYAN_WOOL_SLAB, slabDrops(ModBlock.CYAN_WOOL_SLAB))
        addDrop(ModBlock.CYAN_WOOL_WALL)

        addDrop(ModBlock.PURPLE_WOOL_STAIRS)
        addDrop(ModBlock.PURPLE_WOOL_SLAB, slabDrops(ModBlock.PURPLE_WOOL_SLAB))
        addDrop(ModBlock.PURPLE_WOOL_WALL)

        addDrop(ModBlock.BLUE_WOOL_STAIRS)
        addDrop(ModBlock.BLUE_WOOL_SLAB, slabDrops(ModBlock.BLUE_WOOL_SLAB))
        addDrop(ModBlock.BLUE_WOOL_WALL)

        addDrop(ModBlock.BROWN_WOOL_STAIRS)
        addDrop(ModBlock.BROWN_WOOL_SLAB, slabDrops(ModBlock.BROWN_WOOL_SLAB))
        addDrop(ModBlock.BROWN_WOOL_WALL)

        addDrop(ModBlock.GREEN_WOOL_STAIRS)
        addDrop(ModBlock.GREEN_WOOL_SLAB, slabDrops(ModBlock.GREEN_WOOL_SLAB))
        addDrop(ModBlock.GREEN_WOOL_WALL)

        addDrop(ModBlock.RED_WOOL_STAIRS)
        addDrop(ModBlock.RED_WOOL_SLAB, slabDrops(ModBlock.RED_WOOL_SLAB))
        addDrop(ModBlock.RED_WOOL_WALL)

        addDrop(ModBlock.BLACK_WOOL_STAIRS)
        addDrop(ModBlock.BLACK_WOOL_SLAB, slabDrops(ModBlock.BLACK_WOOL_SLAB))
        addDrop(ModBlock.BLACK_WOOL_WALL)

        /*
        * 混凝土方块
        *
        * */
        addDrop(ModBlock.WHITE_CONCRETE_STAIRS)
        addDrop(ModBlock.WHITE_CONCRETE_SLAB, slabDrops(ModBlock.WHITE_CONCRETE_SLAB))
        addDrop(ModBlock.WHITE_CONCRETE_WALL)

        addDrop(ModBlock.ORANGE_CONCRETE_STAIRS)
        addDrop(ModBlock.ORANGE_CONCRETE_SLAB, slabDrops(ModBlock.ORANGE_CONCRETE_SLAB))
        addDrop(ModBlock.ORANGE_CONCRETE_WALL)

        addDrop(ModBlock.MAGENTA_CONCRETE_STAIRS)
        addDrop(ModBlock.MAGENTA_CONCRETE_SLAB, slabDrops(ModBlock.MAGENTA_CONCRETE_SLAB))
        addDrop(ModBlock.MAGENTA_CONCRETE_WALL)

        addDrop(ModBlock.LIGHT_BLUE_CONCRETE_STAIRS)
        addDrop(ModBlock.LIGHT_BLUE_CONCRETE_SLAB, slabDrops(ModBlock.LIGHT_BLUE_CONCRETE_SLAB))
        addDrop(ModBlock.LIGHT_BLUE_CONCRETE_WALL)

        addDrop(ModBlock.YELLOW_CONCRETE_STAIRS)
        addDrop(ModBlock.YELLOW_CONCRETE_SLAB, slabDrops(ModBlock.YELLOW_CONCRETE_SLAB))
        addDrop(ModBlock.YELLOW_CONCRETE_WALL)

        addDrop(ModBlock.LIME_CONCRETE_STAIRS)
        addDrop(ModBlock.LIME_CONCRETE_SLAB, slabDrops(ModBlock.LIME_CONCRETE_SLAB))
        addDrop(ModBlock.LIME_CONCRETE_WALL)

        addDrop(ModBlock.PINK_CONCRETE_STAIRS)
        addDrop(ModBlock.PINK_CONCRETE_SLAB, slabDrops(ModBlock.PINK_CONCRETE_SLAB))
        addDrop(ModBlock.PINK_CONCRETE_WALL)

        addDrop(ModBlock.GRAY_CONCRETE_STAIRS)
        addDrop(ModBlock.GRAY_CONCRETE_SLAB, slabDrops(ModBlock.GRAY_CONCRETE_SLAB))
        addDrop(ModBlock.GRAY_CONCRETE_WALL)

        addDrop(ModBlock.LIGHT_GRAY_CONCRETE_STAIRS)
        addDrop(ModBlock.LIGHT_GRAY_CONCRETE_SLAB, slabDrops(ModBlock.LIGHT_GRAY_CONCRETE_SLAB))
        addDrop(ModBlock.LIGHT_GRAY_CONCRETE_WALL)

        addDrop(ModBlock.CYAN_CONCRETE_STAIRS)
        addDrop(ModBlock.CYAN_CONCRETE_SLAB, slabDrops(ModBlock.CYAN_CONCRETE_SLAB))
        addDrop(ModBlock.CYAN_CONCRETE_WALL)

        addDrop(ModBlock.PURPLE_CONCRETE_STAIRS)
        addDrop(ModBlock.PURPLE_CONCRETE_SLAB, slabDrops(ModBlock.PURPLE_CONCRETE_SLAB))
        addDrop(ModBlock.PURPLE_CONCRETE_WALL)

        addDrop(ModBlock.BLUE_CONCRETE_STAIRS)
        addDrop(ModBlock.BLUE_CONCRETE_SLAB, slabDrops(ModBlock.BLUE_CONCRETE_SLAB))
        addDrop(ModBlock.BLUE_CONCRETE_WALL)

        addDrop(ModBlock.BROWN_CONCRETE_STAIRS)
        addDrop(ModBlock.BROWN_CONCRETE_SLAB, slabDrops(ModBlock.BROWN_CONCRETE_SLAB))
        addDrop(ModBlock.BROWN_CONCRETE_WALL)

        addDrop(ModBlock.GREEN_CONCRETE_STAIRS)
        addDrop(ModBlock.GREEN_CONCRETE_SLAB, slabDrops(ModBlock.GREEN_CONCRETE_SLAB))
        addDrop(ModBlock.GREEN_CONCRETE_WALL)

        addDrop(ModBlock.RED_CONCRETE_STAIRS)
        addDrop(ModBlock.RED_CONCRETE_SLAB, slabDrops(ModBlock.RED_CONCRETE_SLAB))
        addDrop(ModBlock.RED_CONCRETE_WALL)

        addDrop(ModBlock.BLACK_CONCRETE_STAIRS)
        addDrop(ModBlock.BLACK_CONCRETE_SLAB, slabDrops(ModBlock.BLACK_CONCRETE_SLAB))
        addDrop(ModBlock.BLACK_CONCRETE_WALL)



























        /*
        * 玻璃类型掉落表
        *
        * */
        addDrop(ModBlock.GLASS_SLAB, slabDrops(ModBlock.GLASS_SLAB))
        addDrop(ModBlock.WHITE_GLASS_SLAB, slabDrops(ModBlock.WHITE_GLASS_SLAB))
        addDrop(ModBlock.ORANGE_GLASS_SLAB, slabDrops(ModBlock.ORANGE_GLASS_SLAB))
        addDrop(ModBlock.MAGENTA_GLASS_SLAB, slabDrops(ModBlock.MAGENTA_GLASS_SLAB))
        addDrop(ModBlock.LIGHT_BLUE_GLASS_SLAB, slabDrops(ModBlock.LIGHT_BLUE_GLASS_SLAB))
        addDrop(ModBlock.YELLOW_GLASS_SLAB, slabDrops(ModBlock.YELLOW_GLASS_SLAB))
        addDrop(ModBlock.LIME_GLASS_SLAB, slabDrops(ModBlock.LIME_GLASS_SLAB))
        addDrop(ModBlock.PINK_GLASS_SLAB, slabDrops(ModBlock.PINK_GLASS_SLAB))
        addDrop(ModBlock.GRAY_GLASS_SLAB, slabDrops(ModBlock.GRAY_GLASS_SLAB))
        addDrop(ModBlock.LIGHT_GRAY_GLASS_SLAB, slabDrops(ModBlock.LIGHT_GRAY_GLASS_SLAB))
        addDrop(ModBlock.CYAN_GLASS_SLAB, slabDrops(ModBlock.CYAN_GLASS_SLAB))
        addDrop(ModBlock.PURPLE_GLASS_SLAB, slabDrops(ModBlock.PURPLE_GLASS_SLAB))
        addDrop(ModBlock.BLUE_GLASS_SLAB, slabDrops(ModBlock.BLUE_GLASS_SLAB))
        addDrop(ModBlock.BROWN_GLASS_SLAB, slabDrops(ModBlock.BROWN_GLASS_SLAB))
        addDrop(ModBlock.GREEN_GLASS_SLAB, slabDrops(ModBlock.GREEN_GLASS_SLAB))
        addDrop(ModBlock.RED_GLASS_SLAB, slabDrops(ModBlock.RED_GLASS_SLAB))
        addDrop(ModBlock.BLACK_GLASS_SLAB, slabDrops(ModBlock.BLACK_GLASS_SLAB))

    }
}


