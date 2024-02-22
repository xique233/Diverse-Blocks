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

    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerator?) {
    }
}