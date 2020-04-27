package lectures

object  Expression extends  App {
 val x = 1 + 2 //Expression
  println(x)
  // Math operators  +,-,*, /
  // & , | , ^ , >>(right shift) , <<(left shift) , >>>(right shift with zero expression)
  // == , != , > , <
  // !, && , ||
  // += ,-+,*=,/=  this operator work only with variables. Side effects

  // instructions(DO) VS expression(value and/or type)
  val conditionValue= false
  val aValue = if(true) 5 else 3 // IF expression -- if here gives a value back.
  println(aValue)
  println(if(true) 5 else 3) // evaluates and returns a value ****** Super important ********
  var aVariable=0
  // Dont write loops


  // Everything in scala is an expression

  val weirdValue: Unit = (aVariable=3) // weirdvalue is of unit type -- unit type means don't return anything meaningful
  // unit == void
  // unit type will have a value of ()
  println(weirdValue)
  // example of side effects- println(), while , reassignments

  // code Block is an expression and value of the code block is last expression in the code block

  val codeBlock ={
    //val within the code block is accessible only inside the code block
    val y=2
    val z= y+1
    if(z>2) "hello" else "World"
  } // type of val codeblock is string
  println(codeBlock) // prints hello
  // evaluate expression

  //exercises
  //1. Diff between print and string value
  val strVal="Hello World" // type string
  println("Hello World")  //type unit and side effects - types value to console.
  // 2
  val someVal= {
    2 < 3
  }
  println(someVal)
  val someotherVal ={
    if(someVal) 239 else 439
    42
  }
  println(someotherVal)
}
