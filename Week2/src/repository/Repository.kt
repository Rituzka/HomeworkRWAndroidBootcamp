package repository

import model.animals.Cat
import model.cafe.Product
import model.cafe.Sponsorship
import model.people.Employee
import model.people.Customer
import model.shelter.Shelter

object Repository {



    //cat sponsors
    val sponsor1 = Sponsorship("201A", "500C")
    val sponsor2 = Sponsorship("202A", "502C")
    val sponsor3 = Sponsorship("203A","502C")
    val sponsor4 = Sponsorship("125B", "503C")


    //Employees
    val robb = Employee("123A","Robb", "Skywalker","robb@gmail.com", "1938279192",
            2345.20,"078-05-1120","05-23-2019")
    val arya = Employee("124B","Arya", "Parker","arya@gmail.com", "3038279192",
            2435.20,"080-05-3120","12-17-2018")
    val peter = Employee("125B","Peter", "Strange","peter@gmail.com", "4338279192",
            2245.20,"120-05-5120","01-25-2020")
    val nat = Employee("126C", "Natasha", "Romanoff", "natasha@gmail.com","927393847", 2323.70,
    "121.07.3454","05-12-1993")

    //Cats
    val morris = Cat("500C","Morris", "Tabby tomcat", 'm',242 )
    val orangey = Cat("501C","Orangey", "Toyger", 'm',242)
    val lewis = Cat("502C","Lewis Carrol", "Cheshire", 'f',249)
    val choppy = Cat("503C","Chouppette", "Birman", 'f',249)
    val tobby = Cat("504C","Tobby", "Marmalade Tabby", 'm',242)

    //Shelters
    val shelter1 = Shelter(242, "Sam's Shameless Furballs")
    val shelter2 = Shelter(249, "Andrea's Playful Kittens")

    //Customers
    val customer1 = Customer("126C", "Natasha", "Romanoff","natasha@gmail.com",
            "927393847")
    val customer2 = Customer("201A", "Steve", "Rogers","capi@gmail.com",
            "123393847")
    val customer3 = Customer("202A", "Tony", "Stark","ironTony@gmail.com",
            "435393847")
    val customer4 = Customer("203A", "Peter", "Parker","spider@gmail.com",
            "739393847")

    // Products
    val coffeOrganic = Product(23, 2.10)
    val orangeJuice = Product(34, 3.50)
    val muffins = Product(56, 1.90)
    val cakeVegan = Product(67, 4.90)
    val soda = Product(12, 1.80)


}