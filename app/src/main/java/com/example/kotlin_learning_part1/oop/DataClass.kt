package com.example.kotlin_learning_part1.oop


//TODO :: Note
// Any class contains functions such as
// equals(): Boolean, hashCode(): Int, toString: String

// kotlin creates copy() too
// above all are data class

fun main(){

    var userObj1 = User("Imtiaz",1)
    var userObj2 = User("Imtiaz",1)

    println(userObj1.toString())

    if (userObj1 == userObj2)
        println("Equals")
    else
        print("Not equals")

    var newUser = userObj1.copy(name = "Ovi") // named parameter
    println(newUser)

}

data class User(var name: String, var id: Int){ // data is all about class data not references
    // in case of data class primary construct only contains property variables var or val

}