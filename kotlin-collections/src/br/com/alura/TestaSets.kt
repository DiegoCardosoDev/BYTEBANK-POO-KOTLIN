package br.com.alura

fun testaSet() {
    val assistiramKotlin: Set<String> = setOf("Alex", "Maria", "Jose", "Julia")
    val assistiramAndroid: Set<String> = setOf("Marcos", "Miriam", "Rafa", "Valdeci")

//    val assistiramAmbos = assistiramKotlin +  assistiramAndroid

    val assistiramAmbos = mutableSetOf<String>()

    assistiramAmbos.addAll(assistiramAndroid)
    assistiramAmbos.addAll(assistiramKotlin)
    assistiramAmbos.add("Joseph")
    assistiramAmbos.add("Joseph")
    println(assistiramAmbos)

    /*infix*/
    println(assistiramAndroid union assistiramKotlin)
    println(assistiramAndroid subtract assistiramKotlin)
    println(assistiramAndroid intersect assistiramKotlin)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Maria")
    println(assistiramList.toSet())
}