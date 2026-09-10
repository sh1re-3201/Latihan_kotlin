package data_Types
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("LUAS DAN KELILING LINGKARAN")
    val pi: Double = 3.14159

    print("Masukkan jari-jari lingkaran anda: ")
    val r = scanner.nextDouble()

    val luas = pi * (2*r)
    val keliling = 2 * pi * r

    println("Hasil Luas: $luas \n" +
            "Hasil Keliling: $keliling")
}