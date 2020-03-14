package com.example.kotlin_learning_part1.extensionfunction

import java.math.BigInteger

// TailRec or recursion function is called by itself
// here fibonacci number example given

// 0,1,1,2,3,5,8,13,21....

fun main() {
    println(getFibonacciNumber(8, BigInteger("1"), BigInteger("0")))
}

// tailrec user for safe from stackOverFlow
// if we don't use it we will get an error for big number of fibonacci like 10000
tailrec fun getFibonacciNumber(num: Int, a: BigInteger, b: BigInteger): BigInteger {
    if (num == 0)
        return b
    else
        return getFibonacciNumber(num - 1, a + b, a) // here calling it's own function

}