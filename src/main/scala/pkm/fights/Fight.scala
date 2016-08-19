package pkm.fights

import pkm.models.{Dresseur, Pokemon}

trait Fight


case object Defend extends Fight
case class AttackPokemon(basicAttack: Boolean)  extends Fight
case class AttackDresseur(basicAttack: Boolean) extends Fight
