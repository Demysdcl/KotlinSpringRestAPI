package br.com.dclfactor.kotlinspringrestapi.domain.product

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Product(
       @Id
       @GeneratedValue
       @Column(name = "product_id")
       var id: Int? = null,

       var description: String = ""
)