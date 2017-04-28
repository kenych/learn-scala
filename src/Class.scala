import scala.io.Source

object Class extends App {

  main

  def main {

    val e = new Example()
    e.test1(3)
    e.test(2)
    e.test(4)

  }

}

class Example {

  def test(x: Int): Unit = {
    println(x)
  }

  //or less verbose
  def test1(x: Int) { println(x) }

}