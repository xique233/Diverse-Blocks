package magpies.life.registry

import magpies.life.DiverseBlocks
import magpies.life.DiverseBlocks.MOD_ID
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier


object ModItemGroup {

    fun group(): ItemGroup = Registry.register(
        Registries.ITEM_GROUP, Identifier(MOD_ID, "group"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("group.${MOD_ID}.diverse-block"))
            .icon(fun(): ItemStack { return ItemStack(ModBlock.DIRT_SLAB) })
            .entries(fun(_, entries) {
                entries.add(ModBlock.DIRT_STAIRS)
                entries.add(ModBlock.DIRT_SLAB)
                entries.add(ModBlock.DIRT_WALL)

                entries.add(ModBlock.CRYING_OBSIDIAN_STAIRS)
                entries.add(ModBlock.CRYING_OBSIDIAN_SLAB)
                entries.add(ModBlock.CRYING_OBSIDIAN_WALL)

                entries.add(ModBlock.PACKED_ICE_STAIRS)
                entries.add(ModBlock.PACKED_ICE_SLAB)
                entries.add(ModBlock.PACKED_ICE_WALL)

                entries.add(ModBlock.BLUE_ICE_STAIRS)
                entries.add(ModBlock.BLUE_ICE_SLAB)
                entries.add(ModBlock.BLUE_ICE_WALL)

                entries.add(ModBlock.CALCITE_STAIRS)
                entries.add(ModBlock.CALCITE_SLAB)
                entries.add(ModBlock.CALCITE_WALL)

                entries.add(ModBlock.TUFF_STAIRS)
                entries.add(ModBlock.TUFF_SLAB)
                entries.add(ModBlock.TUFF_WALL)

                entries.add(ModBlock.OBSIDIAN_STAIRS)
                entries.add(ModBlock.OBSIDIAN_SLAB)
                entries.add(ModBlock.OBSIDIAN_WALL)

                entries.add(ModBlock.END_STONE_STAIRS)
                entries.add(ModBlock.END_STONE_SLAB)
                entries.add(ModBlock.END_STONE_WALL)

                entries.add(ModBlock.HONEYCOMB_BLOCK_STAIRS)
                entries.add(ModBlock.HONEYCOMB_BLOCK_SLAB)
                entries.add(ModBlock.HONEYCOMB_BLOCK_WALL)

                entries.add(ModBlock.AMETHYST_BLOCK_STAIRS)
                entries.add(ModBlock.AMETHYST_BLOCK_SLAB)
                entries.add(ModBlock.AMETHYST_BLOCK_WALL)

                entries.add(ModBlock.GLOWSTONE_STAIRS)
                entries.add(ModBlock.GLOWSTONE_SLAB)
                entries.add(ModBlock.GLOWSTONE_WALL)


                /*
                * 羊毛方块
                *
                * */
                entries.add(ModBlock.WHITE_WOOL_STAIRS)
                entries.add(ModBlock.WHITE_WOOL_SLAB)
                entries.add(ModBlock.WHITE_WOOL_WALL)

                entries.add(ModBlock.ORANGE_WOOL_STAIRS)
                entries.add(ModBlock.ORANGE_WOOL_SLAB)
                entries.add(ModBlock.ORANGE_WOOL_WALL)

                entries.add(ModBlock.MAGENTA_WOOL_STAIRS)
                entries.add(ModBlock.MAGENTA_WOOL_SLAB)
                entries.add(ModBlock.MAGENTA_WOOL_WALL)

                entries.add(ModBlock.LIGHT_BLUE_WOOL_STAIRS)
                entries.add(ModBlock.LIGHT_BLUE_WOOL_SLAB)
                entries.add(ModBlock.LIGHT_BLUE_WOOL_WALL)

                entries.add(ModBlock.YELLOW_WOOL_STAIRS)
                entries.add(ModBlock.YELLOW_WOOL_SLAB)
                entries.add(ModBlock.YELLOW_WOOL_WALL)

                entries.add(ModBlock.LIME_WOOL_STAIRS)
                entries.add(ModBlock.LIME_WOOL_SLAB)
                entries.add(ModBlock.LIME_WOOL_WALL)

                entries.add(ModBlock.PINK_WOOL_STAIRS)
                entries.add(ModBlock.PINK_WOOL_SLAB)
                entries.add(ModBlock.PINK_WOOL_WALL)

                entries.add(ModBlock.GRAY_WOOL_STAIRS)
                entries.add(ModBlock.GRAY_WOOL_SLAB)
                entries.add(ModBlock.GRAY_WOOL_WALL)

                entries.add(ModBlock.LIGHT_GRAY_WOOL_STAIRS)
                entries.add(ModBlock.LIGHT_GRAY_WOOL_SLAB)
                entries.add(ModBlock.LIGHT_GRAY_WOOL_WALL)

                entries.add(ModBlock.CYAN_WOOL_STAIRS)
                entries.add(ModBlock.CYAN_WOOL_SLAB)
                entries.add(ModBlock.CYAN_WOOL_WALL)

                entries.add(ModBlock.PURPLE_WOOL_STAIRS)
                entries.add(ModBlock.PURPLE_WOOL_SLAB)
                entries.add(ModBlock.PURPLE_WOOL_WALL)

                entries.add(ModBlock.BLUE_WOOL_STAIRS)
                entries.add(ModBlock.BLUE_WOOL_SLAB)
                entries.add(ModBlock.BLUE_WOOL_WALL)

                entries.add(ModBlock.BROWN_WOOL_STAIRS)
                entries.add(ModBlock.BROWN_WOOL_SLAB)
                entries.add(ModBlock.BROWN_WOOL_WALL)

                entries.add(ModBlock.GREEN_WOOL_STAIRS)
                entries.add(ModBlock.GREEN_WOOL_SLAB)
                entries.add(ModBlock.GREEN_WOOL_WALL)

                entries.add(ModBlock.RED_WOOL_STAIRS)
                entries.add(ModBlock.RED_WOOL_SLAB)
                entries.add(ModBlock.RED_WOOL_WALL)

                entries.add(ModBlock.BLACK_WOOL_STAIRS)
                entries.add(ModBlock.BLACK_WOOL_SLAB)
                entries.add(ModBlock.BLACK_WOOL_WALL)

                /*
                * 混凝土方块
                *
                * */
                entries.add(ModBlock.WHITE_CONCRETE_STAIRS)
                entries.add(ModBlock.WHITE_CONCRETE_SLAB)
                entries.add(ModBlock.WHITE_CONCRETE_WALL)

                entries.add(ModBlock.ORANGE_CONCRETE_STAIRS)
                entries.add(ModBlock.ORANGE_CONCRETE_SLAB)
                entries.add(ModBlock.ORANGE_CONCRETE_WALL)

                entries.add(ModBlock.MAGENTA_CONCRETE_STAIRS)
                entries.add(ModBlock.MAGENTA_CONCRETE_SLAB)
                entries.add(ModBlock.MAGENTA_CONCRETE_WALL)

                entries.add(ModBlock.PURPLE_CONCRETE_STAIRS)
                entries.add(ModBlock.PURPLE_CONCRETE_SLAB)
                entries.add(ModBlock.PURPLE_CONCRETE_WALL)

                entries.add(ModBlock.LIGHT_BLUE_CONCRETE_STAIRS)
                entries.add(ModBlock.LIGHT_BLUE_CONCRETE_SLAB)
                entries.add(ModBlock.LIGHT_BLUE_CONCRETE_WALL)

                entries.add(ModBlock.YELLOW_CONCRETE_STAIRS)
                entries.add(ModBlock.YELLOW_CONCRETE_SLAB)
                entries.add(ModBlock.YELLOW_CONCRETE_WALL)

                entries.add(ModBlock.LIME_CONCRETE_STAIRS)
                entries.add(ModBlock.LIME_CONCRETE_SLAB)
                entries.add(ModBlock.LIME_CONCRETE_WALL)

                entries.add(ModBlock.PINK_CONCRETE_STAIRS)
                entries.add(ModBlock.PINK_CONCRETE_SLAB)
                entries.add(ModBlock.PINK_CONCRETE_WALL)

                entries.add(ModBlock.GRAY_CONCRETE_STAIRS)
                entries.add(ModBlock.GRAY_CONCRETE_SLAB)
                entries.add(ModBlock.GRAY_CONCRETE_WALL)

                entries.add(ModBlock.LIGHT_GRAY_CONCRETE_STAIRS)
                entries.add(ModBlock.LIGHT_GRAY_CONCRETE_SLAB)
                entries.add(ModBlock.LIGHT_GRAY_CONCRETE_WALL)

                entries.add(ModBlock.CYAN_CONCRETE_STAIRS)
                entries.add(ModBlock.CYAN_CONCRETE_SLAB)
                entries.add(ModBlock.CYAN_CONCRETE_WALL)

                entries.add(ModBlock.BLUE_CONCRETE_STAIRS)
                entries.add(ModBlock.BLUE_CONCRETE_SLAB)
                entries.add(ModBlock.BLUE_CONCRETE_WALL)

                entries.add(ModBlock.BROWN_CONCRETE_STAIRS)
                entries.add(ModBlock.BROWN_CONCRETE_SLAB)
                entries.add(ModBlock.BROWN_CONCRETE_WALL)

                entries.add(ModBlock.GREEN_CONCRETE_STAIRS)
                entries.add(ModBlock.GREEN_CONCRETE_SLAB)
                entries.add(ModBlock.GREEN_CONCRETE_WALL)

                entries.add(ModBlock.RED_CONCRETE_STAIRS)
                entries.add(ModBlock.RED_CONCRETE_SLAB)
                entries.add(ModBlock.RED_CONCRETE_WALL)

                entries.add(ModBlock.BLACK_CONCRETE_STAIRS)
                entries.add(ModBlock.BLACK_CONCRETE_SLAB)
                entries.add(ModBlock.BLACK_CONCRETE_WALL)















                /*
                * 陶瓦方块
                *
                * */
                entries.add(ModBlock.TERRACOTTA_STAIRS)
                entries.add(ModBlock.TERRACOTTA_SLAB)
                entries.add(ModBlock.TERRACOTTA_WALL)

                entries.add(ModBlock.WHITE_TERRACOTTA_STAIRS)
                entries.add(ModBlock.WHITE_TERRACOTTA_SLAB)
                entries.add(ModBlock.WHITE_TERRACOTTA_WALL)

                entries.add(ModBlock.ORANGE_TERRACOTTA_STAIRS)
                entries.add(ModBlock.ORANGE_TERRACOTTA_SLAB)
                entries.add(ModBlock.ORANGE_TERRACOTTA_WALL)

                entries.add(ModBlock.MAGENTA_TERRACOTTA_STAIRS)
                entries.add(ModBlock.MAGENTA_TERRACOTTA_SLAB)
                entries.add(ModBlock.MAGENTA_TERRACOTTA_WALL)

                entries.add(ModBlock.LIGHT_BLUE_TERRACOTTA_STAIRS)
                entries.add(ModBlock.LIGHT_BLUE_TERRACOTTA_SLAB)
                entries.add(ModBlock.LIGHT_BLUE_TERRACOTTA_WALL)

                entries.add(ModBlock.YELLOW_TERRACOTTA_STAIRS)
                entries.add(ModBlock.YELLOW_TERRACOTTA_SLAB)
                entries.add(ModBlock.YELLOW_TERRACOTTA_WALL)

                entries.add(ModBlock.LIME_TERRACOTTA_STAIRS)
                entries.add(ModBlock.LIME_TERRACOTTA_SLAB)
                entries.add(ModBlock.LIME_TERRACOTTA_WALL)

                entries.add(ModBlock.PINK_TERRACOTTA_STAIRS)
                entries.add(ModBlock.PINK_TERRACOTTA_SLAB)
                entries.add(ModBlock.PINK_TERRACOTTA_WALL)

                entries.add(ModBlock.GRAY_TERRACOTTA_STAIRS)
                entries.add(ModBlock.GRAY_TERRACOTTA_SLAB)
                entries.add(ModBlock.GRAY_TERRACOTTA_WALL)

                entries.add(ModBlock.LIGHT_GRAY_TERRACOTTA_STAIRS)
                entries.add(ModBlock.LIGHT_GRAY_TERRACOTTA_SLAB)
                entries.add(ModBlock.LIGHT_GRAY_TERRACOTTA_WALL)

                entries.add(ModBlock.CYAN_TERRACOTTA_STAIRS)
                entries.add(ModBlock.CYAN_TERRACOTTA_SLAB)
                entries.add(ModBlock.CYAN_TERRACOTTA_WALL)

                entries.add(ModBlock.PURPLE_TERRACOTTA_STAIRS)
                entries.add(ModBlock.PURPLE_TERRACOTTA_SLAB)
                entries.add(ModBlock.PURPLE_TERRACOTTA_WALL)

                entries.add(ModBlock.BROWN_TERRACOTTA_STAIRS)
                entries.add(ModBlock.BROWN_TERRACOTTA_SLAB)
                entries.add(ModBlock.BROWN_TERRACOTTA_WALL)

                entries.add(ModBlock.GREEN_TERRACOTTA_STAIRS)
                entries.add(ModBlock.GREEN_TERRACOTTA_SLAB)
                entries.add(ModBlock.GREEN_TERRACOTTA_WALL)
                entries.add(ModBlock.RED_TERRACOTTA_STAIRS)
                entries.add(ModBlock.RED_TERRACOTTA_SLAB)
                entries.add(ModBlock.RED_TERRACOTTA_WALL)

                entries.add(ModBlock.BLACK_TERRACOTTA_STAIRS)
                entries.add(ModBlock.BLACK_TERRACOTTA_SLAB)
                entries.add(ModBlock.BLACK_TERRACOTTA_WALL)


                entries.add(ModBlock.GLASS_SLAB)
                entries.add(ModBlock.WHITE_GLASS_SLAB)
                entries.add(ModBlock.ORANGE_GLASS_SLAB)
                entries.add(ModBlock.MAGENTA_GLASS_SLAB)
                entries.add(ModBlock.LIGHT_BLUE_GLASS_SLAB)
                entries.add(ModBlock.YELLOW_GLASS_SLAB)
                entries.add(ModBlock.LIME_GLASS_SLAB)
                entries.add(ModBlock.PINK_GLASS_SLAB)
                entries.add(ModBlock.GRAY_GLASS_SLAB)
                entries.add(ModBlock.LIGHT_GRAY_GLASS_SLAB)
                entries.add(ModBlock.CYAN_GLASS_SLAB)
                entries.add(ModBlock.PURPLE_GLASS_SLAB)
                entries.add(ModBlock.BLUE_GLASS_SLAB)
                entries.add(ModBlock.BROWN_GLASS_SLAB)
                entries.add(ModBlock.GREEN_GLASS_SLAB)
                entries.add(ModBlock.RED_GLASS_SLAB)
                entries.add(ModBlock.BLACK_GLASS_SLAB)

                entries.add(ModBlock.SMOOTH_QUARTZ_WALL)
                entries.add(ModBlock.PURPUR_BLOCK_WALL)
                entries.add(ModBlock.PRISMARINE_BRICKS_WALL)
                entries.add(ModBlock.DARK_PRISMARINE_WALL)
            })
            .build()
    )


    fun registerModGroupLog() {
        DiverseBlocks.logger.info("Registering Mod Group for $MOD_ID")
    }

}
