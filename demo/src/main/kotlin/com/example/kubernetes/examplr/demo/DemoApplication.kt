package com.example.kubernetes.examplr.demo

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}

@RestController
class HelloController() {

    @Value("\${greeting.message:Hello}")
    lateinit var greetingMsg: String

	@GetMapping("/hello")
	fun hello(): String = greetingMsg
}
