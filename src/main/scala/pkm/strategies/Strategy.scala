package pkm.strategies
import scala.util.Random
import pkm.fights.Fight
import pkm.models.Dresseur

/**
  * Created by anastasia on 19/08/16.
  */
trait Strategy {


  def selectAction(firstPlayer:Dresseur, secondPlayer:Dresseur): Fight




}
