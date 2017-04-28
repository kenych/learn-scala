import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.IOException

object Try extends App{
  
  main
  
  def main ={
    
    try {
      val file = new FileInputStream("ff");
    }catch{
      case ex: FileNotFoundException => println("not found:"+ex)
      case ex: IOException => println("io")
    }
  }

}