package components

import dice.blueDie
import dice.orangeDie
import dice.redDie
import dice.yellowDie

val absorptionShield = Component(name = "Absorption Shield", netEnergy = 4, shields = 1)

val antimatterCannon = Component(name = "Antimatter Cannon", cannons = listOf(redDie), netEnergy = -4)

val antimatterMissile = Component(name = "Antimatter Missile", isAncientShipPart = true, missiles = listOf(redDie))

val axionComputer = Component(name = "Axion Computer", computers = 2, initiative = 1, isAncientShipPart = true)

val conformalDrive =
    Component(name = "Conformal Drive", netEnergy = -2, initiative = 2, isAncientShipPart = true, speed = 4)

val conifoldField = Component(name = "Conifold Field", netEnergy = -2, hull = 3)

val electronComputer = Component(name = "Electron Computer", computers = 1)

val fluxMissile = Component(name = "Flux Missile", initiative = 1, missiles = listOf(yellowDie))

val fluxShield = Component(name = "Flux Shield", netEnergy = -2, initiative = 1, isAncientShipPart = true, shields = 3)

val fusionDrive = Component(name = "Fusion Drive", netEnergy = -2, initiative = 2, speed = 2)

val fusionSource = Component(name = "Fusion Source", netEnergy = 6)

val gaussShield = Component(name = "Gauss Shield", shields = 1)

val gluonComputer = Component(name = "Gluon Computer", computers = 3, netEnergy = -2)

val hull = Component(name = "Hull", hull = 1)

val hypergridSource = Component(name = "Hypergrid Source", netEnergy = 11, isAncientShipPart = true)

val improvedHull = Component(name = "Improved Hull", hull = 2)

val inversionShield = Component(name = "Inversion Shield", netEnergy = 2, isAncientShipPart = true, shields = 2)

val ionCannon = Component(name = "Ion Cannon", cannons = listOf(yellowDie), netEnergy = -1)

val ionDisrupter =
    Component(name = "Ion Disrupter", cannons = listOf(yellowDie), initiative = 3, isAncientShipPart = true)

val ionMissile =
    Component(name = "Ion Missile", isAncientShipPart = true, missiles = listOf(yellowDie, yellowDie, yellowDie))

val ionTurret = Component(name = "Ion Turret", cannons = listOf(yellowDie, yellowDie), isAncientShipPart = true)

val muonSource =
    Component(name = "Muon Source", consumesSlot = false, netEnergy = 2, initiative = 1, isAncientShipPart = true)

val nuclearDrive = Component(name = "Nuclear Drive", netEnergy = -1, initiative = 1, speed = 1)

val nuclearSource = Component(name = "Nuclear Source", netEnergy = 3)

val phaseShield = Component(name = "Phase Shield", netEnergy = -1, shields = 2)

val plasmaCannon = Component(name = "Plasma Cannon", cannons = listOf(orangeDie), netEnergy = -2)

val plasmaMissile = Component(name = "Plasma Missile", netEnergy = -1, missiles = listOf(orangeDie))

val positronComputer = Component(name = "Positron Computer", computers = 2, netEnergy = -1)

val sentientHull = Component(name = "Sentient Hull", computers = 1, hull = 1)

val shardHull = Component(name = "Shard Hull", hull = 3, isAncientShipPart = true)

val solitonCannon = Component(name = "Soliton Cannon", cannons = listOf(blueDie), netEnergy = -3)

val solitonCharger =
    Component(name = "SolitonCharager", cannons = listOf(blueDie), netEnergy = -1, isAncientShipPart = true)

val solitonMissile =
    Component(name = "Soliton Missile", initiative = 1, isAncientShipPart = true, missiles = listOf(blueDie))

val tachyonDrive = Component(name = "Tachyon Drive", netEnergy = -3, initiative = 3, speed = 3)

val tachyonSource = Component(name = "Tachyon Source", netEnergy = 9)

val transitionDrive = Component(name = "Transition Drive", speed = 3)

val zeroPointSource = Component(name = "Zero Point Source", netEnergy = 12)