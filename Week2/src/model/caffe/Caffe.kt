package model.caffe

import model.animals.Cat
import model.people.Employee
import model.people.Person

class Cafe {

    private val employees = mutableSetOf<Employee>()
    private val customers = mutableSetOf<Person>()
    private val sponsorships = mutableSetOf<Sponsorship>()

    //To simplify it, let's imitate a week-long cafe turnaround.
    private val receiptsByDay = mutableMapOf(
            "Monday" to mutableSetOf<Receipt>(),
            "Tuesday" to mutableSetOf<Receipt>(),
            "Wednesday" to mutableSetOf<Receipt>(),
            "Thursday" to mutableSetOf<Receipt>(),
            "Friday" to mutableSetOf<Receipt>(),
            "Saturday" to mutableSetOf<Receipt>(),
            "Sunday" to mutableSetOf<Receipt>()
    )

    //add to list employee if check in
    fun checkInEmployee(employee: Employee) {
     employee.clockIn(employee)
        employees.add(employee)
    }

    //remove from list employee if check out
    fun checkOutEmployee(employee: Employee) {
         employee.clockOut(employee)
         employees.remove(employee)
    }

    fun showNumberOfReceiptsForDay(day: String) {
        val receiptDay = receiptsByDay[day]
        val noTickets = ("No transactions today? Something has to be wrong!").also {
            receiptDay?: println(it)
        }
        println("On $day you made ${receiptsByDay[day]?.size} transactions!")

    }
    //add sponsor object to set Sponsorship
    fun addSponsorship(customerId: String, catId: String) {
        val sponsor = Sponsorship(customerId, catId)
        sponsorships.add(sponsor)

    }

    fun getWorkingEmployees(): Set<Employee> = employees

    fun getTotalCustomers(day: String){
        val receiptDay = receiptsByDay[day]
        var totalCustomers = 0

        //an iteration on Set<Receipt> to count customers of the day
        if (receiptDay != null) for ( receipt in receiptDay){
            totalCustomers = receipt.customerId.count()
        }

        println("On $day, the total numbers of customers was: $totalCustomers")

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
        return (employees + customers).filter { it.cats.isNotEmpty() }
    }
}