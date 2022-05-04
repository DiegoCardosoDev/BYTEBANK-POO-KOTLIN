package testes.system

import model.services.Autenticar

class Application {


    fun entrarNoSistema(admim: Autenticar, senha: Int){
        if (admim.autentica(senha)){
            println("logou!")
        }else{
            println("erro ao logar")
        }


    }


}