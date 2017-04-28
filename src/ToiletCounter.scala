object ToiletCounter {

  def initialCount = (args: Array[String]) => (if (args !=null && args.size > 0) args(0).toInt else 1)

  def main(args: Array[String]) {
    var ch = ""
    var counter = initialCount(args)
    println("Toilet has " + initialCount(args) + " initial members")

    println(" enter '+/=' or '-' or e for exit")
    while (true) {
      val result = ch match {
        case "-" => -1
        case "+" => 1
        case "=" => 1
        case default => 0
      }
      counter = counter + result

      println("Toilet has " + counter + " members")

      if (counter == 0) {
        println("Go for it!")
        System.exit(0)
      }

      ch = readLine();

    }
  }
}
