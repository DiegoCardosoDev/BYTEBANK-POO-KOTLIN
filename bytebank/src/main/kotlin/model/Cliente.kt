package model

import model.services.Autenticar

class Cliente(
     name: String,
     email: String,
     override val senha: Int
): Autenticar {
     override fun autentica(senha: Int): Boolean {
          TODO("Not yet implemented")
     }
}