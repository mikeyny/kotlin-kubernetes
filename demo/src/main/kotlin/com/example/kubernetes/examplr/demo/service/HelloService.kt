package com.example.kubernetes.examplr.demo.service

import org.springframework.stereotype.Service

@Service
class HelloService {
	fun getGreeting(): String = "hello world"
}
