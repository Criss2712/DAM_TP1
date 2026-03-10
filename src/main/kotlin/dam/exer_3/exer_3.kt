package org.example.dam.exer_3

fun main() {
    println("+++++++ Sequência de Saltos +++++++")
    // Altura inicial: 100
    // Função: it*0.6 -> pega no valor anterior e calcula o próximo
    val bounceSequence = generateSequence(100.0) {it * 0.6}
        .take(15)          // Os primeiros 15 ressaltos
        .filter { it >= 1.0 } // Filtrar para obter apenas ressaltos superiores a 1 metro
        .toList()             // Conversão para lista

    // Apresentação da sequência com duas casas decimais
    bounceSequence.forEach {println(String.format("%.2f", it))}
}