package model

class Endereco(
    var rua: String = "",
    var cidade: String ="",
    var estado: String= ""
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Endereco

        if (rua != other.rua) return false
        if (cidade != other.cidade) return false
        if (estado != other.estado) return false

        return true
    }

    override fun hashCode(): Int {
        var result = rua.hashCode()
        result = 31 * result + cidade.hashCode()
        result = 31 * result + estado.hashCode()
        return result
    }
}