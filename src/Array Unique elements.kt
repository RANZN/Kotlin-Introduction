import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val s = sc.nextLine();
    var arr=s.split(" ")
    for(i in 0..arr.size-1) {
        var flag=true
        for (j in 0..arr.size - 1)
            if (arr[i] == arr[j] && i!=j) {
                flag = false;
            }
        if(flag) print(arr[i]+" ")
    }
}