package main

import Conta
import model.*

fun main(){

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


    println("\nDiretor:")
    val diretor = Diretor(
        "Flavio",
        47,
        "rose@gmail.com",
        6000.0,
        900.0,
        3231
    )
    println(diretor.toString())

    println("\nGerente:")
    val gerente = Gerente(
        "Rose",
        44,
        "rose@gmail.com",
        6000.0,
        4451
    )

    println(gerente.toString())
    val calc = Calc()
    calc.reg(gerente)
    println("total boni.: ${calc.total}")


    println("\nAnalistas:")
    val analista = Analista(
        name = "Marye",
        year = 33,
        email = "marye@gmail.com",
        salario = 4000.0
    )
}