package com.example.kotlin_learning_part1.oop

//TODO : What is SingleTon ?
// When we have just one instance of class in the whole application
// we have no control Singleton in kotlin, because kotlin handle it internally
// If class Student is declare Singleton then we can't create object for this class


// in kotlin we cannot declare static variables and methods
// so we have alternative : we can declare "object"
// this creates a SingleTon object when programs runs


//TODO : Notes

// When we use "Object", kotlin initially creates a class and an object / instance
// and this object can have properties, methods and initializer
// can't have constructor --> can't creates object and instance manually
// "object" can have also super class
// support inheritance


fun main() {

    Customer.id = 101
    println(Customer.id)
    println(Customer.countryFrom())
    Customer.myMethods("Hello")

}

open class ExampleSuperClass { // super class

    open fun myMethods(str: String) {
        println(str)
    }

}


object Customer : ExampleSuperClass() { // constructor are not allow for object or singleton class
    var id: Int = -1 // behaves like static variable

    fun countryFrom(): String { // behaves like static methods
        return "BD"
    }

    override fun myMethods(str: String) { // currently behaving like static but in super this is not static
        super.myMethods(str)
    }
}