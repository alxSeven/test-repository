import kotlin.random.Random
/*Un programa que genera una lista de 20
 *numeros enteros pseudo aleatorios,
 *los imprime de forma tabular y calcula
 *la suma de los elementos de la lista*/
fun main() {
  var rndNumbers: List<Int> = List(20) { Random.nextInt() }
  rndNumbers.forEachIndexed { index, value ->
    if(index % 5 == 0){
      println()
    }
    print("$value ")
  }
  println()
  println("La sumatoria de los elementos de la lista es ${rndNumbers.sumOf{ it }}")
  println("El menor valor es ${rndNumbers.minOf{ it }}")
  println("El mayor valor es $(rndNumbers.maxOf{ it }}")
}
