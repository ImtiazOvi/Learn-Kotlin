package com.example.kotlin_learning_part1.lambdasexpression

fun main(){

    var myClosuresObj = MyClosures()
    var sum = 0

    myClosuresObj.addTwoNumber(2,5,{x,y -> sum = x + y}) // we can change sum value with in lambdas and it's called closures
    println(sum)
}

class MyClosures{
    fun addTwoNumber(number1: Int, number2: Int, action: (Int, Int) -> Unit){
        action(number1,number2)
    }
}
