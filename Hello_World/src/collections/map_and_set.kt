package collections

fun main(args: Array<String>) {
    val items = listOf(1, 2, 3, 4)
    println("First Element of the list---- " + items.first())
    println("Last Element of the list---- " + items.last())
    println("Even Numbers of the list---- " + items.filter { it % 2 == 0}) // "it" is not a custom variable, "it" cannot be replaced by other word

    val readWriteMap = hashMapOf("a" to 1, "b" to 2)
    println(readWriteMap["a"])

    val stringSet = hashSetOf("a", "b", "c", "c")
    println("Values in set: " + stringSet)
}