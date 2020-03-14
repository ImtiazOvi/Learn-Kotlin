package com.example.kotlin_learning_part1.oop

// TODO :: Abstract class or properties only use for set function and variable without value
// Abstract class are partially defined class
// Abstract class have no body when declare
// Abstract properties can't initialize when declare

fun main() {

    //  var myAbstractObj = MyAbstract()  // can't create abstract class object / instance

}

abstract class MyAbstract { // abstract class
    open var firstName: String = ""
    // abstract var lastName: String = "" // abstract variable can't be instantiate as like abstract class object creation
    abstract var lastName: String


    abstract fun eat() // abstract properties "open" by default and abstract function must not have body
    open fun run() { //  a "open" function ready to be overridden

    }

    fun sleep() { // a normal function "public" "final" by default

    }
}

class MyCharacters : MyAbstract() { // sub class or derived class
    override var firstName: String = "Imtiaz"  // this is override variable
    override var lastName: String =
        "Ovi"     // this is override variable which is abstract is super

    override fun eat() { // super class have a abstract function so must do override that function

    }

    override fun run() { // this is not must overridden function but this function is open function in super so it can be override

    }

    /*in super class also have a sleep function , it can't be override just because of that is public and final by default in super class*/
}