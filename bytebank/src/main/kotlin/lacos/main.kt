/*fun main -- classe main*/
fun main() {


    println("ola mundo!")
    val titular = "Diego Cardoso"
    val numeroConta = 1010
    var saldo: Double = 0.0

    saldo = 100.0
    saldo -= 1000

    println("titular: $titular")
    println("numero conta: $numeroConta")
    println("saldo da conta: $saldo")

    /*whwn expresion*/
//    when {
//        saldo > 0.0 -> println("conta é positiva")
//        saldo == 0.0 -> println("conta é neutra")
//        else -> println("conta é negativa")
//    }


    /*or*/
    fun testaSaldo(saldo: Double) {
        if (saldo > 0.0) {
            println("conta positiva")
        } else if (saldo == 0.0) {
            println("conta neutra")
        } else {
            println("conta negativa")
            println("---------------")
        }
    }
    testaSaldo(saldo)

    /*for aninhado*/
    for (i in 1..3) {
        println("$i for no kotlin")
    }
    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }

    /*while*/
    var i = 0;
    while(i < 5){
        val titular: String = "Alex $i";
        val numeroConta: Int = 1000 + i;
        var saldo = i + 10.0;

        println("titular $titular");
        println("número da conta $numeroConta");
        println("saldo da conta $saldo");
        println();
        i++;
    }

    class Conta {

        val titular = "Diego Cardoso "
        val numeroConta = 1010
        var saldo = 1000

    }

}