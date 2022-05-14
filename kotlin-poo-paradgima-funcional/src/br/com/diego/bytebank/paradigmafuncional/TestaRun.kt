package br.com.diego.bytebank.paradigmafuncional

import br.com.diego.bytebank.modelo.Cliente
import br.com.diego.bytebank.modelo.ContaPoupanca

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println(taxaMensal)
    val novaConta = ContaPoupanca(Cliente(nome = "nnn", cpf = "888", senha = 223), numero = 1000)
    novaConta.run {
        deposita(1000.0)
        println(saldo)
        saldo * taxaMensal
    }.let { rendimento ->
        println(rendimento)
    }
    val rendimentoAnusl = run {
        var saldo = novaConta.saldo
        repeat(12) { indice ->
            saldo += saldo * taxaMensal

        }
        saldo
    }
    println(rendimentoAnusl)
}