package looping

fun main(args: Array<String>) {
    val items =  listOf(1, 2, 3, 4, 22, 85, 7)

    for ((index, value) in items.withIndex()) {
        println("The element at index: $index is $value")
    }
}