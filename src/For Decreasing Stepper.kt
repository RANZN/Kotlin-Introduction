import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Starting value: ")
    val starting=sc.nextInt()
    print("Decrement: ")

    val dec=sc.nextInt()
    for(i in starting downTo 0 step dec){
        println(i)
    }
}