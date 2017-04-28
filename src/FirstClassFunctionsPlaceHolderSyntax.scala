import java.io.FileInputStream

import scala.util.control.Breaks._

import java.io.FileNotFoundException
import java.io.IOException

object Anonimus extends App {

  filter

  var increaser = (x: Int) => x + 1
  //main
  def main = {

    println(increaser(12));

    increaser = (x: Int) => x + 2
    println(increaser(12));

  }

  def filter {

    //function literal
    val evenFiler = (x: Int) => x % 2 == 0
    val oddFiler = (x: Int) => x % 2 != 0

    val list = List(1, 2, 3, 4, 5)

    //verbose
    val evenList = list.filter(x=> evenFiler(x))
    
    //less verbose
    val oddList = list.filter(oddFiler)

    val oddListLessVerbose1 = list.filter((x: Int) => x % 2 != 0)
    val oddListLessVerbose2 = list.filter(x => x % 2 != 0)
    
    val oddListLessVerbose3 = list.filter(_ > 3)
    

    evenList.foreach(println _)
    println
    oddList.foreach(println)
    println
    oddListLessVerbose1.foreach(println)
    println
    oddListLessVerbose2.foreach(println)
    println
    oddListLessVerbose3.foreach(println)

  }

}