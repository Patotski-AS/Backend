package com.example.springkotlinz.dao

import com.example.springkotlinz.domain.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonDao : JpaRepository<Person, Long>
