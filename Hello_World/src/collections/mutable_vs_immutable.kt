package collections

fun main(args: Array<String>) {
    val mutList: MutableList<Int> = mutableListOf(1,2,3)
    val readOnlyView: List<Int> = mutList

    println("My immutable list-- " + mutList)
    mutList.add(4)
    println("My immutable list after addition -- " + mutList)

    println(readOnlyView)
    //readOnlyView.clear() // will error
}