
object Matcher extends App {

  val files = (new java.io.File("/Users/kayanazimov/workspace/testapps/scalaTestHome/src")).listFiles()

  val filteredFilesContains = filesContains("Fil")
  filteredFilesContains.foreach(println)
  def filesContains(query: String): Array[java.io.File] = {
    for (file <- files if file.getName().contains(query))
      yield file
  }

  println("---");

  val filteredFilesWith = filesEndsWith("s.scala")
  filteredFilesWith.foreach(println)
  def filesEndsWith(query: String) = {
    for (file <- files if file.getName().endsWith(query))
      yield file
  }

  println("====");

  val filteredFilesContains2 = filesMatching("Fil", contains)
  val filteredFilesWith2 = filesMatching("scala", endsWith)
  filteredFilesContains2.foreach(println)
  println("---");
  filteredFilesWith2.foreach(println)

  def contains(fileName: String, query: String) = {
    fileName.contains(query)
  }
  def endsWith(fileName: String, query: String) = {
    fileName.endsWith(query)
  }

  private def filesMatching(query: String, matcherMethod: (String, String) => Boolean) = {
    for (file <- files if matcherMethod(file.getName(), query))
      yield file
  }

}