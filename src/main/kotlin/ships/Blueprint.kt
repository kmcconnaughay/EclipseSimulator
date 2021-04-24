package ships

import components.Component
import races.Race

data class Blueprint(
    val race: Race,
    val shipType: ShipType,
    val intrinsicEnergy: Int,
    val intrinsicInitiative: Int,
    val numComponentSlots: Int,
    val defaultComponents: List<Component>
)