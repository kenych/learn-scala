

object Tuple extends App {

  tuple

  def tuple {

    val pair = (1,"2xxx",3)
    //scala  infers type
    println(pair._1);
    println(pair._2);
    
    
    println(pair._3);
    
  }

 
}