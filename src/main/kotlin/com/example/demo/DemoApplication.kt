package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}

@RestController
class HelloController(
    private val userRepository: UserRepository
) {

    @GetMapping("/hello")
    fun hello(): String = "Hello World"

    @GetMapping( "/hello/{name}")
    fun getGreeting( @PathVariable name: String = "world"): String {
        return userRepository.findByName(name)
            ?.let { "Hello ${it.name}! Your email is ${it.email}." }
            ?: "Hello $name! (User not found in database)"
    }
}
