package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val joao = Analista("Joao marcelo", "65987456984", 200.00)
    fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())
    imprimeRelatorio(joao)
}