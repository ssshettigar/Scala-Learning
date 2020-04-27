package lectures

object ValuesVariablesTypes  extends App {
  val x: Int =42
  //VAL is immutable
  // type mentioned after 'val x:' is not mandatory
  println(x);
  val y =52
  println(y)

  val strVal="Hello This is a string"
  // semicolon is needed only when multiple code lines written in single line
  val boolVal = false
  val characterVal='A'
  val shortVal: Short = 22222 //compiler will complain if number is too big
  val longVal: Long = 3434343434343434343L
  //compiler will complain if number is too big and append L at the end for long variable
  val floatVal: Float = 3.45F
  val DecimalVal = 3.45


  var intVar: Int =4
  intVar =5 //side effects

}
