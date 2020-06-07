package model.caffe

import model.animals.Cat
import model.people.Employee
import model.people.Person

class Cafe {


    // cafe related stuff

    /**
     * To simplify it, let's imitate a week-long cafe turnaround.
     *
     * Make sure to add your receipts to each set, with your data.
     * */
    private val receiptsByDay = mutableMapOf(
            "Monday" to mutableSetOf<Receipt>(),
            "Tuesday" to mutableSetOf<Receipt>(),
            "Wednesday" to mutableSetOf<Receipt>(),
            "Thursday" to mutableSetOf<Receipt>(),
            "Friday" to mutableSetOf<Receipt>(),
            "Saturday" to mutableSetOf<Receipt>(),
            "Sunday" to mutableSetOf<Receipt>()
    )

    // maybe as employees check in, you can add them to the list of working employees!
    private val employees = mutableSetOf<Employee>()
    private val patrons = mutableSetOf<Person>()

    // make sure to add sponsorships and tie them to people!
    private val sponsorships = mutableSetOf<Sponsorship>()

    // TODO Add logic for checking in and checking out!
    fun checkInEmployee(employee: Employee) {
     employee.clockIn(employee)
        employees.add(employee)
    }

    fun checkOutEmployee(employee: Employee) {
         employee.clockOut(employee)
         employees.remove(employee)
    }

    fun showNumberOfReceiptsForDay(day: String) {
        val errorDay = "Wrong day inserted"
        val receiptForDay = receiptsByDay[day] ?: errorDay

        println("On $day you made ${receiptsByDay.size} transactions!")
    }

    fun getReceipt(items: List<Product>, patronId: String): Receipt {
        // TODO return a receipt! Also make sure to check if customer is also an employee
        return Receipt()
    }

    fun addSponsorship(catId: String, patronId: String) {
        // TODO add the sponsorship

    }

    fun getWorkingEmployees(): Set<Employee> = employees

    fun getTotalPatrons(day: String):Int{
        val receiptDay = receiptsByDay[day]
        val patron = mutableSetOf<String>()

        if (receiptDay != null) {
            receiptDay.forEach {
             patron.add(it.id)
            }
        }
        return patrons.size
    }

    fun getAdoptedCats(): Set<Cat> {
        return emptySet()
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
        return (employees + patrons).filter { it.cats.isNotEmpty() }
    }
}