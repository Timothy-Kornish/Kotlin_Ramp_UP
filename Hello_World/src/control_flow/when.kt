package control_flow

fun main(args: Array<String>) {
    var x: Int = 5

    // Kotlin form of a switch statement
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("X is neither 1 nor 2")
        }
    }

    x = 1
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("X is neither 1 nor 2")
        }
    }

    when (x) {
        1, 2 -> println("value of X is either 1 or 2")
        else -> {
            println("X is neither 1 nor 2")
        }
    }


}