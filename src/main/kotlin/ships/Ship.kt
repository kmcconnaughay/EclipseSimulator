package ships

import components.Component
import preconditions.checkArgument

data class Ship internal constructor(
    val blueprint: Blueprint,
    val components: List<Component>
) {
    val race = blueprint.race
    val type = blueprint.shipType
    val initiative = blueprint.intrinsicInitiative + components.sumBy(Component::initiative)
    val netEnergy = blueprint.intrinsicEnergy + components.sumBy(Component::netEnergy)
    val totalHull = 1 + components.sumBy(Component::hull)

    companion object {
        fun create(blueprint: Blueprint, components: List<Component> = listOf()): Ship {
            val ship = Ship(blueprint = blueprint, components = components.ifEmpty { blueprint.defaultComponents })
            checkSlots(ship)
            checkEnergy(ship)
            checkAncientShipParts(ship)
            checkDrives(ship)
            return ship
        }

        private fun checkSlots(ship: Ship) =
            checkArgument(ship.components.filter(Component::consumesSlot).size <= ship.blueprint.numComponentSlots)

        private fun checkEnergy(ship: Ship) = checkArgument(ship.netEnergy >= 0)

        private fun checkAncientShipParts(ship: Ship) = checkArgument(
            ship.components.filter(Component::isAncientShipPart).groupingBy(Component::name).eachCount().all {
                val (name, count) = it; count <= 1
            })

        private fun checkDrives(ship: Ship) {
            if (ship.type == ShipType.STARBASE) {
                checkArgument(ship.components.all { it.speed == 0 })
            } else {
                checkArgument(ship.components.any { it.speed > 0 })
            }
        }
    }
}