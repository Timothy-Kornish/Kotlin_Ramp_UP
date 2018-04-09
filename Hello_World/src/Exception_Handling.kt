fun main(args: Array<String>) {
    try {
        val myVar : Int = 12
        val v : String = "tutorial"
        v.toInt()
    } catch(e: Exception) {
        e.printStackTrace()
    } finally {
        println("Exception handeling in kotlin")
    }
}