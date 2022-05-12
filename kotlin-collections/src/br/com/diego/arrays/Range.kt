package arrays

fun main(){

    val serie : IntRange  = 1.rangeTo(10)

    for (s in serie){
        println("$s")
    }

    val numerosPares = 0..10 step 2
    for (par in numerosPares){
        println("esse é par: ${par}")
    }

    val reverso = 10 downTo 0 step 2
    reverso.forEach{ println("par reverso: ${it}") }

}