package com.micro.eshop.inventory

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class InventoryServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(InventoryServiceApplication::class.java, *args)
}
