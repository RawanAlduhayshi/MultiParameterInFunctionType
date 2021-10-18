fun main(args: Array<String>) {
  //using multiple parameter
    val greetingFunction : (String,Int) -> String ={playerName,numBuildings ->
        val currentYear = 2018
        println("adding $numBuildings houses")
        "Welcome to SimVillage,$playerName! (copyright $currentYear"
    }
    println(greetingFunction("Rawan",2))
}