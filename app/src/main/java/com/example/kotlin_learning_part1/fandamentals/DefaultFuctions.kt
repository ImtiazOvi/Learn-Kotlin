@file:JvmName("MyKotlinClass")
package com.example.kotlin_learning_part1.fandamentals

// java doesn't support default functions
//TODO::  @JvmOverloads for interoperability

fun main() {
    var result = findVolume(2, 3)
    var result2 = findVolume(2, 3, 30)
    println(result)
    println(result2)
}

@JvmOverloads
fun findVolume(length: Int, breadth: Int, height: Int = 10): Int {
    return length * breadth * height;
}