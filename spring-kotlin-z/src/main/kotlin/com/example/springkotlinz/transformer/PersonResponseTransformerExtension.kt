package com.example.springkotlinz.transformer

import com.example.springkotlinz.domain.Person
import com.example.springkotlinz.dto.PersonResponse

fun Person?.toPersonResponse(): PersonResponse {
    return PersonResponse(
        id = this?.id ?: 1L,
        fillName = "${this?.lastname}, ${this?.name}"
    )
}