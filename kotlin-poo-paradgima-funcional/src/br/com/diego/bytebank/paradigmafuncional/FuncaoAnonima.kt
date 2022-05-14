package br.com.diego.bytebank.paradigmafuncional

fun testaFuncaoAnonima() {
    /*função anonima*/
    val funAnonima = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(funAnonima(10, 22))

    val anonimaFunction: () -> Unit = fun() { println("anonima") }
    println(anonimaFunction())


    val calculadoraBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50
        }
        return salario + 100.0
    }
    println(calculadoraBonificacaoAnonima(1000.0))
}