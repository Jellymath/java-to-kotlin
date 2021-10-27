package comparison.kt

fun main() {
    println(5 > 4) // Int comparison
    println(5L >= 4L) // Long comparison
    println(4.0 <= 5.0) // Double comparison
    println(4f < 5f) // Float comparison
    println('a' < 'c') // Char comparison
    println(false <= true); // Boolean comparison
    val b1: Byte = 5
    val b2: Byte = 4
    println (b1 > b2)
    val s1: Short = 5
    val s2: Short = 4
    println (s1 >= s2)

    println(4u < 5u) // UInt comparison
    println(4uL <= 5uL) //ULong comparison
    val ub1: UByte = 5u
    val ub2: UByte = 4u
    println(ub1 > ub2)
    val us1: UShort = 5u
    val us2: UShort = 4u
    println(us1 >= us2)
}