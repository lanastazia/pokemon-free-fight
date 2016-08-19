package pkm

import scala.util.Random
import pkm.data.Pokedex
import pkm.models.Dresseur
import pkm.PrepareFight

object Main extends App {



  val firstPlayer = Dresseur(name = "Front", hp = 500, mana = 0, pokemon = PrepareFight.giveMeSix())

  val secondPlayer = Dresseur(name = "Bick", hp = 500, mana = 0, pokemon = PrepareFight.giveMeSix())

  def endGame(firstPlayer:Dresseur, secondPlayer: Dresseur):Boolean = {
    if (firstPlayer.hp==0 && secondPlayer.hp==0 && firstPlayer.pokemon.isEmpty && secondPlayer.pokemon.isEmpty)
      val end= true
    end
  }
}
