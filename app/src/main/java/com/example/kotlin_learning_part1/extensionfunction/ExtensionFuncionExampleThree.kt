package com.example.kotlin_learning_part1.extensionfunction

// TODO : Note
/*
* add new functions to the classes
* can add function to a class without declaring it
* it's behave like static
*they can be user defined class(ex:Student,Employee) or predefined class(ex: String, Int)
*
* */

fun main(){

    val x:Int = 6
    val y:Int = 10

    val isGreater = x.greaterValue(y)
    println(isGreater)

}

fun Int.greaterValue(other : Int):Int{
    if (this>other)
        return this
    else
        return other
}
