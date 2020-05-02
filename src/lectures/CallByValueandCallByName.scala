package lectures

object CallByValueandCallByName extends  App {
   def CallByValueFunc(x:Long):Unit = {
     println("Value of x is "+ x) //evaluate the value of x first then use in the function
     println("Value of x is "+ x) //evaluate the value of x first then use in the function
     //same value of x is printed in this function
   }
  // => used in call by name function
  def CallByNameFunc(x: => Long):Unit = {
    println("By Name "+ x) //expression itself passed to the function and  evaluated only everytime when it used in the function
    println("By Name "+ x) //expression itself passed to the function and  evaluated only everytime when it used in the function
  }
  CallByValueFunc(System.nanoTime())
  CallByNameFunc(System.nanoTime())
}
