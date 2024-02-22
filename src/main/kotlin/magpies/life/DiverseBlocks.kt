package magpies.life

import magpies.life.registry.ModRegister
import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object DiverseBlocks : ModInitializer {
	const val MOD_ID = "diverse"
	val logger: Logger = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		logger.info("Hello Fabric world!")
		ModRegister.register()
	}
}