package org.nodexy

import java.time.LocalDate

data class Customer(
        var id: Long = -1,
        val firstName: String = "",
        val lastName: String = "",
        val birthDate: LocalDate,
        val status: CustomerStatus,
        val email: String = ""
)
