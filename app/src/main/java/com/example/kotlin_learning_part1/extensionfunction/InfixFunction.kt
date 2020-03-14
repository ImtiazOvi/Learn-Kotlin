package com.example.kotlin_learning_part1.extensionfunction


// TODO : Note
/*
* all infix are extension functions but not all extension functions are infix
* infix functions have only one parameter
* */

fun main() {

    val x: Int = 6
    val y: Int = 10

    val isGreater = x bigValue y
    println(isGreater)

}

infix fun Int.bigValue(other: Int): Int { // this is infix function and also extension function
    if (this > other)
        return this
    else
        return other
}
