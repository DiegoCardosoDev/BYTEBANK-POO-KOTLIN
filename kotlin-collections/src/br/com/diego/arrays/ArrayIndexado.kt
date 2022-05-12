package arrays

fun  main(){

    /*array de doubles*/
    val salarios = doubleArrayOf(1000.0, 3000.0, 5000.0)
    println("salarios: ${salarios}")

    var  indice = 0
    val aumento = 1.1

    for (indice in salarios.indices){
        salarios[indice] = salarios[indice]* aumento
    }
    println("aumento: ${salarios}")
    println(salarios.contentToString())

    salarios.forEachIndexed(){i, salario->
        salarios[i] = salario * aumento

    }
    println(salarios.contentToString())
}