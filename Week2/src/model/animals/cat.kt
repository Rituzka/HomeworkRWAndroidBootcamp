package model.animals

import model.caffe.Sponsorship
import java.util.*

data class Cat(
        val id: String = UUID.randomUUID().toString(),
        val name: String,
        val breed: String,
        val gender: Char,
        val shelterId: Int,
        val sponsorships: MutableSet<Sponsorship> = mutableSetOf()
)
