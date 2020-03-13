package com.example.kotlin_learning_part1

fun main() {
    var myClassObj = MyClass() // this is class creation
    myClassObj.myName = "Md Imtiaz Uddin" // set name in myClass

    println("So my name is :" + myClassObj.myName) // normal print
    println("So my name is : ${myClassObj.myName}") // this is String interpolation with carl bracket
}

class MyClass {
    var myName: String = " " // this is empty string
}