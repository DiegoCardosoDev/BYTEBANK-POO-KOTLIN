package br.com.alura

fun testaCopias() {

    val bancoDeNomes = BancoDeNomes()
    bancoDeNomes.save("Alex")
    println(bancoDeNomes.dados)

}
class BancoDeNomes{
    val dados = mutableListOf<String>()
    val nomes: Collection<String> get() = dados

    fun save(nome:String){
        dados.add(nome)

    }

}

fun testaCollection() {
    val nomes: MutableCollection<String> = mutableListOf("Naomi", "jose", "maria")
    nomes.add("Paulo")
    nomes.remove("Naomi")
    println(nomes)

    for (nome in nomes.iterator()) {
        println("nome:${nome}")
    }

    println("tem? ${nomes.contains("Naomi")}")
}


