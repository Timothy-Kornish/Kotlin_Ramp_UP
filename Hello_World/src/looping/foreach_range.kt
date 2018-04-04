package looping

fun main(args: Array<String>) {
    val i: Int = 2
    for (j in 1..4)
        print(j)
    if (i in 1..10) {
        println("\nFound the number for i: " + i)
    }
}
