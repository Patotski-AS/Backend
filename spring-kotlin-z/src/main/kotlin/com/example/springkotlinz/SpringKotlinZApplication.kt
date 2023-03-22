package com.example.springkotlinz

import com.example.springkotlinz.domain.Person
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class SpringKotlinZApplication {

    @RequestMapping("/")
    fun hi(): Person {
        return Person()
    }
}

fun main(args: Array<String>) {
    runApplication<SpringKotlinZApplication>(*args)
}
