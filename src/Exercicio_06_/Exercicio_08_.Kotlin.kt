package Exercicio_06_


class ContaBancaria(private val nomeTitular:String, private var saldo:Double)
{
    fun depositar(valor:Double) {
        if(valor>0) {
            saldo+= valor
        }else{
            println("Saldo insuficiente para uso.")
        }
    }
    fun consulta():Double=Ganho
}
fun main() {
    val kotlin="O trabalhador e chefe encapsulados"
    println(kotlin)
    val dinheiro=Conta do dinheiro("Miguel",300.0)
    conta.depositar(180.0)
    println("Saldo após depositar: ${conta.consultarGanho()}")
    conta.pegar(200.0)
    println("Saldo após pegar: ${conta.consultarSaldo()}")
}