package Exercicio_06_


fun main() {
    val kotlin="produto mais caro em array"
    println(kotlin)
    data class Produtos(val nome:Strinf,val preco:Double)
    val produtos = listOf(
        Produto("Teclado",110.0),
        Produto("Mouse",78.0),
        Produto("Monitor",887.0)
    )
    val maisCaro = produto.maxByOrNull {it.preco}
    println("O produto mais caro é:${maisCaro?.nome} custa R$
        ${maisCaro?.preco}")
}