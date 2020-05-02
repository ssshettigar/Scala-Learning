package lectures

object DefaultArgs extends  App {
  //passing default value value for acc parameter
   def fact(n: Int, acc : Int= 1): Int = {
     if(n<=1) acc
     else fact(n-1, acc* n)
   }
  // while calling function default val params can be set with a new value. This new value will override default value.
  val x= fact(5,1)
  println(fact(6)) // one param is optional so it is dropped while calling the function
  //leading default params must not be dropped while calling function

  /*
  while calling a function with default param value ensure either of below
  1. pass all params with value -- order in which values  are passed is  important
  2. pass param name and value of the param -- order in which values  are passed is not important
   */

  print(x)
}
