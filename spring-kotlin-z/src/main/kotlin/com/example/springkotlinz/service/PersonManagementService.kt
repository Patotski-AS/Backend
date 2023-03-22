package com.example.springkotlinz.service

import com.example.springkotlinz.dto.AddPersonRequest
import com.example.springkotlinz.dto.PersonResponse
import com.example.springkotlinz.dto.UpdatePersonRequest

interface PersonManagementService {
    fun findById(id: Long): PersonResponse?
    fun findAll(): List<PersonResponse>
    fun save(addPersonRequest: AddPersonRequest): PersonResponse
    fun update(updatePersonRequest: UpdatePersonRequest): PersonResponse
    fun deleteById(id: Long)
}