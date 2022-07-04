package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val maria = Gerente("Maria do Carmo", "36556998745", 500.00)
    imprimeRelatorioFuncionario.imprime(maria)
}