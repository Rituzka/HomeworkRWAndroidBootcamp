import helper.CafeController
import model.cafe.Cafe
import model.cafe.Product
import repository.Repository

fun main () {
    val cafe = Cafe()
    val cafeController = CafeController()

    //employees check in
    cafe.checkInEmployee(Repository.arya)
    cafe.checkInEmployee(Repository.nat)
    cafe.checkInEmployee(Repository.peter)
    cafe.checkInEmployee(Repository.robb)
    println("")

    //employees check out
    cafe.checkOutEmployee(Repository.robb)

    //sell items



}