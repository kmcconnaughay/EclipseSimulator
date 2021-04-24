package races

import components.*
import races.Race.DESCENDANTS_OF_DRACO
import ships.Blueprint
import ships.ShipType.*

val dracoInterceptorBlueprint =
    Blueprint(
        race = DESCENDANTS_OF_DRACO,
        shipType = INTERCEPTOR,
        intrinsicEnergy = 0,
        intrinsicInitiative = 2,
        numComponentSlots = 4,
        defaultComponents = listOf(ionCannon, nuclearDrive, nuclearSource)
    )

val dracoCruiserBlueprint =
    Blueprint(
        race = DESCENDANTS_OF_DRACO,
        shipType = CRUISER,
        intrinsicEnergy = 0,
        intrinsicInitiative = 1,
        numComponentSlots = 6,
        defaultComponents = listOf(nuclearSource, nuclearDrive, hull, electronComputer, ionCannon)
    )

val dracoDreadnoughtBlueprint =
    Blueprint(
        race = DESCENDANTS_OF_DRACO,
        shipType = DREADNOUGHT,
        intrinsicEnergy = 0,
        intrinsicInitiative = 0,
        numComponentSlots = 8,
        defaultComponents = listOf(nuclearSource, hull, hull, electronComputer, ionCannon, ionCannon, nuclearDrive)
    )

val dracoStarbaseBlueprint =
    Blueprint(
        race = DESCENDANTS_OF_DRACO,
        shipType = STARBASE,
        intrinsicEnergy = 3,
        intrinsicInitiative = 4,
        numComponentSlots = 5,
        defaultComponents = listOf(hull, hull, electronComputer, ionCannon)
    )
