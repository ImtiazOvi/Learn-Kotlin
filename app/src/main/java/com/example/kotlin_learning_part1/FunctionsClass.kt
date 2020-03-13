package com.example.kotlin_learning_part1

fun main(){
    var name : String
    name = "Md Imtiaz Uddin"

    displayName(name) // this is function call in the class

    // this is class object creation
    var personObject = Person()
    personObject.displayName(name)
}

// this is display function
fun displayName(name : String){
    println(name)
}
