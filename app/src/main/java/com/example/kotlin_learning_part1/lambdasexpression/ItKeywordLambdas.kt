package com.example.kotlin_learning_part1.lambdasexpression

fun main() {

    var itKeywordsObj = ItKeywords()

    itKeywordsObj.reverseStringDisplay("hello", { it.reversed() })
}

class ItKeywords {
    fun reverseStringDisplay(str: String, myFunc: (String) -> String) {
        var output =
            myFunc(str)  // it.reversed() ==> str.reversed() ==> "hello".reversed() ==> "ollew"
        println(output)

    }
}