

object ArraysAndList extends App	 {

  //  list1
  list2

  def list2 {

    val list = "hello2" :: "world1" :: "another workd7" :: "8" :: "4" :: Nil

    list.foreach(println)

    val allHasL = list.forall(s => s.contains("l"))
    val allHasE = list.forall(s => s.contains("e"))
    val atLeastOneHasD = list.exists(s => s.contains("d"))
    println("allHasL:" + allHasL)
    println("allHasE:" + allHasE)
    println("atLeastOneHasD:" + atLeastOneHasD)

    println("how many with e:" + list.count(s => s.contains("e")))

    val editAll = list.map(s => s + " this is edited")
    editAll.foreach(println)

    //sort by last character of work

    val sortedList = list.sortBy(element => element.charAt(element.length() - 1))
    println(sortedList)

  }

  def list1 {

    val objArr = Array()
    val strArr = Array("1", "2")
    //  strArr.foreach(println)

    val strList1 = List("1", "2")
    val strList2 = List("3", "4")

    //concat
    var strList3 = strList1 ::: strList2

    //cons add to begin
    strList3 = "0" :: strList3

    // cons verbos to 
    strList3 = strList3.::("00")

    strList3.foreach(println)

    //start with empty list
    val lis = Nil

    val newList = List(111, 2222) ::: lis

    newList.foreach(println)
  }

}