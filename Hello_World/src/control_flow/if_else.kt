package control_flow

fun main(args: Array<String>) {
    val a: Int = 5
    val b: Int = 2
    var max: Int
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("Max: $max")

    max = if (a < b) a else b

    println("Max: $max")
}
