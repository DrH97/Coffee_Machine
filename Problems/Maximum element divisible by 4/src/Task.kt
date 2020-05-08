import java.util.*

var maxDivBy4 = 0

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    repeat(scanner.nextInt()) {
        val x = scanner.nextInt()
        when {
            x > maxDivBy4 && x % 4 == 0 -> maxDivBy4 = x
        }
    }

    print(maxDivBy4)
}