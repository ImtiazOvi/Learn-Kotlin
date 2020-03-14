package com.example.kotlin_learning_part1.oop

import java.lang.reflect.Array

fun main() {

    var dogObj = DogClass()
    dogObj.eat()


    var catObj = CatClass()
    catObj.eat()


}

//TODO :: by default class is public and final
// so you can't inherit but using open you can
// if child class wants to override parent class methods,,, the parent class method must be open

//--------------animal class----------------------
open class AnimalClass {
    var color: String = " "
    open fun eat() {
        println("Animal eating")
    }
}

//---------------dog class---------------------------
class DogClass() : AnimalClass() {
    var breed: String = " "

    fun bark() {
        println("Bark")
    }

    override fun eat() {
        super.eat() // super.eat() means it will execute super class eat method
        println("Dog eating")
    }
}

//----------------cat class---------------------------
class CatClass() : AnimalClass() {
    var age: Int = -1

    fun meow() {
        println("Meow")
    }

    override fun eat() {
        super.eat() // super.eat() means it will execute super class eat method
        println("Cat eating")
    }
}