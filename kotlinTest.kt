import kotlin.random.Random

fun main() {
  var rndNumbers: List<Int> = List(20) { Random.nextInt() }
  rndNumbers.forEachIndexed { index, value -> 
    if(index % 5 == 0){
      println()
    }
    print("$value ")
  }
  println()
}
