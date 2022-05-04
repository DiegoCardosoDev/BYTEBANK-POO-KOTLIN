package model

class Gerente(
    name:String,
    year:Int,
    email:String,
    salario: Double,
    senha: Int

): FuncionarioAdmin(
    name = name,
    year = year,
    email  = email,
    salario = salario,
    senha = senha

), Autenticar{

    override val bonificacao: Double get() = salario * 0.2 + salario








}