package lectures

object StringOps extends App {
 val str: String ="Hello World"
  //println(str.charAt(2))
  //println(str.split(" ").toList)

 //append -- :+ and prepend -- +:
 //println("a"+: "2" :+"z")
 //println(str)
 //println(str.length)
 //println(str.reverse)
 //string scala specific -- string interpolation

 // s- interpolation
 val name="Srikanth"
 val age=33
 val greetingText =s"Hello, My Name is $name and my age is $age"
 val anothergreetingText =s"Hello, My Name is $name and my age is ${age + 10}"
 println(greetingText)
 println(anothergreetingText)
 // F - interpolation
 // for formatted string, similar to printf function
 val speed= 1.2F
 println(f"$name%s can eat burgers at $speed%2.2f speed" )
 //float format 2.2f 2 characters total and 2 decimal places.
 // f stands for interpolated formatted string $ will expand the value

 // Raw - interpolation
 println(raw"this is new line character \n") // no escape sequence occurs in this case.
 val escapeseq="This is a - \n new line character "
 println(raw"$escapeseq") // \n works as escape sequence. 

}
