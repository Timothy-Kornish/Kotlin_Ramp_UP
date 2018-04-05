package Constructors

fun main(args: Array<String>) {
    val Human = Human("Timothy", 23)

    println("${Human.message} ${Human.firstName} Welcom to the example of the Seconday Constructor, You age is - ${Human.age}")
}

class Human(val firstName: String, var age: Int) {
    val message: String = "Hey!!!"

    constructor(name: String, age: Int, message: String): this(name, age) {}
}