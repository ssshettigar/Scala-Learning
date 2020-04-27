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

  println(repeatFunction("Hello",3))
}
