package magpies.life.registry


object ModRegister {
    fun register() {
        ModItemGroup.group()
        ModBlock.registerModBlocksLog()
    }
}