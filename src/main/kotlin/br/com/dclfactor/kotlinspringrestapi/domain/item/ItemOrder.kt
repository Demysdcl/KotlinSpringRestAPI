package br.com.dclfactor.kotlinspringrestapi.domain.item

import br.com.dclfactor.kotlinspringrestapi.domain.po.PurchaseOrder
import br.com.dclfactor.kotlinspringrestapi.domain.product.Product
import java.math.BigDecimal
import javax.persistence.*

@Entity
data class ItemOrder (

        @Id
        @GeneratedValue
        @Column(name = "item_id")
        var id: Int? = null,

        @ManyToOne
        val product: Product = Product(),

        val quantity: Int = 0,

        val value: BigDecimal = BigDecimal(0),

        @ManyToOne
        val purchaseOrder: PurchaseOrder = PurchaseOrder()

)