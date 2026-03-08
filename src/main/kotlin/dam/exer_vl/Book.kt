package org.example.dam.exer_vl

abstract class Book (val title: String, val author: String, val publicationYear : Int, availableCopies : Int){

    val bookEra: String
        get() {
            return when {
                publicationYear < 1980 -> "Classical"
                publicationYear in 1980..2010-> "Modern"
                else -> "Contemporary"
            }
        }

    var availableCopies: Int = availableCopies
        set(value) {
            val newValue = if (value < 0) 0 else value
            if (newValue == 0 && field > 0) {
                println("Warning: Book is now out of stock! ") // ou println
            }
            field = newValue
        }

    init {
        println("Book '$title' by $author has been added to the library.")
    }

    abstract fun getStorageInfo(): String

    override fun toString(): String {
        return "Title: $title, Author: $author, Era: $publicationYear, Available: $availableCopies copies\nStorage: ${getStorageInfo()}"
    }
}