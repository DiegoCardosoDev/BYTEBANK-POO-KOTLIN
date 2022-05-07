import exeptions.SaldoExeption
import model.Cliente
import model.services.Autenticar


abstract class Conta(
    val titular:Cliente,
    val numeroConta: Int
)  {

    /*Objects declarations*/
    companion object Contador {
        var total = 0
            private set
    }

    init {
        println("criando conta")
        total++
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

        try {
            if (saldo >= valor) {
                this.saldo -= valor

            }

        } catch (s: SaldoExeption) {
            s.message
        }

    }


    fun transfere(valor: Double, contaDestino: Conta, senha: Int) {

        if (saldo < valor) {
            throw SaldoExeption(mensagem = "saldo insuficiente o saldo na conta é ${saldo}")

        }
        saldo -= valor
        contaDestino.depositar(valor)

    }

//    override fun autentica(senha: Int): Boolean {
//        if (this.senha == senha) {
//            return true
//        }
//        return false
//    }


    override fun toString(): String {
        return "Dados da Conta(titular='$titular'," +
                "numeroConta=$numeroConta, saldo=$saldo," +
                " ativa=$ativa)"
    }




}