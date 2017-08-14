package org.nodexy

import java.util.logging.Logger

object CustomerService {
    val log: Logger = Logger.getLogger(CustomerService.javaClass.name)
    val contacts: HashMap<Long,Customer> = hashMapOf()
    var nextId = 0L

    fun findAll(): List<Customer> = findAll(null)
    fun findAll(filter: String?): List<Customer> {
        if (filter==null)
            return contacts.values.toList()
        else {
            return contacts.values.filter {
                it.firstName.contains(filter) ||
                        it.lastName.contains(filter)
            }
        }
    }
    fun delete(customer: Customer) {
        contacts.remove(customer.id)
    }

    fun add(customer: Customer) {
        contacts.put(nextId++, customer)
    }
}
