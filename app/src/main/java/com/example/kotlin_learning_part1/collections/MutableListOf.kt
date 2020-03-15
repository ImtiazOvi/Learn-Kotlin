package com.example.kotlin_learning_part1.collections

fun main(){

     // all are same

    //var list = mutableListOf<String>( "Uddin", "Ovi") // not fixed size , mutable, can add and remove elements
    //var list = arrayListOf<>()<String>( "Uddin", "Ovi") // not fixed size , mutable, can add and remove elements
    var list = ArrayList<String>() // not fixed size , mutable, can add and remove elements

    list.add("M") // here adding
    list.add("Ovi") // here adding
    list.add("Imtiaz") // here adding

//    list.remove("Ovi") // here removing

    list.add(1,"Md") // here replace name  // also write // list[1] = "Md"

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

