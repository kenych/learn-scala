import scala.io.Source

object File extends App {

  //  sets

  main

  def main {

    Source.fromFile("/Users/kayanazimov/addoff.sh").
      getLines().
      foreach(println)

  }

}