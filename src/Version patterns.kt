import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter left value: ")
    val left = sc.nextInt()
    print("Enter right value: ")
    val right = sc.nextInt()
    for (i in 1..left)
        for (j in 1..right) {
            println("$i.$j")
        }
}