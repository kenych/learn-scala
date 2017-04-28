import java.io.FileInputStream

import scala.util.control.Breaks._

import java.io.FileNotFoundException
import java.io.IOException

object Scope extends App {

  main

  def main = {
    val i =10
    val a = 1;
    {
      val a = 2 //in java can't
      inner
    }
    
    def inner ={
      println(i);
    }

  }

}