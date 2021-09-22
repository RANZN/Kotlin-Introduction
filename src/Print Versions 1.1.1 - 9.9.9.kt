import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    for (i in 0..n)
        for (j in 0..n)
            for (k in 0..n)
                println("$i.$j.$k")
}