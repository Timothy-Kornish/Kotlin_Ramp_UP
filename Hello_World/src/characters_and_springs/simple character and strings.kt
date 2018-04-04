package characters_and_springs

fun  main(args: Array<String>) {
    val letter: Char = 'A'
    println("letter: $letter, " + letter)

    val rawString: String = "I am a raw String!"
    val escapedString: String = "I am escaped String!"

    println("Hello! " + escapedString)
    println("Hey!! " + rawString)

    val shortRawString: String = rawString.substring(0, 4)

    println("short string: " + shortRawString)
}