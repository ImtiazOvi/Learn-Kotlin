package com.example.kotlin_learning_part1

fun main() {

    // break statements

    for (i in 1..10) {
        println(i)
        if (i == 4) {
            break
        }
    }

    println("------------------------------------------------------")
    myLoop@ for (i in 1..3) {
        for (j in 1..3) {
            println("$i $j")
            if (i == 2 && j == 2) {
                break@myLoop // @myLoop is label of loop // using this with break it's work for only outer loop not for inner loop
            }
        }
    }


    println("------------------------------------------------------")

    // continue statements

    for (i in 1..10){
        if (i % 2 == 0){
            continue
        }
        println(i)
    }



    println("-----------------------continue part 1-------------------------------")

    // continue statements

    for (i in 1..10){
        if (i % 2 == 0){
            continue
        }
        println(i)
    }
    println("-----------------continue part 2-------------------------------------")

    outer@for (i in 1..3){
        if (i % 2 == 0) {

            for (j in 1..3) {
                if (i == 2 && j == 2) {
                    continue@outer // this continue work for outer for loop
                    println("$i $j")
                }
            }

        }
    }


}