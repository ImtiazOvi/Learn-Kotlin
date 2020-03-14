package com.example.kotlin_learning_part1.extensionfunction

fun main(){

    val str1 = "Imtiaz"
    val str2 ="Ovi"
    val str3 = "Hello"

    println("$str1 $str2 $str3") // this is simple way to display
    println("------------------------")
    println(str3.add(str1,str2)) // this is extension function


}

fun String.add(s1:String, s2:String) :String{
    return this + " " +s1 + " " +s2
}
