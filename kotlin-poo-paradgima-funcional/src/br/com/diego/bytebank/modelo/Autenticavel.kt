package br.com.diego.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}