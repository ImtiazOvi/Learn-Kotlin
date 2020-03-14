package com.example.kotlin_learning_part1.oop

fun main(){

    var myDogObj = MyDog("Gray","pug") // here passing parameters
}

open class MyAnimal{ // super class
    var color: String = ""

    constructor(_color:String){ // secondary constructor
        this.color = _color;
        println("MyAnimal class color is $color")
    }
}

class MyDog: MyAnimal{ // derived class
    var breed: String = ""

    constructor(color:String,  _breed : String) : super(color){ //must class super when using secondary constructor // secondary constructor
        this.breed = _breed
        println("MyDog class color is $color and breed is $breed")
    }
}