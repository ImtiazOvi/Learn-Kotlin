package com.example.kotlin_learning_part1.extensionfunction

fun main(){

    var studentObj =
        Student();
    println("Pass status : ${studentObj.hasPassed(40)}")
    println("Scholar status : ${studentObj.isScholar(87)}")

}

fun Student.isScholar(marks: Int) : Boolean{
    return marks>90
}

class Student{
    fun hasPassed(marks:Int) : Boolean{
        return marks>39;
    }
}