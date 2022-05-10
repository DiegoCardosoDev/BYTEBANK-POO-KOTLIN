package listas

data class Books(

    val  titulo: String,
    val  autor: String,
    val  editora: String? = null,
    val  anoPublicacao: Long,
):Comparable<Books>{
    override fun compareTo(other: Books): Int {
        return this.anoPublicacao.compareTo(other.anoPublicacao)
    }

}
