package org.example.dam.exer_vl

class Library(val name: String) {
    // Lista mutável para armazenar os livros
    private val books = mutableListOf<Book>()

    // Métodos a implementar:
    fun addBook(book: Book) {
        // Adiciona um livro à lista
        books.add(book)
    }

    fun borrowBook(title: String) {
        // Procura um livro pelo título e diminui as cópias disponíveis
        val book = books.find { it.title.equals(title, ignoreCase = true) }
        if (book != null) {
            if (book.availableCopies > 0) {
                book.availableCopies--
                println("Successfully borrowed '$title'. Copies remaining: ${book.availableCopies}")
            } else {
                println("Sorry, no copies available for '$title'")
            }
        } else {
            println("Book '$title' not found")
        }
    }

    fun returnBook(title: String) {
        val book = books.find { it.title.equals(title, ignoreCase = true) }
        if (book != null) {
            book.availableCopies++
            println("Book '$title' returned successfully. Copies available: ${book.availableCopies}")
        } else {
            println("Book '$title' not found")
        }
    }

    fun showBooks() {
        println("\n--- Library Catalog ---")
        books.forEach { println(it) } // Chama toString() de cada livro
    }

    fun searchByAuthor(author: String) {
        val results = books.filter { it.author.equals(author, ignoreCase = true) }
        if (results.isEmpty()) {
            println("No books found by $author")
        } else {
            println("Books by $author:")
            results.forEach {
                println("- ${it.title} (${it.publicationYear}, ${it.availableCopies} copies available)")
                // Atenção: it.publicationYear é a string (Classic/Modern/Contemporary) – é isso que queremos?
                // No exemplo do enunciado aparece "Classic", "Modern", etc. Portanto sim.
            }
        }
    }
}