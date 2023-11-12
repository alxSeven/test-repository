import kotlin.random.Random
/*Un programa que genera una lista de 20
 *numeros enteros pseudo aleatorios,
 *los imprime de forma tabular, calcula
 *la suma de los elementos de la lista y
 *determina el menor valor y el mayor valor*/
fun main() {
  var rndNumbers: List<Int> = List(20) { Random.nextInt(from=1, until=100) }
  rndNumbers.forEachIndexed { index, value ->
    if(index % 5 == 0){
      println()
    }
    print(if(value < 10){ "0" } else { "" } + "$value ")
  }
  println()
  println("La sumatoria de los elementos de la lista es ${rndNumbers.sumOf{ it }}")
  println("El menor valor es ${rndNumbers.minOf{ it }}")
  println("El mayor valor es ${rndNumbers.maxOf{ it }}")
}
