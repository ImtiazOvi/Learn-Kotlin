package com.example.kotlin_learning_part1.oop

import java.lang.reflect.Array

fun main() {

    var dogObj = Dog()
    dogObj.breed = "labra"
    dogObj.color = "red"
    dogObj.bark()
    dogObj.eat()


    var catObj = Cat()
    catObj.age = 7
    catObj.color = "white"
    catObj.meow()
    catObj.eat()


}

//TODO :: by default class is public and final
// so you can't inherit but using open you can

//--------------animal class----------------------
open class Animal{
    var color: String = " "
    fun eat() {
        println("Eat")
    }
}

//---------------dog class---------------------------
class Dog() : Animal() {
    var breed: String = " "

    fun bark() {
        println("Bark")
    }

}
//----------------cat class---------------------------
class Cat() : Animal(){
    var age: Int = -1

    fun meow() {
        println("Meow")
    }
}