package com.example.kotlin_learning_part1

fun main() {


    //TODO : if as expression and when as expression

    // if as expression
    val a = 3
    val b = 5

    var maxValue: Int
    if (a > b)
        maxValue = a
    else (a < b)
    maxValue = b
    println(maxValue)

    // another way

//    var maxValue:Int = if (a > b)
//                            a
//                        else
//                            b
//    println(maxValue)

    //-----------------------------------------------------------------------------------------
    // when expression

    val x = 3;
//    var myStr:String = when (x){
//        3 ->"Hello im myStr"
//        else ->"Unknown"
//    }
    when (x) {
        in 1..20 -> println("x lies in 1 to 20")
        0, 1 -> println("x is 0 or 1")
        2 -> println("x is 2")
        3 -> {
            println("x is 2")
            println("Yes, Found")
        }
        else -> {
            println("X value is unknown")
            println("Sorry")
        }
    }
}