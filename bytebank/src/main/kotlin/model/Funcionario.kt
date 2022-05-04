package model

abstract class Funcionario(
    val name: String,
    val year: Int,
    val email: String,
    val salario: Double,
){

    /*técnica properties*/
    open val bonificacao: Double get() = salario * 0.1

    override fun toString(): String {
        return "name:'$name',\n idade:$year,\n email:'$email',\n salario:$salario\n"

    }




}



