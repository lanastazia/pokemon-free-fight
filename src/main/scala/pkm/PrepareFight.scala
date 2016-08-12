package pkm

import scala.util.Random
import pkm.data.Pokedex
import pkm.models.Dresseur

object PrepareFight {


  //def readyToFight(firtsPlayer: Dresseur, secondPlayer: Dresseur)


  val rangePokemons=(1 to 6).toList

  def giveMeSix() = {
    rangePokemons.map{ _ =>
    Pokedex.pokemons(Random.nextInt(Pokedex.pokemons.length))
    }

  }
}

