package model

import model.services.Autenticar

class Cliente(
     var name: String,
     val cpf: String,
     val endereco: Endereco,
     override var senha: Int
): Autenticar {


     override fun autentica(senha: Int): Boolean {
          println("logaodo...")
          if (this.senha == senha){
               return true
          }
          println("não logou")
          return false
     }

     override fun toString(): String {
          return "Cliente(senha=$name)"
     }

}

