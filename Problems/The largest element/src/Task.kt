import java.util.*

var largest = 0

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var x = scanner.nextInt()
    largest = x

    while (x != 0) {
        x = scanner.nextInt()

        when {
            x > largest -> largest = x
        }
    }

    print(largest)
}