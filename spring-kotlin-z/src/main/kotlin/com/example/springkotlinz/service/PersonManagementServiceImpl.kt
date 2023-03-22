package com.example.springkotlinz.service

import com.example.springkotlinz.dao.PersonDao
import com.example.springkotlinz.dto.AddPersonRequest
import com.example.springkotlinz.dto.PersonResponse
import com.example.springkotlinz.dto.UpdatePersonRequest
import org.springframework.stereotype.Service

@Service
class PersonManagementServiceImpl(
    private val personDao: PersonDao
) : PersonManagementService {
    override fun findById(id: Long): PersonResponse? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<PersonResponse> {
        TODO("Not yet implemented")
    }

    override fun save(addPersonRequest: AddPersonRequest): PersonResponse {
        TODO("Not yet implemented")
    }

    override fun update(updatePersonRequest: UpdatePersonRequest): PersonResponse {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Long) {
        TODO("Not yet implemented")
    }
}