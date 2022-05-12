package listas

data class Pratileira(
    var genero: String,
    var livros: MutableList<Books>
){

    fun organizarPorAutor(): MutableList<Books>{
        livros.sortedBy { it.autor }
        return livros
    }

    fun organizarPorAno(): MutableList<Books>{
        livros.sortedBy { it.anoPublicacao }
        return livros
    }




}


