package arrays

fun main(){

    var  idade1 = 25
    var  idade2 = 55
    var  idade3 = 33

    val maioridade = if (idade1 > idade2 && idade1 > idade3){
        idade1

    }else if (idade2 >  idade3){
        idade2

    }else{
        idade3

    }
    println(maioridade)

    val idades: IntArray = intArrayOf(25,19,66)

//    idades[0] = 25
//    idades[1] = 19
//    idades[2] = 66
    println(idades)
    println("------------------")


    var maiorId = 0
    for (idade in idades ){
        if (idade > maiorId){
            maiorId = idade
        }
    }
    println("maior: ${maiorId}")

    var menorIdade =  Int.MAX_VALUE
    idades.forEach { idade ->

        if (idade< menorIdade){
            menorIdade = idade
        }
    }
    println("menor: ${menorIdade}")
}