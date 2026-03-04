package org.example.dam.exer_1

fun main() {
    //Alínea (a): Using IntArray constructor
    // Array com 50 elementos inicializados a 0
    val a = IntArray(50)
    // Percorrer os valores de 1 a 50 para calcular o quadrado de cada um
    for (i in 1..50){
        // Começo no índice i-1, pois os arrays começam em 0, e não 1 (e o primeiro valor de i é 1)
        a[i-1] = i*i
    }
    print("(a) IntArray Constructor: " + a.toList())

    //Alínea (b): Using a range and map()
    // Utilização da transformação map() com função lambda que calcula o quadrado de cada valor
    val b = (1..50).map{it * it}
    print("\n(b) Range and Map: " + b.toList())

    //Alínea (c): Using Array with constructor
    // Utilização de um construtor de Arrays que preenche o array com o quadrado de cada valor de 1 a 50
    val c = Array(50) {i -> ((i+1)*(i+1))}
    print("\n(c) Array Constructor: " + c.toList())
}