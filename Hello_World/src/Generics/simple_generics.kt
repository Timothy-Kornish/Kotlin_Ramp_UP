package Generics

fun main(args: Array<String>) {
    //var object = genericsExample<String>("JAVA")
    //var object2 = genericsExample<Int>(10)
}

class genericsExample<T>(input : T) {
    init {
        println("I am getting called with the value " + input)
    }
}