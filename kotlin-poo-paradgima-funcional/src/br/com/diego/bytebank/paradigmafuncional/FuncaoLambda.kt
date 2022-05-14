package br.com.diego.bytebank.paradigmafuncional

fun testaFuncaoLambda() {
    val lambaFunction: () -> Unit = {
        println("executa lambda")
    }
    println(lambaFunction())

    val funcitionClass: () -> Unit = Teste()
    println(funcitionClass())
    val calculaBonificacao: (salario: Double) -> Double = lambda@{
        if (it > 1000.0) {
            return@lambda it + 50
        }
        it + 100.0
    }
    println(calculaBonificacao(1000.0))
}