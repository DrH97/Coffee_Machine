import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val d = scanner.nextInt()
    val f = scanner.nextInt()
    val t = scanner.nextInt()
    val n = scanner.nextInt()

    print(f * d + 2 * t + n * (d - 1))
}