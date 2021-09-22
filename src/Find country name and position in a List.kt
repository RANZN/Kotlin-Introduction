import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter number of country: ")
    val size = sc.nextInt()
    println("Enter Country: ")
    var country = arrayOfNulls<String>(size + 1)
    for (i in 0..size) {
        country[i] = sc.next()
    }
    print("Enter search: ")
    val c = sc.next()
    for ((item, element) in country.withIndex()) {
        if (c == element) println("$c $item")
    }

}