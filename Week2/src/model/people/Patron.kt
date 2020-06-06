package model.people

import java.util.*

class Patron(
        val patronId: String = UUID.randomUUID().toString(),
        firstName: String,
        lastName: String,
        email: String,
        phoneNumber: String

) : Person(firstName = firstName, lastName = lastName, email = email, phoneNumber = phoneNumber) {

    override fun toString(): String {
        return "" // TODO format the data in any way you want! :]
    }


}