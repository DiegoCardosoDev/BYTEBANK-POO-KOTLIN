package model

interface Autenticar {

    val senha: Int
    fun autentica(senha: Int): Boolean
}