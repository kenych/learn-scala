import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.IOException

object Match extends App {

  main

  def main = {

    val input = "12"

    val result = input match {
      case "1" => println("so litlle?")
      case "12" => "tvelve!"
    }
    
    println(result)

  }

}