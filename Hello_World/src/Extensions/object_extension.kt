package Extensions

fun main(args: Array<String>) {
    println("Heyy!! " + A.show())
}

class A {
    companion object {
        fun show() : String {
            return ("You are learningn Kotlin")
        }
    }
}