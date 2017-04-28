
object T extends App {

  //  recursionTail(100)
  recursion(100)

  //1 time
  def recursionTail(x: Int): Int = {
    if (x == 0) throw new Exception("boom!")
    else recursionTail(x - 1)

  }

  //100 times
  def recursion(x: Int): Int = {
    if (x == 0) throw new Exception("boom!")
    else recursion(x - 1)
    1

  }

}