package testes

import Conta
import model.Cliente
import model.ContaCorrente
import model.ContaPoupanca
import model.Endereco

fun  testaContas(){

    val end1 = Endereco("rua adriatico", "santo andre", "sao paulo")
    val end2 = Endereco("rua amoritas", "santo andre", "sao paulo")
    val end3 = Endereco("rua amor", "santo andre", "sao paulo")

    val cliente1 = Cliente(name = "jose", cpf = "333-555-666-98", end1, 2233)
    val cc: Conta = ContaCorrente(cliente1, 33)

    val cliente2 = Cliente(name = "jose", cpf = "333-555-666-98",  end2, 1122)
    val cp: Conta = ContaPoupanca(cliente2, 31)

    val contaPoupanca = ContaPoupanca(
        Cliente(name = "mary",
            cpf = "999-999-777-77",
            end3,
            senha = 44,),
        1287
    )
    println("alterando atributos da cliente: ${contaPoupanca.titular}")
    contaPoupanca.titular.senha = 4451
    contaPoupanca.titular.name = "Mary Jane"


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

    println("contas: ${Conta.Contador.total}")

}

