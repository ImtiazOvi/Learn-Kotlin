package com.example.kotlin_learning_part1.lambdasexpression

fun main(){

    val programObj = Program()

    //----------------------------------------------------------------------------------------------

    programObj.addTwoNumbers(2,9) // simple way function


    //----------------------------------------------------------------------------------------------

    programObj.addTwoNumbers(2,9,object : MyInterFace{  // interface call as parameter
        override fun execute(sum: Int) {
            println("Interface way function -> sum is : $sum") // body
        }

    })

    //----------------------------------------------------------------------------------------------

    val myLambda: (Int) -> Unit = {value: Int -> println("Lambda function -> sum is $value")} // lambda expression or function
    programObj.addTwoNumbers(2,9,myLambda)
    //programObj.addTwoNumbers(2,9,{value: Int -> println("Lambda function -> sum is $value")}) // without put in variable


}

class Program{

    //----------------------------------------------------------------------------------------------

    fun addTwoNumbers(number1: Int, number2: Int, action: (Int) -> Unit){ // High level function or lambdas function as a parameter
        val sum = number1 + number2
        action(sum) // it's work like println(sum)

    }

    //----------------------------------------------------------------------------------------------

    fun addTwoNumbers(number1: Int, number2: Int, action: MyInterFace){ // Using Interface or Object oriented way
        val sum = number1 + number2
        action.execute(sum)
    }


    //----------------------------------------------------------------------------------------------

    fun addTwoNumbers(number1: Int, number2: Int){ // Simple way
        val sum = number1 + number2
        println("Simple way function -> sum is : $sum")
    }
}

//----------------------------------------------------------------------------------------------
interface MyInterFace{ // this is an interface
    fun execute(sum: Int)
}