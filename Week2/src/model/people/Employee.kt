package model.people

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Employee(
        id:String,
        firstName: String,
        lastName: String,
        email: String,
        phoneNumber: String,
        val salary: Double,
        val socialSecurityNumber: String,
        val hireDate: String

) : Person(id = id, firstName = firstName, lastName = lastName, email = email, phoneNumber = phoneNumber) {


    override fun toString(): String {
        return "" // TODO format the data in any way you want! :]

    }

    fun clockIn(employee: Employee) {

        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("EEE, MMM d, yyyy -  h:mm a")
        val formatted = current.format(formatter)


        println( "${employee.fullName}, clock in: $formatted")

    }

    // TODO same as above, but times for clocking out!
    fun clockOut(employee: Employee) {
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("EEE, MMM d, yyyy -  h:mm a")
        val formatted = current.format(formatter)

        println( "${employee.fullName}, clock out: $formatted")

    }
}