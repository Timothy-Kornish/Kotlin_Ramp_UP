package Inheritance

import java.util.Arrays

open class CDE {
    open fun think() {
        print("Hey!! I am thinking")
    }
}

class DEF : CDE() {
    override fun think() {
        print("Overriden")
    }
}

fun main(args: Array<String>) {
    var a = DEF()
    a.think()
}