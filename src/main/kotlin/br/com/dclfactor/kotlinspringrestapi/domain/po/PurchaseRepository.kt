package br.com.dclfactor.kotlinspringrestapi.domain.po

import org.springframework.data.jpa.repository.JpaRepository

interface PurchaseRepository: JpaRepository<PurchaseOrder, Int>