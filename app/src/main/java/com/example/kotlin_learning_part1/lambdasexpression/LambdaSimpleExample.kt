package com.example.kotlin_learning_part1.lambdasexpression

fun main(){

    var myLambdaObj = MyLambda()

    myLambdaObj.addTwoNumber(2,3,{x,y -> x + y}) // lambda function
    // myLambdaObj.addTwoNumber(2,3){x,y -> x + y} // another way of lambda function
}

class MyLambda{
    fun addTwoNumber(number1: Int, number2: Int, action: (Int , Int) -> Int){
        println("Sum is: ${action(number1,number2)}")
    }
}