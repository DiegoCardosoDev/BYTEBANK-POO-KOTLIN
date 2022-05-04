package model.services

interface Autenticar {

    val senha: Int
    open fun autentica(senha: Int): Boolean{
        if (this.senha == senha){
            println("logado...")
            return true
        }
        println("não logou")
        return false
    }
}