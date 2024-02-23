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
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
            .add(ModBlock.DIRT_SLAB)
            .add(ModBlock.DIRT_STAIRS)
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
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

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
            .add(ModBlock.GLASS_SLAB)
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
            .add(ModBlock.WHITE_WOOL_SLAB)
            .add(ModBlock.WHITE_WOOL_STAIRS)
        getOrCreateTagBuilder(BlockTags.WALLS)
            .add(ModBlock.DIRT_WALL)
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
    }

}