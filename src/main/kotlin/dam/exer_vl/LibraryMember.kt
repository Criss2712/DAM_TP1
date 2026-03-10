package org.example.dam.exer_vl

data class LibraryMember(
    val name: String,
    val membershipID: String,
    val borrowedBooks: MutableList<String> = mutableListOf() )
