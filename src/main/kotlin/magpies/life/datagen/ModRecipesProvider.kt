package magpies.life.datagen

import magpies.life.DiverseBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder
import net.minecraft.item.Items
import net.minecraft.recipe.book.RecipeCategory
import net.minecraft.util.Identifier

class ModRecipesProvider(output: FabricDataOutput) : FabricRecipeProvider(output) {
    override fun generate(exporter: RecipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.SUGAR, 6)
            .pattern("###")
            .input('#', Items.DIRT)
            .offerTo(exporter, Identifier(DiverseBlocks.MOD_ID,"dirt_stairs"))
    }
}