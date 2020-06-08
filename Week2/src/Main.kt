import helper.CafeController
import model.cafe.Cafe
import model.cafe.Product
import model.shelter.Shelter
import repository.Repository

fun main () {
    val cafe = Cafe()
    val cafeController = CafeController()

 // ** EMPLOYEES **

    //employees check in demo
    cafe.checkInEmployee(Repository.arya)
    cafe.checkInEmployee(Repository.nat)
    cafe.checkInEmployee(Repository.peter)
    cafe.checkInEmployee(Repository.robb)
    println("")

    //employees check out demo
    cafe.checkOutEmployee(Repository.robb)
    println("")

    // ** ITEMS **

    //sell items demo
    cafeController.sellItems("Monday","601", Repository.customer1.id,Repository.coffeOrganic,2)
    cafeController.sellItems("Monday","603", Repository.customer2.id, Repository.cakeVegan,4)
    println("")

    //Report total items sells today
    cafe.showNumberOfReceiptsForDay("Monday")
    println("")

    //get total customers today
    cafe.getTotalCustomers("Monday")
    println("")

    // ** CATS **

    //add shelters to list shelter
    cafeController.shelter.add(Repository.shelter1)
    cafeController.shelter.add(Repository.shelter2)

    //Add cats to shelter1
    cafeController.shelter1Cats.add(Repository.morris)
    cafeController.shelter1Cats.add(Repository.orangey)
    cafeController.shelter1Cats.add(Repository.tobby)

    //Add cats to shelter2
    cafeController.shelter2Cats.add(Repository.choppy)
    cafeController.shelter2Cats.add(Repository.lewis)

    //put cats and shelter in a map
    cafeController.shelterToCat.put(Repository.shelter1 , cafeController.shelter1Cats)
    cafeController.shelterToCat.put (Repository.shelter2, cafeController.shelter2Cats)

    //adopt a cat, remove from shelter list, add to the happy customer
    cafeController.adoptCat(Repository.lewis.id, Repository.customer4)
    println("")

}