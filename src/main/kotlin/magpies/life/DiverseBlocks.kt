package magpies.life

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object DiverseBlocks : ModInitializer {
    private val logger = LoggerFactory.getLogger("diverse-blocks")

	override fun onInitialize() {

		logger.info("Hello Fabric world!")
	}
}