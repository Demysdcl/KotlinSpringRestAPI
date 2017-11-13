package br.com.dclfactor.kotlinspringrestapi.domain.product

import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, Int>