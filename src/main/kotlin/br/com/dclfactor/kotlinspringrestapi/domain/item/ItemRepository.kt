package br.com.dclfactor.kotlinspringrestapi.domain.item

import org.springframework.data.jpa.repository.JpaRepository

interface ItemRepository: JpaRepository<ItemOrder, Int>