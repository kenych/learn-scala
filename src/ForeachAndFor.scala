import scala.collection.mutable.ListBuffer

object Foreach extends App {

  //  foreach1
  for_

  def foreach1 {

    class Empl(var name: String = "noname", var age: Int = 0) {
      require(age >= 0)
      override def toString = "name: " + name + " age: " + age
    }

    val arrEmpls = new Array[Empl](3)

    val emp1 = new Empl("ken1", 29)
    val emp2 = new Empl("ken2", 3)
    val emp3 = new Empl("ken3", 55)

    arrEmpls(0) = emp1;
    arrEmpls(1) = emp2;
    arrEmpls(2) = emp3;

    var ages: String = "";

    arrEmpls.foreach(println)
    arrEmpls.foreach((emp: Empl) => println(emp.age))
    arrEmpls.foreach(emp => println(emp.name))

    //arrEmpls.foreach(emp => ages += "," + emp.age)

    //drop 1st ,
    //println(ages.drop(1))

    //    //instead do
    //    var strList = List[String]()
    //    //    arrEmpls.foreach(emp => strList = strList:::List(emp.name))
    //    arrEmpls.foreach(emp => strList :+=   emp.name)
    //    
    //or better 
    var strList = ListBuffer[String]()
    //    arrEmpls.foreach(emp => strList = strList:::List(emp.name))
    arrEmpls.foreach(emp => strList += emp.name)

    println(strList.size)
    println(strList.mkString(", "))

  }

  def for_ {
    class Empl(var name: String = "noname", var age: Int = 0)
    val arrEmpls = new Array[Empl](3)

    val emp1 = new Empl("ken1", 29)
    val emp2 = new Empl("ken2", 3)
    val emp3 = new Empl("ken3", 55)

    arrEmpls(0) = emp1;
    arrEmpls(1) = emp2;
    arrEmpls(2) = emp3;

    //arg <- arrEmpls exp is generator
    for (arg <- arrEmpls) println(arg.name)

    for (index <- 0 until 2) println("until " + index)
    for (index <- 0 to 2) println("to" + index)

    for (index <- 0 to 2) println(arrEmpls(index).name)
    for (index <- (0).to(2)) println(arrEmpls(index).name)

  }

}

