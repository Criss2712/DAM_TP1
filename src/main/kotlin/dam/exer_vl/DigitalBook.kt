package org.example.dam.exer_vl

class DigitalBook(
    title: String,
    author: String,
    publicationYear: Int,
    availableCopies: Int,
    val fileSize: Double,
    val format: String
) : Book(title, author, publicationYear, availableCopies) {
    override fun getStorageInfo(): String {
        return "Stored digitally: $fileSize MB, Format: $format"
    }
}