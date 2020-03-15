package com.example.kotlin_learning_part1.collections

fun main() {

    // "Set" contains unique elements
    // "HashSet" also contain unique elements, but the sequence not guaranteed in output


    var mySet = hashSetOf<Int>(2, 4, 56, 7, 78, 9)  // Immutable, read only

    // follow output ,,, sequence not same all the time


    // in myMap.keys have all of keys like 2,43,7
    for (elements in mySet) { //using individual element (object)
        println(elements)
    }

}