package model

class Analista(
    name:String,
    year:Int,
    email:String,
    salario: Double,

): Funcionario(name = name,
    year = year,
    email  = email,
    salario = salario,
){

    override val bonificacao: Double get() = salario * 0.2 + salario * 0.2








}