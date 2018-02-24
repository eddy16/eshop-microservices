package com.micro.eshop.catalog

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class CatalogServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(CatalogServiceApplication::class.java, *args)
}
