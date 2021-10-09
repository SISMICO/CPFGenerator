fun main(args: Array<String>) {
    println("Hello World!")
}

fun Char.toNumberInt(): Int {
    return Character.getNumericValue(this)
}