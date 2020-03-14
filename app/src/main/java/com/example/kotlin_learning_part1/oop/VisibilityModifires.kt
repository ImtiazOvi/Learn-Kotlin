package com.example.kotlin_learning_part1.oop

// TODO ::
// Modifiers are : public, protected, internal , private

/*
* by default everything is public in kotlin
 */

fun main() { // main function

}

open class People{ // super class
    public var a: String = "" // no need to declare public modifier just because of by default everything is public in kotlin
    protected var b: String = "" // access for sub class
    internal var c: String = "" // it can be access in same module
    private var d: String = ""
}

class BD : People(){ // derived class
    // a is visible in case of super or not (both)
    // b is visible in case of having super class or only for sub class
    // c is visible just because of it's internal
    // d is not visible

    fun myFun(){
        println(a)
        println(b)
        println(c)
       // println(d) // this can't be access because of private
    }

}