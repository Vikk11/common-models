package com.savvy.commonmodels

import java.math.BigDecimal


data class TransactionEvent (
        val userId: Long,
        val amount: BigDecimal,
        val type: String,
        val categoryId: Long
)