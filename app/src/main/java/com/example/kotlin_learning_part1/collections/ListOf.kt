package com.example.kotlin_learning_part1.collections

fun main() {

    var list = listOf<String>("Imtaz", "Uddin", "Ovi") // fixed size , Immutable, read only , can't write or modify anything in future

    // list[1] = "Something"  // we can't modify it , kotlin don't allow it



    for (element in list){ //using individual element (object)
        println(element)
    }

    println("---------------------------------------------")
    println("---------------------------------------------")

    for (index in 0..list.size-1){
        println(list[index])   // also call list.get(index)
    }

}

