package com.example.kotlin_learning_part1.fandamentals

// TODO :: Methods Structure

fun main() {

    area(10,20)
    findArea(10,20)

}


// fun --> keyword
// area --> Method name
// length and breadth --> Formal parameters
// Int -> return type
fun area(length: Int, breadth: Int): Int {

    // Methods body : Here do something
    return length * breadth;
}


// Unit --> void in java
fun findArea(length: Int, breadth: Int): Unit {

    // Methods body : Here do something
}