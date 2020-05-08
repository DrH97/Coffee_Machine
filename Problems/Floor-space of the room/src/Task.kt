import java.util.*

const val PIE = 3.14

fun areaTri(a: Double, b: Double, c: Double): Double {
    val s = (a + b + c) / 2

    return kotlin.math.sqrt(s * (s - a) * (s - b) * (s - c))
}

fun areaRect(a: Double, b: Double): Double {
    return a * b
}

fun areaCircle(r: Double): Double {
    return PIE * r * r
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    print(when (scanner.next()) {
        "triangle" -> areaTri(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble())
        "rectangle" -> areaRect(scanner.nextDouble(), scanner.nextDouble())
        "circle" -> areaCircle(scanner.nextDouble())
        else -> "not a valid option"
    })
}