package model

class Calc {

    var total:Double= 0.0
    private  set

    fun reg(func: Funcionario) {
        println("fazendo o calculo...")
        println("name: ${func.name}")
        this.total += func.bonificacao
    }



}