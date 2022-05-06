package testes

import Conta
import model.Endereco
import model.testaExpression

fun main(){
    testaContas()
    println("total de contas criadas: ${Conta.total}")

    val end = Endereco()
    val endNovo = Endereco()
    println(end.equals(endNovo))
    println(end.hashCode())



    fun imprime(valor: Any): Unit{
        println(valor)

    }
    imprime(1)
    imprime(1.0)
    testaExpression()







}