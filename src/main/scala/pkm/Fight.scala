package pkm

import pkm.models.{Dresseur, Pokemon}

trait Fight {

  def attackDresseur(agressor: Dresseur, victim: Dresseur)

  def attackPok(agressor:Dresseur, victim: Pokemon)

  def defend(agressor:Dresseur, victim:Dresseur)

  val KO=0

}


