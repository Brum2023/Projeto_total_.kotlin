fun main() {
    val kotlin="Funcionário e Chefe"
    println(kotlin)

    open class Funcionário(val nome:String, open val salario:Double){
        open fun retornarSalario():DOuble = slario
    }
    class Gerente(nome: String,salario: Double) :Funcionario(val nome:String,open val salario : DOuble){
        open fun retornarSalario(): DOuble = salario
    }
    class Gerente: String,salario:Double) :Funcionamento (nome,salrio) {
        override fun retornoSalario():DOuble
        return super.retornosalario()*3.45
    }
}
val g1 = Gerente("Roberto",4600.00)
println("Salário do Gerente com comissão: ${g1.retornarSalario()})


