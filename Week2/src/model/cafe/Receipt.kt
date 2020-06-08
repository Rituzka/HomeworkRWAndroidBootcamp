package model.cafe

import model.animals.Cat
import model.cafe.Cafe.Companion.customers
import model.cafe.Cafe.Companion.employees
import model.people.Customer
import model.people.Employee
import model.people.Person
import java.util.*
import kotlin.random.Random


// TODO add data, such as ID, list of products, and maybe an optional set of cats adopted/sponsored!
class Receipt(
        val id: String,
        val customerId: String = "",
        val items: Map<Product, Int> = mutableMapOf()
        //val adopted: Set<Cat>? = mutableSetOf(),
        //val sponsors: Set<Cat>? = mutableSetOf()
) {
    companion object{
        val receiptSet = mutableSetOf<Receipt>()
    }

    val totalReceipt: Double
        get() {
                var total: Double = 0.0
                items.keys.map {
                    total += (it.price * items.getValue(it))
                }
            return total
        }


}
