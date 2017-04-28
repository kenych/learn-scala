

object SpecialFuncCall extends App {

  repeatedParameters
  def repeatedParameters {
    val strArr = Array("xx", "yy")

    multiParam("hell")
    multiParam("1", "2")
    //if want to pass array then add colon underscore and astresik
    multiParam(strArr: _*)

    def multiParam(args: String*) {

      for (arg <- args) println(arg)

    }
  }
  
  

  namedArguments
  def namedArguments {

    person(address = "lokbatan", surname = "azimov", name = "ken")
    person(address = "lokbatan", surname = "azimov")

    //default param value
    def person(name: String = "anonimous", surname: String, address: String) = {
      println(
        "name: " + name +
          "  , surname:" + surname +
          " ,address:" + address)
    }

  }

}