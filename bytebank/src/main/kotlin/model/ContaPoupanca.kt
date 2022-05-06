package model

import Conta

class ContaPoupanca(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
){


    override fun saca(valor: Double) {
        val valorTaxa = valor + 0.1
        if (this.saldo >= valorTaxa) {
            this.saldo -= valorTaxa
        }
    }

}