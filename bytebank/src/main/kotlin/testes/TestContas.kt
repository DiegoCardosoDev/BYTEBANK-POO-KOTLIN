package testes

import Conta
import model.ContaCorrente
import model.ContaPoupanca

fun main(){

    val cc: Conta = ContaCorrente("jose", 33)
    val cp: Conta = ContaPoupanca("maria", 31)


    println("saldo corrente ${cc.saldo}")
    println("depositando...\n")
    cc.depositar(1000.0)
    println("sacando...")
    cc.saca(100.0)
    println("saldo corrente ${cc.saldo}")

    println("-----------------------------------------")

    println("saldo poupanca ${cp.saldo}")
    println("depositando...\n")
    cp.depositar(1000.0)
    println("sacando...")
    cp.saca(100.0)
    println(cp.saldo)
    println("saldo poupanca ${cp.saldo}")

    println("Bem Vindo")
    val contaDiego = Conta("Diego cardoso", 1023)
    println(contaDiego.toString())


    val contaTamires = Conta("Tamires", 1024)
    println(contaTamires.toString())

    contaDiego.depositar( 1000.0)
    println("saldo: ${contaDiego.saldo}")

    println("-------------------------")
    contaDiego.saca(10.0)
    println("saldo : ${contaDiego.saldo}")
    contaDiego.saca(2000.0)
    contaDiego.transfere(10.0,contaTamires)
    println("nome: ${contaTamires.titular} saldo:${contaTamires.saldo} numero conta: ${contaTamires.numeroConta}")


}