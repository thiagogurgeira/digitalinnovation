package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val thiago = Pessoa(nome = "Thiago Gurgeira", cpf = "32698545698")
    println(thiago.nome)
    println(thiago.cpf)

    val joao = Funcionario("Joao marcelo", "65987456984", BigDecimal(2000))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)


}