package model.caffe

import model.animals.Cat
import java.util.*

// TODO add data, such as ID, list of products, and maybe an optional set of cats adopted/sponsored!
data class Receipt (
    val id: String = UUID.randomUUID().toString(),
    val items:List<Product> = mutableListOf(),
    val adopted:Set<Cat>? = setOf(),
    val sponsors:Set<Cat>? = setOf()
)
