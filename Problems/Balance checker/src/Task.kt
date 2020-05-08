import java.util.*

var balance = 0
var success = false

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var n = scanner.nextInt()
    balance = n

    while (scanner.hasNextInt()) {
        n = scanner.nextInt()

        success = when {
            balance >= n -> {
                balance -= n
                true
            }
            else -> false
        }
    }

    when (success) {
        true -> print("Thank you for choosing us to manage your account! You have $balance money.")
        false -> print("Error, insufficient funds for the purchase. You have $balance, but you need $n.")
    }
}
