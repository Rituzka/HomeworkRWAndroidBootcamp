package repository

import model.animals.Cat
import model.caffe.Product
import model.caffe.Sponsorship
import model.people.Employee
import model.people.Customer
import model.shelter.Shelter

class Repository {


    val sponsorship1 = mutableSetOf<Sponsorship>()

    //Employees
    val robb = Employee("","Robb", "Skywalker","robb@gmail.com", "1938279192",
            2345.20,"078-05-1120","05-23-2019")
    val arya = Employee("","Arya", "Parker","arya@gmail.com", "3038279192",
            2435.20,"080-05-3120","12-17-2018")
    val peter = Employee("","Peter", "Strange","peter@gmail.com", "4338279192",
            2245.20,"120-05-5120","01-25-2020")

    //Cats
    val morris = Cat("","Morris", "Tabby tomcat", 'm',242,
    sponsorship1)
    val orangey = Cat("","Orangey", "Toyger", 'm',242,
            sponsorship1)
    val lewis = Cat("","Lewis Carrol", "Cheshire", 'f',249,
            sponsorship1)
    val choppy = Cat("","Chouppette", "Birman", 'f',249,
            sponsorship1)
    val tobby = Cat("","Tobby", "Marmalade Tabby", 'm',242,
            sponsorship1)

    //Shelters
    val shelter1 = Shelter(242, "Sam's Shameless Furballs")
    val shelter2 = Shelter(249, "Andrea's Playful Kittens")

    //Patrons
    val patron1 = Customer("", "Natasha", "Romanoff","natasha@gmail.com",
            "927393847")
    val patron2 = Customer("", "Steve", "Rogers","capi@gmail.com",
            "123393847")
    val patron3 = Customer("", "Tony", "Stark","ironTony@gmail.com",
            "435393847")
    val patron4 = Customer("", "Peter", "Parker","spider@gmail.com",
            "739393847")

    // Products
    val coffeOrganic = Product(23, 2.10)
    val orangeJuice = Product(34, 3.50)
    val muffins = Product(56, 1.90)
    val cakeVegan = Product(67, 4.90)
    val soda = Product(12, 1.80)





}