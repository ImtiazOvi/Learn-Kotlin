package com.example.kotlin_learning_part1.fandamentals

import java.util.*

fun main(args: Array<String>) {

    println(InteroperabilityExampleJava.getArea(9, 10))  // this method call from a java class

}

fun add(a: Int, b: Int): Int {
    return a + b
}