package data_Types
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("KALKULATOR SUHU")
    print("Masukkan suhu dalam Celcius: ")
    val suhu = scanner.nextDouble()

    val fahrenheit: Double = (suhu * 9/5) +32
    val kelvin: Double = suhu + 273.15

    println("Suhu Celsius:        $suhu \n" +
            "Suhu Fahrenheit:     $fahrenheit \n" +
            "Suhu Kelvin:         $kelvin")
}