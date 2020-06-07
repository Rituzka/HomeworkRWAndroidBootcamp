package model.cafe

import model.animals.Cat
import java.util.*



// TODO add data, such as ID, list of products, and maybe an optional set of cats adopted/sponsored!
data class Receipt(
        val id: String = UUID.randomUUID().toString(),
        val customerId: String,
        val items: Map<Product, Int> = mutableMapOf(),
        val adopted: Set<Cat>? = mutableSetOf(),
        val sponsors: Set<Cat>? = mutableSetOf()
){
    companion object {
        val receiptSet = mutableSetOf<Receipt>()
    }
  /*  var receiptTotal: Double
    get() {

    }*/

}
