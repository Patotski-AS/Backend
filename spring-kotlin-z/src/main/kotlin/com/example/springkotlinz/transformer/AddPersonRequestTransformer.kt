package com.example.springkotlinz.transformer

import com.example.springkotlinz.domain.Person
import com.example.springkotlinz.dto.AddPersonRequest
import org.springframework.stereotype.Component

@Component
class AddPersonRequestTransformer : Transformer<AddPersonRequest, Person> {
    override fun transform(source: AddPersonRequest): Person {
        return Person(
            name = source.name,
            lastname = source.lastName
        )
    }
}