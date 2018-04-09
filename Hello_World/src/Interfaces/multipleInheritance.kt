package Interfaces

interface A {
    fun printMe() {
        println(" Method of interface A")
    }
}

interface B {
    fun printMeToo() {
        println("I am another method from interface B")
    }
}

class multipleInInterfaceExample : A, B

fun main(args: Array<String>) {
    val obj = multipleInInterfaceExample()

    obj.printMe()
    obj.printMeToo()
}