package org.example.dam.exer_vl

class Library(val name: String) {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun borrowBook(title: String) {
        val book = books.find { it.title.equals(title, ignoreCase = true) }
        if (book != null) {
            if (book.availableCopies > 0) {
                val remaining = book.availableCopies - 1
                println("Successfully borrowed '$title'. Copies remaining: $remaining ")
                book.availableCopies = remaining
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
        books.forEach { println(it) }
    }

    fun searchByAuthor(author: String) {
        val results = books.filter { it.author.equals(author, ignoreCase = true) }
        if (results.isEmpty()) {
            println("No books found by $author")
        } else {
            println("Books by $author:")
            results.forEach {
                println("- ${it.title} (${it.bookEra}, ${it.availableCopies} copies available)")
            }
        }
    }
}