package looping

fun main(args: Array<String>) {
    var x: Int = 0
    do {
        x += 10
        println(x)
    } while(x <= 50)
}