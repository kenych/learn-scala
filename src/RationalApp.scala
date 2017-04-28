object RationalApp extends App {

  def gcd(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
      println("a: " + a + " b:" + b)
    }
    b
  }

  implicit def intToRational(i: Int) = {
    val result = new Rational(i)
    println("translating Int: " + i + " to Rational: " + result)
    result
  }
  implicit def stringToRational(s: String) = {
    val result = new Rational(s.toInt)
    println("translating String: " + s + " to Rational: " + result)
    result
  }

  //  main
  main2

  def main2 {

    println("gcd: " + gcd(35, 25))

    print("unit eq unit: " + println("unit") == ())

  }

  def main {
    val oneTwo1 = new Rational(1, 2)
    val treeFour = new Rational(3, 4)

    println(oneTwo1 lessThan treeFour)
    println(oneTwo1 lessThan treeFour)

    val sum = oneTwo1 add treeFour
    println(sum)

    println("max is " + Rational.max(oneTwo1, treeFour))

    println(oneTwo1 * treeFour)
    println(oneTwo1 * 2)
    println(treeFour * new Rational(4, 3))
    println(2 * new Rational(4, 3))
    println("22" * new Rational(4, 3))
  }

}

class Rational(n: Int, d: Int) {

  val number: Int = n
  val denom: Int = d

  require(d > 0)

  def this(n: Int) = this(n, 1)

  def add(that: Rational): Rational = {
    println("adding:" + that + " to" + this)
    new Rational(number * that.denom + denom * that.number, denom * that.denom)
  }

  def lessThan(that: Rational) =
    number * that.denom < that.number * denom

  def *(that: Rational) = {
    println("multiplying " + this + " and " + that)
    new Rational(number * that.number, denom * that.denom)
  }

  def *(i: Int) = new Rational(number * i, denom)

  override def toString =
    number + "/" + denom
}

object Rational {

  def max(this_ : Rational, that: Rational): Rational = {
    val maxValue = if (this_.lessThan(that)) that else this_
    println("max found: " + maxValue);
    maxValue
  }

}