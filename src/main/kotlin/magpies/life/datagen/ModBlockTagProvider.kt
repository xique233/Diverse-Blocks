package magpies.life.datagen

import magpies.life.registry.ModBlock
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.registry.RegistryWrapper
import net.minecraft.registry.tag.BlockTags
import java.util.concurrent.CompletableFuture

class ModBlockTagProvider(
    output: FabricDataOutput?,
    registriesFuture: CompletableFuture<RegistryWrapper.WrapperLookup>?
) : FabricTagProvider.BlockTagProvider(output, registriesFuture) {
    override fun configure(arg: RegistryWrapper.WrapperLookup?) {
        // 铲子挖掘加速器
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
            .add(ModBlock.DIRT_SLAB)
            .add(ModBlock.DIRT_STAIRS)
        // 镐子挖掘加速器
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)

            /*
            * 杂项类
            *
            * */
            .add(ModBlock.CRYING_OBSIDIAN_SLAB)
            .add(ModBlock.CRYING_OBSIDIAN_STAIRS)

            .add(ModBlock.PACKED_ICE_SLAB)
            .add(ModBlock.PACKED_ICE_STAIRS)

            .add(ModBlock.BLUE_ICE_SLAB)
            .add(ModBlock.BLUE_ICE_STAIRS)

            .add(ModBlock.CALCITE_SLAB)
            .add(ModBlock.CALCITE_STAIRS)

            .add(ModBlock.TUFF_SLAB)
            .add(ModBlock.TUFF_STAIRS)

            .add(ModBlock.OBSIDIAN_SLAB)
            .add(ModBlock.OBSIDIAN_STAIRS)

            .add(ModBlock.END_STONE_SLAB)
            .add(ModBlock.END_STONE_STAIRS)

            .add(ModBlock.TERRACOTTA_SLAB)
            .add(ModBlock.TERRACOTTA_STAIRS)

            .add(ModBlock.WHITE_TERRACOTTA_SLAB)
            .add(ModBlock.WHITE_TERRACOTTA_STAIRS)

            .add(ModBlock.ORANGE_TERRACOTTA_SLAB)
            .add(ModBlock.ORANGE_TERRACOTTA_STAIRS)

            .add(ModBlock.MAGENTA_TERRACOTTA_SLAB)
            .add(ModBlock.MAGENTA_TERRACOTTA_STAIRS)

            .add(ModBlock.LIGHT_BLUE_TERRACOTTA_SLAB)
            .add(ModBlock.LIGHT_BLUE_TERRACOTTA_STAIRS)

            .add(ModBlock.YELLOW_TERRACOTTA_SLAB)
            .add(ModBlock.YELLOW_TERRACOTTA_STAIRS)

            .add(ModBlock.LIME_TERRACOTTA_SLAB)
            .add(ModBlock.LIME_TERRACOTTA_STAIRS)

            .add(ModBlock.PINK_TERRACOTTA_SLAB)
            .add(ModBlock.PINK_TERRACOTTA_STAIRS)

            .add(ModBlock.GRAY_TERRACOTTA_SLAB)
            .add(ModBlock.GRAY_TERRACOTTA_STAIRS)

            .add(ModBlock.LIGHT_GRAY_TERRACOTTA_SLAB)
            .add(ModBlock.LIGHT_GRAY_TERRACOTTA_STAIRS)

            .add(ModBlock.CYAN_TERRACOTTA_SLAB)
            .add(ModBlock.CYAN_TERRACOTTA_STAIRS)

            .add(ModBlock.PURPLE_TERRACOTTA_SLAB)
            .add(ModBlock.PURPLE_TERRACOTTA_STAIRS)

            .add(ModBlock.BLUE_TERRACOTTA_SLAB)
            .add(ModBlock.BLUE_TERRACOTTA_STAIRS)

            .add(ModBlock.BROWN_TERRACOTTA_SLAB)
            .add(ModBlock.BROWN_TERRACOTTA_STAIRS)

            .add(ModBlock.GREEN_TERRACOTTA_SLAB)
            .add(ModBlock.GREEN_TERRACOTTA_STAIRS)

            .add(ModBlock.RED_TERRACOTTA_SLAB)
            .add(ModBlock.RED_TERRACOTTA_STAIRS)

            .add(ModBlock.BLACK_TERRACOTTA_SLAB)
            .add(ModBlock.BLACK_TERRACOTTA_STAIRS)

            .add(ModBlock.HONEYCOMB_BLOCK_SLAB)
            .add(ModBlock.HONEYCOMB_BLOCK_STAIRS)

            .add(ModBlock.AMETHYST_BLOCK_SLAB)
            .add(ModBlock.AMETHYST_BLOCK_STAIRS)

            .add(ModBlock.GLOWSTONE_SLAB)
            .add(ModBlock.GLOWSTONE_STAIRS)

            /*
            * 混凝土方块
            *
            * */
            .add(ModBlock.WHITE_CONCRETE_SLAB)
            .add(ModBlock.WHITE_CONCRETE_STAIRS)
            .add(ModBlock.ORANGE_CONCRETE_SLAB)
            .add(ModBlock.ORANGE_CONCRETE_STAIRS)
            .add(ModBlock.MAGENTA_CONCRETE_SLAB)
            .add(ModBlock.MAGENTA_CONCRETE_STAIRS)
            .add(ModBlock.LIGHT_BLUE_CONCRETE_SLAB)
            .add(ModBlock.LIGHT_BLUE_CONCRETE_STAIRS)
            .add(ModBlock.YELLOW_CONCRETE_SLAB)
            .add(ModBlock.YELLOW_CONCRETE_STAIRS)
            .add(ModBlock.LIME_CONCRETE_SLAB)
            .add(ModBlock.LIME_CONCRETE_STAIRS)
            .add(ModBlock.PINK_CONCRETE_SLAB)
            .add(ModBlock.PINK_CONCRETE_STAIRS)
            .add(ModBlock.GRAY_CONCRETE_SLAB)
            .add(ModBlock.GRAY_CONCRETE_STAIRS)
            .add(ModBlock.LIGHT_GRAY_CONCRETE_SLAB)
            .add(ModBlock.LIGHT_GRAY_CONCRETE_STAIRS)
            .add(ModBlock.CYAN_CONCRETE_SLAB)
            .add(ModBlock.CYAN_CONCRETE_STAIRS)
            .add(ModBlock.PURPLE_CONCRETE_SLAB)
            .add(ModBlock.PURPLE_CONCRETE_STAIRS)
            .add(ModBlock.BLUE_CONCRETE_SLAB)
            .add(ModBlock.BLUE_CONCRETE_STAIRS)
            .add(ModBlock.BROWN_CONCRETE_SLAB)
            .add(ModBlock.BROWN_CONCRETE_STAIRS)
            .add(ModBlock.GREEN_CONCRETE_SLAB)
            .add(ModBlock.GREEN_CONCRETE_STAIRS)
            .add(ModBlock.RED_CONCRETE_SLAB)
            .add(ModBlock.RED_CONCRETE_STAIRS)
            .add(ModBlock.BLACK_CONCRETE_SLAB)
            .add(ModBlock.BLACK_CONCRETE_STAIRS)


            /*
            * 羊毛类
            *
            * */
            .add(ModBlock.WHITE_WOOL_SLAB)
            .add(ModBlock.WHITE_WOOL_STAIRS)
            .add(ModBlock.ORANGE_WOOL_SLAB)
            .add(ModBlock.ORANGE_WOOL_STAIRS)
            .add(ModBlock.MAGENTA_WOOL_SLAB)
            .add(ModBlock.MAGENTA_WOOL_STAIRS)
            .add(ModBlock.LIGHT_BLUE_WOOL_SLAB)
            .add(ModBlock.LIGHT_BLUE_WOOL_STAIRS)
            .add(ModBlock.YELLOW_WOOL_SLAB)
            .add(ModBlock.YELLOW_WOOL_STAIRS)
            .add(ModBlock.LIME_WOOL_SLAB)
            .add(ModBlock.LIME_WOOL_STAIRS)
            .add(ModBlock.PINK_WOOL_SLAB)
            .add(ModBlock.PINK_WOOL_STAIRS)
            .add(ModBlock.GRAY_WOOL_SLAB)
            .add(ModBlock.GRAY_WOOL_STAIRS)
            .add(ModBlock.LIGHT_GRAY_WOOL_SLAB)
            .add(ModBlock.LIGHT_GRAY_WOOL_STAIRS)
            .add(ModBlock.CYAN_WOOL_SLAB)
            .add(ModBlock.CYAN_WOOL_STAIRS)
            .add(ModBlock.PURPLE_WOOL_SLAB)
            .add(ModBlock.PURPLE_WOOL_STAIRS)
            .add(ModBlock.BLUE_WOOL_SLAB)
            .add(ModBlock.BLUE_WOOL_STAIRS)
            .add(ModBlock.BROWN_WOOL_SLAB)
            .add(ModBlock.BROWN_WOOL_STAIRS)
            .add(ModBlock.GREEN_WOOL_SLAB)
            .add(ModBlock.GREEN_WOOL_STAIRS)
            .add(ModBlock.RED_WOOL_SLAB)
            .add(ModBlock.RED_WOOL_STAIRS)
            .add(ModBlock.BLACK_WOOL_SLAB)
            .add(ModBlock.BLACK_WOOL_STAIRS)

            /*
            * 玻璃类
            *
            * */
            .add(ModBlock.GLASS_SLAB)
            .add(ModBlock.WHITE_GLASS_SLAB)
            .add(ModBlock.ORANGE_GLASS_SLAB)
            .add(ModBlock.MAGENTA_GLASS_SLAB)
            .add(ModBlock.LIGHT_BLUE_GLASS_SLAB)
            .add(ModBlock.YELLOW_GLASS_SLAB)
            .add(ModBlock.LIME_GLASS_SLAB)
            .add(ModBlock.PINK_GLASS_SLAB)
            .add(ModBlock.GRAY_GLASS_SLAB)
            .add(ModBlock.LIGHT_GRAY_GLASS_SLAB)
            .add(ModBlock.CYAN_GLASS_SLAB)
            .add(ModBlock.PURPLE_GLASS_SLAB)
            .add(ModBlock.BLUE_GLASS_SLAB)
            .add(ModBlock.BROWN_GLASS_SLAB)
            .add(ModBlock.GREEN_GLASS_SLAB)
            .add(ModBlock.RED_GLASS_SLAB)
            .add(ModBlock.BLACK_GLASS_SLAB)
        // 斧头挖掘加速器
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
            .add(ModBlock.GLASS_SLAB)
        // 锄头挖掘加速器
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
            .add(ModBlock.WHITE_WOOL_SLAB)
            .add(ModBlock.WHITE_WOOL_STAIRS)
        // 墙类注册
        getOrCreateTagBuilder(BlockTags.WALLS)
            .add(ModBlock.DIRT_WALL)
            .add(ModBlock.CRYING_OBSIDIAN_WALL)
            .add(ModBlock.PACKED_ICE_WALL)
            .add(ModBlock.BLUE_ICE_WALL)
            .add(ModBlock.CALCITE_WALL)
            .add(ModBlock.TUFF_WALL)
            .add(ModBlock.OBSIDIAN_WALL)
            .add(ModBlock.END_STONE_WALL)
            .add(ModBlock.TERRACOTTA_WALL)
            .add(ModBlock.WHITE_TERRACOTTA_WALL)
            .add(ModBlock.ORANGE_TERRACOTTA_WALL)
            .add(ModBlock.MAGENTA_TERRACOTTA_WALL)
            .add(ModBlock.LIGHT_BLUE_TERRACOTTA_WALL)
            .add(ModBlock.YELLOW_TERRACOTTA_WALL)
            .add(ModBlock.LIME_TERRACOTTA_WALL)
            .add(ModBlock.PINK_TERRACOTTA_WALL)
            .add(ModBlock.GRAY_TERRACOTTA_WALL)
            .add(ModBlock.LIGHT_GRAY_TERRACOTTA_WALL)
            .add(ModBlock.CYAN_TERRACOTTA_WALL)
            .add(ModBlock.PURPLE_TERRACOTTA_WALL)
            .add(ModBlock.BLUE_TERRACOTTA_WALL)
            .add(ModBlock.BROWN_TERRACOTTA_WALL)
            .add(ModBlock.GREEN_TERRACOTTA_WALL)
            .add(ModBlock.RED_TERRACOTTA_WALL)
            .add(ModBlock.BLACK_TERRACOTTA_WALL)
            .add(ModBlock.HONEYCOMB_BLOCK_WALL)
            .add(ModBlock.AMETHYST_BLOCK_WALL)
            .add(ModBlock.GLOWSTONE_WALL)
            .add(ModBlock.WHITE_WOOL_WALL)
            .add(ModBlock.ORANGE_WOOL_WALL)
            .add(ModBlock.MAGENTA_WOOL_WALL)
            .add(ModBlock.LIGHT_BLUE_WOOL_WALL)
            .add(ModBlock.YELLOW_WOOL_WALL)
            .add(ModBlock.LIME_WOOL_WALL)
            .add(ModBlock.PINK_WOOL_WALL)
            .add(ModBlock.GRAY_WOOL_WALL)
            .add(ModBlock.LIGHT_GRAY_WOOL_WALL)
            .add(ModBlock.CYAN_WOOL_WALL)
            .add(ModBlock.PURPLE_WOOL_WALL)
            .add(ModBlock.BLUE_WOOL_WALL)
            .add(ModBlock.BROWN_WOOL_WALL)
            .add(ModBlock.GREEN_WOOL_WALL)
            .add(ModBlock.RED_WOOL_WALL)
            .add(ModBlock.BLACK_WOOL_WALL)
            .add(ModBlock.SMOOTH_QUARTZ_WALL)
            .add(ModBlock.DARK_PRISMARINE_WALL)
            .add(ModBlock.PURPUR_BLOCK_WALL)
            .add(ModBlock.PRISMARINE_BRICKS_WALL)
            .add(ModBlock.WHITE_CONCRETE_WALL)
            .add(ModBlock.ORANGE_CONCRETE_WALL)
            .add(ModBlock.MAGENTA_CONCRETE_WALL)
            .add(ModBlock.LIGHT_BLUE_CONCRETE_WALL)
            .add(ModBlock.YELLOW_CONCRETE_WALL)
            .add(ModBlock.LIME_CONCRETE_WALL)
            .add(ModBlock.PINK_CONCRETE_WALL)
            .add(ModBlock.GRAY_CONCRETE_WALL)
            .add(ModBlock.LIGHT_GRAY_CONCRETE_WALL)
            .add(ModBlock.CYAN_CONCRETE_WALL)
            .add(ModBlock.PURPLE_CONCRETE_WALL)
            .add(ModBlock.BLUE_CONCRETE_WALL)
            .add(ModBlock.BROWN_CONCRETE_WALL)
            .add(ModBlock.GREEN_CONCRETE_WALL)
            .add(ModBlock.RED_CONCRETE_WALL)
            .add(ModBlock.BLACK_CONCRETE_WALL)
    }

}