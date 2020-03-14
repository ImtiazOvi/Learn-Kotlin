package com.example.kotlin_learning_part1.oop

fun main() { // main function

    var anotherDogObj = AnotherDog("Black","pug")
}

open class AnotherAnimal(var color: String) { // super class
    init {
        println("AnotherAnimal class init color is $color")
    }

}

class AnotherDog(color: String, var breed: String) : AnotherAnimal(color) { // derived class

    init {
        println("AnotherDog class init color is $color and breed is $breed")
    }

}