package class_and_object

fun main(args: Array<String>) {
    val demo = Outer.Nested().foo() // calling a nested class method
    // setting variable as a function to be called
    println(demo)
}

class Outer {
    class Nested { // by default, nested classes are static
        fun foo() = "Welcome to the tutorial"
    }
}