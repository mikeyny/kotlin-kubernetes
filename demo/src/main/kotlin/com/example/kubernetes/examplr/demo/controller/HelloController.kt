package com.example.kubernetes.examplr.demo.controller

import com.example.kubernetes.examplr.demo.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(
	private val helloService: HelloService
) {
	@GetMapping("/hello")
	fun hello(): String = helloService.getGreeting()
}
