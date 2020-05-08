import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val a = scanner.next().single()
    val b = scanner.next().single()
    val c = scanner.next().single()

    print(a + 1 == b && b + 1 == c)
}