package com.example.kotlin_learning_part1.collections

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(){
    // key-value pair
    var myMap = HashMap<Int, String>() // not fixed size , mutable, read and write both

    myMap.put(2,"Md")  // adding
    myMap.put(43,"Imtiaz") // adding
    myMap.put(7,"Uddin")  // adding

    myMap.replace(43,"IMTIAZ")  // replace

    // in myMap.keys have all of keys like 2,43,7
    for (key in myMap.keys){ //using individual element (object)
        println(myMap[key])   // also write // myMap.get(key)
    }
}