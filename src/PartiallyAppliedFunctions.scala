import java.io.FileInputStream

import scala.util.control.Breaks._

import java.io.FileNotFoundException
import java.io.IOException

object PartiallyAppliedFunctions extends App {


  def sum (a: Int, b: Int, c: Int) = a + b +c
  
  
  val varsum = sum(4, _:Int , 4)
  
  println(sum(2,3,4))
  println(varsum(2));

}