import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter size of array: ")
    val n = sc.nextInt()
    val arr = IntArray(n)
    var sum = 0
    println("Enter elements of array")
    for (i in 0 until n) {
        arr[i] = sc.nextInt()
        sum += arr[i]
    }
    println(sum/n)

}