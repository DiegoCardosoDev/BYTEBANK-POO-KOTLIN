package model

class Cliente(
     name: String,
     email: String,
     senha: Int
): Autenticar{
     override fun autentica(senha: Int): Boolean {
          TODO("Not yet implemented")
     }
}