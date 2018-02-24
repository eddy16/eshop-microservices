package com.micro.eshop.catalog.product

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/product")
class ProductController {

    @Value("\${server.port}")
    val portNumber: Int = 0

    @GetMapping
    fun someMethod() = println("Hola from port ${portNumber}")
}