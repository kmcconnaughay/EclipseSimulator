package ships

import components.*
import org.junit.jupiter.api.Test
import races.dracoCruiserBlueprint
import races.dracoInterceptorBlueprint
import races.dracoStarbaseBlueprint
import kotlin.test.assertFailsWith

internal class ShipTest {

    @Test
    fun create_mobileShipWithNoDrives_throwsException() {
        assertFailsWith<IllegalArgumentException> {
            Ship.create(
                blueprint = dracoCruiserBlueprint,
                components = listOf(ionCannon)
            )
        }
    }

    @Test
    fun create_starbaseWithDrives_throwsException() {
        assertFailsWith<IllegalArgumentException> {
            Ship.create(
                blueprint = dracoStarbaseBlueprint,
                components = listOf(nuclearDrive)
            )
        }
    }

    @Test
    fun create_negativeNetEnergy_throwsException() {
        assertFailsWith<IllegalArgumentException> {
            Ship.create(
                blueprint = dracoCruiserBlueprint,
                components = listOf(antimatterCannon)
            )
        }
    }

    @Test
    fun create_duplicateAncientShipParts_throwsException() {
        assertFailsWith<IllegalArgumentException> {
            Ship.create(
                blueprint = dracoCruiserBlueprint,
                components = listOf(conformalDrive, conformalDrive)
            )
        }
    }

    @Test
    fun create_tooManyComponents_throwsException() {
        assertFailsWith<IllegalArgumentException> {
            Ship.create(
                blueprint = dracoInterceptorBlueprint,
                components = listOf(nuclearSource, nuclearDrive, nuclearSource, nuclearSource, nuclearSource)
            )
        }
    }

    @Test
    fun create_extraComponentConsumesNoSlots_returnsShip() {
            Ship.create(
                blueprint = dracoInterceptorBlueprint,
                components = listOf(muonSource, nuclearDrive, nuclearSource, nuclearSource, nuclearSource)
            )
    }
}