package model

interface Autenticar {

    val senha: Int
    open fun autentica(senha: Int): Boolean{
        if (this.senha == senha){
            return true
            println("logaodo...")
        }
        return false
        println("não logou")
    }
}