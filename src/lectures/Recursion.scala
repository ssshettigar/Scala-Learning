package lectures

import lectures.Function.fibancciFunction

object Recursion extends  App{
  def factorialFunction(number: Int): Int ={
    if(number ==1) number
    else {
      println("")
      number * factorialFunction(number-1)
    }
  }
}
