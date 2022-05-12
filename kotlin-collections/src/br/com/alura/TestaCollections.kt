package br.com.alura

fun testaCollections() {
    val pedidos = listOf(
        Pedido(1, 77.0),
        Pedido(2, 20.0),
        Pedido(3, 33.0),
        Pedido(4, 23.0)
    )
    println(pedidos)

    /*associação*/
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)

    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }

//    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido ->
//        pedido.valor > 50.0
//    }
//    println(mapa)

    /*agrupando*/

    val map: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50.0
    }
    println(map)

    val nomes = listOf("Paulo", "Rodrigo", "Bruno")

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }
    println(agenda)
    println(agenda['B'])//pega o nome com a letra na agenda
}