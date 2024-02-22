package magpies.life.datagen

import magpies.life.registry.ModBlock
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider

class ModLootTableProvider(dataOutput: FabricDataOutput?) : FabricBlockLootTableProvider(dataOutput) {
    override fun generate() {
        addDrop(ModBlock.DIRT_STAIRS)
        addDrop(ModBlock.DIRT_SLAB, slabDrops(ModBlock.DIRT_SLAB))
    }
}


