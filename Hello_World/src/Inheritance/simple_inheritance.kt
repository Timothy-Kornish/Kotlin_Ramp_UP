package Inheritance

import java.util.Arrays

open class ABC {
    // open keyword makes a class inheritable
    fun think() {
        print("Hey!! I am thinking ")
    }
}

class BCD : ABC() {
    // inheritance gives BCD the think function u
}

fun main(args: Array<String>) {
    var a = BCD()
    a.think()
}