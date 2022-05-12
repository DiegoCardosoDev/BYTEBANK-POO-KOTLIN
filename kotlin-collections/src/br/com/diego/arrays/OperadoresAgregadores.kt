package arrays


fun main(){

    val idades:  IntArray = intArrayOf(10,20,30)
    val maiorIdade = idades.maxOrNull()
    println("$maiorIdade")

    val menor = idades.minOrNull()
    println("$menor")

    val todoSmaiores = idades.all { it >= 18 }
    println("$todoSmaiores")
    val existeMaior = idades.any() { it >= 18 }
    println("$existeMaior")

}