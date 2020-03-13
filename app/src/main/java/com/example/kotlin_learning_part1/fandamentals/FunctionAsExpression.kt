package com.example.kotlin_learning_part1.fandamentals

fun main(){
    var maxValue = max(10,20)
    var minValue = min(10,20)
    println("The large number is $maxValue")
    println("The mini number is $minValue")
}

fun max(a:Int , b:Int) : Int{
    if (a>b)
        return a
    else
        return b
}

// function as expression
fun min(c:Int, d:Int) : Int
        = if (c<d)
        {
            println("$c is greater")
            c} else{
    println("$d is greater")
    d }