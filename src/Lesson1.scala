object Lesson1 {

  def main(args: Array[String]) {

    val res = calc(1, 10)
    print(res)

  }

  def calc(x: Int, y: Int): Int = {

    if (x > 0 && y > 0) x + y
    else 0
  }

}


