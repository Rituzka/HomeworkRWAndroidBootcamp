package helper
import model.animals.Cat
import model.cafe.Cafe
import model.cafe.Product
import model.cafe.Receipt
import model.people.Person
import model.shelter.Shelter
import repository.Repository

class CafeController {

    private val cafe = Cafe()
    val shelterToCat = mutableMapOf<Shelter, MutableSet<Cat>>()
    val shelter = mutableSetOf<Shelter>()
    val shelter1Cats = mutableSetOf<Cat>()
    val shelter2Cats = mutableSetOf<Cat>()
    val catsAdopted = mutableSetOf<Cat>()


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
            catsAdopted.add(cat)

            println("Identity of Cat adopted: ${cat.name} , from shelter ${catInShelter.key.name}, customer" +
                    " ${person.fullName} is the lucky one. Congratulations family!!")
        }
    }
    //create receipt, add in Set of receipts and print it
    fun sellItems(day: String, id: String, customerId: String, item: Product, quantity: Int) {
        val items = mutableMapOf<Product, Int>()
        items.put(item, quantity)

        //add ticket in setReceipts
        val ticket = Receipt(id, customerId, items)
        Cafe.receiptsByDay[day]?.add(ticket)

        cafe.getReceipt(day, customerId, items)

    }

    fun getNumberOfAdoptionsPerShelter(): Map<String, Int> {
        val allAdopters = cafe.getAdopters()
        val adoptionsPerShelter = mutableMapOf<String,Int>()
        var total:Int = 0
        val size = adoptionsPerShelter.size
              catsAdopted.forEach {
                 if(it.shelterId == 242) {
                     total += 1
                     adoptionsPerShelter.put(Repository.shelter1.name, total)
                 }else
                     adoptionsPerShelter.put(Repository.shelter2.name,(size-total))
              }

        return adoptionsPerShelter
    }

    //cats still in shelter
    fun getUnadoptedCats(): Set<Cat> {
        val setCats = mutableSetOf<Cat>()
        for (value in shelterToCat.values) {
            setCats.addAll(value)
        }
        return setCats
    }
}