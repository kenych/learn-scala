object SetMap extends App {

  //  sets

  maps

  def maps {

    val map = Map[Int, String](1 -> "dsfsd", 2 -> "ken")

    val newMap = map + (3 -> "rrrrr")

    println(newMap)

    val mutableMap = scala.collection.mutable.Map[Int, String]()

    mutableMap += (1 -> "ken")
    mutableMap += (2 -> "2222")
    mutableMap += (3 -> "333")

    val tuple = (1, "hi")

    mutableMap += tuple

    println(mutableMap)

  }

  def sets {

    val set = Set("kayan", "kayan", "ken")

    //can not as mutable
    //    set += "kenn"

    println(set)
    println(set + "dashkin" + "dashkin")

    val mutableSet = scala.collection.mutable.Set("ken")

    mutableSet += "kenych";
    println(mutableSet)

  }

}