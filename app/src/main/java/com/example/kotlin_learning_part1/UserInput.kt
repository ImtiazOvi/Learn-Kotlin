package com.example.kotlin_learning_part1

fun main() {

    //TODO: this is very simple example
//    print("Enter your name :--- ")
//    var a = readLine()
//    println("Your entered name is :--"+ a)

    println("Enter a number")
    var a: Int = readLine()!!.toInt() // if we don't want to declare the int value than we should use !! symbol
    println("Your entered number is :---" + a)
}