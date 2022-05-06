package model

fun testaExpression (){
    println("inicio main")
    fun1()
    println("fim...")


}
fun fun1(){
    println("função 1")
    val entry: String = "1,9"

    try {
        val valor : Double= entry.toDouble()
        println("valor: $valor")

    }catch (ex: java.lang.NumberFormatException){
        ex.printStackTrace()

    }

    try {
        fun2()

    }catch (e:java.lang.ClassCastException){
        println(e.printStackTrace())
        println("peguei")

    }

    println("fim função 1")

}
fun fun2(){
    println("função 2")
    for (i in 1..5){
        println(i)
        var endereco = Any()
        throw ClassCastException()

    }
    println("fim função 2")



}
