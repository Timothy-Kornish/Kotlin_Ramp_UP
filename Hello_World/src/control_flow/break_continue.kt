package control_flow

fun main(args: Array<String>) {
    println("Example of Break and Continue statements")

    myLabel@ for (x in 1..10) {
        if(x == 5) {
            println("I am inside if block with value $x \n -- hence it will close the operation")
            break@myLabel // no space between break and @ symbol is allowed, must be typed as shown
        } else {
            println("I am inside else block with value $x")
            continue@myLabel // no space between continue and @ symbol is allowed, must be typed as shown
            // the continue statement is not necessary for the loop to continue since it is enclosed in if else blocks
        }

    }
}
