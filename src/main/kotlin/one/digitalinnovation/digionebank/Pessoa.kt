package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Thiago"

    var cpf:String = "335.223.638-13"
    private set

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val thiago = Pessoa()

    println(thiago.pessoaInfo())
}