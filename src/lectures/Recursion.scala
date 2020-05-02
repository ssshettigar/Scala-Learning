package lectures

import lectures.Function.fibancciFunction

object Recursion extends  App{
  def factorialFunction(number: Int): Int ={
    if(number ==1) number
    else {
      println("Computing factorial of number" + number + "Computing factorial of number -1"+ (number-1))
      val result= number * factorialFunction(number-1)
      println("Computed Factorial of number" + number)
      result
    }
  }// Scala uses call stack to store partial results so that it can get to computing desired result.
  //stackoverflow error happens when recursive depth is too high
  //factorialFunction(10)
  def anotherFactorialFunction(number : Int) : BigInt = {
    //auxiliary function
    @scala.annotation.tailrec
    def factorialHelper(n: Int, accumulator: BigInt): BigInt = {
      if(n<=1) accumulator
      else factorialHelper(n-1, n * accumulator) // this is called tail recursion
      //last expression on the code path and preserve the same stack frame.
    }
    factorialHelper(number,1)
  }
  //println(anotherFactorialFunction(4000))

  // when you need loops, use tail recursion
  // Use accumulator to store results rather than calling function recursively.


  //Problem # 1 - concatenate string n times
  def stringConcatenate(strData: String, count : Int): String= {
    @scala.annotation.tailrec
    def stringConcatenateHelper(accumulator: String, n: Int): String ={
      if(n<=1) accumulator
      else stringConcatenateHelper(accumulator + " "+ strData, n-1 )
    }
    stringConcatenateHelper(strData, 10)
  }
  //println(stringConcatenate("Hello",3))

  def fibnacciNumber(number: Int): Int= {
    def fibnacciHelper(start : Int, accumulator : Int, count: Int): Int = {
      if(count <=1)  accumulator
      else fibnacciHelper( accumulator , start +accumulator, count-1)
    }
    fibnacciHelper(0,1, number)
  }
  //println(fibnacciNumber(10))

  def IsPrime(number : Int): Boolean ={
    def PrimeHelper(Divisor : Int, isDivisble : Boolean):Boolean ={
      if(!isDivisble) false
      else if (Divisor==1)true
      else
        PrimeHelper(Divisor-1, number%(Divisor)!= 0 && isDivisble)
    }
    PrimeHelper(number/2 ,true )
  }

  println(IsPrime(17))
}
