package com.example.gmail

data class EmailModel(
    val name: String,
    val message: String,
    val avatar: String,
    val time: String,
    var selected: Boolean
)