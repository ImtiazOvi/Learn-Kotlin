package com.example.kotlin_learning_part1

fun main(){
    // for loop
    for (i in 1..4){
        println("For loop")
    }

    // while loop
    println("------------------------------")
    var w:Int = 1
    while (w < 5){
        println("While loop")
        w++
    }

    // do while loop
    println("------------------------------")
    var d:Int = 1
    do {
        println("do while loop")
        d++
    }while (d<5)
}