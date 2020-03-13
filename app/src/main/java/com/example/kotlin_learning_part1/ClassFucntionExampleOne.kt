package com.example.kotlin_learning_part1

fun main() {
    var studentObj = Student() // Student class object creation
    studentObj.name = "Imtiaz" // set name into Student class object
    studentObj.displayName() // this is Student class disPlayName function
}

class Student() {
    var name: String = ""
    fun displayName() {
        println(name)
    }
}