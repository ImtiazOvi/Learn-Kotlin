package com.example.kotlin_learning_part1.lambdasexpression

fun main(){

    var manObj = Man()

    with(manObj){
        name = "Imtiaz"
        age = 26
    }

    manObj.apply {
        name = "Imtiaz"
        age = 26
    }.startRun()

    println(manObj.name)
    println(manObj.age)
}

class Man{
    var name: String = ""
    var age: Int = -1

    fun startRun(){
        println("I am ready to run")
    }
}