package br.com.diego.bytebank.paradigmafuncional

import br.com.diego.bytebank.modelo.Autenticavel
import br.com.diego.bytebank.modelo.Endereco
import br.com.diego.bytebank.modelo.SistemaInterno

fun ScopeFunctions() {
    val autenticavel = object : Autenticavel {
        val senha = 4451
        override fun autentica(senha: Int) = this.senha == senha

    }
    SistemaInterno().entra(autenticavel, 4451, autenticado = {
        println("realizar pagamento")
    })
    println("----------------------------------")


    //with
    println("usando with...")
    val endereço3 = Endereco(logradouro = "AVENIDA", complemento = "BLOCO12")
    with(endereço3) {
        "$logradouro, $complemento".toLowerCase()
    }.let { endMinuscuslo: String ->
        println(endMinuscuslo)
    }
    println("----------------------------------")

    // HOF (Higher-Order Function)
    //high order function HOF- funcoes de primeira ordem-> uma funcao chamando outra
    println("usando HOF... com let...")
    Endereco(logradouro = "Rua", numero = 22)
        .let { endereco ->
            " ${endereco.logradouro}, ${endereco.numero}"
                .toUpperCase()
        }.let(::println)
    println("----------------------------------")


    //run
    println("usando run...")
    Endereco(logradouro = "Rua A", complemento = "Ap2")
        .run {
            "$logradouro , $complemento".toUpperCase()
        }.let { endM: String ->
            println(endM)
        }
    println("----------------------------------")

    println("usando apply e also para printar...")
    val end4 = Endereco()
        .also { println("criando enderenço: also") }
        .apply {
            logradouro = "av.ujii"
            complemento = "ap778"
        }
    println(end4)
    println("----------------------------------")


    println("usando filter...")
    val enderecosComComplemento = listOf(
        Endereco(complemento = "casa"),
        Endereco(complemento = "ap")
    ).filter { endereco ->
        endereco.complemento.isNotEmpty()
    }.let(::println)
    println("----------------------------------")
}