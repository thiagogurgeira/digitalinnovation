package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Thiago"

    var cpf:String = "335.223.638-13"
    private set
}

fun main(){
    val thiago = Pessoa()
    thiago.nome = "Thiago Gurgeira"
    println(thiago.nome)
    println(thiago.cpf)

}