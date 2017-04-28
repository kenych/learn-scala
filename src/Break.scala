import java.io.FileInputStream

import scala.util.control.Breaks._

import java.io.FileNotFoundException
import java.io.IOException

object Break extends App {

  main

  def main = {

    breakable {
      for (index <- 1 until 10){
        println("index: "+ index)
        if(index==3)break
      }
      
    }

  }

}