import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val year = sc.nextInt()
    if (year % 4 == 0) {
        if (year % 400 == 0) {
            println("LEAP YEAR")
        } else if (year % 100 == 0) {
            println("NOT LEAP YEAR")
        }else println("LEAP YEAR")
    } else println("NOT LEAR YEAR")
}