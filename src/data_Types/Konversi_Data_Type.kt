package data_Types

fun main() {
    println("KONVERSI TIPE DATA")
    print("Masukkan bilangan desimal: ")
    val bilangan = readln()
    val retconDouble: Double = bilangan.toDouble()
    val retconInt = retconDouble.toInt()

    println("Nilai Double: $retconDouble \n" +
            "Nilai Int: $retconInt \n" +
            "Nilai String: $bilangan")
}