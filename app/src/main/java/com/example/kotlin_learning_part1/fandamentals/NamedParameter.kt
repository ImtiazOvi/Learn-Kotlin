package com.example.kotlin_learning_part1.fandamentals

fun main() {
    volume(height = 23, length = 10, breadth = 89) // here have a look ,,, volume method parameter sequence
    println("------------------")
    volume(length = 10, breadth = 89) // here have a look ,,, volume method parameter sequence


}

fun volume(length: Int, breadth: Int, height: Int = 20) { // here have a look ,,, volume method parameter sequence
    println("Length is $length")
    println("Breadth is $breadth")
    println("Height is $height")

}