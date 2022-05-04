package model

import model.services.Autenticar

class Diretor(
    name:String,
    year:Int,
    email:String,
    salario: Double,
    plr: Double,
    senha: Int

): FuncionarioAdmin(
    name = name,
    year = year,
    email  = email,
    salario = salario,
    senha = senha
), Autenticar {

    override val bonificacao: Double get() = salario * 0.3 + salario
    override fun autentica(senha: Int): Boolean {
        println("logaodo...")
        if (this.senha == senha){
            return true
        }
        println("não logou")
        return false
    }

    override fun toString(): String {
        return "name:'$name',\n idade:$year,\n " +
                "email:'$email',\n" +
                " salario:$salario,\n" +
                " PLR: $bonificacao"
    }


}