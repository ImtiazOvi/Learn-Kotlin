package com.example.kotlin_learning_part1

fun main() {

    val name = "Ovi"
    val str = "Hello " + name
    val str2 = "Hello $name"
    val a = 10
    val b = 20

    println(str)
    println(str2)
    println("The statement is $str2. The number of characters in statement is ${str2.length}") // here we use string Interpolation
    println("The sum of $a and $b is ${a + b}") // here we use string Interpolation

    var rectangleObj = Rectangle();
    rectangleObj.length = 10.0;
    rectangleObj.breadth = 22.00
    println("The length of rectangle is ${rectangleObj.length} and breadth is ${rectangleObj.breadth}. The Area is ${rectangleObj.length * rectangleObj.breadth}")
}

class Rectangle {
    var length: Double = 0.0
    var breadth: Double = 0.0
}