import java.util.*

var a = 0
var b = 0
var c = 0
var d = 0

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    repeat(scanner.nextInt()) {
        when (scanner.nextInt()) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
        }
    }

    print("$d $c $b $a")
}