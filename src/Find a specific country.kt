import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Enter number of Country")
    val size = sc.nextInt()
    println("Enter Country : ")
    var list = arrayOfNulls<String>(size + 1)
    for (i in 0..size) {
        list[i] = sc.nextLine()
    }
    println("Enter country to search: ")
    val c = sc.next()
    var flag = false
    for (i in list) {
        if (i == c) {
            flag = true
            break
        } else flag = false
    }
    if (flag) println("YES") else println("NO")
}