object MultilineString extends App {

  val helloMsg = """|hello
    |world
 """

  println(helloMsg.stripMargin.toLowerCase())
  
  println ((2).unary_-)

}