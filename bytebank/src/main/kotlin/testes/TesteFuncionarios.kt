package testes

import model.*
import testes.system.Application

fun main(){

    val cliente = Cliente("Rebeca", "robson.com", 3321)
    val gerente1 = Gerente("Jermaine",33,"jerman.com", 10000.0, 4451 )
    val dieretor = Diretor("Alex",37,"alex.com", 10000.0, 200.0, 5544 )

    val sistema = Application()
    sistema.entrarNoSistema(gerente1, 4451)

    val calculoBonificacao = CalculoBonificacao()

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
    calculoBonificacao.reg(dieretor)
    println("total bonificacao.: ${calculoBonificacao.total}")

    println("\nGerente:")
    val gerente = Gerente(
        "Rose",
        44,
        "rose@gmail.com",
        6000.0,
        4451
    )
    println(gerente.toString())
    calculoBonificacao.reg(gerente)
    println("total bonificacao.: ${calculoBonificacao.total}")


    println("\nAnalistas:")
    val analista = Analista(
        name = "Marye",
        year = 33,
        email = "marye@gmail.com",
        salario = 4000.0
    )

    println(analista.toString())
    calculoBonificacao.reg(analista)
    println("total bonificacao.: ${calculoBonificacao.total}")



}