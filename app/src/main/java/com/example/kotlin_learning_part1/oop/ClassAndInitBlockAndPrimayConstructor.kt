package com.example.kotlin_learning_part1.oop


// TODO ::
/*
* The code inside the init block is the first to be executed when the class is instantiated.
* The init block is run every time the class is instantiated, with any kind of constructor.
* Multiple initializer blocks can be written in a class. They’ll be executed sequentially.
*/

fun main() {
    var studentObj = Student("Imtiaz"); // class object creation
}

class Student(var name: String) { // this is class and also constructor simultaneously
    init { // this is init block
        println("Name is: $name")
    }
}