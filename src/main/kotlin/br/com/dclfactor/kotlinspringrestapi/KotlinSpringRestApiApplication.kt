package br.com.dclfactor.kotlinspringrestapi

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinSpringRestApiApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSpringRestApiApplication::class.java, *args)
}
