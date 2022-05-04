package main

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


}