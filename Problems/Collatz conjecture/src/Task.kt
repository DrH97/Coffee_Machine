import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var n = scanner.nextInt()
    print("$n ")

    while (n != 1) {
        n = when {
            n % 2 == 1 -> n * 3 + 1
            else -> n / 2
        }

        print("$n ")
    }
}
