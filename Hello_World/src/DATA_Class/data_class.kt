package DATA_Class

fun main(args: Array<String>) {
    val book: Book = Book("Kotlin", "TutorialsPoint", 5)

    println("Name of the books is ${book.name}")
    println("Publisher Name is ${book.publisher}")
    println("Review of the book is ${book.reviewScore}")

    book.reviewScore = 7

    println("Printing all the info all together : " + book.toString())
    println("Example of the HashCode function " + book.hashCode())
}

data class Book(val name : String, val publisher : String, var reviewScore : Int)