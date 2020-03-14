package com.example.kotlin_learning_part1.oop

// Companion object are same as object but declare within a class

fun main() {

    MyClass.id = 101
    println(MyClass.countryFrom())

}


class MyClass {

    companion object  { // constructor are not allow for object or singleton class
        var id: Int = -1 // behaves like static variable

        @JvmStatic
        fun countryFrom(): String { // behaves like static methods
            return "BD"
        }
    }

}

