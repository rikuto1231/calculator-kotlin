package org.example.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/api/hello")
    fun hello(@RequestParam(value = "name", defaultValue = "World") name: String): Map<String, String> {
        return mapOf("message" to "Hello, $name!")
    }

    @GetMapping("/kotlin")
    fun kotlinHello(): Map<String, Any> {
        val result = mutableMapOf<String, Any>()
        result["message"] = "Hello, Kotlin!"
        result["numbers"] = (1..5).toList()
        return result
    }
} 