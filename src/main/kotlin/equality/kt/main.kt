package equality.kt

data class Foo(val i: Int, val s: String)

fun main() {
    println("-- Primitives --")
    val i: Int = 2
    val nullableI: Int? = 2
    val nullI: Int? = null
    println(i == 2)
    println(i == nullableI)
    println(i == nullI)
    println(nullI == nullableI)

    println("-- Objects --")
    val nullableFoo: Foo? = Foo(2, "abc");
    val nullFoo: Foo? = null
    println(nullableFoo == Foo(2, "abc"))
    println(nullFoo == Foo(2, "abc"))
    println(nullFoo == nullableFoo)

    println("-- Arrays --")
    val arr = intArrayOf(1, 2, 3)
    println(arr == intArrayOf(1, 2, 3))
    println(arr.contentEquals(intArrayOf(1, 2, 3)))

    println("-- Nested arrays --")
    val matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
    println(matrix == arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)))
    println(matrix.contentEquals(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))))
    println(matrix.contentDeepEquals(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))))
}

