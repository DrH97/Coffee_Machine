import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val x = scanner.nextInt()
    val y = scanner.nextInt()
    val z = scanner.nextInt()

    print(x <= y && x >= z || x <= z && x >= y)
}