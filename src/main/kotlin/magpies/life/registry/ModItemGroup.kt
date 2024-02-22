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
                entries.add(ModBlock.DIRT_SLAB)
                entries.add(ModBlock.DIRT_STAIRS)
            })
            .build()
    )


    fun registerModGroupLog() {
        DiverseBlocks.logger.info("Registering Mod Group for $MOD_ID")
    }

}
