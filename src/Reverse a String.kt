import java.util.*

fun main() {
    val sc= Scanner(System.`in`)
    print("Enter a string: ")
    val s=sc.next()
    for(i in s.length-1 downTo 0){
        print(s[i])
    }
}