package main.system

import model.Autenticar
import model.FuncionarioAdmin

class Application {



    fun entrar(admim: Autenticar, senha: Int){
        if (admim.autentica(senha)){
            println("logou!")
        }else{
            println("erro ao logar")
        }


    }


}