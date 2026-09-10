package data_Types
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("ANALISIS KARAKTER")

    print("Masukkan karakter: ")
    val karakter: Char = scanner.next().first()

    val asciiCode = karakter.code
    val isLetter = karakter.isLetter()
    val isNumber = karakter.isDigit()

    println("Karakter: $karakter \n" +
            "Kode ASCII: $asciiCode \n" +
            "Apakah Huruf: $isLetter \n" +
            "Apakah Angka: $isNumber")
}