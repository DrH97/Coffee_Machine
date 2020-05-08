import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val i = scanner.nextInt()

    print(i % 100 / 10)
}