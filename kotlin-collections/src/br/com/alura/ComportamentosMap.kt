package br.com.alura

fun comportamentosMap() {
    val pedidos = mutableMapOf<Int, Double>(
        1 to 20.0,
        Pair(2, 30.0),
        Pair(3, 45.0),
        4 to 100.0,
        5 to 200.0,
        6 to 677.0

    )// usando infix

    /*get value*/
    val valorPediso = pedidos.getValue(4)
    println(pedidos)


    val msg = pedidos.getOrElse(10) {
        "NÃO EXISTE"
    }
    println(msg)

    pedidos.getOrDefault(1, -1.0)
    println(pedidos)
    println(pedidos.keys)
    println(pedidos.values)

    for (n in pedidos.keys) {
        println("numero: $n")
        for (v in pedidos.values) {
            println("valor: $v")
        }

    }

    /*FILTROS*/
    val pedidodFilter = pedidos.filter { (n, v) ->
        n % 2 == 0 && v > 50.0
    }
    println("filtrados: $pedidodFilter")

    val filterValor = pedidos.filterValues { v ->
        v > 20.0
    }
    println("filter valor: $filterValor")

    val filterKey = pedidos.filterKeys { n ->
        n % 2 == 0
    }
    println("pedidos pares $filterKey")

    println(pedidos + mapOf(7 to 78.0))
    println(pedidos)


    println(pedidos - 6)//removendo o pedido
    println(pedidos)

    println(pedidos - listOf(1, 3))//renovendo mais de um pedido

    pedidos.putAll(setOf(6 to 66.0))//adicionando em conjunto
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)
    pedidos.values.remove(66.0)
    println(pedidos)

    pedidos -= 5
    println(pedidos)
}