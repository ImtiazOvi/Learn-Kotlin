package com.example.kotlin_learning_part1.oop

// TODO
// interface can contain both abstract and normal function but can't be initialize
// interface is not class
// can't create instance of interface as like abstract class

//TODO :: Can be implement multi interfaces in a class
fun main() {
    var buttonObj = Button();
    buttonObj.onTouch()
    buttonObj.onClick()

}

interface MyInterfaceListener { // interface isn't class. It is like listener // interface is abstract by nature
    // interface can't ne instantiated

    // inside interface ,, properties are abstract and open
    // var name: String = "Imtiaz" // interface properties should not contain default value

    var name: String
    // public final var name: String // in side interface nothing is final every thing is open

    fun onClick() { // this is public open by default but not final

        println("onClick interface : Button clicked")
    }

    fun onTouch() // methods is interface abstract by default
}


class Button : MyInterfaceListener {
    // in interface abstract properties must be override in implemented class

    override var name: String = "Imtiaz"

    override fun onTouch() { // this function is must be override because of this is abstract function in the interface
        println("Button touched")
    }

    override fun onClick() { // optional to override just because of normal method in the interface
        super.onClick()

    }

}