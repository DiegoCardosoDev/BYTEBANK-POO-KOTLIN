package br.com.diego.bytebank.paradigmafuncional

fun testeTiposFuncoes() {
    fun teste() {
        println("teste executado")
    }

    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())

    fun soma(a: Int, b: Int): Int {
        return a + b
    }


    fun functionReferencia() {
        val myFunction: (Int, Int) -> Int = ::soma
        println(myFunction(5, 10))
    }
}

class Teste : () -> Unit {
    override fun invoke() {
        println("invoke teste")
    }

}