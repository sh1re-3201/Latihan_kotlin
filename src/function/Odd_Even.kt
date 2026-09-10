package function

fun cekGenapGanjil(bilangan: Int): String {
    return if (bilangan % 2 == 0) {
        "Genap"
    } else {
        "Ganjil"
    }
}

fun main() {
    val bilangan = 17

    val hasil = cekGenapGanjil(bilangan)

    println("Masukkan bilangan: $bilangan")
    println("$bilangan merupakan bilangan $hasil")
}
