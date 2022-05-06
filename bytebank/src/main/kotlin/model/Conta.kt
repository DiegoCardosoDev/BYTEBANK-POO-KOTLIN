import model.Cliente



open class Conta(
    val titular: Cliente,
    val numeroConta: Int
) {

    /*Objects declarations*/
   companion object Contador{
        var total = 0
        private set
    }
    init {
        println("criando conta")
         Contador.total++
    }
    var saldo = 0.0

        set(valor: Double) {
            if (valor > 0) {
                field = valor

            } else {
                println("não foi possível valor negativo")
            }

        }



    var ativa: Boolean = true

    fun depositar(valor: Double) {
        saldo += valor
    }

    open fun saca(valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor

        } else {
            println("saldo insuficiente")
        }
    }

    fun desativarConta(conta: Conta) {
        conta.ativa = false
        println("a conta esta desativada")
    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.depositar(valor)
            return true
        }
        return false

    }


    override fun toString(): String {
        return "Dados da Conta(titular='$titular', numeroConta=$numeroConta, saldo=$saldo, ativa=$ativa)"
    }


}