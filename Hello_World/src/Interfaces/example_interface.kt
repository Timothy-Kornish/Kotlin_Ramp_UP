package Interfaces

interface ExampleInterface {
    var myVar : Int // abstract property

    fun absMethod(): String // Abastract method
    fun hello() {
        println("Hello there")
    } // method with default implementation
}

class InterfaceImp : ExampleInterface {
    override var myVar : Int = 25
    override fun absMethod() = "DEM Abs"

}

fun main(args : Array<String>) {
    val obj = InterfaceImp()

    println("My variable is ${obj.myVar}")
    println("Calling hello(): ")

    obj.hello()

    println("Message from the website-- ")
    println(obj.absMethod())
}