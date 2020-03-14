package com.example.kotlin_learning_part1.oop


// TODO ::
/*
* The code inside the init block is the first to be executed when the class is instantiated.
* The init block is run every time the class is instantiated, with any kind of constructor.
* Multiple initializer blocks can be written in a class. They’ll be executed sequentially.
*/

fun main() {
    var studentObj = Student("Imtiaz",10); // class object creation for secondary constructor
    println("${studentObj.name} ${studentObj.id}")

}

// In kotlin there are two constructor (primary and secondary)
class Student(var name: String) { // this is class and also constructor simultaneously // this is primary constructor
    var id:Int = -1;
    // primary constructor body must written in init block
    init { // this is init block
        println("Name is: $name")
    }

    //TODO :: can't declare secondary constructor without calling primary constructor
    constructor(sName: String, id: Int) : this(sName) { // this is secondary constructor
        // this is secondary constructor body
        // this have own body no need init block
        // var is not allow in secondary constructor as a parameter
        // that's means can't declare property in secondary constructor unlike primary constructor (ex ; var name:String)
        this.id = id

    }
}