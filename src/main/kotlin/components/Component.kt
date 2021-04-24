package components

import dice.Die

data class Component(
    val name: String,
    val cannons: List<Die> = listOf(),
    val computers: Int = 0,
    val consumesSlot: Boolean = true,
    val netEnergy: Int = 0,
    val hull: Int = 0,
    val initiative: Int = 0,
    val isAncientShipPart: Boolean = false,
    val missiles: List<Die> = listOf(),
    val shields: Int = 0,
    val speed: Int = 0)