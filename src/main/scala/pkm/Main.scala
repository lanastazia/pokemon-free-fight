package pkm

import scala.util.Random
import pkm.data.Pokedex
import pkm.models.Dresseur
import pkm.PrepareFight

object Main extends App {



  val firstPlayer = Dresseur(name = "Front", hp = 500, mana = 0, pokemon = PrepareFight.giveMeSix())

  val secondPlayer = Dresseur(name = "Bick", hp = 500, mana = 0, pokemon = PrepareFight.giveMeSix())



  while (true) {



  }

}
