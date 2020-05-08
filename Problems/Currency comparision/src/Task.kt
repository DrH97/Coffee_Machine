import java.util.Scanner

enum class Country(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar"),
    NULL("");
}

fun getCountry(country: String): Country {
    for (enum in Country.values()) {
        if (country == enum.name) return enum
    }
    return Country.NULL
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val a = getCountry(input.next())
    val b = getCountry(input.next())

    print(b.currency == a.currency)
}
