package magpies.life.datagen

import magpies.life.DiverseBlocks
import magpies.life.registry.ModBlock
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.block.Blocks
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.data.server.recipe.RecipeProvider
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder
import net.minecraft.item.Items
import net.minecraft.recipe.book.RecipeCategory
import net.minecraft.util.Identifier

class ModRecipesProvider(output: FabricDataOutput) : FabricRecipeProvider(output) {
    override fun generate(exporter: RecipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlock.DIRT_SLAB, 6)
            .pattern("###")
            .input('#', Items.DIRT)
            .criterion(hasItem(Blocks.DIRT), RecipeProvider.conditionsFromItem(Blocks.DIRT))
            .offerTo(exporter, Identifier(DiverseBlocks.MOD_ID,"dirt_slab"))

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlock.DIRT_STAIRS, 4)
            .pattern("#  ")
            .pattern("## ")
            .pattern("###")
            .input('#', Items.DIRT)
            .criterion(hasItem(Blocks.DIRT), RecipeProvider.conditionsFromItem(Blocks.DIRT))
            .offerTo(exporter, Identifier(DiverseBlocks.MOD_ID,"dirt_stairs"))
    }
}