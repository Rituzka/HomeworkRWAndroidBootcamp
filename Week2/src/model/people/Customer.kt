package model.people

import java.util.*

class Customer(

        id:String,
        firstName: String,
        lastName: String,
        email: String,
        phoneNumber: String

) : Person(id = id, firstName = firstName, lastName = lastName, email = email, phoneNumber = phoneNumber) {

    override fun toString(): String {
        return "" // TODO format the data in any way you want! :]
    }


}