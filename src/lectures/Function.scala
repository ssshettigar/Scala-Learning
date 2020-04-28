package lectures

object Function extends  App {
  // function parameters and return type is specified after colon in the below function it is string.
 def afunction(a: String , b: Int): String = {
   //return type of string is not mandatory
   a + " " + b
 }
 println(afunction("Hello", 253467))
 // parameter function can be called just by their names
  def aparameterLessFunction():Int =42
  println(aparameterLessFunction) // calling fn without parenthesis
  println(aparameterLessFunction())

  def repeatFunction(strInputToRepeat: String , count: Int): String ={
    if(count ==1) strInputToRepeat
    else
      strInputToRepeat + " " + repeatFunction(strInputToRepeat,count-1 )
    //when you need loops uses recursion -- functional programming
    //return type must be specified for the recursive function
  }

  //println(repeatFunction("Hello",3))

  def aFunctionWithSideEffects(strVal: String): Unit = println(strVal)

  //println(aFunctionWithSidEffects("Hello"))

  //function inside a function - auxiliary function

  def bigFunction(n:Int): Int ={
    def smallFunction( a: Int, b: Int): Int = {
      a+b
    } //auxiliary function
    smallFunction(n,n-1) // implementation of return type of bigfunction.
  }
  //bigFunction(10)

  def greetingFunction(name: String , age: Int)  = {
    println("Hi, My Name is "+name + "and I'm " + age + " years old")
  }
  greetingFunction("Srikanth",33)
  def factorialFunction(number: Int): Int ={
    if(number ==1) number
    else
      number * factorialFunction(number-1)
  }

  //println(factorialFunction(4))
  def fibancciFunction(number : Int): Int ={
    if(number <= 2) 1
    else fibancciFunction(number-1) + fibancciFunction(number-2)
  }
  //println(fibancciFunction(10))
  //1,1,2,3,5,8

  def isPrime(number : Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean= {
      if(t<=1) true
      else number % t !=0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(number/2)
  }
  println(isPrime(10))

}
