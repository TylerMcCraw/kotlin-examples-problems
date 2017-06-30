/*
 * Your task is to implement the sum() function so that it computes the sum of
 * all elements in the given array a.
 */
package sum

/* SOLUTION 1 */
fun sum(a: IntArray): Int {
    return a.sum()
}

/* SOLUTION 2 */
fun sum(a: IntArray): Int {
    return if (a.isEmpty()) 0 else a.reduce { a, b -> a + b }
}

/* SOLUTION 3 */
fun sum(a: IntArray): Int {
    var total = 0
    a.forEach { item -> total = total + item }
    return total
}

/* SOLUTION 4 */
fun sum(a: IntArray): Int {
    var total = 0
    for (item in a) {
        total = total + item
    }
    return total
}
