package class_and_object

fun main(args: Array<String>) {
    val demo = Outer2().Nested2().foo() // call nested class method
    println(demo)
}

class Outer2 {
    private val welcomeMessage: String = "Welcome to the tutorial"
    inner class Nested2 {
        fun foo() = welcomeMessage
    }
}