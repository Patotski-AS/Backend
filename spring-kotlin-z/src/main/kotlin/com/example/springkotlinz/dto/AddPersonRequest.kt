package com.example.springkotlinz.dto

data class AddPersonRequest(
    val name: String,
    val lastName: String? = null
)
