package br.com.alura


fun testaMap() {
    val pedidos = mutableMapOf<Int, Double>(
        Pair(2, 30.0),
        Pair(3, 45.0),
        1 to 20.0
    )// usando infix


    println("pedido: ${pedidos}")
    val pedido = pedidos[1]//pega o objeto por chave

    pedido?.let {
        println("pedido: ${pedido}")//mostra o valor
    }

    for (p in pedidos) {
        println("numero do pedido ${p.key}")
        println("valor do pedido ${p.value}")
    }

    pedidos[4] = 40.0
    println("pedidos: ${pedidos}")
    pedidos.put(5, 56.0)
    println("pedidos: ${pedidos}")

    pedidos[1] = 100.0
    println("pedido: ${pedidos}")

    pedidos.putIfAbsent(6, 200.0)
    println("pedido: ${pedidos}")

    pedidos.remove(6)
    println("pedido: ${pedidos}")
}