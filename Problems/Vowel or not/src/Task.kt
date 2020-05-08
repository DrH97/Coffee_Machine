import java.util.Scanner

// write your function here
fun isVowel(x: Char): Boolean {
    val xL = x.toLowerCase()
    return xL == 'a' || xL == 'e' || xL == 'i' || xL == 'o' || xL == 'u'
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}