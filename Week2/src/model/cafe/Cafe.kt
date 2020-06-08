package model.cafe

import helper.CafeController
import model.animals.Cat
import model.people.Customer
import model.people.Employee
import model.people.Person

class Cafe {
    companion object {
        val employees = mutableSetOf<Employee>()
        val customers = mutableSetOf<Person>()
        val sponsorships = mutableSetOf<Sponsorship>()

        //To simplify it, let's imitate a week-long cafe turnaround(map of day and set of Receipt)
        val receiptsByDay = mutableMapOf(
                "Monday" to Receipt.receiptSet,
                "Tuesday" to Receipt.receiptSet,
                "Wednesday" to Receipt.receiptSet,
                "Thursday" to Receipt.receiptSet,
                "Friday" to Receipt.receiptSet,
                "Saturday" to Receipt.receiptSet,
                "Sunday" to Receipt.receiptSet
        )
        val cafeController = CafeController()
    }

    //added to list employee if check in
    fun checkInEmployee(employee: Employee) {
        employee.clockIn(employee)
        employees.add(employee)
    }

    //removed from list employee if check out
    fun checkOutEmployee(employee: Employee) {
        employee.clockOut(employee)
        employees.remove(employee)
    }

    fun showNumberOfReceiptsForDay(day: String) {
        val receiptDay = receiptsByDay[day]
        ("No transactions today? Something has to be wrong!").also {
            receiptDay ?: println(it)
        }
        println("On $day you made ${receiptsByDay[day]?.size} transactions!")

    }

    //add sponsor object to set Sponsorship
    fun addSponsorship(customerId: String, catId: String) {
        val sponsor = Sponsorship(customerId, catId)
        sponsorships.add(sponsor)

    }

    fun getTotalCustomers(day: String) {
        val receiptDay = receiptsByDay.get(day)
        var customersDay = 0
        for(it in receiptDay!!) {
          customersDay =  it.customerId.count()
        }
        println("On $day, the total numbers of customers was: $customersDay")

    }

    fun getTotalCustomersNonEmployees(day: String) {
      val toPrint = customers.filter { it is Employee }
        toPrint.size
        println("On day $day, total customers = $customers.size, non employees = $toPrint")
    }

    fun getAdoptedCats() {
            println("Cats Adopted:")
        cafeController.catsAdopted.forEach {
            println(it.name)
        }
    }

    fun getSponsoredCats(): Set<Cat> {
       return emptySet()

    }

    fun getMostPopularCats(): Set<Cat> {
        return emptySet()
    }

    fun getTopSellingItems(): Set<Product> {
        return emptySet()
    }

    fun getAdopters(): List<Person> {
        return (employees + customers).filter { it.cats.isNotEmpty() }
    }

    fun getReceipt(day: String, customerId: String, items: Map<Product, Int>) {
        val receiptDay = receiptsByDay[day]

        val receipt = receiptDay?.find { it.customerId == customerId && it.items == items }

        println("Receipt nº ${receipt?.id}   CustomerId: ${receipt?.customerId} \t ITEMS ${receipt?.items?.keys}\t " +
                " Total = $ ${receipt?.totalReceipt} \t Thank You & come back soon!!")


    }

}