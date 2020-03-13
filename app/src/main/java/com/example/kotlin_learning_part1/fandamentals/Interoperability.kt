package com.example.kotlin_learning_part1.fandamentals

// Kotlin Java Interoperability : kotlin code is compiled & converted to a .class file

//TODO :: how java codes runs ?
// <compile time > (MyClass.java --(compiler)--> MyClass.class) -> <runtime>(JVM -> Program Running)

//-------------------------------------------------
// TODO :: how kotlin code runs?
//  <compile time > (MyClass.kt --(compiler)--> MyClass.class) -> <runtime>(JVM -> Program Running)



// kotlin file
//Assume the file name is Student.kt
/*      fun add(a : Int) : Boolean{ // method body }
*/

// After compilation what happens to the Student.kt file?
// Ot os converted into Student Student.class
/*
class Student {public static Boolean add(int a){ // method body}}
 */

// TODO :: Calling kotlin functions from java file and vice-versa
