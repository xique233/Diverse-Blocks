package magpies.life

import magpies.life.registry.ModBlock
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.client.render.RenderLayer

object DiverseBlocksClient:ClientModInitializer {
    override fun onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlock.GLASS_SLAB)
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), ModBlock.WHITE_GLASS_SLAB)
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), ModBlock.ORANGE_GLASS_SLAB)
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), ModBlock.MAGENTA_GLASS_SLAB)
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), ModBlock.LIGHT_BLUE_GLASS_SLAB)
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), ModBlock.YELLOW_GLASS_SLAB)
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), ModBlock.LIME_GLASS_SLAB)
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), ModBlock.PINK_GLASS_SLAB)
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), ModBlock.GRAY_GLASS_SLAB)
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), ModBlock.LIGHT_GRAY_GLASS_SLAB)
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), ModBlock.CYAN_GLASS_SLAB)
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), ModBlock.PURPLE_GLASS_SLAB)
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), ModBlock.BLUE_GLASS_SLAB)
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), ModBlock.BROWN_GLASS_SLAB)
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), ModBlock.GREEN_GLASS_SLAB)
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), ModBlock.RED_GLASS_SLAB)
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), ModBlock.BLACK_GLASS_SLAB)
    }
}