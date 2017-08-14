package org.nodexy

import java.time.LocalDate
import java.util.*

class CustomerSeeder {
    fun seed() {
        if (CustomerService.findAll().isEmpty()) {
            val rand = Random(0)

            val names = listOf("Gabrielle Patel", "Brian Robinson", "Eduardo Haugen",
                    "Koen Johansen", "Alejandro Macdonald", "Angel Karlsson", "Yahir Gustavsson", "Haiden Svensson",
                    "Emily Stewart", "Corinne Davis", "Ryann Davis", "Yurem Jackson", "Kelly Gustavsson",
                    "Eileen Walker", "Katelyn Martin", "Israel Carlsson", "Quinn Hansson", "Makena Smith",
                    "Danielle Watson", "Leland Harris", "Gunner Karlsen", "Jamar Olsson", "Lara Martin",
                    "Ann Andersson", "Remington Andersson", "Rene Carlsson", "Elvis Olsen", "Solomon Olsen",
                    "Jaydan Jackson", "Bernard Nilsen")
            names.forEach {
                val f = it.split(" ").first()
                val l = it.split(" ").last()
                CustomerService.add(Customer(firstName = f, lastName = l, email = "$f.$l@yahoo.com", birthDate = LocalDate.now().plusDays((0-rand.nextInt(365 * 15 + 365 * 60)).toLong()), status = CustomerStatus.values()[rand.nextInt(CustomerStatus.values().size)]))
            }
        }
    }
}