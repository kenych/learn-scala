
object Matcher2 extends App {

  val files = (new java.io.File("/Users/kayanazimov/workspace/testapps/scalaTestHome/src")).listFiles()

  val filteredFilesContains = filesContains("Fil")
  filteredFilesContains.foreach(println)

  println("---");

  //  val filteredFilesEnds = filesEndsWith("scala")
  val filteredFilesEnds =  filesMatching("scala", _.endsWith(_))

  filteredFilesEnds.foreach(println)

  def filesContains(query: String) = {
    filesMatching(query, _.contains(_))
  }

  def filesEndsWith(query: String) = {
    filesMatching(query, _.endsWith(_))
  }

  private def filesMatching(query: String, matcherMethod: (String,String) => Boolean) = {
    for (file <- files if matcherMethod(file.getName(), query))
      yield file
  }

}