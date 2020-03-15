package com.example.kotlin_learning_part1.collections

fun main(args: Array<String>){

    // array elements : 1 3 9 5 0
    // array index    : 0 1 2 3 4

    var myArray = Array<Int>(5) {0}  // Mutable and fixed size

    myArray[0] = 1
    myArray[3] = 5
    myArray[1] = 3
    myArray[2] = 9

    for (element in myArray){ //using individual element (object)
        println(element)
    }

    println("---------------------------------------------")
    println("---------------------------------------------")

    for (index in 0..myArray.size-1){
        println(myArray[index])
    }
}