package com.savvy.commonmodels

import java.math.BigDecimal

data class PaymentEvent (
        val requesterId: Long,
        val payerId: Long?,
        val groupId: Long?,
        val amount: BigDecimal,
        val description: String?,
        val isRecurring: Boolean
)