package one.digitalinnovation.digionebank

import java.math.BigDecimal
import java.util.function.BiConsumer

class Conta (
    val agencia: String,
    val numero: String,
    val saldo: BigDecimal){

    fun deposito(valor: BigDecimal) {

    }

    fun saque(valor: BigDecimal){

    }
}
