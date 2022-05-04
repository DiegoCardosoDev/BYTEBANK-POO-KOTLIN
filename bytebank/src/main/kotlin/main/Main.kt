package main

import Conta
import main.system.Application
import model.*

fun  main(){

    val cliente = Cliente("mayname", "robson.com", 3321)
    val gerente = Gerente("Alex",33,"alex.com", 10000.0, 4451 )
    val dieretor = Diretor("Alex",33,"alex.com", 10000.0, 200.0, 5544 )
    val sistema = Application()
    sistema.entrar(gerente, 4451)







}

