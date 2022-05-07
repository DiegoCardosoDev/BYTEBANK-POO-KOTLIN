import model.Endereco

fun testeNull(){

    /*NULL SAFETY SEGURANÇA PARA NULOS
    *NULL POINTER EXEPTION NPE
    * SAFE CALL OPERATOR ?
    * */



    /*safe call*/
    var endereco: Endereco? = Endereco(cidade = "sp", rua = "hhh", estado = "sppp")
    println(endereco?.cidade?.length)

    endereco?.let {endereco: Endereco ->
        println(endereco?.cidade)
    }

    /*elvis operator*/
    endereco?.let {end: Endereco ->
        val tamanhoEstado: Int = end.estado?.length ?: throw java.lang.IllegalStateException("vazio")
        println(tamanhoEstado)
    }


    /*safe cast*/
    fun test(valor: Any){
        val numero: Int? = valor as? Int
        println(numero)
    }
    test(1)
    test("")




}