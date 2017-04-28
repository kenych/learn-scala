

object Filters extends App {
  val files = (new java.io.File("/Users/kayanazimov/workspace/testapps/scalaTestHome/src")).listFiles()

  for3

  def for1 {

  }

  def for2 {

    for (file <- files if file.getName().contains("Fil")) println(file)

  }

  def for3 {
    
    
    files.foreach(println)
    
    val filteredFiles =  
    for {
      file <- files if file.getName().contains("Fil") if file.isFile()
//    ) println(file)
    } yield file
    
    println("filterd:")
    filteredFiles.foreach(println)
    

  }
  
  def main {
    //nested loops, when filters and generators are used use curly braces (or comma after generator)
    for {
      file <- files //file is bind var
      if file.getName().contains("Fil")
      //line is bind variable
      line <- scala.io.Source.fromFile(file).getLines().toList
      if line.trim.matches("main")
    } println(file + " : " + line.trim())
    //...  (or comma after generator)
    for (
      file <- files if file.getName().contains("Fil");
      line <- scala.io.Source.fromFile(file).getLines().toList if line.trim.matches("main")
    ) println(file + " : " + line.trim())

  }
  
 

}