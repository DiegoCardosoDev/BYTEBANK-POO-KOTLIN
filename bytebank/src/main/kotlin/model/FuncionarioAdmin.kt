package model

import model.Funcionario

abstract class FuncionarioAdmin(
     name: String,
     year: Int,
     email: String,
    salario: Double,
    val senha: Int
): Funcionario(
    name = name,
    year = year,
    email  = email,
    salario = salario

){



    open fun autentica(senha: Int): Boolean{
        if (this.senha == senha){
            return true
            println("login efetuado")
        }else{
            println("falha")
            return false
        }

    }

    override fun toString(): String {
        return "name:'$name',\n idade:$year,\n email:'$email',\n salario:$salario\n"

    }


}



