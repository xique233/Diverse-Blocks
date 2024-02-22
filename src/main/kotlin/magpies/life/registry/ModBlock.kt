package magpies.life.registry

import magpies.life.DiverseBlocks
import magpies.life.DiverseBlocks.MOD_ID
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.block.SlabBlock
import net.minecraft.block.StairsBlock
import net.minecraft.item.BlockItem
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModBlock {

    val DIRT_SLAB = registerBlocks("dirt_slab", SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)))
    val DIRT_STAIRS = registerBlocks("dirt_stairs", StairsBlock(Blocks.DIRT.defaultState,FabricBlockSettings.copyOf(Blocks.DIRT)))

    private fun registerBlocks(name: String, block: Block): Block {
        registerBlockItems(name, block)
        return Registry.register(Registries.BLOCK, Identifier(MOD_ID, name), block)
    }

    private fun registerBlockItems(name: String, block: Block) {
        Registry.register(Registries.ITEM, Identifier(MOD_ID, name), BlockItem(block, FabricItemSettings()))
    }

    fun registerModBlocksLog() {
        DiverseBlocks.logger.info("Registering Mod Blocks for $MOD_ID")
    }
}