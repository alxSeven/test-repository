import kotlin.random.Random
/*Un programa que genera una lista de 20
 *numeros enteros pseudo aleatorios,
 *los imprime de forma tabular y calcula
 *la suma de los elementos de la lista*/
fun main() {
  var rndNumbers: List<Int> = List(20) { Random.nextInt() }
  var sum = 0
  rndNumbers.forEachIndexed { index, value ->
    sum += value
    if(index % 5 == 0){
      println()
    }
    print("$value ")
  }
  println()
  println("La sumatoria de los elementos de la lista es $sum")
}
