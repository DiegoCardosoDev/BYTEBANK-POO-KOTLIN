package listas

fun main(){


    val livro1 = Books(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Books(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Books(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Books(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )
    val meusLivros: MutableList<Books> =
        mutableListOf(livro1, livro2, livro3, livro4)

    val livro5 = Books(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946
    )

    meusLivros.add(livro5)

    fun MutableList<Books>.imprimeListaComMarcadores() {
        val listaComMarcadores = this.joinToString(separator = "\n") {
            " - ${it.titulo} de ${it.autor}"
        }
        println("\n ### Lista de Livros ### \n${listaComMarcadores}")
    }

    meusLivros.imprimeListaComMarcadores()
    meusLivros.sorted()

    fun MutableList<Books>.titulosPorAnoPublicacaoDoAutor(prefixoAutor: String)
            : List<String> {
        return this
            .filter { it.autor.startsWith(prefixoAutor) }
            .sortedBy { it.anoPublicacao }
            .map { it.titulo }
    }

    val titulos: List<String> = meusLivros.titulosPorAnoPublicacaoDoAutor("João")


}