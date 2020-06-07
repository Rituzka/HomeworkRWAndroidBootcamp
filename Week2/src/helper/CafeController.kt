package helper
import model.animals.Cat
import model.cafe.Cafe
import model.cafe.Product
import model.cafe.Receipt
import model.people.Person
import model.shelter.Shelter

class CafeController {

    // cafe related things
    private val cafe = Cafe()

    // shelter related things // TODO make sure to fill in the data!
    private val shelters = mutableSetOf<Shelter>()
    private val shelterToCat = mutableMapOf<Shelter, MutableSet<Cat>>()

    fun adoptCat(catId: String, person: Person) {
        // check if cats exist, and retrieve its entry!
        val catInShelter = shelterToCat.entries.firstOrNull { (_, catsInShelter) ->
            catsInShelter.any { it.id == catId }
        }

        // you can adopt that cat!
        if (catInShelter != null) {
            val cat = catInShelter.value.first { cat -> cat.id == catId } // find the cat for that ID again

            // remove the cat from the shelter
            catInShelter.value.remove(cat)

            // add the cat to the person
            person.cats.add(cat)
        }
    }
    //create receipt, add in Set of receipts and print it
    fun sellItems(day: String, items: Map<Product, Int>, customerId: String) {
        val ticket = Receipt("", customerId, items)
        cafe.receiptsByDay[day]?.add(ticket)
        
        val receipt = cafe.getReceipt(day, customerId, items)

    }

    /**
     * First gets a list of all adopters, then queries shelters.
     *
     * */
    fun getNumberOfAdoptionsPerShelter(): Map<String, Int> {
        val allAdopters = cafe.getAdopters()

        return emptyMap() // TODO find which cats belong to which shelter, and create a map of Shelter name to number of adoptions
    }

    fun getUnadoptedCats(): Set<Cat> {
        return emptySet()
    }
}
