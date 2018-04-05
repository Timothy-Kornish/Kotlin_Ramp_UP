package class_and_object

class myClass {
    // property (data member)
    private var name: String = "Tutorials.point"

    // member function
    fun printMe() {
        // notice no return type declared the parenthesis, this is equivalent to void in java
        println("You are at the best learning website Named - $name")
    }
}

fun main(args: Array<String>) {
    val obj = myClass() // create instance of myClass class
    obj.printMe()
}