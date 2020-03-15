package com.example.kotlin_learning_part1.collections

fun main(){


    // key-value pair
    var myMap = mapOf<Int, String>(2 to "Md", 43 to "Imtiaz" , 7 to "Uddin") // fixed size , immutable, read only

    // myMap.put // this is not possible just because of this mapOf is immutable


    // in myMap.keys have all of keys like 2,43,7
    for (key in myMap.keys){ //using individual element (object)
        println(myMap[key])   // also write // myMap.get(key)
    }


}