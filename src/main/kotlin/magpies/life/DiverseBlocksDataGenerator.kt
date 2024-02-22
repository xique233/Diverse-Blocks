package magpies.life

import magpies.life.datagen.*
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator

class DiverseBlocksDataGenerator : DataGeneratorEntrypoint {
	override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
		val pack = fabricDataGenerator.createPack()
		pack.addProvider(::ModBlockTagProvider)
		pack.addProvider(::ModItemTagProvider)
		pack.addProvider(::ModLootTableProvider)
		pack.addProvider(::ModModelsProvider)
		pack.addProvider(::ModRecipesProvider)
	}
}