package listas

fun main(){

    val listaComNulos: MutableList<Books?> = mutableListOf(

        Books(
            titulo = "Grande Sertão: Veredas",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1956
        ),
        Books(
            titulo = "Minha vida de menina",
            autor = "Helena Morley",
            anoPublicacao = 1942,
            editora = "Editora A"

        ),
        Books(
            titulo = "Memórias Póstumas de Brás Cubas",
            autor = "Machado de Assis",
            anoPublicacao = 1881

        ),
        Books(

            titulo = "Iracema",
            autor = "José de Alencar",
            anoPublicacao = 1865,
            editora = "Editora B"

        )
    )
    listaComNulos
        .groupBy { it?.editora ?: "editora desconhecida" }
        .forEach { (editora, livros) ->
            println("$editora: ${livros.joinToString { it?.titulo!! }}")
        }
}