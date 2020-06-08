package model.people

import helper.CafeController
import model.animals.Cat
import model.cafe.Sponsorship
import java.util.*
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

open class Person(

        val id: String,
        val firstName: String,
        val lastName: String,
        val phoneNumber: String,
        val email: String,
        val cats: MutableSet<Cat> = mutableSetOf()

) {
    val cafeController = CafeController()

    var isAdopted: Boolean by Delegates.observable(false){
        _kProperty: KProperty<*>, old: Boolean, new: Boolean ->

    }

    val fullName = "$firstName $lastName"
}